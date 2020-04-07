package com.visionvera.bean.cms;

public class ServerVO {
	private String uuid;//序号
	private String name;//服务器名称
	private Integer type;//服务器类型
	private String ip;//服务器IP
	private String port;//服务器端口
	private String account;//服务器登录账号
	private String password;//服务器登录密码
	private int tcpState; //开关

	public int getTcpState() {
		return tcpState;
	}
	public void setTcpState(int tcpState) {
		this.tcpState = tcpState;
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
	
}
