package com.visionvera.bean.cms;


/***
 * 
 * @author 褚英奇
 * Description:会议告警信息
 */
public class MeetingAlarmVO {
	private String endpoint;//会议ID
	private String metric;//平台名称
	private String note;//告警内容
	private String status;//状态：OK：正常	PROBLEM：不正常
	private Long timestamp;//时间戳
	private Integer alarmType;/***
	 * 报警类型：“1”：CPU报警“2”：内存报警“3”：存储容量报警“4”：服务器宕机
	 * “5”：终端（终端提供版本支持丢包率）“6”：服务器掉线“7”：监控不可用
	 * “8”：协转掉线“9”：会议异常“10”：会议中终端异常“11”：带宽丢包严重“12”：硬盘报警“13”：其他
	 */
	

	public MeetingAlarmVO() {
		super();
	}

	
	public String getEndpoint() {
		return endpoint;
	}


	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}


	public String getMetric() {
		this.metric="视联网会议管理平台";
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

	public Integer getAlarmType() {
		return alarmType;
	}

	public void setAlarmType(Integer alarmType) {
		this.alarmType = alarmType;
	}

	
}
