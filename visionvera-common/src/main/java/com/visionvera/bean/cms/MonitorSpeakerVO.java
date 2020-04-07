package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 监控切发言人VO
 * @author wangqiubao
 */
@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class MonitorSpeakerVO {
	public MonitorSpeakerVO() {
		super();
	}

	private String addMsgId;					//绑定监控:消息号
	private String addMonitorId;				//绑定监控:监控ID
	private String addDevno ;			    	//绑定监控:设备号(主消息号终端号码)
	private String addDevName;				    //绑定监控:设备名称
	private Integer addStreamType;				//绑定监控:大小流
	private String changeMonitorUUID ;			//切发1:监控UUID
	private String delMonitorUUID ;				//解绑监控:监控UUID
	private String scheduleId ;					//会议id
	private String describeInfo ;				//描述信息

	public String getAddMsgId() {
		return addMsgId;
	}
	public void setAddMsgId(String addMsgId) {
		this.addMsgId = addMsgId;
	}
	public String getAddMonitorId() {
		return addMonitorId;
	}
	public void setAddMonitorId(String addMonitorId) {
		this.addMonitorId = addMonitorId;
	}
	public String getAddDevno() {
		return addDevno;
	}
	public void setAddDevno(String addDevno) {
		this.addDevno = addDevno;
	}
	public String getAddDevName() {
		return addDevName;
	}
	public void setAddDevName(String addDevName) {
		this.addDevName = addDevName;
	}
	public Integer getAddStreamType() {
		return addStreamType;
	}
	public void setAddStreamType(Integer addStreamType) {
		this.addStreamType = addStreamType;
	}
	public String getChangeMonitorUUID() {
		return changeMonitorUUID;
	}
	public void setChangeMonitorUUID(String changeMonitorUUID) {
		this.changeMonitorUUID = changeMonitorUUID;
	}
	public String getDelMonitorUUID() {
		return delMonitorUUID;
	}
	public void setDelMonitorUUID(String delMonitorUUID) {
		this.delMonitorUUID = delMonitorUUID;
	}
	public String getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getDescribeInfo() {
		return describeInfo;
	}
	public void setDescribeInfo(String describeInfo) {
		this.describeInfo = describeInfo;
	}
	
	
}
