package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @ClassName: ScheduleFormVO 
 * @Description: TODO 会议表单
 * @author xiechs
 * @date 2017年11月13日
 *
 */
@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class SummaryForm {
	
	private String schedule_id; //预约ID(主键)
	private String process_id; //审批流程ID
	private String title; //标题
	private String form_no; //表单编号
	private String create_time; //创建时间
	private String creator; //创建人
	private String dept; //部门
	private String rank; //岗位职级
	private String name;  //会议名称
	private String schedule_no;  //会议编号
	private String incharge;  //负责人
	private String schedule_level;  //保障等级
	private String start_unit; //发起单位
	private String main_dept; //主要与会部门
	private String main_leader; //主要与会领导
	private String functions; //主要使用功能：1可视电话；2会议；3监播；4无人机；5监控；6手机；7点播；8采集卡录播；9网络录播；10电子矩阵
	private Integer device_expect; //预计参会点位数
	private Integer device_actual; //实际参会点位数
	private Integer device_problem; //问题参会点位数
	private String start_time;  //会议开始时间
	private String end_time;   //会议结束时间
	private String customer_advice;   //客户意见
	private Integer customer_comment;   //客户评价：1非常满意；2满意；3一般；4不满意
	private String opt_name;   //会议软件操作人
	private String opt_phone;   //会议软件操作人电话
	private String func_name;   //相关功能实现人员
	private String func_phone;   //相关功能实现人员电话
	private String resp_name;   //群消息响应反馈人
	private String resp_phone;   //群消息响应反馈人员电话
	private String mon_name;   //流量监控人
	private String mon_phone;   //流量监控人员电话
	private String prob_name;   //问题收集及整理人员
	private String prob_phone;   //问题收集及整理人员电话
	private String sum_name;   //会议总结人员
	private String sum_phone;   //会议总结人员电话
	private String summary;   //问题总结：同一问题的内容间以&**&分割；不同问题间以&***&分割
	private String related;   //与我司相关内容
	private String svr_region_id;		//数据来源-子系统行政区域ID
	public String getSchedule_id() {
		return schedule_id;
	}
	public void setSchedule_id(String schedule_id) {
		this.schedule_id = schedule_id;
	}
	public String getProcess_id() {
		return process_id;
	}
	public void setProcess_id(String process_id) {
		this.process_id = process_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getForm_no() {
		return form_no;
	}
	public void setForm_no(String form_no) {
		this.form_no = form_no;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchedule_no() {
		return schedule_no;
	}
	public void setSchedule_no(String schedule_no) {
		this.schedule_no = schedule_no;
	}
	public String getIncharge() {
		return incharge;
	}
	public void setIncharge(String incharge) {
		this.incharge = incharge;
	}
	public String getSchedule_level() {
		return schedule_level;
	}
	public void setSchedule_level(String schedule_level) {
		this.schedule_level = schedule_level;
	}
	public String getStart_unit() {
		return start_unit;
	}
	public void setStart_unit(String start_unit) {
		this.start_unit = start_unit;
	}
	public String getMain_dept() {
		return main_dept;
	}
	public void setMain_dept(String main_dept) {
		this.main_dept = main_dept;
	}
	public String getMain_leader() {
		return main_leader;
	}
	public void setMain_leader(String main_leader) {
		this.main_leader = main_leader;
	}
	public String getFunctions() {
		return functions;
	}
	public void setFunctions(String functions) {
		this.functions = functions;
	}
	public Integer getDevice_expect() {
		return device_expect;
	}
	public void setDevice_expect(Integer device_expect) {
		this.device_expect = device_expect;
	}
	public Integer getDevice_actual() {
		return device_actual;
	}
	public void setDevice_actual(Integer device_actual) {
		this.device_actual = device_actual;
	}
	public Integer getDevice_problem() {
		return device_problem;
	}
	public void setDevice_problem(Integer device_problem) {
		this.device_problem = device_problem;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getCustomer_advice() {
		return customer_advice;
	}
	public void setCustomer_advice(String customer_advice) {
		this.customer_advice = customer_advice;
	}
	public Integer getCustomer_comment() {
		return customer_comment;
	}
	public void setCustomer_comment(Integer customer_comment) {
		this.customer_comment = customer_comment;
	}
	public String getOpt_name() {
		return opt_name;
	}
	public void setOpt_name(String opt_name) {
		this.opt_name = opt_name;
	}
	public String getOpt_phone() {
		return opt_phone;
	}
	public void setOpt_phone(String opt_phone) {
		this.opt_phone = opt_phone;
	}
	public String getFunc_name() {
		return func_name;
	}
	public void setFunc_name(String func_name) {
		this.func_name = func_name;
	}
	public String getFunc_phone() {
		return func_phone;
	}
	public void setFunc_phone(String func_phone) {
		this.func_phone = func_phone;
	}
	public String getResp_name() {
		return resp_name;
	}
	public void setResp_name(String resp_name) {
		this.resp_name = resp_name;
	}
	public String getResp_phone() {
		return resp_phone;
	}
	public void setResp_phone(String resp_phone) {
		this.resp_phone = resp_phone;
	}
	public String getMon_name() {
		return mon_name;
	}
	public void setMon_name(String mon_name) {
		this.mon_name = mon_name;
	}
	public String getMon_phone() {
		return mon_phone;
	}
	public void setMon_phone(String mon_phone) {
		this.mon_phone = mon_phone;
	}
	public String getProb_name() {
		return prob_name;
	}
	public void setProb_name(String prob_name) {
		this.prob_name = prob_name;
	}
	public String getProb_phone() {
		return prob_phone;
	}
	public void setProb_phone(String prob_phone) {
		this.prob_phone = prob_phone;
	}
	public String getSum_name() {
		return sum_name;
	}
	public void setSum_name(String sum_name) {
		this.sum_name = sum_name;
	}
	public String getSum_phone() {
		return sum_phone;
	}
	public void setSum_phone(String sum_phone) {
		this.sum_phone = sum_phone;
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
	public String getSvr_region_id() {
		return svr_region_id;
	}
	public void setSvr_region_id(String svr_region_id) {
		this.svr_region_id = svr_region_id;
	}
}
