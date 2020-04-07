package com.visionvera.bean.datacore;

public class UserRelationVO {

//	private String uuid ;
	private String userId = "";
	private String callerId = "";  //创建人的itop用户id
	private String itopAccount = ""; //itop用户账号
	private String itopPwd = "";	//itop用户密码
	private String ticketId = "";//itop工单id
	private String status = "";//工单状态
	private int createType;//创建类型 创建类型0手机端 1故障工单 2 告警中心
	private String businessId = "";//关联业务的id（会议id，告警中心告警id，故障上报工单id）
	private String createTime;//创建时间
//	private String assignTime;//分配时间
//	private String yishouliTime;//受理时间
//	private String yihuifuTime;//已恢复时间
//	private String resoveTime;//解决时间
//	private String closeTime;//关闭时间
	private String businessServiceId = "";//服务标识
//	private String operationTime;//操作时间
	private String operatorId = "";//操作用户 itop用户id
	private String agentId = "";//分配的用户id  （itop）
	private String teamId = "";//处理人团队id（itop）
	private String orgId = "";//组织id（itop）
	private String operatorName = "";//操作人姓名
	private String orgName = "";//组织名称（itop）
	private String teamName = "";//团队名称（itop）
//	private String userInfo; //操作用户姓名
//	private Integer oldValue; //旧值
//	private Integer newValue; //新值
//	private String objClass; //工单类型 Incident事件工单 UserRequest 用户需求
	private String faultOrgName = ""; //单位
	private String mobilephone = ""; //联系方式
	private String title = ""; //工单标题
//	private String description; //描述
//	private String privateLog; //私信
	private String finalclass = ""; //工单类型
	private int impact; //影响范围
	private int priority; //优先级
	private int urgency; //紧急度
	private String origin = ""; //来源
//	private String serviceId; //服务id
//	private String servicesubcategoryId; //子服务id
//	private String resolutionCode; //解决方式
//	private String solution; //解决方案
//	private String pendingReason; //待定原因
//	private String publicLog; //评论
//	private Integer userSatisfaction; //用户满意度
//	private Integer incidentReason; //故障原因分类
//	private Integer productType; //产品分类
//	private String productName; //产品名称
//	private String productVer; //产品版本
//	private String xiangMuName; //项目名称
//	private String promptly; //响应是否及时
	private String emergencyMeasure = ""; //应急处理办法
	private String isAffectBusiness = ""; //是否影响业务
//	private String yeWu2; //影响业务说明
//	private String FName; //400客服姓名
//	private Integer timeSpentType; //
//	private String accident; //	是否事故
//	private String requestType; //	需求类型
	private String itopId = ""; //	itop用户id
	private String approverId = "";//审批人
	private int type;//查询类型
	private String callerName = "";//创建人姓名
	private String agentName = "";//经办人姓名
	private String ref = "";//工单编号
	private String itopUserName = "";//itop用户名
	private String search = ""; //查询参数
	private String firstName= "";//用户姓
	private String lastName= "";//用户名
	private String fullName= "";//用户全称
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getItopAccount() {
		return itopAccount;
	}
	public void setItopAccount(String itopAccount) {
		this.itopAccount = itopAccount;
	}
	public String getItopPwd() {
		return itopPwd;
	}
	public void setItopPwd(String itopPwd) {
		this.itopPwd = itopPwd;
	}
	public UserRelationVO() {
		super();
	}
	public String getTicketId() {
		return ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getBusinessId() {
		return businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public String getBusinessServiceId() {
		return businessServiceId;
	}
	public void setBusinessServiceId(String businessServiceId) {
		this.businessServiceId = businessServiceId;
	}
//	public String getOperationTime() {
//		return operationTime;
//	}
//	public void setOperationTime(String operationTime) {
//		this.operationTime = operationTime;
//	}
	public String getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	public String getAgentId() {
		return agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getTeamId() {
		return teamId;
	}
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
//	public String getUserInfo() {
//		return userInfo;
//	}
//	public void setUserInfo(String userInfo) {
//		this.userInfo = userInfo;
//	}
//	public Integer getOldValue() {
//		return oldValue;
//	}
//	public void setOldValue(Integer oldValue) {
//		this.oldValue = oldValue;
//	}
//	public Integer getNewValue() {
//		return newValue;
//	}
//	public void setNewValue(Integer newValue) {
//		this.newValue = newValue;
//	}

	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	public String getCallerId() {
		return callerId;
	}
	public void setCallerId(String callerId) {
		this.callerId = callerId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
//	public String getPrivateLog() {
//		return privateLog;
//	}
//	public void setPrivateLog(String privateLog) {
//		this.privateLog = privateLog;
//	}
	public String getFinalclass() {
		return finalclass;
	}
	public void setFinalclass(String finalclass) {
		this.finalclass = finalclass;
	}
	
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
//	public String getServiceId() {
//		return serviceId;
//	}
//	public void setServiceId(String serviceId) {
//		this.serviceId = serviceId;
//	}
//	public String getServicesubcategoryId() {
//		return servicesubcategoryId;
//	}
//	public void setServicesubcategoryId(String servicesubcategoryId) {
//		this.servicesubcategoryId = servicesubcategoryId;
//	}
//	public String getResolutionCode() {
//		return resolutionCode;
//	}
//	public void setResolutionCode(String resolutionCode) {
//		this.resolutionCode = resolutionCode;
//	}
//	public String getSolution() {
//		return solution;
//	}
//	public void setSolution(String solution) {
//		this.solution = solution;
//	}
//	public String getPendingReason() {
//		return pendingReason;
//	}
//	public void setPendingReason(String pendingReason) {
//		this.pendingReason = pendingReason;
//	}
//	public String getPublicLog() {
//		return publicLog;
//	}
//	public void setPublicLog(String publicLog) {
//		this.publicLog = publicLog;
//	}
//	public Integer getUserSatisfaction() {
//		return userSatisfaction;
//	}
//	public void setUserSatisfaction(Integer userSatisfaction) {
//		this.userSatisfaction = userSatisfaction;
//	}
//	public Integer getIncidentReason() {
//		return incidentReason;
//	}
//	public void setIncidentReason(Integer incidentReason) {
//		this.incidentReason = incidentReason;
//	}
//	public Integer getProductType() {
//		return productType;
//	}
//	public void setProductType(Integer productType) {
//		this.productType = productType;
//	}
//	public String getProductName() {
//		return productName;
//	}
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
//	public String getXiangMuName() {
//		return xiangMuName;
//	}
//	public void setXiangMuName(String xiangMuName) {
//		this.xiangMuName = xiangMuName;
//	}
//	public String getPromptly() {
//		return promptly;
//	}
//	public void setPromptly(String promptly) {
//		this.promptly = promptly;
//	}
//	public String getYeWu2() {
//		return yeWu2;
//	}
//	public void setYeWu2(String yeWu2) {
//		this.yeWu2 = yeWu2;
//	}
//	public String getFName() {
//		return FName;
//	}
//	public void setFName(String fName) {
//		FName = fName;
//	}
//	public Integer getTimeSpentType() {
//		return timeSpentType;
//	}
//	public void setTimeSpentType(Integer timeSpentType) {
//		this.timeSpentType = timeSpentType;
//	}
//	public String getAccident() {
//		return accident;
//	}
//	public void setAccident(String accident) {
//		this.accident = accident;
//	}
//	public String getRequestType() {
//		return requestType = "service_request";
//	}
//	public void setRequestType(String requestType) {
//		this.requestType = "service_request";
//	}
	public String getItopId() {
		return itopId;
	}
	public void setItopId(String itopId) {
		this.itopId = itopId;
	}
//	public String getProductVer() {
//		return productVer;
//	}
//	public void setProductVer(String productVer) {
//		this.productVer = productVer;
//	}
	public String getApproverId() {
		return approverId;
	}
	public void setApproverId(String approverId) {
		this.approverId = approverId;
	}
	
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getCallerName() {
		return callerName;
	}
	public void setCallerName(String callerName) {
		this.callerName = callerName;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	public int getCreateType() {
		return createType;
	}
	public void setCreateType(int createType) {
		this.createType = createType;
	}
	public int getImpact() {
		return impact;
	}
	public void setImpact(int impact) {
		this.impact = impact;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getUrgency() {
		return urgency;
	}
	public void setUrgency(int urgency) {
		this.urgency = urgency;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getFaultOrgName() {
		return faultOrgName;
	}
	public void setFaultOrgName(String faultOrgName) {
		this.faultOrgName = faultOrgName;
	}
	public String getEmergencyMeasure() {
		return emergencyMeasure;
	}
	public void setEmergencyMeasure(String emergencyMeasure) {
		this.emergencyMeasure = emergencyMeasure;
	}
	public String getIsAffectBusiness() {
		return isAffectBusiness;
	}
	public void setIsAffectBusiness(String isAffectBusiness) {
		this.isAffectBusiness = isAffectBusiness;
	}
	public String getItopUserName() {
		return itopUserName;
	}
	public void setItopUserName(String itopUserName) {
		this.itopUserName = itopUserName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
}
