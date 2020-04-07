package com.visionvera.bean.cms;

import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @ClassName: ScheduleFormVO 
 * @Description: TODO 会议表单
 * @author 谢程算
 * @date 2017年5月9日
 *
 */
@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class ScheduleFormVO {
	
	private String uuid;   //主键
	private String processId;   //审批流程ID
	private String title; //标题
	private String formNo; //表单编号
	private String name;  //会议名称
	private String scheduleTime; //会议日期
	private String createTime; //创建时间
	private String creator; //创建人
	private String rank; //岗位职级
	private String dept; //部门
	private String devices; //会议点位覆盖信息
	private String chairman; //会议主席点位
	private String host; //会议主持人
	private String functions; //会议主要功能：1可视电话；2会议；3监播；4无人机；5监控；6手机；7点播；8采集卡录播；9网络录播；10电子矩阵
	private Integer deviceCount; //入会点位数
	private Integer memberLevel; //参会人员级别
	private Integer scheduleLevel; //会议等级
	private String startTime;  //会议开始时间
	private String endTime;   //会议结束时间
	private String scheduleId;   //会议编号
	private String comment;   //会议总结-具体评价
	private Integer customerComment;   //会议总结-客户评价
	private String commanderHq;   //总指挥-总部
	private String commanderOut;   //总指挥-外地
	private String switchHq;   //监控交换机流量-总部
	private String switchOut;   //监控交换机流量-外地
	private String problemHq;   //处理解决问题-总部
	private String problemOut;   //处理解决问题-外地
	private String feedbackHq;   //反馈所有视联网点位信息-总部
	private String feedbackOut;   //反馈所有视联网点位信息-外地
	private String responseHq;   //响应群消息收集反馈问题-总部
	private String responseOut;   //响应群消息收集反馈问题-外地
	private String assistHq;   //辅助-总部
	private String assistOut;   //辅助-外地
	private String prepareHq;   //大塔预备-总部
	private String prepareOut;   //大塔预备-外地
	private Integer state;        //审批状态（控制页面权限使用）
	private Integer status;        //审批状态：1拒绝，2同意，3待审批，4已完成
	private String region;       //会议区域
	private String accessorId;       //审批人ID
	private String accessorTime;       //审批时间（第一节点审批时间）
	private String accessorName;       //审批人名
	private String usergroupId;       //用户组ID
	private String xmcu;       //xmcu
	private String dvr;       //dvr
	private String monitor;       //monitor
	private Integer planPersonNum;       //预计参会人数
	private Integer callMode;       //呼叫方式
	private Integer devNum;       //时间参会点位数
	private List<Map<String, Object>> devs;       //Pamir创建预约时传递的点位信息列表
	private String taskId;
	private String names;
	private String advice;
	private Integer createType;   //创建类型
	private String mainBw;   //主源带宽
    private String auxiliaryBw;   //辅源带宽
    private String masterAddr;   //主席地址（省份、直辖市、特区、自治区）
    private Integer scheduleType;//0帕米尔预约 1手机会控预约
    private String devGroupId;//设备组ID
    private Integer clientType ;//1 pamir 2 webservice
	private String mainAddr;  //主会场地址
	private String theLeaders; //与会领导
	private String customerUnit; //客户单位
    private String customerPosition; //客户职务
    private String scheduleOperator; //会议操作员
    private String customerName; //客户名称
    private String zoneno;      //两位区号
    private String masterId;   //主席32位号码
    private List<Map<String,Object>> regionMap;  //点位覆盖信息存放


	
	public String getMainAddr() {
		return mainAddr;
	}
	public void setMainAddr(String mainAddr) {
		this.mainAddr = mainAddr;
	}
	public String getTheLeaders() {
		return theLeaders;
	}
	public void setTheLeaders(String theLeaders) {
		this.theLeaders = theLeaders;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public String getAdvice() {
		return advice;
	}
	public void setAdvice(String advice) {
		this.advice = advice;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getXmcu() {
		return xmcu;
	}
	public void setXmcu(String xmcu) {
		this.xmcu = xmcu;
	}
	public String getDvr() {
		return dvr;
	}
	public void setDvr(String dvr) {
		this.dvr = dvr;
	}
	public String getMonitor() {
		return monitor;
	}
	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}
	public Integer getPlanPersonNum() {
		return planPersonNum;
	}
	public void setPlanPersonNum(Integer planPersonNum) {
		this.planPersonNum = planPersonNum;
	}
	public Integer getCallMode() {
		return callMode;
	}
	public void setCallMode(Integer callMode) {
		this.callMode = callMode;
	}
	public String getFormNo() {
		return formNo;
	}
	public void setFormNo(String formNo) {
		this.formNo = formNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDevices() {
		return devices;
	}
	public void setDevices(String devices) {
		this.devices = devices;
	}
	public String getChairman() {
		return chairman;
	}
	public void setChairman(String chairman) {
		this.chairman = chairman;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getFunctions() {
		return functions;
	}
	public void setFunctions(String functions) {
		this.functions = functions;
	}
	public Integer getDeviceCount() {
		return deviceCount;
	}
	public void setDeviceCount(Integer i) {
		this.deviceCount = i;
	}
	public Integer getMemberLevel() {
		return memberLevel;
	}
	public void setMemberLevel(Integer memberLevel) {
		this.memberLevel = memberLevel;
	}
	public Integer getScheduleLevel() {
		return scheduleLevel;
	}
	public void setScheduleLevel(Integer scheduleLevel) {
		this.scheduleLevel = scheduleLevel;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Integer getCustomerComment() {
		return customerComment;
	}
	public void setCustomerComment(Integer customerComment) {
		this.customerComment = customerComment;
	}
	public String getCommanderHq() {
		return commanderHq;
	}
	public void setCommanderHq(String commanderHq) {
		this.commanderHq = commanderHq;
	}
	public String getCommanderOut() {
		return commanderOut;
	}
	public void setCommanderOut(String commanderOut) {
		this.commanderOut = commanderOut;
	}
	public String getSwitchHq() {
		return switchHq;
	}
	public void setSwitchHq(String switchHq) {
		this.switchHq = switchHq;
	}
	public String getSwitchOut() {
		return switchOut;
	}
	public void setSwitchOut(String switchOut) {
		this.switchOut = switchOut;
	}
	public String getProblemHq() {
		return problemHq;
	}
	public void setProblemHq(String problemHq) {
		this.problemHq = problemHq;
	}
	public String getProblemOut() {
		return problemOut;
	}
	public void setProblemOut(String problemOut) {
		this.problemOut = problemOut;
	}
	public String getFeedbackHq() {
		return feedbackHq;
	}
	public void setFeedbackHq(String feedbackHq) {
		this.feedbackHq = feedbackHq;
	}
	public String getFeedbackOut() {
		return feedbackOut;
	}
	public void setFeedbackOut(String feedbackOut) {
		this.feedbackOut = feedbackOut;
	}
	public String getResponseHq() {
		return responseHq;
	}
	public void setResponseHq(String responseHq) {
		this.responseHq = responseHq;
	}
	public String getResponseOut() {
		return responseOut;
	}
	public void setResponseOut(String responseOut) {
		this.responseOut = responseOut;
	}
	public String getAssistHq() {
		return assistHq;
	}
	public void setAssistHq(String assistHq) {
		this.assistHq = assistHq;
	}
	public String getAssistOut() {
		return assistOut;
	}
	public void setAssistOut(String assistOut) {
		this.assistOut = assistOut;
	}
	public String getPrepareHq() {
		return prepareHq;
	}
	public void setPrepareHq(String prepareHq) {
		this.prepareHq = prepareHq;
	}
	public String getPrepareOut() {
		return prepareOut;
	}
	public void setPrepareOut(String prepareOut) {
		this.prepareOut = prepareOut;
	}
	public String getProcessId() {
		return processId;
	}
	public void setProcessId(String processId) {
		this.processId = processId;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getScheduleTime() {
		return scheduleTime;
	}
	public void setScheduleTime(String scheduleTime) {
		this.scheduleTime = scheduleTime;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getAccessorId() {
		return accessorId;
	}
	public void setAccessorId(String accessorId) {
		this.accessorId = accessorId;
	}
	public String getUsergroupId() {
		return usergroupId;
	}
	public void setUsergroupId(String usergroupId) {
		this.usergroupId = usergroupId;
	}
	public Integer getDevNum() {
		return devNum;
	}
	public void setDevNum(Integer devNum) {
		this.devNum = devNum;
	}
	public List<Map<String, Object>> getDevs() {
		return devs;
	}
	public void setDevs(List<Map<String, Object>> devs) {
		this.devs = devs;
	}
	public String getAccessorName() {
		return accessorName;
	}
	public void setAccessorName(String accessorName) {
		this.accessorName = accessorName;
	}
	public Integer getCreateType() {
		return createType;
	}
	public void setCreateType(Integer createType) {
		this.createType = createType;
	}
	public String getAccessorTime() {
		return accessorTime;
	}
	public void setAccessorTime(String accessorTime) {
		this.accessorTime = accessorTime;
	}
	public String getMainBw() {
		return mainBw;
	}
	public void setMainBw(String mainBw) {
		this.mainBw = mainBw;
	}
	public String getAuxiliaryBw() {
		return auxiliaryBw;
	}
	public void setAuxiliaryBw(String auxiliaryBw) {
		this.auxiliaryBw = auxiliaryBw;
	}
	public String getMasterAddr() {
		return masterAddr;
	}
	public void setMasterAddr(String masterAddr) {
		this.masterAddr = masterAddr;
	}
	public Integer getScheduleType() {
		return scheduleType;
	}
	public void setScheduleType(Integer scheduleType) {
		this.scheduleType = scheduleType;
	}
	public String getDevGroupId() {
		return devGroupId;
	}
	public void setDevGroupId(String devGroupId) {
		this.devGroupId = devGroupId;
	}
	public Integer getClientType() {
		return clientType;
	}
	public void setClientType(Integer clientType) {
		this.clientType = clientType;
	}
	public String getCustomerUnit() {
		return customerUnit;
	}
	public void setCustomerUnit(String customerUnit) {
		this.customerUnit = customerUnit;
	}
	public String getCustomerPosition() {
		return customerPosition;
	}
	public void setCustomerPosition(String customerPosition) {
		this.customerPosition = customerPosition;
	}
	public String getScheduleOperator() {
		return scheduleOperator;
	}
	public void setScheduleOperator(String scheduleOperator) {
		this.scheduleOperator = scheduleOperator;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getZoneno() {
		return zoneno;
	}
	public void setZoneno(String zoneno) {
		this.zoneno = zoneno;
	}
	public String getMasterId() {
		return masterId;
	}
	public void setMasterId(String masterId) {
		this.masterId = masterId;
	}
	public List<Map<String, Object>> getRegionMap() {
		return regionMap;
	}
	public void setRegionMap(List<Map<String, Object>> regionMap) {
		this.regionMap = regionMap;
	}
}
