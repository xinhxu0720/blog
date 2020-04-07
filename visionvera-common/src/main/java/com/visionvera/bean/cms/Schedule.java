package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @ClassName: ScheduleBean 
 * @Description: TODO 预约列表所有字段
 * @author xiechs
 * @date 2017年11月13日
 *
 */
@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class Schedule {
	
	private String uuid; //uuid
	private String name;  //名称
	private String start_time;  //开始时间
	private String end_time;   //结束时间
	private String create_time; //创建时间
	private String creator_id;//流程ID
	private String creator_name;//创建者名称
	private String accessor_id;  //审核人
	private String accessor_time;  //审核时间
	private String usergroup_id;  //授权用户组ID
	private String meetTime;  //会议开始时间
	private Integer status;	 //预约状态 1-审批中，2、4、5-审批通过，3-未通过, 6-变更申请操作
	private String description;	 //备注
	private Integer pcmeet_id;	 //pamir会议id
	private String key;	 //会议ID（已废除）
	private String ip;	 //主席IP
	private Integer call_mode;	 //呼叫方式
	private String xmcu;	 //xmcu
	private String dvr_server_number;	 //服务器号
	private String monitor;        //监控协转地址
	private String notice;	 //通知消息
	private String file_url;	 //附件地址
	private int create_type; //会议创建类型
	private Integer level;         //会议等级
	private Integer type;         //1预约会议，2即时会议
	private String master_no;       //主席号码
	private Integer plan_person_num;       //计划参会人数
	private Integer plan_dev_num;       //计划参会终端数
	private Integer person_num;       //实际参会人数
	private Integer dev_num;       //实际参会终端数
	private String title; //标题
	private String form_no; //表单编号
	private String schedule_time; //会议日期
	private String dept; //部门
	private String devices; //点位信息
	private String rank; //岗位职级
	private String advice;
	private String host; //主持人
	private String functions; //会议主要功能：1可视电话；2会议；3监播；4无人机；5监控；6手机；7点播；8采集卡录播；9网络录播；10电子矩阵
	private Integer member_level; //会议等级
	private String schedule_id;   //会议编号
	private String comment;   //会议总结-具体评价
	private Integer customer_comment;   //会议总结-客户评价
	private String commander_hq;   //总指挥-总部
	private String commander_out;   //总指挥-外地
	private String switch_hq;   //监控交换机流量-总部
	private String switch_out;   //监控交换机流量-外地
	private String problem_hq;   //处理解决问题-总部
	private String problem_out;   //处理解决问题-外地
	private String feedback_hq;   //反馈所有视联网点位信息-总部
	private String feedback_out;   //反馈所有视联网点位信息-外地
	private String response_hq;   //响应群消息收集反馈问题-总部
	private String response_out;   //响应群消息收集反馈问题-外地
	private String assist_hq;   //辅助-总部
	private String assist_out;   //辅助-外地
	private String prepare_hq;   //大塔预备-总部
	private String prepare_out;   //大塔预备-外地
	private String process_id;   //审批流程ID
	private Integer state;        //审批状态（控制页面权限使用）
	private String region;       //会议区域
	private String auth_member;       //授权用户
	private String svr_region_id;		//数据来源-子系统行政区域ID
	private String client_type;		//开会客户端类型。1 pamir; 2 webservice
	private String main_bw;		//主源带宽
	private String auxiliary_bw;		//辅源带宽
	private String master_addr;		//主席地址（省份、直辖市、特区、自治区）
	private Integer stop_status;    //会议停止状态
	private Integer login_mode;    //-1会管调度开启的 0是表示key值登录 1是表示IP登录 2是表示V2V登录
	
	
	public String getMaster_no() {
		return master_no;
	}
	public void setMaster_no(String master_no) {
		this.master_no = master_no;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getCreator_id() {
		return creator_id;
	}
	public void setCreator_id(String creator_id) {
		this.creator_id = creator_id;
	}
	public String getAccessor_id() {
		return accessor_id;
	}
	public void setAccessor_id(String accessor_id) {
		this.accessor_id = accessor_id;
	}
	public String getUsergroup_id() {
		return usergroup_id;
	}
	public void setUsergroup_id(String usergroup_id) {
		this.usergroup_id = usergroup_id;
	}
	public String getMeetTime() {
		return meetTime;
	}
	public void setMeetTime(String meetTime) {
		this.meetTime = meetTime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getPcmeet_id() {
		return pcmeet_id;
	}
	public void setPcmeet_id(Integer pcmeet_id) {
		this.pcmeet_id = pcmeet_id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Integer getCall_mode() {
		return call_mode;
	}
	public void setCall_mode(Integer call_mode) {
		this.call_mode = call_mode;
	}
	public String getXmcu() {
		return xmcu;
	}
	public void setXmcu(String xmcu) {
		this.xmcu = xmcu;
	}
	public String getDvr_server_number() {
		return dvr_server_number;
	}
	public void setDvr_server_number(String dvr_server_number) {
		this.dvr_server_number = dvr_server_number;
	}
	public String getMonitor() {
		return monitor;
	}
	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}
	public String getNotice() {
		return notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}
	public String getFile_url() {
		return file_url;
	}
	public void setFile_url(String file_url) {
		this.file_url = file_url;
	}
	public int getCreate_type() {
		return create_type;
	}
	public void setCreate_type(int create_type) {
		this.create_type = create_type;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	
	public Integer getPlan_person_num() {
		return plan_person_num;
	}
	public void setPlan_person_num(Integer plan_person_num) {
		this.plan_person_num = plan_person_num;
	}
	public Integer getPlan_dev_num() {
		return plan_dev_num;
	}
	public void setPlan_dev_num(Integer plan_dev_num) {
		this.plan_dev_num = plan_dev_num;
	}
	public Integer getPerson_num() {
		return person_num;
	}
	public void setPerson_num(Integer person_num) {
		this.person_num = person_num;
	}
	public Integer getDev_num() {
		return dev_num;
	}
	public void setDev_num(Integer dev_num) {
		this.dev_num = dev_num;
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
	public String getSchedule_time() {
		return schedule_time;
	}
	public void setSchedule_time(String schedule_time) {
		this.schedule_time = schedule_time;
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
	public String getAdvice() {
		return advice;
	}
	public void setAdvice(String advice) {
		this.advice = advice;
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
	public Integer getMember_level() {
		return member_level;
	}
	public void setMember_level(Integer member_level) {
		this.member_level = member_level;
	}
	public String getSchedule_id() {
		return schedule_id;
	}
	public void setSchedule_id(String schedule_id) {
		this.schedule_id = schedule_id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Integer getCustomer_comment() {
		return customer_comment;
	}
	public void setCustomer_comment(Integer customer_comment) {
		this.customer_comment = customer_comment;
	}
	public String getCommander_hq() {
		return commander_hq;
	}
	public void setCommander_hq(String commander_hq) {
		this.commander_hq = commander_hq;
	}
	public String getCommander_out() {
		return commander_out;
	}
	public void setCommander_out(String commander_out) {
		this.commander_out = commander_out;
	}
	public String getSwitch_hq() {
		return switch_hq;
	}
	public void setSwitch_hq(String switch_hq) {
		this.switch_hq = switch_hq;
	}
	public String getSwitch_out() {
		return switch_out;
	}
	public void setSwitch_out(String switch_out) {
		this.switch_out = switch_out;
	}
	public String getProblem_hq() {
		return problem_hq;
	}
	public void setProblem_hq(String problem_hq) {
		this.problem_hq = problem_hq;
	}
	public String getProblem_out() {
		return problem_out;
	}
	public void setProblem_out(String problem_out) {
		this.problem_out = problem_out;
	}
	public String getFeedback_hq() {
		return feedback_hq;
	}
	public void setFeedback_hq(String feedback_hq) {
		this.feedback_hq = feedback_hq;
	}
	public String getFeedback_out() {
		return feedback_out;
	}
	public void setFeedback_out(String feedback_out) {
		this.feedback_out = feedback_out;
	}
	public String getResponse_hq() {
		return response_hq;
	}
	public void setResponse_hq(String response_hq) {
		this.response_hq = response_hq;
	}
	public String getResponse_out() {
		return response_out;
	}
	public void setResponse_out(String response_out) {
		this.response_out = response_out;
	}
	public String getAssist_hq() {
		return assist_hq;
	}
	public void setAssist_hq(String assist_hq) {
		this.assist_hq = assist_hq;
	}
	public String getAssist_out() {
		return assist_out;
	}
	public void setAssist_out(String assist_out) {
		this.assist_out = assist_out;
	}
	public String getPrepare_hq() {
		return prepare_hq;
	}
	public void setPrepare_hq(String prepare_hq) {
		this.prepare_hq = prepare_hq;
	}
	public String getPrepare_out() {
		return prepare_out;
	}
	public void setPrepare_out(String prepare_out) {
		this.prepare_out = prepare_out;
	}
	public String getProcess_id() {
		return process_id;
	}
	public void setProcess_id(String process_id) {
		this.process_id = process_id;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getAuth_member() {
		return auth_member;
	}
	public void setAuth_member(String auth_member) {
		this.auth_member = auth_member;
	}
	public String getDevices() {
		return devices;
	}
	public void setDevices(String devices) {
		this.devices = devices;
	}
	public String getSvr_region_id() {
		return svr_region_id;
	}
	public void setSvr_region_id(String svr_region_id) {
		this.svr_region_id = svr_region_id;
	}
	public String getAccessor_time() {
		return accessor_time;
	}
	public void setAccessor_time(String accessor_time) {
		this.accessor_time = accessor_time;
	}
	public String getClient_type() {
		return client_type;
	}
	public void setClient_type(String client_type) {
		this.client_type = client_type;
	}
	public String getMain_bw() {
		return main_bw;
	}
	public void setMain_bw(String main_bw) {
		this.main_bw = main_bw;
	}
	public String getAuxiliary_bw() {
		return auxiliary_bw;
	}
	public void setAuxiliary_bw(String auxiliary_bw) {
		this.auxiliary_bw = auxiliary_bw;
	}
	public String getMaster_addr() {
		return master_addr;
	}
	public void setMaster_addr(String master_addr) {
		this.master_addr = master_addr;
	}
	public String getCreator_name() {
		return creator_name;
	}
	public void setCreator_name(String creator_name) {
		this.creator_name = creator_name;
	}
	public Integer getStop_status() {
		return stop_status;
	}
	public void setStop_status(Integer stop_status) {
		this.stop_status = stop_status;
	}
	public Integer getLogin_mode() {
		return login_mode;
	}
	public void setLogin_mode(Integer login_mode) {
		this.login_mode = login_mode;
	}
}
