/**  
 * @Title: CMSUserVO.java
 * @Package com.visionvera.union.bean
 * @Description: TODO
 * @author 谢程算
 * @date 2018年6月11日
 */
package com.visionvera.bean.cms;

/**
 * ClassName: CMSUserVO 
 * @Description: TODO
 * @author 谢程算
 * @date 2018年6月11日
 */
public class CMSUserVO {
	private String name;
	private String pwd;
	private String sessionID;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}
	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	/**
	 * @return the sessionID
	 */
	public String getSessionID() {
		return sessionID;
	}
	/**
	 * @param sessionID the sessionID to set
	 */
	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}
	
}
