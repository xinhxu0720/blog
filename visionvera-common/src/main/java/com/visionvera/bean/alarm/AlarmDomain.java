package com.visionvera.bean.alarm;

import java.io.Serializable;
import java.util.List;

/**
 * Created by shaow on 2018/6/5. AlarmDomain
 */
public class AlarmDomain implements Cloneable, Serializable {
    private static final long serialVersionUID = -178733088072575362L;
    private Integer id;//自增主键
    private String raiseTime;//告警时间
    private String regionId;//区划ID
    private String regionName;//区划名称
    private String alarmId;//平台中告警的唯一标示
    private String state;//告警状态
    private String level;//告警级别
    private String display;//告警级别名称
    private String type;//告警类别
    private String subType;//告警子类别
    private String deviceType;//设备类型
    private String deviceTypeName;//设备类型名称
    private String raiseMode;//告警方式
    private String platformId;//平台唯一标志
    private String platformName;//平台名称
    private String platformInfo;//平台详情
    private String deviceId;//设备唯一标志
    private String deviceName;//设备名称
    private String deviceInfo;//设备详情
    private String meetInfo;//会议详情
    private String contactInfo;//联系人信息
    private String clearMode;//告警消除方式
    private String clearTime;//告警消除时间
    private String operator;//更新人
    private String updateTime;//更新时间
    private String detail;//告警详情
    private String firstRaiseTime;//第一次报警时间
    private Integer levelId;//报警级别ID
    private String levelName;//报警级别名称
    private Integer typeId;//报警类型ID
    private String typeName;//报警类型名称
    private Integer subId;//报警子类型ID
    private String subTypeName;//报警子类型名称
    private String platformType;//平台类型
    private Integer total;//同类型报警总数
    private Integer detailLength;//详情字数
    private String stateName;//告警状态名称
    private Integer raiseTimes;//报警次数
    private String firstTime;//第一次报警时间
    private String raiseId;//唯一告警编号排序用 
    private String userId;//当前登录用户id
    private String maintenanceOpinion;//维护意见
    private String rootInfluence;//根源及影响
    private String token;//令牌
    private String createTime;//维护意见创建时间
    private String userName;//修改人
    private String updateKnowledgeTime;//维护意见更新时间
    private Integer pageNum;//第几页
    private Integer bits;//系统类别，64位和16位
	private Integer pageSize;//每页有几条
    private List<String>  levelList; 
    private List<String>  typelList;  
    private String scheduleName; //会议名称（pamir、视联汇、视联管家故障上报新增字段）
    private String masterNo;//主席号码（pamir、视联汇、视联管家故障上报新增字段）
    private Integer devNum;//点位数（pamir、视联汇、视联管家故障上报新增字段）
    private String host;//主控人（pamir、视联汇、视联管家故障上报新增字段）
    private String reportUser;//上报人员（pamir、视联汇、视联管家故障上报新增字段）
    private String reportUserPhone;//上报电话（pamir、视联汇、视联管家故障上报新增字段）
    private String reportUserId;//上报人员Id（pamir、视联汇、视联管家故障上报新增字段）
    private String operationUser;//运维人员（pamir、视联汇、视联管家故障上报新增字段）
    private String operationUserPhone;//运维电话（pamir、视联汇、视联管家故障上报新增字段）
    private Integer scheduleLevel;//会议级别（pamir、视联汇、视联管家故障上报新增字段）
    private Integer reportType;//上报类型 1手动上报 2自动上报（pamir、视联汇、视联管家故障上报新增字段）
    private String handlingSuggestion;//处理意见（pamir、视联汇、视联管家故障上报新增字段）

    private Integer lockState;  //锁定状态(0未锁定，1锁定)
    private String source;  //告警来源
    private String ywUuid;  //所属运维中心uuid

    private String glbno;       //64位网管20位终端号
    private String v2vno;       //64位网管11位终端号
    private String devno;       //64位网管5位终端号
    private String terminalType;    //64位网管终端类型，比如启明2，极光等
    private String almcode;    //64位网管终端告警类型

    /**
     * 工单ID
     */
    private Integer ticketId;

    /**
     * 工单状态
     */
    private String ticketState;

    /**
     * 工单状态变更列表
     */
    private List orderStateChangeList;


    /**
     * 为会管终端告警添加的字段
     */
    private Integer bsstatus;   //业务类型 4会议，5可视电话，8收看直播
    
    
	public Integer getBits() {
		return bits;
	}

	public void setBits(Integer bits) {
		this.bits = bits;
	}

	public List<String> getLevelList() {
		return levelList;
	}

	public void setLevelList(List<String> levelList) {
		this.levelList = levelList;
	}

	public List<String> getTypelList() {
		return typelList;
	}

	public void setTypelList(List<String> typelList) {
		this.typelList = typelList;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUpdateKnowledgeTime() {
		return updateKnowledgeTime;
	}

	public void setUpdateKnowledgeTime(String updateKnowledgeTime) {
		this.updateKnowledgeTime = updateKnowledgeTime;
	}

	public String getRaiseId() {
		return raiseId;
	}

	public void setRaiseId(String raiseId) {
		this.raiseId = raiseId;
	}

	public Integer getRaiseTimes() {
		return raiseTimes;
	}

	public void setRaiseTimes(Integer raiseTimes) {
		this.raiseTimes = raiseTimes;
	}

	public String getFirstTime() {
		return firstTime;
	}

	public void setFirstTime(String firstTime) {
		this.firstTime = firstTime;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public Integer getDetailLength() {
		return detailLength;
	}

	public void setDetailLength(Integer detailLength) {
		this.detailLength = detailLength;
	}

	public String getDeviceTypeName() {
        return deviceTypeName;
    }

    public void setDeviceTypeName(String deviceTypeName) {
        this.deviceTypeName = deviceTypeName;
    }

    public String getFirstRaiseTime() {
        return firstRaiseTime;
    }

    public void setFirstRaiseTime(String firstRaiseTime) {
        this.firstRaiseTime = firstRaiseTime;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId == null ? null : alarmId.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getRaiseTime() {
        return raiseTime;
    }

    public void setRaiseTime(String raiseTime) {
        this.raiseTime = raiseTime == null ? null : raiseTime.trim();
    }

    public String getRaiseMode() {
        return raiseMode;
    }

    public void setRaiseMode(String raiseMode) {
        this.raiseMode = raiseMode == null ? null : raiseMode.trim();
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId == null ? null : regionId.trim();
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName == null ? null : levelName.trim();
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display == null ? null : display.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Integer getSubId() {
        return subId;
    }

    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType == null ? null : subType.trim();
    }

    public String getSubTypeName() {
        return subTypeName;
    }

    public void setSubTypeName(String subTypeName) {
        this.subTypeName = subTypeName == null ? null : subTypeName.trim();
    }

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType == null ? null : platformType.trim();
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId == null ? null : platformId.trim();
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName == null ? null : platformName.trim();
    }

    public String getPlatformInfo() {
        return platformInfo;
    }

    public void setPlatformInfo(String platformInfo) {
        this.platformInfo = platformInfo == null ? null : platformInfo.trim();
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo == null ? null : deviceInfo.trim();
    }

    public String getMeetInfo() {
        return meetInfo;
    }

    public void setMeetInfo(String meetInfo) {
        this.meetInfo = meetInfo == null ? null : meetInfo.trim();
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo == null ? null : contactInfo.trim();
    }

    public String getClearMode() {
        return clearMode;
    }

    public void setClearMode(String clearMode) {
        this.clearMode = clearMode == null ? null : clearMode.trim();
    }

    public String getClearTime() {
        return clearTime;
    }

    public void setClearTime(String clearTime) {
        this.clearTime = clearTime == null ? null : clearTime.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

	public String getScheduleName() {
		return scheduleName;
	}

	public void setScheduleName(String scheduleName) {
		this.scheduleName = scheduleName;
	}

	public String getMasterNo() {
		return masterNo;
	}

	public void setMasterNo(String masterNo) {
		this.masterNo = masterNo;
	}

	public Integer getDevNum() {
		return devNum;
	}

	public void setDevNum(Integer devNum) {
		this.devNum = devNum;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getReportUser() {
		return reportUser;
	}

	public void setReportUser(String reportUser) {
		this.reportUser = reportUser;
	}

	public String getReportUserPhone() {
		return reportUserPhone;
	}

	public void setReportUserPhone(String reportUserPhone) {
		this.reportUserPhone = reportUserPhone;
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

	public Integer getScheduleLevel() {
		return scheduleLevel;
	}

	public void setScheduleLevel(Integer scheduleLevel) {
		this.scheduleLevel = scheduleLevel;
	}

	public Integer getReportType() {
		return reportType;
	}

	public void setReportType(Integer reportType) {
		this.reportType = reportType;
	}

	public String getHandlingSuggestion() {
		return handlingSuggestion;
	}

	public void setHandlingSuggestion(String handlingSuggestion) {
		this.handlingSuggestion = handlingSuggestion;
	}

	public String getReportUserId() {
		return reportUserId;
	}

	public void setReportUserId(String reportUserId) {
		this.reportUserId = reportUserId;
	}

    public Integer getLockState() {
        return lockState;
    }

    public void setLockState(Integer lockState) {
        this.lockState = lockState;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getYwUuid() {
        return ywUuid;
    }

    public void setYwUuid(String ywUuid) {
        this.ywUuid = ywUuid;
    }

    public String getGlbno() {
        return glbno;
    }

    public void setGlbno(String glbno) {
        this.glbno = glbno;
    }

    public String getV2vno() {
        return v2vno;
    }

    public void setV2vno(String v2vno) {
        this.v2vno = v2vno;
    }

    public String getDevno() {
        return devno;
    }

    public void setDevno(String devno) {
        this.devno = devno;
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public String getAlmcode() {
        return almcode;
    }

    public void setAlmcode(String almcode) {
        this.almcode = almcode;
    }

    public Integer getBsstatus() {
        return bsstatus;
    }

    public void setBsstatus(Integer bsstatus) {
        this.bsstatus = bsstatus;
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public String getTicketState() {
        return ticketState;
    }

    public void setTicketState(String ticketState) {
        this.ticketState = ticketState;
    }

    public List getOrderStateChangeList() {
        return orderStateChangeList;
    }

    public void setOrderStateChangeList(List orderStateChangeList) {
        this.orderStateChangeList = orderStateChangeList;
    }
}
