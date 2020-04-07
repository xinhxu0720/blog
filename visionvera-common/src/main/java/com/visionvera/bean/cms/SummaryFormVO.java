package com.visionvera.bean.cms;

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
public class SummaryFormVO {
	
	private String processId; //审批流程ID(主键)
	private String title; //标题
	private String formNo; //表单编号
	private String name;  //会议名称
	private String scheduleId;  //会议编号
	private String incharge;  //负责人
	private String scheduleLevel;  //保障等级
	private String createTime; //创建时间
	private String creator; //创建人
	private String rank; //岗位职级
	private String dept; //部门
	private String startUnit; //发起单位
	private String mainDept; //主要与会部门
	private String mainLeader; //主要与会领导
	private String functions; //主要使用功能：1可视电话；2会议；3监播；4无人机；5监控；6手机；7点播；8采集卡录播；9网络录播；10电子矩阵
	private Integer deviceExpect; //预计参会点位数
	private Integer deviceActual; //实际参会点位数
	private Integer deviceProblem; //问题参会点位数
	private String startTime;  //会议开始时间
	private String endTime;   //会议结束时间
	private String customerAdvice;   //客户意见
	private Integer customerComment;   //客户评价：1非常满意；2满意；3一般；4不满意
	private String optName;   //会议软件操作人
	private String optPhone;   //会议软件操作人电话
	private String funcName;   //相关功能实现人员
	private String funcPhone;   //相关功能实现人员电话
	private String respName;   //群消息响应反馈人
	private String respPhone;   //群消息响应反馈人员电话
	private String monName;   //流量监控人
	private String monPhone;   //流量监控人员电话
	private String probName;   //问题收集及整理人员
	private String probPhone;   //问题收集及整理人员电话
	private String sumName;   //会议总结人员
	private String sumPhone;   //会议总结人员电话
	private String summary;   //问题总结：同一问题的内容间以&**&分割；不同问题间以&***&分割
	private String related;   //与我司相关内容
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getIncharge() {
		return incharge;
	}
	public void setIncharge(String incharge) {
		this.incharge = incharge;
	}
	public String getScheduleLevel() {
		return scheduleLevel;
	}
	public void setScheduleLevel(String scheduleLevel) {
		this.scheduleLevel = scheduleLevel;
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
	public String getStartUnit() {
		return startUnit;
	}
	public void setStartUnit(String startUnit) {
		this.startUnit = startUnit;
	}
	public String getMainDept() {
		return mainDept;
	}
	public void setMainDept(String mainDept) {
		this.mainDept = mainDept;
	}
	public String getMainLeader() {
		return mainLeader;
	}
	public void setMainLeader(String mainLeader) {
		this.mainLeader = mainLeader;
	}
	public String getFunctions() {
		return functions;
	}
	public void setFunctions(String functions) {
		this.functions = functions;
	}
	public Integer getDeviceExpect() {
		return deviceExpect;
	}
	public void setDeviceExpect(Integer deviceExpect) {
		this.deviceExpect = deviceExpect;
	}
	public Integer getDeviceActual() {
		return deviceActual;
	}
	public void setDeviceActual(Integer deviceActual) {
		this.deviceActual = deviceActual;
	}
	public Integer getDeviceProblem() {
		return deviceProblem;
	}
	public void setDeviceProblem(Integer deviceProblem) {
		this.deviceProblem = deviceProblem;
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
	public String getCustomerAdvice() {
		return customerAdvice;
	}
	public void setCustomerAdvice(String customerAdvice) {
		this.customerAdvice = customerAdvice;
	}
	public Integer getCustomerComment() {
		return customerComment;
	}
	public void setCustomerComment(Integer customerComment) {
		this.customerComment = customerComment;
	}
	public String getOptName() {
		return optName;
	}
	public void setOptName(String optName) {
		this.optName = optName;
	}
	public String getOptPhone() {
		return optPhone;
	}
	public void setOptPhone(String optPhone) {
		this.optPhone = optPhone;
	}
	public String getFuncName() {
		return funcName;
	}
	public void setFuncName(String funcName) {
		this.funcName = funcName;
	}
	public String getFuncPhone() {
		return funcPhone;
	}
	public void setFuncPhone(String funcPhone) {
		this.funcPhone = funcPhone;
	}
	public String getRespName() {
		return respName;
	}
	public void setRespName(String respName) {
		this.respName = respName;
	}
	public String getRespPhone() {
		return respPhone;
	}
	public void setRespPhone(String respPhone) {
		this.respPhone = respPhone;
	}
	public String getMonName() {
		return monName;
	}
	public void setMonName(String monName) {
		this.monName = monName;
	}
	public String getMonPhone() {
		return monPhone;
	}
	public void setMonPhone(String monPhone) {
		this.monPhone = monPhone;
	}
	public String getProbName() {
		return probName;
	}
	public void setProbName(String probName) {
		this.probName = probName;
	}
	public String getProbPhone() {
		return probPhone;
	}
	public void setProbPhone(String probPhone) {
		this.probPhone = probPhone;
	}
	public String getSumName() {
		return sumName;
	}
	public void setSumName(String sumName) {
		this.sumName = sumName;
	}
	public String getSumPhone() {
		return sumPhone;
	}
	public void setSumPhone(String sumPhone) {
		this.sumPhone = sumPhone;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getRelated() {
		return related;
	}
	public void setRelated(String related) {
		this.related = related;
	}
	public String getProcessId() {
		return processId;
	}
	public void setProcessId(String processId) {
		this.processId = processId;
	}
	
}
