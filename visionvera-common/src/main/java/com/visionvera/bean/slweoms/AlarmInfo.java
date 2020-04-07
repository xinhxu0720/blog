package com.visionvera.bean.slweoms;

import java.util.Date;

/**
 * Created by shaow on 2018/6/5.
 */
public class AlarmInfo {
    
	private Long id;
	/**
	 * 监控主机名称
	 */
   	private String endpoint;
    /**
     * 服务器名称
     */
   	private String metric;
    /**
     * 告警内容
     */
   	private String note;
    /**
     * 状态，OK:正常，PROBLEM:不正常
     */
   	private String status;
    /**
     * UNix时间戳
     */
   	private Long timestamp;
    /**
     * 服务器唯一标识
     */
   	private String registerid;
    /**
     * 报警类型
     */
   	private Integer alarmType;
    /**
     * 处理状态：0已处理，1未处理
     */
   	private Integer treatmentStates;
    /**
     * 告警级别
     */
   	private Integer alarmLevel;
    /**
     * 区分报警与通知 报警为 1 通知为2
     */
   	private Integer kindType;
    /**
     * 状态，0正常，-1已删除
     */
   	private Integer state;
   
   	private Date createTime;
   
   	private Date modifyTime;

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getEndpoint() {
		return endpoint;
	}
	
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
	
	public String getMetric() {
		return metric;
	}
	
	public void setMetric(String metric) {
		this.metric = metric;
	}
	
	public String getNote() {
		return note;
	}
	
	public void setNote(String note) {
		this.note = note;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Long getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	
	public String getRegisterid() {
		return registerid;
	}
	
	public void setRegisterid(String registerid) {
		this.registerid = registerid;
	}
	
	public Integer getAlarmType() {
		return alarmType;
	}
	
	public void setAlarmType(Integer alarmType) {
		this.alarmType = alarmType;
	}
	
	public Integer getTreatmentStates() {
		return treatmentStates;
	}
	
	public void setTreatmentStates(Integer treatmentStates) {
		this.treatmentStates = treatmentStates;
	}
	
	public Integer getAlarmLevel() {
		return alarmLevel;
	}
	
	public void setAlarmLevel(Integer alarmLevel) {
		this.alarmLevel = alarmLevel;
	}
	
	public Integer getKindType() {
		return kindType;
	}
	
	public void setKindType(Integer kindType) {
		this.kindType = kindType;
	}
	
	public Integer getState() {
		return state;
	}
	
	public void setState(Integer state) {
		this.state = state;
	}
	
	public Date getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Date getModifyTime() {
		return modifyTime;
	}
	
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
   
}
