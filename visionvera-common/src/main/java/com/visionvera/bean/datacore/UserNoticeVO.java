package com.visionvera.bean.datacore;

public class UserNoticeVO {

	public String uuid;
	public String ticketId = ""; //工单id
	public String alarmId = ""; //告警id
	public String userId = "";//推送的用户id
	public String ticketType = "";//工单id
	public Integer type = 0;//1:工单推送信息2:告警中心推送信息3:网管推送消息（暂定）
	public String platformId = "";//平台id
	public String platform = "";//平台
	public String createTime;//添加时间
	public String description = "";//描述
	public Integer isRead = 0;//阅读状态0未读1已读
	public Integer messageType = 0;//消息类型１分配给我的工单２我创建的工单
	public String title = "";//标题
	private String timeStamp; //时间戳
	 /**
     * 网管审批id
     */
    private String netWorkReviewId;

	/**
	 * 申请开通终端的网管用户id
	 */
	private String applyNetWorkId;

	public String getApplyNetWorkId() {
		return applyNetWorkId;
	}

	public void setApplyNetWorkId(String applyNetWorkId) {
		this.applyNetWorkId = applyNetWorkId;
	}

	public UserNoticeVO() {
		super();
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getTicketId() {
		return ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTicketType() {
		return ticketType;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getPlatformId() {
		return platformId;
	}
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getAlarmId() {
		return alarmId;
	}
	public void setAlarmId(String alarmId) {
		this.alarmId = alarmId;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getIsRead() {
		return isRead;
	}
	public void setIsRead(Integer isRead) {
		this.isRead = isRead;
	}
	public String getNetWorkReviewId() {
		return netWorkReviewId;
	}
	public void setNetWorkReviewId(String netWorkReviewId) {
		this.netWorkReviewId = netWorkReviewId;
	}
	public Integer getMessageType() {
		return messageType;
	}
	public void setMessageType(Integer messageType) {
		this.messageType = messageType;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	
}
