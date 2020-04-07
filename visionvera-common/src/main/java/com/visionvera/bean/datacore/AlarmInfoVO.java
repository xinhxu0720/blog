package com.visionvera.bean.datacore;

public class AlarmInfoVO {

	private String alarmId = "";//告警id
	private String ywUuid = "";//所在告警中心的id
	private String type = "";//告警类型
	private String typeName = "";//告警类型中文
	private String subType = "";//告警子类型编码  
	private String subTypeName = "";//告警子类型编码中文
	private String level = "";//告警级别
	private String levelName = "";//告警级别中文
	private String state = "";//告警状态
	private String stateName = "";//告警状态中文
	private String detail;//告警详情
	private String regionId = "";//告警区域编码
	private String regionName = "";//告警区域中文
	private String firstTime = "";//告警第一次上报时间
	private String raiseTime = "";//告警最新上报时间
	private String clearTime = "";//告警恢复时间
	private String maintenanceOpinion; //维护意见
	private String rootInfluence; //根源及影响
	private String operationUser = "";//处理人姓名
	private String operationUserPhone = "";//处理人电话
	private String handlingSuggestion;  //处理状态
	private String userId = "";//用户id
	private int businessType;//查询类型
	private String time;//
	private String ticketId;//工单id
	private String loginName = "";
	private String realName = "";
	
	
	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public AlarmInfoVO() {
		super();
	}

	public String getAlarmId() {
		return alarmId;
	}

	public void setAlarmId(String alarmId) {
		this.alarmId = alarmId;
	}

	public String getYwUuid() {
		return ywUuid;
	}

	public void setYwUuid(String ywUuid) {
		this.ywUuid = ywUuid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getSubType() {
		return subType;
	}

	public void setSubType(String subType) {
		this.subType = subType;
	}

	public String getSubTypeName() {
		return subTypeName;
	}

	public void setSubTypeName(String subTypeName) {
		this.subTypeName = subTypeName;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getRegionId() {
		return regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getFirstTime() {
		return firstTime;
	}

	public void setFirstTime(String firstTime) {
		this.firstTime = firstTime;
	}

	public String getRaiseTime() {
		return raiseTime;
	}

	public void setRaiseTime(String raiseTime) {
		this.raiseTime = raiseTime;
	}

	public String getClearTime() {
		return clearTime;
	}

	public void setClearTime(String clearTime) {
		this.clearTime = clearTime;
	}

	public String getMaintenanceOpinion() {
		return maintenanceOpinion;
	}

	public void setMaintenanceOpinion(String maintenanceOpinion) {
		this.maintenanceOpinion = maintenanceOpinion;
	}

	public String getRootInfluence() {
		return rootInfluence;
	}

	public void setRootInfluence(String rootInfluence) {
		this.rootInfluence = rootInfluence;
	}

	public String getOperationUser() {
		return operationUser;
	}

	public void setOperationUser(String operationUser) {
		this.operationUser = operationUser;
	}

	public String getOperationUserPhone() {
		return operationUserPhone;
	}

	public void setOperationUserPhone(String operationUserPhone) {
		this.operationUserPhone = operationUserPhone;
	}

	public String getHandlingSuggestion() {
		return handlingSuggestion;
	}

	public void setHandlingSuggestion(String handlingSuggestion) {
		this.handlingSuggestion = handlingSuggestion;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	
	public int getBusinessType() {
		return businessType;
	}

	public void setBusinessType(int businessType) {
		this.businessType = businessType;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public boolean equals(Object obj) {
		AlarmInfoVO al = (AlarmInfoVO) obj;
		return this.alarmId.equals(al.alarmId) && this.ywUuid.equals(al.ywUuid);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	
}
