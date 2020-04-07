/**   
 * @Title: UserVO.java 
 * @Package com.visionvera.cms.bean 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author zhaolei
 * @date 2016年8月12日 下午5:26:56 
 * @version V1.0   
 */
package com.visionvera.bean.cms;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.visionvera.bean.base.BaseTimeEntity;
import com.visionvera.bean.datacore.TPermissionVO;
import com.visionvera.bean.datacore.TRoleVO;

/**
 * @ClassName: UserVO
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaolei
 * @date 2016年8月12日 下午5:26:56
 * 
 */
@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class UserVO extends BaseTimeEntity {
	private static final long serialVersionUID = 1L;



	public UserVO() {
		super();
	}

	private String uuid; 				//用户uuid
	private String name; 				//用户名称
	private String loginName;			//登录名称
	private String loginPwd;			//登录密码
	private String role;				//用户角色
	private String roleIds;				//用户角色ID
	private String phone;			    //用户手机
	private String description;			//备注
	private Integer status;				//用户状态 0不在线 1在线
	private String groupId;			    //用户组id
	private String groupName;			//用户组名
	private String operatorId;          //操作人ID（webservice调用时须传递该参数）
	private String orgId;               //工作单位编号
	private String orgName;             //工作单位名称
	private String areaId;              //所在区域编号
	private String areaName;            //所在区域名称
	private Integer gradeId;			//行政区域级别
	private String departId;            //部门名称
	private String departName;          //所在部门名称
	private String oldPwd;              //旧密码   应用于重置密码接口
	private String newPwd;              //新密码   应用于重置密码接口
	private Integer isvalid;            //webservice专用，判断注册的用户是否生效（0无效，1有效）
	private Integer editType;           //用户修改操作的类型
	private Integer isWsLogin;          //webservice专用，是否从webservice登录过。0未登录过，1登录过
	private String imgUrl;              //用户头像url
	private String devId;               //终端号码，多个值用,分割
	private String postName;            //岗位
	private String rankName;            //职级
	private String idCard;              //身份证号
	private Integer webLogin;           //是否允许登录会管 0-不允许，1-允许
	private Integer infoOk;             //用户信息是否合法（终端号是否正确） 0-不合法，1-合法
	private String createTime; 			//申请时间
	private String updateTime;			//最后一次修改时间
	private Integer type;               //用户类型：1会控助手，2其他
	private String nickName;			//用户昵称
	private String deviceIds;			//设备号码，多值
	private String devGroupIds;			//群组ID，多值
	private String address;             //设备地址
	private String email;				//email
//	private int userid;					//用户系统自增int 类型的id CRUD需要
	private Integer maxDevNum;          //使用会控助手开会的最大参会终端数量，默认20个，最多200个
	private Integer allowHkzs;          //是否允许登录会控助手。0禁止登录 1普通用户，2vip用户
	private String svrRegionName;		//数据来源-子系统行政区域名称 
	private String svrRegionId;			//数据来源-子系统行政区域ID
	private String permission;          //会控权限分配 ","号分割九种权限。依次是：V观大数据、会控、遥控器、点播回放、分布图、唐古拉监控、运维工具、会议信息、智能音箱
	private String loginModule;			//可登陆模块。1表示展示中心；2表示告警中心；3表示感知中心；4表示调度中心。多个使用英文逗号隔开
	private String industryId;			//行业归属ID
	private String industryName;		//行业归属名字
	private String platformName;		//平台名字
	private String platformId;			//平台ID
	private Integer platformType;		//平台类型
	private List<TRoleVO> roleList;		//角色列表信息
	private Set<TPermissionVO> permissionSet;//权限列表
	private String accessToken;			//访问令牌
	private String verifiCode;			//验证码
	private String source;             //用户注册来源
	private String approve;				//用于预约会议是否需要审批。1需要，0不需要
	private String isDefault;			//是否是默认用户。0表示不是默认用户；1表示是默认用户
    private String isDelete;			//前端是否允许删除。0表示允许删除；1表示不允许删除
    private String realName;			//兼容流媒体用户的真实用户名
    private String md5Pwd;				//md5的密码
    private String sm3Pwd;				//sm3的密码
    private Integer failNum;             //登录失败次数
    private Date  pwdModifyTime;         //最后密码修改时间
    private Date  limitLoginTime;        //限制登录时间
    
    /** 扩展字段 */
    private String ext1;				//扩展字段1
    private String ext2;				//扩展字段2
    private String ext3;				//扩展字段3
    private String ext4;				//扩展字段4
    private String ext5;				//扩展字段5
    
	public String getSm3Pwd() {
		return sm3Pwd;
	}
	public void setSm3Pwd(String sm3Pwd) {
		this.sm3Pwd = sm3Pwd;
	}
	public String getMd5Pwd() {
		return md5Pwd;
	}
	public void setMd5Pwd(String md5Pwd) {
		this.md5Pwd = md5Pwd;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getDepartId() {
		return departId;
	}
	public void setDepartId(String departId) {
		this.departId = departId;
	}
	public String getDepartName() {
		return departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	public String getOldPwd() {
		return oldPwd;
	}
	public void setOldPwd(String oldPwd) {
		this.oldPwd = oldPwd;
	}
	public String getNewPwd() {
		return newPwd;
	}
	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}
	public Integer getIsvalid() {
		return isvalid;
	}
	public void setIsvalid(Integer isvalid) {
		this.isvalid = isvalid;
	}
	public Integer getEditType() {
		return editType;
	}
	public void setEditType(Integer editType) {
		this.editType = editType;
	}
	public Integer getIsWsLogin() {
		return isWsLogin;
	}
	public void setIsWsLogin(Integer isWsLogin) {
		this.isWsLogin = isWsLogin;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getDevId() {
		return devId;
	}
	public void setDevId(String devId) {
		this.devId = devId;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public String getRankName() {
		return rankName;
	}
	public void setRankName(String rankName) {
		this.rankName = rankName;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public Integer getWebLogin() {
		return webLogin;
	}
	public void setWebLogin(Integer webLogin) {
		this.webLogin = webLogin;
	}
	public Integer getInfoOk() {
		return infoOk;
	}
	public void setInfoOk(Integer infoOk) {
		this.infoOk = infoOk;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getDeviceIds() {
		return deviceIds;
	}
	public void setDeviceIds(String deviceIds) {
		this.deviceIds = deviceIds;
	}
	public String getDevGroupIds() {
		return devGroupIds;
	}
	public void setDevGroupIds(String devGroupIds) {
		this.devGroupIds = devGroupIds;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getMaxDevNum() {
		return maxDevNum;
	}
	public void setMaxDevNum(Integer maxDevNum) {
		this.maxDevNum = maxDevNum;
	}
	public Integer getAllowHkzs() {
		return allowHkzs;
	}
	public void setAllowHkzs(Integer allowHkzs) {
		this.allowHkzs = allowHkzs;
	}
	public String getSvrRegionName() {
		return svrRegionName;
	}
	public void setSvrRegionName(String svrRegionName) {
		this.svrRegionName = svrRegionName;
	}
	public String getSvrRegionId() {
		return svrRegionId;
	}
	public void setSvrRegionId(String svrRegionId) {
		this.svrRegionId = svrRegionId;
	}
	public String getPermission() {
		return permission;
	}
	public void setPermission(String permission) {
		this.permission = permission;
	}
	public String getIndustryId() {
		return industryId;
	}
	public void setIndustryId(String industryId) {
		this.industryId = industryId;
	}
	public String getIndustryName() {
		return industryName;
	}
	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}
	public String getPlatformName() {
		return platformName;
	}
	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}
	public Integer getPlatformType() {
		return platformType;
	}
	public void setPlatformType(Integer platformType) {
		this.platformType = platformType;
	}
	public List<TRoleVO> getRoleList() {
		return roleList;
	}
	public void setRoleList(List<TRoleVO> roleList) {
		this.roleList = roleList;
	}
	public Set<TPermissionVO> getPermissionSet() {
		return permissionSet;
	}
	public void setPermissionSet(Set<TPermissionVO> permissionSet) {
		this.permissionSet = permissionSet;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getRoleIds() {
		return roleIds;
	}
	public void setRoleIds(String roleIds) {
		this.roleIds = roleIds;
	}
	public String getPlatformId() {
		return platformId;
	}
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}
	public String getVerifiCode() {
		return verifiCode;
	}
	public void setVerifiCode(String verifiCode) {
		this.verifiCode = verifiCode;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	@Deprecated
	public String getLoginModule() {
		return loginModule;
	}
	@Deprecated
	public void setLoginModule(String loginModule) {
		this.loginModule = loginModule;
	}
	public Integer getGradeId() {
		return gradeId;
	}
	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
	public String getApprove() {
		return approve;
	}
	public void setApprove(String approve) {
		this.approve = approve;
	}
	public String getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}
	public String getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public Integer getFailNum() {
		return failNum;
	}
	public void setFailNum(Integer failNum) {
		this.failNum = failNum;
	}
	public Date getPwdModifyTime() {
		return pwdModifyTime;
	}
	public void setPwdModifyTime(Date pwdModifyTime) {
		this.pwdModifyTime = pwdModifyTime;
	}
	public Date getLimitLoginTime() {
		return limitLoginTime;
	}
	public void setLimitLoginTime(Date limitLoginTime) {
		this.limitLoginTime = limitLoginTime;
	}
	public String getExt1() {
		return ext1;
	}
	public void setExt1(String ext1) {
		this.ext1 = ext1;
	}
	public String getExt2() {
		return ext2;
	}
	public void setExt2(String ext2) {
		this.ext2 = ext2;
	}
	public String getExt3() {
		return ext3;
	}
	public void setExt3(String ext3) {
		this.ext3 = ext3;
	}
	public String getExt4() {
		return ext4;
	}
	public void setExt4(String ext4) {
		this.ext4 = ext4;
	}
	public String getExt5() {
		return ext5;
	}
	public void setExt5(String ext5) {
		this.ext5 = ext5;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((loginName == null) ? 0 : loginName.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserVO other = (UserVO) obj;
		if (loginName == null) {
			if (other.loginName != null)
				return false;
		} else if (!loginName.equals(other.loginName))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}
}
