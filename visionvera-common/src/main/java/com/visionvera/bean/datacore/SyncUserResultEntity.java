package com.visionvera.bean.datacore;

import java.io.Serializable;

/**
 * 同步用户结果实体类
 *
 */
public class SyncUserResultEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private String localLoginName;				//本平台用户名
	private String localPhone;					//本平台用户的手机号
	private String localCreateTime;				//本平台用户的创建时间
	private String otherLoginName;				//对方平台用户名
	private String otherPhone;					//对方平台用户的手机号
	private String otherCreateTime;				//对方平台用户的创建时间
	private String reason;						//同步失败原因
	
	public SyncUserResultEntity() {
	}

	public SyncUserResultEntity(String localLoginName, String localPhone, String localCreateTime, String otherLoginName,
			String otherPhone, String otherCreateTime, String reason) {
		this.localLoginName = localLoginName;
		this.localPhone = localPhone;
		this.localCreateTime = localCreateTime;
		this.otherLoginName = otherLoginName;
		this.otherPhone = otherPhone;
		this.otherCreateTime = otherCreateTime;
		this.reason = reason;
	}

	public String getLocalLoginName() {
		return localLoginName;
	}

	public void setLocalLoginName(String localLoginName) {
		this.localLoginName = localLoginName;
	}

	public String getLocalPhone() {
		return localPhone;
	}

	public void setLocalPhone(String localPhone) {
		this.localPhone = localPhone;
	}

	public String getLocalCreateTime() {
		return localCreateTime;
	}

	public void setLocalCreateTime(String localCreateTime) {
		this.localCreateTime = localCreateTime;
	}

	public String getOtherLoginName() {
		return otherLoginName;
	}

	public void setOtherLoginName(String otherLoginName) {
		this.otherLoginName = otherLoginName;
	}

	public String getOtherPhone() {
		return otherPhone;
	}

	public void setOtherPhone(String otherPhone) {
		this.otherPhone = otherPhone;
	}

	public String getOtherCreateTime() {
		return otherCreateTime;
	}

	public void setOtherCreateTime(String otherCreateTime) {
		this.otherCreateTime = otherCreateTime;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
}
