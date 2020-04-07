package com.visionvera.service;

import com.visionvera.bean.base.BaseReturn;
import com.visionvera.bean.base.ReturnData;
import com.visionvera.bean.cms.UserVO;
import com.visionvera.bean.datacore.TApplicationdevicebVO;
import com.visionvera.bean.datacore.TPermissionVO;
import com.visionvera.bean.datacore.TRoleVO;
import com.visionvera.constrant.CommonConstrant;
import com.visionvera.constrant.LogTypeConstrant;
import com.visionvera.dao.JRedisDao;
import com.visionvera.dao.xinhxu.UserDao;
import com.visionvera.util.DateUtil;
import com.visionvera.util.Sm3Utils;
import com.visionvera.util.StringUtil;
import com.visionvera.util.TimeUtil;
import com.visionvera.vo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class UserServiceImpl implements UserService {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Resource
    UserDao userDao;

    @Resource
    JRedisDao jedisDao;
    @Override
    public List<User> querAll() {
        return userDao.querAll();
    }

    @Value("${login.limitNum:5}")
    private Integer limitNum;//登录限制次数
    @Value("${login.limitNum:3}")
    private Integer limitTime;//登录限制时长（分钟）
    @Value("${login.modityDay:30}")
    private Long modityDay;//密码修改时长（天）

    /**
     * 用户登录操作
     *
     * @param userParam
     *            用户信息
     * @param loginType
     *            登陆类型。1: 表示用户名密码登录；2: 表示手机号密码登录；3: 表示手机号验证码登录； 4: 表示用户名验证码登陆
     * @param sessionTimeoutMinute
     *            Session过期时间，分钟
     * @return
     */
    @Override
    public ReturnData userLogin(UserVO userParam, Integer loginType, Integer sessionTimeoutMinute) {
        BaseReturn returnData = new BaseReturn();
        Map<String, Object> paramsMap = new HashMap<String,Object>();// 向DAO传递的参数Map
        Map<String, Object> extraData = new HashMap<String,Object>();// 结果Map
        Set<TPermissionVO> userPermissionSet = new LinkedHashSet<>();// 有序的Set集合

        if (loginType.equals(1) || loginType.equals(4)|| loginType.equals(5)) {// 使用用户名+密码或者用户名+验证码封装查询数据
            paramsMap.clear();
            paramsMap.put("loginName", userParam.getLoginName());
        }

        if (loginType.equals(2) || loginType.equals(3)) {// 使用手机号+密码或者手机号+验证码封装查询数据
            paramsMap.clear();
            paramsMap.put("phone", userParam.getPhone());
        }

        /** 校验用户信息 Start */
        UserVO user = this.userDao.selectUserByUniqueKey(paramsMap);// 查询用户信息
        if (user == null) {// 用户不存在
        //    this.rabbitProvider.sendLogMessage(LogTypeConstrant.LOGIN, "用户不存在", userParam.getLoginName(), false, userParam.getPlatformId(), "用户不存在", null);
            return returnData.returnError("用户不存在");
        }


        if (loginType.equals(1) || loginType.equals(2)) {// 用户名+密码或者手机号+密码登陆
            //校验密码加密方式，如果是md5加密，则根据加密规则sm3（login_name+md5（login_pwd））对密码加密后与数据库返回密码进行比对
            if(userParam.getLoginPwd().length() == 32){//按照密码长度判断加密方式 md5为32位  sm3是64位
                String loginPwd = Sm3Utils.encrypt(user.getLoginName()+userParam.getLoginPwd());//最终的用户密码
                userParam.setLoginPwd(loginPwd);
            }
            if (!user.getLoginPwd().equalsIgnoreCase(userParam.getLoginPwd())) {// 密码不对
             //   this.rabbitProvider.sendLogMessage(LogTypeConstrant.LOGIN, "用户名和密码不匹配", user.getLoginName(), false, userParam.getPlatformId(), "用户名和密码不匹配", null);
                return returnData.returnError("用户名和密码不匹配");
            }
        }

        /** 校验用户信息 End */

        /** 校验平台信息 Start */
//        TApplicationdevicebVO platform = this.applicationdevicebDao.selectApplicationdevicebById(userParam.getPlatformId());
//        if (platform == null) {//平台不存在
//          //  this.rabbitProvider.sendLogMessage(LogTypeConstrant.LOGIN, "平台不存在", user.getLoginName(), false, userParam.getPlatformId(), "平台不存在", null);
//            return returnData.returnError("平台不存在");
//        }
        /** 校验平台信息 End */

        /** 验证码登陆，校验验证码信息 Start */
        if (loginType.equals(3) || loginType.equals(4)) {// 用户名+验证码或手机号+验证码登陆 或用户名+密码+验证码
            String code = this.jedisDao.get(getRedisKey(CommonConstrant.PREFIX_VERIFICATION_CODE, user.getPhone()));
            if (StringUtil.isNull(code)) {//验证码过期
          //      this.rabbitProvider.sendLogMessage(LogTypeConstrant.LOGIN, "验证码已过期,请重新获取验证码", user.getLoginName(), false, userParam.getPlatformId(), "验证码已过期,请重新获取验证码", null);
                return returnData.returnError("验证码已过期,请重新获取验证码");
            }
            if (!userParam.getVerifiCode().equals(code)) {//验证码不正确
         //       this.rabbitProvider.sendLogMessage(LogTypeConstrant.LOGIN, "验证码不正确", user.getLoginName(), false, userParam.getPlatformId(), "验证码不正确", null);
                return returnData.returnError("验证码不正确");
            }
            this.jedisDao.del(getRedisKey(CommonConstrant.PREFIX_VERIFICATION_CODE, user.getPhone()));// 验证码验证成功后，删除验证码缓存
        }
        /** 验证码登陆，校验验证码信息 End */

        if(loginType.equals(5)){
            // 验证用户密码是否过期
            Date startModifyDate = user.getPwdModifyTime();
            if(startModifyDate==null){
                Date currentDate =new Date();
                startModifyDate = currentDate ;
                UserVO params = new UserVO();
                params.setUuid(user.getUuid());
                params.setPwdModifyTime(currentDate);
                this.userDao.updateUser(params);// 更新用户基本信息
            }
            Date endModifyDate = DateUtil.string2Date(DateUtil.addDateDays(startModifyDate, 30));
            if (!DateUtil.isEffectiveDate(new Date(), startModifyDate, endModifyDate)) {
                extraData.put("isPwdExpires", true);
                return returnData.returnResult(1, "账号密码已过期，请修改密码后重试", null, null, extraData);
            }
            ReturnData resultCheck =this.failCheckLoginHandle(user,userParam,2);
            if(resultCheck.getErrcode()!=0){
             //   this.rabbitProvider.sendLogMessage(LogTypeConstrant.LOGIN, resultCheck.getErrmsg(), user.getLoginName(), false, userParam.getPlatformId(), resultCheck.getErrmsg(), null);
                return resultCheck;
            }

        }
        paramsMap.clear();
        paramsMap.put("userId", user.getUuid());//用户主键UUID
        paramsMap.put("platformId", userParam.getPlatformId());//平台ID
      /*  List<TRoleVO> roleList = this.roleDao.selectRoleForLogin(paramsMap);//根据用户主键ID和系统ID查询角色信息

        if (!"78b0de7ecb22414cbb44025e4402204f".equals(user.getPlatformId())) {//GIS调度平台不验证角色信息(初版)
            if (roleList == null || roleList.size() <= 0) {//用户没有分配角色
             //   this.rabbitProvider.sendLogMessage(LogTypeConstrant.LOGIN, "该用户没有被分配角色权限", user.getLoginName(), false, userParam.getPlatformId(), "请先给用户分配角色", null);
                return returnData.returnError("请先给用户分配权限");
            }

            for (TRoleVO role : roleList) {// 根据角色查询权限信息
                role.setPlatformId(userParam.getPlatformId());
                List<TPermissionVO> permissionList = this.permissionDao.selectPermissionForLogin(role);// 查询角色和平台对应的权限信息

                if (permissionList != null && permissionList.size() > 0) {
                    for (TPermissionVO tPermissionVO : permissionList) {
                        userPermissionSet.add(tPermissionVO);// 权限信息LinkedHashSet集合
                    }
                }
            }
        }*/

        String accessToken = StringUtil.get32UUID();// 生成票据信息
     //   user.setRoleList(roleList);// 角色列表
        user.setPermissionSet(userPermissionSet);// 权限列表
        this.checkAndSaveRedis(user, sessionTimeoutMinute, accessToken, "55639d09f8994b49973a7d095e8f09be");// 检查并存放Redis
        user.setAccessToken(null);
        user.setPlatformId(userParam.getPlatformId());
    //    this.rabbitProvider.sendLogMessage(LogTypeConstrant.LOGIN, "登录成功", user.getLoginName(), true, userParam.getPlatformId(), null, null);
        if(loginType.equals(5)){
            UserVO params = new UserVO();
            params.setUuid(user.getUuid());
            params.setFailNum(0);
            this.userDao.updateUser(params);//密码验证成功重置次数
            this.jedisDao.del(getRedisKey(CommonConstrant.PREFIX_VERIFICATION_CODE, user.getPhone()));// 验证码验证成功后，删除验证码缓存
        }
        return returnData.returnResult(0, "成功", accessToken, null, user);
    }

    private String getRedisKey(String prefix, String postfix) {
        return prefix + "_" + postfix;
    }
    /**
     * 检查用户信息 1、判断Redis是否保存了loginName+platformType组成的key对应的用户信息 1.1
     * 如果有则删除(踢掉)之前用户的登陆信息 1.2 如果没有, 则存放信息。默认超时时间为3天
     *
     * @param user 用户+权限+角色信息
     * @param sessionTimeoutMinute 过期时间，单位为分钟
     * @param accessToken 访问令牌
     * @param platformId 平台ID
     */
    private synchronized void checkAndSaveRedis(UserVO user, Integer sessionTimeoutMinute,
                                                String accessToken, String platformId) {
        String loginName = user.getLoginName();// 用户登录名

        // 用户名+平台类型+平台ID组成的key
        String loginNameKey = this.getRedisKey(CommonConstrant.PREFIX_LOGIN_NAME, loginName) + "_" + platformId;
        /** 是否需要踢掉之前的用户 Start */
        UserVO userRedis = (UserVO) this.jedisDao.getObject(loginNameKey);
        if (userRedis != null) {// 之前已经有登录过的信息了
            // 删除用户信息和会话token
            this.jedisDao.del(loginNameKey);// 删除用户信息
            this.jedisDao.del(this.getRedisKey(CommonConstrant.PREFIX_TOKEN, userRedis.getAccessToken()));// 删除Token
            this.jedisDao.del(this.getRedisKey(CommonConstrant.PREFIX_PLATFORM_ID, userRedis.getAccessToken()));//删除平台信息

        }
        /** 是否需要踢掉之前的用户 End */

        // 向Redis缓存存放新的用户信息
        user.setAccessToken(accessToken);// 用户里保存Token信息
        this.jedisDao.set(this.getRedisKey(CommonConstrant.PREFIX_TOKEN, accessToken), loginName,
                TimeUtil.getSecondsByMinute(sessionTimeoutMinute));//存储用户名：key：token
        this.jedisDao.set(this.getRedisKey(CommonConstrant.PREFIX_PLATFORM_ID, accessToken), platformId,
                TimeUtil.getSecondsByMinute(sessionTimeoutMinute));//存储平台信息。key：token
        this.jedisDao.setObject(loginNameKey, user, TimeUtil.getSecondsByMinute(sessionTimeoutMinute));//存储用户信息
    }
    /**
     * 限制登录检查
     *
     * @param user  用户信息
     * @param checkType   1：验证用户名密码 2：验证用户名密码和验证码
     * @return
     */
    public ReturnData failCheckLoginHandle(UserVO user, UserVO userParam, int checkType) {
        BaseReturn returnData = new BaseReturn();
        Map<String, Object> extraData = new HashMap<String, Object>();// 结果Map
        extraData.put("isPwdExpires", false);
        extraData.put("countdown", 0);
        String typeName = "";
        if (checkType == 1) {
            typeName = "用户名或密码";
        }else{
            typeName = "密码或验证码";
        }
        int failNum = user.getFailNum() == null ? 0 : user.getFailNum();
        int surplusNum = limitNum - (failNum + 1) > 0 ? limitNum - (failNum + 1) : 0;// 剩余登录次数
        if (surplusNum == 0) {
            String limitDate = DateUtil.date2String(user.getLimitLoginTime());
            String currentDate = DateUtil.date2String(new Date());
            if (limitDate != null) {
                if (DateUtil.compareToCurTime(limitDate) < 0) {
                    long time = DateUtil.getMarginSeconds(currentDate, limitDate);
                    extraData.put("countdown", time);
                    return returnData.returnResult(1, "此账号已被限制登录，请在" + time + "秒之后重试", null, null,
                            extraData);
                } else {
                    // 验证用户名密码
                    if (checkType == 1) {
                        if (user.getLoginPwd().equalsIgnoreCase(userParam.getLoginPwd())) {
                            return returnData.returnSuccess("验证成功");
                        }
                        // 验证用户名密码和验证码
                    } else {
                        if (user.getLoginPwd().equalsIgnoreCase(userParam.getLoginPwd())) {
                            String code = this.jedisDao
                                    .get(getRedisKey(CommonConstrant.PREFIX_VERIFICATION_CODE, user.getPhone()));
                            if (userParam.getVerifiCode().equals(code)) {
                                return returnData.returnSuccess("验证成功");
                            } else {
                                typeName = "验证码";
                            }
                        }

                    }
                }
            }
            String limitLoginTime = DateUtil.addDateMinute(new Date(), limitTime);
            UserVO param = new UserVO();
            param.setUuid(user.getUuid());
            param.setFailNum(failNum + 1);
            param.setLimitLoginTime(DateUtil.string2Date(limitLoginTime));
            this.userDao.updateUser(param);// 更新用户基本信息
            long time = limitTime * 60;
            extraData.put("countdown", time);
            return returnData.returnResult(1, typeName + "错误此账号已被限制登录，请在" + time + "秒之后重试", null, null, extraData);
            //不超过次数逻辑
        } else {
            if (checkType == 1) {
                // 验证用户名密码
                if (user.getLoginPwd().equalsIgnoreCase(userParam.getLoginPwd())) {
                    return returnData.returnSuccess("验证成功");
                }

            } else {
                if (user.getLoginPwd().equalsIgnoreCase(userParam.getLoginPwd())) {
                    String code = this.jedisDao
                            .get(getRedisKey(CommonConstrant.PREFIX_VERIFICATION_CODE, user.getPhone()));
                    if (userParam.getVerifiCode().equals(code)) {
                        return returnData.returnSuccess("验证成功");
                    } else {
                        typeName = "验证码";
                    }
                } else {
                    typeName = "用户名或密码";
                }

            }
            UserVO params = new UserVO();
            params.setUuid(user.getUuid());
            params.setFailNum(failNum + 1);
            this.userDao.updateUser(params);// 更新失败次数
            return returnData.returnError(typeName + "错误，此账号仅剩" + surplusNum + "次登录尝试机会");
        }

    }

    /**
     * 用户登出
     * @param accessToken 访问令牌
     * @param platformId 平台标识/ID
     * @return
     */
    @Override
    public ReturnData userLogout(String accessToken, String platformId) {
        BaseReturn dataReturn = new BaseReturn();
        if("33333333333333333333333333333333".equals(accessToken)){//特殊token，不删除，直接返回成功
            return dataReturn.returnResult(0, "登出成功");
        }
        String tokenKey = this.getRedisKey(CommonConstrant.PREFIX_TOKEN, accessToken);//Token完整Key

        String loginName = this.jedisDao.get(tokenKey);//获取用户名
        if (StringUtil.isNotNull(loginName)) {
            this.LOGGER.info("删除Redis缓存的Token信息 =====> " + tokenKey);
            this.jedisDao.del(tokenKey);//删除token
            this.jedisDao.del(this.getRedisKey(CommonConstrant.PREFIX_PLATFORM_ID, accessToken));//删除平台信息

            //获取平台信息
         /*   TApplicationdevicebVO platform = this.applicationdevicebDao.selectApplicationdevicebById(platformId);
            if (platform != null) {
                //用户信息完整Key
                String userInfoKey = this.getRedisKey(CommonConstrant.PREFIX_LOGIN_NAME, loginName) + "_" + platformId;
                this.LOGGER.info("删除Redis缓存的用户角色权限信息 =====> " + userInfoKey);
                this.jedisDao.del(userInfoKey);
            }*/
        }
   //     this.rabbitProvider.sendLogMessage(LogTypeConstrant.LOGOUT, "登出成功", loginName, true, platformId, null, null);
        return dataReturn.returnResult(0, "登出成功");
    }
}
