package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @ClassName: ScheduleBean 
 * @Description: TODO 用户查询预约列表bean 
 * @author zhaolei
 * @date 2016年8月12日 下午3:29:58 
 *
 */
@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class ScheduleStateVO {
	
	private String scheduleId;  //预约ID
	private String masterNo;   //主席号码
	private String speaker1;   //发一号码
	private String speaker2;   //发二号码
	private String svrUrl;      //会议使用的调度服务器地址
	private String svrAccount;  //会议使用的调度服务器账号
	private String svrPassword; //会议使用的调度服务器密码
	private String userId;      //开会用户ID
	private String devSecStream;   //辅流设备号码
	private String masterZoneno;   //主席设备区号
	private String speakerZoneno1;   //发一设备区号
	private String speakerZoneno2;   //发二设备区号
	
	public String getDevSecStream() {
		return devSecStream;
	}
	public void setDevSecStream(String devSecStream) {
		this.devSecStream = devSecStream;
	}
	public String getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getMasterNo() {
		return masterNo;
	}
	public void setMasterNo(String masterNo) {
		this.masterNo = masterNo;
	}
	public String getSpeaker1() {
		return speaker1;
	}
	public void setSpeaker1(String speaker1) {
		this.speaker1 = speaker1;
	}
	public String getSpeaker2() {
		return speaker2;
	}
	public void setSpeaker2(String speaker2) {
		this.speaker2 = speaker2;
	}
	public String getSvrUrl() {
		return svrUrl;
	}
	public void setSvrUrl(String svrUrl) {
		this.svrUrl = svrUrl;
	}
	public String getSvrAccount() {
		return svrAccount;
	}
	public void setSvrAccount(String svrAccount) {
		this.svrAccount = svrAccount;
	}
	public String getSvrPassword() {
		return svrPassword;
	}
	public void setSvrPassword(String svrPassword) {
		this.svrPassword = svrPassword;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMasterZoneno() {
		return masterZoneno;
	}
	public void setMasterZoneno(String masterZoneno) {
		this.masterZoneno = masterZoneno;
	}
	public String getSpeakerZoneno1() {
		return speakerZoneno1;
	}
	public void setSpeakerZoneno1(String speakerZoneno1) {
		this.speakerZoneno1 = speakerZoneno1;
	}
	public String getSpeakerZoneno2() {
		return speakerZoneno2;
	}
	public void setSpeakerZoneno2(String speakerZoneno2) {
		this.speakerZoneno2 = speakerZoneno2;
	}
	
}
