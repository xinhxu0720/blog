package com.visionvera.bean.datacore;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhanghui
 * @since 2018-10-18
 */
public class LmtUserVo {

    // 第三方用户ID
    private String uuid ;
    
    // 真实姓名
    private String realName ;
    
    // 登录名
    private String loginName ;
    
    // 密码
    private String loginPwd ;
    
    // 老的密码
    private String oldPwd ;
    
    // 手机号码
    private String phone ;
    
    // 平台ID
    private String platformId ;
    
    // 行业ID,逗号分隔
    private String industryId ;
    
    // 组织名称
    private String orgName ;
    
    // 角色ID，逗号分隔
    private String roleIds ;
    
    // 工作区域ID
    private String areaId ;
    
    // 工作区域名称
    private String areaName ;
    
    // 令牌
    private String token ;
    
    // 注册时间
    private long registerTime; 
    
    // 最后更新时间
    private long updateTime;
    
    // 头像地址
    private String headImgUrl ;

    // 身份证ID
    private String idCard ;
    
    // 昵称
    private String nickName ;
    
    // 地址
    private String address ;
    
    // 邮箱地址
    private String email ;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
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

	public String getOldPwd() {
		return oldPwd;
	}

	public void setOldPwd(String oldPwd) {
		this.oldPwd = oldPwd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPlatformId() {
		return platformId;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	public String getIndustryId() {
		return industryId;
	}

	public void setIndustryId(String industryId) {
		this.industryId = industryId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getRoleIds() {
		return roleIds;
	}

	public void setRoleIds(String roleIds) {
		this.roleIds = roleIds;
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

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public long getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(long registerTime) {
		this.registerTime = registerTime;
	}

	public long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(long updateTime) {
		this.updateTime = updateTime;
	}

	public String getHeadImgUrl() {
		return headImgUrl;
	}

	public void setHeadImgUrl(String headImgUrl) {
		this.headImgUrl = headImgUrl;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
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
    
}
