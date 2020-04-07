package com.visionvera.bean.cms;

public class Log {
	private String uuid;//主键
	private int operatorId;//操作类型对应log_type表中的id
	private String description;//备注
	private String createTime;//操作时间
	private String userId;//操作用户ID
	private int result;//操作结果。0-失败；1-成功
	private String errdesc;//错误描述
	private String scheduleId;//预约id，关联预约
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public int getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(int operatorId) {
		this.operatorId = operatorId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public String getErrdesc() {
		return errdesc;
	}
	public void setErrdesc(String errdesc) {
		this.errdesc = errdesc;
	}
	public String getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}
}
