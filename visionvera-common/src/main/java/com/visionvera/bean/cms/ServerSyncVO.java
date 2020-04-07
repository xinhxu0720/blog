package com.visionvera.bean.cms;

public class ServerSyncVO {
	private String dstIp;//上级服务器IP
	private String dstPort;//上级服务器端口
	private String dstAccount;//上级服务器登录账号
	private String dstPassword;//上级服务器登录密码
	private String dstAreaId;//上级服务器所在行政区域ID
	private String dstAreaName;//上级系统所在的行政区域名称
	private String registerId;//本系统在父系统中的uuid，注册成功后由父系统返回
	private String dstProtocol ;//上级服务协议

	private String uuid;//序号（主键）
	private String name;//服务器名称
	private Integer type;//服务器类型
	private String ip;//服务器IP
	private String port;//服务器端口
	private String account;//服务器登录账号
	private String password;//服务器登录密码
	private String areaId;//本系统所在的行政区域ID
	private String protocol ;//服务协议
	
	private String areaName;//本系统所在的行政区域名称
	private String createTime;//系统注册时间

	public String getDstIp() {
		return dstIp;
	}
	public void setDstIp(String dstIp) {
		this.dstIp = dstIp;
	}
	public String getDstPort() {
		return dstPort;
	}
	public void setDstPort(String dstPort) {
		this.dstPort = dstPort;
	}
	public String getDstAccount() {
		return dstAccount;
	}
	public void setDstAccount(String dstAccount) {
		this.dstAccount = dstAccount;
	}
	public String getDstPassword() {
		return dstPassword;
	}
	public void setDstPassword(String dstPassword) {
		this.dstPassword = dstPassword;
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
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRegisterId() {
		return registerId;
	}
	public void setRegisterId(String registerId) {
		this.registerId = registerId;
	}
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	public String getDstAreaId() {
		return dstAreaId;
	}
	public void setDstAreaId(String dstAreaId) {
		this.dstAreaId = dstAreaId;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getDstAreaName() {
		return dstAreaName;
	}
	public void setDstAreaName(String dstAreaName) {
		this.dstAreaName = dstAreaName;
	}
	public String getDstProtocol() {
		return dstProtocol;
	}
	public void setDstProtocol(String dstProtocol) {
		this.dstProtocol = dstProtocol;
	}
	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	
}
