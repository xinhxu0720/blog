package com.visionvera.bean.restful;

/**
 * 自定义webservice错误返回信息
 * 
 * @author xiechengsuan 创建日期 2018.5.31
 */
public class SysInfo {
	String ip;
	String port;
	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}
	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
	/**
	 * @return the port
	 */
	public String getPort() {
		return port;
	}
	/**
	 * @param port the port to set
	 */
	public void setPort(String port) {
		this.port = port;
	}
}
