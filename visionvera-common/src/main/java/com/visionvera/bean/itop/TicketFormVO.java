package com.visionvera.bean.itop;

/**
 * 事件表单
 * @author cyq
 *
 */
public class TicketFormVO {

	//总表单部分 （start）
	private Integer id;
	private String operationalStatus;//enum('closed','ongoing','resolved') NULL
	private String ref;//分类+六位表单id 例如问题类型为P-000001 用户需求为R-000002 事件为I-000003
	private Integer orgId; //关联的组织id
	private Integer callerId; //表单填写人
	private Integer teamId; //团队id
	private Integer agentId; //处理人
	private String title; //标题
	private String finalClass;//工单类型 Incident事件类，UserRequest需求类，Problem问题类，NormalChange普通变更，RoutineChange例行变更，EmergencyChange紧急变更
	//总表单部分 （end）
	
	
	//事件表单参数 （start）
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
	public TicketFormVO() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOperationalStatus() {
		return operationalStatus;
	}

	public void setOperationalStatus(String operationalStatus) {
		this.operationalStatus = operationalStatus;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	public Integer getCallerId() {
		return callerId;
	}

	public void setCallerId(Integer callerId) {
		this.callerId = callerId;
	}

	public Integer getTeamId() {
		return teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	public Integer getAgentId() {
		return agentId;
	}

	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getFinalClass() {
		return finalClass;
	}

	public void setFinalClass(String finalClass) {
		this.finalClass = finalClass;
	}

}
