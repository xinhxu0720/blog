package com.visionvera.bean.cms;

import java.io.Serializable;

/**
 * 用户登录的实体类
 *
 */
public class UserLogin implements Serializable {
	private static final long serialVersionUID = 1L;
	private String uuid; 				//用户uuid
	private String loginName;			//登录名称
	private String loginPwd;			//登录密码
	private String phone;			    //用户手机
	private String verifiCode;  		//验证码
	private String createTime; 		    //创建时间
	
	public UserLogin() {
	}

	public UserLogin(String uuid, String loginName, String loginPwd, String phone, String verifiCode,
			String createTime) {
		this.uuid = uuid;
		this.loginName = loginName;
		this.loginPwd = loginPwd;
		this.phone = phone;
		this.verifiCode = verifiCode;
		this.createTime = createTime;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
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

	public String getVerifiCode() {
		return verifiCode;
	}

	public void setVerifiCode(String verifiCode) {
		this.verifiCode = verifiCode;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
}
