package com.visionvera.bean.datacore;

import java.io.Serializable;


/**
 * <p>
 * 
 * </p>
 *
 * @author zhanghui
 * @since 2018-10-24
 */

public class ServerConfig implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	private Integer id;
	/**
	 * ip地址
	 */
	private String ip;
	/**
	 * 端口
	 */
	private Integer port;
	/**
	 * 登录名
	 */
	private String loginName;
	/**
	 * 密码
	 */
	private String loginPwd;
	/**
	 * token值
	 */
	private String token;
	/**
	 * 其他平台给智能运维统一平台的平台ID
	 */
	private String platformId;
	/**
	 * 智能运维平台给其他平台的平台ID
	 */
	private String otherPlatformId;
	/**
	 * 修改时间
	 */
	private String updateTime;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 扩展字段1
	 */
	private String field1;
	/**
	 * 扩展字段2
	 */
	private String field2;
	/**
	 * 扩展字段3
	 */
	private String field3;
	/**
	 * 扩展字段4
	 */
	private String field4;
	
	/** 以下是扩展字段 */
	/** 平台类别 */
	private String platformType;
	
	/** 平台名称 */
	private String platformName;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
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
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getPlatformId() {
		return platformId;
	}
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}
	public String getOtherPlatformId() {
		return otherPlatformId;
	}
	public void setOtherPlatformId(String otherPlatformId) {
		this.otherPlatformId = otherPlatformId;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getField1() {
		return field1;
	}
	public void setField1(String field1) {
		this.field1 = field1;
	}
	public String getField2() {
		return field2;
	}
	public void setField2(String field2) {
		this.field2 = field2;
	}
	public String getField3() {
		return field3;
	}
	public void setField3(String field3) {
		this.field3 = field3;
	}
	public String getField4() {
		return field4;
	}
	public void setField4(String field4) {
		this.field4 = field4;
	}
	public String getPlatformType() {
		return platformType;
	}
	public void setPlatformType(String platformType) {
		this.platformType = platformType;
	}
	public String getPlatformName() {
		return platformName;
	}
	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}
	@Override
	public String toString() {
		return "ServerConfig{" +
			   "id=" + id +
			   ", ip=" + ip +
			   ", port=" + port +
			   ", loginName=" + loginName +
			   ", loginPwd=" + loginPwd +
			   ", token=" + token +
			   ", platformId=" + platformId +
			   ", otherPlatformId=" + otherPlatformId +
			   ", updateTime=" + updateTime +
			   ", remark=" + remark +
			   ", field1=" + field1 +
			   ", field2=" + field2 +
			   ", field3=" + field3 +
			   ", field4=" + field4 +
			"}";
	}
	
	public String getLmtUrl() {
		return "http://" + this.ip + ":" + this.port;
	}

	/**
	 * 获取服务器的URL
	 * @return http://ip:port 注意，结尾没有/
	 */
	public String getUrl() {
		return this.getLmtUrl();
	}
}
