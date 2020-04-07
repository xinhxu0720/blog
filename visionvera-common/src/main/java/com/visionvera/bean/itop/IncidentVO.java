package com.visionvera.bean.itop;

/**
 * 事件表单
 * @author cyq
 *
 */
public class IncidentVO {

	private Integer id;
	private String status;//enum('assigned','closed','escalated_tto','escalated_ttr','new','pending','resolved')
	private Integer impact; //影响范围（1部门2服务3个体 ）
	private Integer priority;//urgency 紧急程度（1非常高 2高 3中 4低）
	private Integer urgency;//priority 优先级（1非常高 2高 3中 4低）
	private String origin;//来源
	private Integer serviceId;//服务id
	private String assignmentDate;//
	private String resolutionDate;//
	private String lastPendingDate;//
	private String userCommment;//用户评论
	
	public IncidentVO() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getImpact() {
		return impact;
	}
	public void setImpact(Integer impact) {
		this.impact = impact;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Integer getUrgency() {
		return urgency;
	}
	public void setUrgency(Integer urgency) {
		this.urgency = urgency;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public Integer getServiceId() {
		return serviceId;
	}
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}
	public String getAssignmentDate() {
		return assignmentDate;
	}
	public void setAssignmentDate(String assignmentDate) {
		this.assignmentDate = assignmentDate;
	}
	public String getResolutionDate() {
		return resolutionDate;
	}
	public void setResolutionDate(String resolutionDate) {
		this.resolutionDate = resolutionDate;
	}
	public String getLastPendingDate() {
		return lastPendingDate;
	}
	public void setLastPendingDate(String lastPendingDate) {
		this.lastPendingDate = lastPendingDate;
	}
	public String getUserCommment() {
		return userCommment;
	}
	public void setUserCommment(String userCommment) {
		this.userCommment = userCommment;
	}
	
	
	
}
