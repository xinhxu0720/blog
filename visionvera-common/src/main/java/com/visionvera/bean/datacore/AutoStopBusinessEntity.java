package com.visionvera.bean.datacore;

import java.io.Serializable;
import java.util.List;

/**
 * 自动掐断业务：会议、直播、可视电话、升级、录制、点播、监控等业务的抽象实体
 * @author Bianjf
 *
 */
public class AutoStopBusinessEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private String primaryKey;				//业务主键
	
	private String startTime;				//开始时间
	
	private String endTime;					//结束时间
	
	private Integer platformType;				//平台类型
	
	private String stopStatus;				//停止类型：1正常停止 2 自动停止 3 手动停会
	
	private String loginName;				//登录名称
	
	private String loginPwd;				//密码
	
	private String masterZoneDevNo;				//主席设备号
	
	private String masterRegionId;          //主席行政区域号码
	
	private String msgNo;                   //协转主消息号
	
	private String monitor;                 //监控号码
	
	private String msgNoRegionId;           //协转主消息号行政区域
	
	private String zoneMsgNo;           //行政区域+5位协转主消息号
	
	private String zoneDevNo;           //行政区域+终端号码
	
	/**
	 * 业务类型。0表示可视电话；1表示发布直播；2表示发布监控；3表示发布升级；7表示录制；8表示点播；11表示一级会议；12表示二级会议；13表示三级会议；14表示四级会议；15表示五级会议
	 */
	private Integer busiessType;
	
	private String businessLevel;			//业务级别(目前只有会议含有会议级别，其他业务均无级别)
	
	private List<AutoStopBusinessDeviceEntity> deviceList;//业务所使用的设备信息列表
	
	private String meetingName;           //会议名称
	
	private Integer createType;           //会议创建平台
	
	public AutoStopBusinessEntity() {
	}

	public AutoStopBusinessEntity(String primaryKey, String startTime, String endTime, Integer platformType,
			String stopStatus, String loginName, String loginPwd, String masterZoneDevNo, Integer busiessType,
			String businessLevel, List<AutoStopBusinessDeviceEntity> deviceList) {
		this.primaryKey = primaryKey;
		this.startTime = startTime;
		this.endTime = endTime;
		this.platformType = platformType;
		this.stopStatus = stopStatus;
		this.loginName = loginName;
		this.loginPwd = loginPwd;
		this.masterZoneDevNo = masterZoneDevNo;
		this.busiessType = busiessType;
		this.businessLevel = businessLevel;
		this.deviceList = deviceList;
	}

	public String getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Integer getPlatformType() {
		return platformType;
	}

	public void setPlatformType(Integer platformType) {
		this.platformType = platformType;
	}

	public String getStopStatus() {
		return stopStatus;
	}

	public void setStopStatus(String stopStatus) {
		this.stopStatus = stopStatus;
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

	public Integer getBusiessType() {
		return busiessType;
	}

	public void setBusiessType(Integer busiessType) {
		this.busiessType = busiessType;
	}

	public String getBusinessLevel() {
		return businessLevel;
	}

	public void setBusinessLevel(String businessLevel) {
		this.businessLevel = businessLevel;
	}

	public List<AutoStopBusinessDeviceEntity> getDeviceList() {
		return deviceList;
	}

	public void setDeviceList(List<AutoStopBusinessDeviceEntity> deviceList) {
		this.deviceList = deviceList;
	}
	
	public String getMasterZoneDevNo() {
		return masterZoneDevNo;
	}

	public void setMasterZoneDevNo(String masterZoneDevNo) {
		this.masterZoneDevNo = masterZoneDevNo;
	}

	public String getMasterRegionId() {
		return masterRegionId;
	}

	public void setMasterRegionId(String masterRegionId) {
		this.masterRegionId = masterRegionId;
	}

	public String getMsgNo() {
		return msgNo;
	}

	public void setMsgNo(String msgNo) {
		this.msgNo = msgNo;
	}

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}

	public String getMsgNoRegionId() {
		return msgNoRegionId;
	}

	public void setMsgNoRegionId(String msgNoRegionId) {
		this.msgNoRegionId = msgNoRegionId;
	}

	public String getZoneMsgNo() {
		return zoneMsgNo;
	}

	public void setZoneMsgNo(String zoneMsgNo) {
		this.zoneMsgNo = zoneMsgNo;
	}

	public String getZoneDevNo() {
		return zoneDevNo;
	}

	public void setZoneDevNo(String zoneDevNo) {
		this.zoneDevNo = zoneDevNo;
	}

	public String getMeetingName() {
		return meetingName;
	}

	public void setMeetingName(String meetingName) {
		this.meetingName = meetingName;
	}

	public Integer getCreateType() {
		return createType;
	}

	public void setCreateType(Integer createType) {
		this.createType = createType;
	}

}
