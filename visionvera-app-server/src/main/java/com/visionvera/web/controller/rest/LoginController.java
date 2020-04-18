package com.visionvera.web.controller.rest;

import com.visionvera.bean.base.BaseReturn;
import com.visionvera.bean.base.ReturnData;
import com.visionvera.bean.cms.UserVO;
import com.visionvera.config.SysConfig;
import com.visionvera.constrant.CommonConstrant;
import com.visionvera.dao.JRedisDao;
import com.visionvera.service.TrackService;
import com.visionvera.service.UserService;
import com.visionvera.util.IPUtils;
import com.visionvera.util.StringUtil;
import com.visionvera.util.TimeUtil;
import com.visionvera.vo.IPEntity;
import com.visionvera.vo.Track;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * 登陆
 */
@CrossOrigin
@RestController
@RequestMapping("/rest")
public class LoginController extends BaseReturn {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;


    @Autowired
    private JRedisDao jedisDao;

    @Autowired
    SysConfig sysConfig;

    @Resource
    TrackService trackService;

    /**
     * 用户登录
     *
     * @param user                 用户信息
     * @param loginType            登陆类型。1: 表示用户名密码登录；2: 表示手机号密码登录；3: 表示手机号验证码登录； 4: 表示用户名验证码  5: 表示用户名密码验证码
     * @param platformType         1: 只能运维统一管理平台; 2: 运维工作站; 3: 视联汇APP; 4: 视联管家; 5: Pamir; 6: GIS调度平台
     * @param sessionTimeoutMinute session过期时间，分钟
     * @return
     */
    @RequestMapping(value = "/user/{loginType}/login", method = RequestMethod.POST, consumes = "application/json;charset=utf-8")
    public ReturnData userLogin(@RequestBody UserVO user, @PathVariable("loginType") Integer loginType,
                                @RequestParam(required = false) Integer sessionTimeoutMinute, HttpServletResponse response,
                                HttpServletRequest request) {
        try {
            /** 数据校验 Start */
            if (StringUtil.isNull(user.getPlatformId())) {
                return super.returnError("平台标识不能为空");
            }

            if (loginType.equals(1)) {
                if (StringUtil.isNull(user.getLoginName()) || StringUtil.isNull(user.getLoginPwd())) {
                    return super.returnError("用户名或密码不能为空");
                }
            } else if (loginType.equals(2)) {
                if (StringUtil.isNull(user.getPhone()) || StringUtil.isNull(user.getLoginPwd())) {
                    return super.returnError("手机号或密码不能为空");
                }
            } else if (loginType.equals(3)) {
                if (StringUtil.isNull(user.getPhone()) || StringUtil.isNull(user.getVerifiCode())) {
                    return super.returnError("手机号或验证码不能为空");
                }
            } else if (loginType.equals(4)) {
                if (StringUtil.isNull(user.getLoginName()) || StringUtil.isNull(user.getVerifiCode())) {
                    return super.returnError("用户名或验证码不能为空");
                }
            } else if (loginType.equals(5)) {
                if (StringUtil.isNull(user.getLoginName()) || StringUtil.isNull(user.getLoginPwd())) {
                    return super.returnError("用户名或密码不能为空");
                }
                if (StringUtil.isNull(user.getVerifiCode())) {
                    return super.returnError("验证码不能为空");
                }
            } else {
                return super.returnError("登陆类型错误");
            }
            /** 数据校验 End */

            //登录成功设置
            String ipAddress = this.getIpAddress(request);

            Track ip = trackService.findIp(ipAddress);
            Track track = new Track();
            if (null == ip) {
                IPEntity msg = IPUtils.getIPMsg(ipAddress);
                //添加城市数据
                MeetingController.setCityData(track,msg);
                track.setIp(ipAddress);
                track.setVersion(1);
                track.setCreateDate(new Date());
                track.setCountry("初次登录");
                trackService.add(track);
            }


            /** 设置Cookie Start */
            ReturnData resultData = this.userService.userLogin(user, loginType, sessionTimeoutMinute);
            if (resultData.getErrcode().equals(0)) {//用户登录成功，存储Cookie
                Cookie tokenCookie = new Cookie("access_token", resultData.getAccess_token());//向Cookie中添加token
                Cookie platformIdCookie = new Cookie("platformId", user.getPlatformId());
                tokenCookie.setMaxAge(TimeUtil.getSecondsByMinute(sessionTimeoutMinute));//设置失效时间，默认为3天
                platformIdCookie.setMaxAge(TimeUtil.getSecondsByMinute(sessionTimeoutMinute));//设置失效时间，默认为3天
                response.addCookie(tokenCookie);
                response.addCookie(platformIdCookie);
            }
            /** 设置Cookie End */
            resultData.setSysBit("64");

            if (null != ip){
                IPEntity msg = IPUtils.getIPMsg(ipAddress);
                //添加城市数据
                MeetingController.setCityData(track,msg);
                track.setVersion(ip.getVersion() + 1);
                track.setModifyDate(new Date());
                if (resultData.getErrcode() == 0){
                    track.setCountry("二次登录,登录成功");
                }else {
                    track.setCountry("二次登录,登录失败");
                }
                track.setId(ip.getId());
                trackService.update(track);
            }


            return resultData;
        } catch (Exception e) {
            this.LOGGER.error("用户登录系统异常=====>", e);
            //	this.rabbitProvider.sendLogMessage(LogTypeConstrant.LOGIN, "用户登录系统异常", user.getLoginName(), false, user.getPlatformId(), "用户登录系统异常", null);
            return super.returnError("用户登录失败");
        }
    }

    /**
     * 用户登出
     *
     * @param accessToken 访问令牌
     * @param platformId  平台标识/ID
     * @return
     */
    @RequestMapping(value = "/user/{platformId}/logout", method = RequestMethod.POST, consumes = "application/json;charset=utf-8")
    public ReturnData userLogout(@RequestParam("access_token") String accessToken, @PathVariable("platformId") String platformId) {
        String loginName = "";
        try {
            loginName = this.jedisDao.get(CommonConstrant.PREFIX_PLATFORM_ID + "_" + accessToken);
            return this.userService.userLogout(accessToken, platformId);
        } catch (Exception e) {
            this.LOGGER.error("用户登出异常=====>", e);
            //	this.rabbitProvider.sendLogMessage(LogTypeConstrant.LOGOUT, "用户登出系统异常", loginName, false, platformId, "用户登出系统异常", accessToken);
            return super.returnError("用户登出失败");
        }
    }


    /**
     * 根据用户名密码获取短信验证码
     * @param user
     * @return
     */
	/*@RequestMapping(value = "/user/sendCodeByCondition", method = RequestMethod.POST, consumes = "application/json;charset=utf-8")
	public ReturnData sendCodeByCondition(@RequestBody UserVO user) {
		try {
			if (StringUtil.isNull(user.getLoginName()) || StringUtil.isNull(user.getLoginPwd())) {
				return super.returnError("用户名或密码不能为空");
			}
			return this.userService.sendCodeByLoginNameAndLoginPwd(user);
		} catch (BusinessException e) {
			this.LOGGER.error("根据用户名密码获取短信验证码失败，失败的原因是: {}", e.getMessage(), e);
			return super.returnError(e.getMessage());
		} catch (Exception e) {
			this.LOGGER.error("根据用户名密码获取短信验证码失败", e);
			return super.returnError("根据用户名密码获取短信验证码失败");
		}
	}*/

    /**
     * 根据手机号获取短信验证码
     *
     * @param user
     * @return
     */
	/*@RequestMapping(value = "/user/sendCodeByPhone", method = RequestMethod.POST, consumes = "application/json;charset=utf-8")
	public ReturnData sendCodeByPhone(@RequestBody UserVO user) {
		try {
			String phone = user.getPhone();
			if (StringUtil.isNull(phone)) {
				return super.returnError("手机号码不能为空");
			}
			if(!CheckFormUtil.checkMobileNumber(phone)){
				return super.returnError("请输入正确的手机号");
			}
			
			return this.userService.sendCodeByPhone(user);
		} catch (BusinessException e) {
			this.LOGGER.error("根据手机号获取短信验证码失败，失败的原因是: {}", e.getMessage(), e);
			return super.returnError(e.getMessage());
		} catch (Exception e) {
			this.LOGGER.error("根据手机号获取短信验证码失败", e);
			return super.returnError("根据手机号获取短信验证码失败");
		}
	}*/
    public static String getIpAddress(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
}
