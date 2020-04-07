package com.visionvera.bean.cms;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/** 
 * <pre>项目名称：cmsweb    
 * 类名称：AlarmVO    
 * 类描述： 会议告警bean实例 
 * 创建人：周逸芳  
 * 创建时间：2018年4月16日 下午5:55:27    
 * 修改人：周逸芳     
 * 修改时间：2018年4月16日 下午5:55:27    
 * 修改备注：       
 * @version </pre>    
 */
@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class AlarmVO {
	
	
	private String uuid;         //ID
	private String scheduleId;   //预约列表ID
	private String scheduleName; //预约名称
	private String alarmContent; //报警内容
	private Integer alarmType;   //报警级别 1报警 最高级别 2警告 中等级别 3注意 最低级别
	private String alarmTime;    //报警时间
	private Integer confirmFlag; //报警状态 0未确认 1已知悉
	private String confirmTime;  //确认时间
	private String confirmUserId;//确认报警操作用户ID
	private String masterName;   //主席名称
	private Integer masterNo;    //主席号码
	private Integer devCount;    //设备总数
	private Integer meetCount;   //会议开启次数
	private List<LogVO> loglist; //预约列表告警详情信息
	private String alostpacket;  //音频丢包率
	private String vlostpacket;  //视频丢包率
	private String contentType;	 //告警类型,4表示版本异常，5表示视频无流，6表示音频无流，7表示音视频丢包率都异常，8表示会议终端离线异常；9表示视频丢包率异常；10表示音频丢包率异常
	
	
	
	public String getAlostpacket() {
		return alostpacket;
	}
	public void setAlostpacket(String alostpacket) {
		this.alostpacket = alostpacket;
	}
	public String getVlostpacket() {
		return vlostpacket;
	}
	public void setVlostpacket(String vlostpacket) {
		this.vlostpacket = vlostpacket;
	}
	public List<LogVO> getLoglist() {
		return loglist;
	}
	public void setLoglist(List<LogVO> loglist) {
		this.loglist = loglist;
	}
	public Integer getMasterNo() {
		return masterNo;
	}
	public void setMasterNo(Integer masterNo) {
		this.masterNo = masterNo;
	}
	public Integer getMeetCount() {
		return meetCount;
	}
	public void setMeetCount(Integer meetCount) {
		this.meetCount = meetCount;
	}
	public String getMasterName() {
		return masterName;
	}
	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}
	public Integer getDevCount() {
		return devCount;
	}
	public void setDevCount(Integer devCount) {
		this.devCount = devCount;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getScheduleName() {
		return scheduleName;
	}
	public void setScheduleName(String scheduleName) {
		this.scheduleName = scheduleName;
	}
	public String getAlarmContent() {
		return alarmContent;
	}
	public void setAlarmContent(String alarmContent) {
		this.alarmContent = alarmContent;
	}
	public Integer getAlarmType() {
		return alarmType;
	}
	public void setAlarmType(Integer alarmType) {
		this.alarmType = alarmType;
	}
	public String getAlarmTime() {
		return alarmTime;
	}
	public void setAlarmTime(String alarmTime) {
		this.alarmTime = alarmTime;
	}
	public Integer getConfirmFlag() {
		return confirmFlag;
	}
	public void setConfirmFlag(Integer confirmFlag) {
		this.confirmFlag = confirmFlag;
	}
	public String getConfirmTime() {
		return confirmTime;
	}
	public void setConfirmTime(String confirmTime) {
		this.confirmTime = confirmTime;
	}
	public String getConfirmUserId() {
		return confirmUserId;
	}
	public void setConfirmUserId(String confirmUserId) {
		this.confirmUserId = confirmUserId;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
}
