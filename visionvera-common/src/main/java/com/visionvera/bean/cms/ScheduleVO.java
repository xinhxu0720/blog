package com.visionvera.bean.cms;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @ClassName: ScheduleBean 
 * @Description: TODO 用户查询预约列表bean 
 * @author zhaolei
 * @date 2016年8月12日 下午3:29:58 
 *
 */
@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class ScheduleVO {
	
	
	
	public ScheduleVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private String id;  //任务节点id
	private String uuid; //uuid
	private String processId;//流程ID
	private String name;  //名称
	private String title;  //标题
	private String startTime;  //开始时间
	private String meetTime;  //会议开始时间
	private String endTime;   //结束时间
	private String createTime; //创建时间
	private String accessorTime; //审批时间
	private String groupId;  //授权用户组ID
	private String groupName; //授权用户组名称
	private String creatorId;  //创建人ID
	private String creatorName;  //创建人名称
	private String operatorId;  //开会人ID
	private String operatorName;  //开会人名称
	private String operatorStatus;  //开会人状态: 0-不在线，1-登录中
	private String accessor;  //审核人
	private String accessorId;  //审核人
	private String status;	 //预约状态 1-审批中，2、4、5-审批通过，3-未通过, 6-变更申请操作
	private Integer pcmeetId;	 //pamir会议id
	private String key;	 //会议ID（已废除）
	private String ip;	 //主席IP
	private Integer callMode;	 //呼叫方式
	private String xmcu;	 //xmcu
	private String dvrServerNumber;	 //服务器号
	private String notice;	 //通知消息
	private String fileUrl;	 //附件地址
	private String description;	 //备注
	private String devGroups;	 //会场ID(多个用,分割)
	private String devices;	 //终端ID(多个用,分割)
	private Integer signTotal;	 //需要签到的会场总数
	private Integer signed;	 //已签到的会场总数
//    private List<MeetingDevVO> devList;
    private Integer createType; //会议创建类型，1：pamir；2：会易通；3 Gis; 4 会控助手；
    private String editorName;     //编辑人账号 会议详细信息需要用到
    private String editType;       //编辑类型 会议详细信息需要用到
    private Integer level;         //会议等级
    private Integer modifyStatus;         //是否变更。0 否，1 是
    private String monitor;        //监控协转地址
    private String masterNo;       //主席号码(全局设备ID）
    private String masterNoLocal;       //主席号码(本地设备ID） 2019/2/20 周逸芳合并16位与64位代码时增加
    private String masterAddr;       //主席地址
    private Integer planPersonNum;       //计划参会人数
    private Integer planDevNum;       //计划参会终端数
    private Integer personNum;       //实际参会人数
    private Integer devNum;       //实际参会终端数
    private String host;          //会议主持人
    private Integer memberLevel;  //参会人员级别
    private List<DeviceVO> devList;  //参会终端列表（前端以json字符串形式传递）
    private String devId;        //设备号码
    private Integer devSum;      //设备终端数量
    private Integer chooseNext; //判断是否需要选择下一节点审批人
    private String state;      //审批状态：1被拒绝，3待审批，5待总结 
    private String speakerOne;  //发一号码
    private String speakerTwo;  //发二号码
    private String approveTime; //超时时间
    private String approveExc; //审批优秀时间
    private String approveQua;//审批合格事件
    private Integer timeOut;   //审批时间是否超时 0未超时，1超时
    private String svrRegionId;   //数据来源-子系统行政区域ID
    private String svrRegionName;   //数据来源-子系统行政区域ID
    private String masterName;    //会议主席名称
    private String devGroupId;  //群组id
    private String globalId;     //全局会议ID（开会成功后调度返回，可重复）2019/2/20 周逸芳合并16位与64位代码时增加
    private Integer type;       //预约类型
    private String stopReason;  //停会原因
	private Integer meetCount;  //告警次数
    private Integer confirmFlag; //报警状态 0未确认 1已知悉
    private String scheduleTime;  //会议时长
    private String stopTime;     //会议结束时间
	private String alostpacket;          //音频丢包率
	private String vlostpacket; 		//视频丢包率addMonitorDevice
	private Integer alost;          //音频丢包率是否异常 0正常 1异常
	private Integer vlost; 		//视频丢包率 是否异常 0正常 1异常
//    private Integer type;       //预约
	private String video;		//远程医疗录制的视频终端列表（ 以;分割）
    private String isVphone ;    //是否为可视电话会议  2019/2/20 周逸芳合并16位与64位代码时增加
    private String audio;		//远程医疗录制的音频终端列表 （以;分割） 
    private Integer vcrType;   // 1手术示教录制  0会议录制 
    private Integer disPlayMod;  //分屏模式 1：一分屏   21：大小屏  22：左右分屏  31：三分屏41：四分屏等分42：四分屏上一下三43：四分屏左一右三

    private Integer meetMode;   //会议模式
    private Integer startVCR;  //是否开启录制  0 不录制  1 录制
    private String customerUnit; //客户单位
    private String customerPosition; //客户职务
    private String scheduleOperator; //会议操作员
    private String customerName; //客户名称
    private String oldUuid; //被点调的终端所在会议id
    private String oldName; //被点调的终端所在会议名称
    private String devType; //终端类型
    private String devName; //终端名称
    private String planTime; //延迟时间
    private String remindMsg; //终端显示消息
    private String devRegionId; //终端行政区域
    private String oldCreatorId; //被点调的终端所在会议创建者uuid
    private Integer versionMode; //区分启明与极光字段
    private Integer loginMode; //1是表示IP登录 2是表示V2V登录 0表示key值登录  2019/2/20 周逸芳合并16位与64位代码时修改 64为String类型 16位为int类型
	private Integer process;    //是否为即时会议 1 及时 2 正常会议
//  private Integer type;       //预约
	private String devno;//终端设备号码
	private Integer platformType;//平台类型
	private String  platformId;//平台ID	
    private String devZoneno;//终端区号
    private String monstorDev; //虚拟终端号码
    private String describeInfo ; //描述信息 2019/2/20 周逸芳合并16位与64位代码时增加
    private String recFileName;//录制文件名
    private String recMeetName;//录制会议名称
    private String recUserId;//录制用户Id
    private String recUserName;//录制用户名字
	private Integer privilege;//是否为特权账号申请会议 0是 1否     
	private String devRegionName;//终端区域名称
    private String loginName;//用户名
    private String pwd;//密码
    private String masterId;//主席八位号码
    private Integer devStatus;//设备在线状态
    
    private String msgIdZoneno;		//主消息区域号
    private String msgIdNo;		//32位主消息id 唯一标识
    private Integer msgId;			//主消息号  协转号码
    
    private Long userID;	//用户编号
    private String userPhone;		//用户电话
    private Integer role ;    //终端
	private Integer ptzCmd;//遥控器控制监控移动类型(0:左,1:上,2:下,3:右,4:停止,5:放大焦距,6:缩小焦距,7:停止焦距)
    private String meetStartTime; //vc_meeting表中start_time(会议开始时间)   
    private String msgNo; 		//协转消息号码
    private String monitorId;		//监控号码
    private String devNo;		//终端号码
    private String reason;		//原因
    private Integer operationType;//业务类型（0普通会议 1一键点调）
	private String regionList;   //会议中终端列表所属行政区域
	private Integer threeMeetingMode; //三方会议业务模式( 0-业务受理模式 1-协助模式 2-分享屏幕模式)
	private Integer stopStatus;//停止状态
	private Integer screenType;//屏幕显示模式 0：1分屏，1：4分屏，2：9分屏，3：13分屏，4：16分屏，5:(2分屏,左右),6:(4分屏，左1右3),7:(4分屏，上1下3),8:(3分屏，上1下2),9:(5分屏，上3下2),10:10分屏,11:11分屏,12:12分屏,13:8分屏,14:6分屏,15:7分屏,16:64分屏
	private String monitorInfo;//播放设备号,是否辅源(1:是，0:否),是否有声音(1:是，0:否);播放设备号,是否辅源,是否有声音(多条以;分隔)
	private Boolean handSpeakSwitch; //举手发言开关（true/false）

	/**64位需求字段
	 * 会议子模式(0:非全景会议,1:全景会议)
	 */
	private Integer meetSubMode ;

	/**64位需求字段
	 * 允许同一个用户开多个会议(1:允许，0:不允许)
	 */
	private Integer allowManyMeeting ;

	/**64位开始录制需求参数
	 * vodMode app段指定参数位0
	 */
	private Integer vodMode;

	/**64位开始录制需求参数
	 * fileName 文件名字
	 */
	private String fileName;
	/**64位一键点调需求参数
	 * 1:Pamir控制的会议,0:App控制的会议
	 */
	private Integer oldMust ;

	/**64位一键点调需求参数
	 *1:Pamir控制的会议,0:App控制的会议
	 */
	private Integer newMust ;

	/**64位需求参数
	 *终端数据字节长度
	 */
	private Integer terminalDataLength ;

	/**64位需求参数
	 * 终端数据
	 */
	private String terminalData ;

	/**64位需求参数
	 * 监控摄像头位置
	 */
	private Integer monitorPosition ;

	/**64位需求参数
	 * 向终端申请退会数据长度
	 */
	private Integer removeDeviceDataLength ;

	/**64位需求参数
	 * 向终端申请退会数据
	 */
	private String removeDeviceData ;

	/**64位需求参数
	 * 字幕信息
	 */
	private List<CaptionsVO> captionsList ;

	/**64位需求参数
	 * 会议创建者
	 */
	private String meetingCreatorId;

	/**64位需求参数
	 * 是否给pamir发送数据（0：发，1：不发）
	 */
	private String isSendPamir;

	/** pamirMobile融合会议需要参数
	 * 16位终端信息,互联互通功能(多个用,分割)
	 */
	private String devices16;

	/** pamirMobile融合会议需要参数
	 * 16+64互联互通的区号
	 */
	private Integer areaNumber ;

	/** pamirMobile融合会议需要参数
	 * 桥接主席ip
	 */
	private String brigeMasterIp ;

	/** pamirMobile虚拟会议室需求参数
	 * 第三方会议类型，1:视联汇,2:PamirMobile
	 */
	private String appCreateType ;

	/** 杨乌拉的平顶山项目需求参数录制使用
	 * 告警id
	 */
	private String alarmId;

	public String getAlarmId() {
		return alarmId;
	}

	public void setAlarmId(String alarmId) {
		this.alarmId = alarmId;
	}

	public String getAppCreateType() {
		return appCreateType;
	}

	public void setAppCreateType(String appCreateType) {
		this.appCreateType = appCreateType;
	}

	public String getDevices16() {
		return devices16;
	}

	public void setDevices16(String devices16) {
		this.devices16 = devices16;
	}

	public Integer getAreaNumber() {
		return areaNumber;
	}

	public void setAreaNumber(Integer areaNumber) {
		this.areaNumber = areaNumber;
	}

	public String getBrigeMasterIp() {
		return brigeMasterIp;
	}

	public void setBrigeMasterIp(String brigeMasterIp) {
		this.brigeMasterIp = brigeMasterIp;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getProcessId() {
		return processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getMeetTime() {
		return meetTime;
	}

	public void setMeetTime(String meetTime) {
		this.meetTime = meetTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getAccessorTime() {
		return accessorTime;
	}

	public void setAccessorTime(String accessorTime) {
		this.accessorTime = accessorTime;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getCreatorName() {
		return creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getOperatorStatus() {
		return operatorStatus;
	}

	public void setOperatorStatus(String operatorStatus) {
		this.operatorStatus = operatorStatus;
	}

	public String getAccessor() {
		return accessor;
	}

	public void setAccessor(String accessor) {
		this.accessor = accessor;
	}

	public String getAccessorId() {
		return accessorId;
	}

	public void setAccessorId(String accessorId) {
		this.accessorId = accessorId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getPcmeetId() {
		return pcmeetId;
	}

	public void setPcmeetId(Integer pcmeetId) {
		this.pcmeetId = pcmeetId;
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

	public Integer getCallMode() {
		return callMode;
	}

	public void setCallMode(Integer callMode) {
		this.callMode = callMode;
	}

	public String getXmcu() {
		return xmcu;
	}

	public void setXmcu(String xmcu) {
		this.xmcu = xmcu;
	}

	public String getDvrServerNumber() {
		return dvrServerNumber;
	}

	public void setDvrServerNumber(String dvrServerNumber) {
		this.dvrServerNumber = dvrServerNumber;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDevGroups() {
		return devGroups;
	}

	public void setDevGroups(String devGroups) {
		this.devGroups = devGroups;
	}

	public String getDevices() {
		return devices;
	}

	public void setDevices(String devices) {
		this.devices = devices;
	}

	public Integer getSignTotal() {
		return signTotal;
	}

	public void setSignTotal(Integer signTotal) {
		this.signTotal = signTotal;
	}

	public Integer getSigned() {
		return signed;
	}

	public void setSigned(Integer signed) {
		this.signed = signed;
	}

	public Integer getCreateType() {
		return createType;
	}

	public void setCreateType(Integer createType) {
		this.createType = createType;
	}

	public String getEditorName() {
		return editorName;
	}

	public void setEditorName(String editorName) {
		this.editorName = editorName;
	}

	public String getEditType() {
		return editType;
	}

	public void setEditType(String editType) {
		this.editType = editType;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getModifyStatus() {
		return modifyStatus;
	}

	public void setModifyStatus(Integer modifyStatus) {
		this.modifyStatus = modifyStatus;
	}

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}

	public String getMasterNo() {
		return masterNo;
	}

	public void setMasterNo(String masterNo) {
		this.masterNo = masterNo;
	}

	public String getMasterNoLocal() {
		return masterNoLocal;
	}

	public void setMasterNoLocal(String masterNoLocal) {
		this.masterNoLocal = masterNoLocal;
	}

	public String getMasterAddr() {
		return masterAddr;
	}

	public void setMasterAddr(String masterAddr) {
		this.masterAddr = masterAddr;
	}

	public Integer getPlanPersonNum() {
		return planPersonNum;
	}

	public void setPlanPersonNum(Integer planPersonNum) {
		this.planPersonNum = planPersonNum;
	}

	public Integer getPlanDevNum() {
		return planDevNum;
	}

	public void setPlanDevNum(Integer planDevNum) {
		this.planDevNum = planDevNum;
	}

	public Integer getPersonNum() {
		return personNum;
	}

	public void setPersonNum(Integer personNum) {
		this.personNum = personNum;
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

	public Integer getMemberLevel() {
		return memberLevel;
	}

	public void setMemberLevel(Integer memberLevel) {
		this.memberLevel = memberLevel;
	}

	public List<DeviceVO> getDevList() {
		return devList;
	}

	public void setDevList(List<DeviceVO> devList) {
		this.devList = devList;
	}

	public String getDevId() {
		return devId;
	}

	public void setDevId(String devId) {
		this.devId = devId;
	}

	public Integer getDevSum() {
		return devSum;
	}

	public void setDevSum(Integer devSum) {
		this.devSum = devSum;
	}

	public Integer getChooseNext() {
		return chooseNext;
	}

	public void setChooseNext(Integer chooseNext) {
		this.chooseNext = chooseNext;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSpeakerOne() {
		return speakerOne;
	}

	public void setSpeakerOne(String speakerOne) {
		this.speakerOne = speakerOne;
	}

	public String getSpeakerTwo() {
		return speakerTwo;
	}

	public void setSpeakerTwo(String speakerTwo) {
		this.speakerTwo = speakerTwo;
	}

	public String getApproveTime() {
		return approveTime;
	}

	public void setApproveTime(String approveTime) {
		this.approveTime = approveTime;
	}

	public String getApproveExc() {
		return approveExc;
	}

	public void setApproveExc(String approveExc) {
		this.approveExc = approveExc;
	}

	public String getApproveQua() {
		return approveQua;
	}

	public void setApproveQua(String approveQua) {
		this.approveQua = approveQua;
	}

	public Integer getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(Integer timeOut) {
		this.timeOut = timeOut;
	}

	public String getSvrRegionId() {
		return svrRegionId;
	}

	public void setSvrRegionId(String svrRegionId) {
		this.svrRegionId = svrRegionId;
	}

	public String getSvrRegionName() {
		return svrRegionName;
	}

	public void setSvrRegionName(String svrRegionName) {
		this.svrRegionName = svrRegionName;
	}

	public String getMasterName() {
		return masterName;
	}

	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}

	public String getDevGroupId() {
		return devGroupId;
	}

	public void setDevGroupId(String devGroupId) {
		this.devGroupId = devGroupId;
	}

	public String getGlobalId() {
		return globalId;
	}

	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getStopReason() {
		return stopReason;
	}

	public void setStopReason(String stopReason) {
		this.stopReason = stopReason;
	}

	public Integer getMeetCount() {
		return meetCount;
	}

	public void setMeetCount(Integer meetCount) {
		this.meetCount = meetCount;
	}

	public Integer getConfirmFlag() {
		return confirmFlag;
	}

	public void setConfirmFlag(Integer confirmFlag) {
		this.confirmFlag = confirmFlag;
	}

	public String getScheduleTime() {
		return scheduleTime;
	}

	public void setScheduleTime(String scheduleTime) {
		this.scheduleTime = scheduleTime;
	}

	public String getStopTime() {
		return stopTime;
	}

	public void setStopTime(String stopTime) {
		this.stopTime = stopTime;
	}

	public String getAlostpacket() {
		return alostpacket;
	}

	public void setAlostpacket(String alostpacket) {
		this.alostpacket = alostpacket;
	}

	public String getVlostpacket() {
		return vlostpacket;
	}

	public void setVlostpacket(String vlostpacket) {
		this.vlostpacket = vlostpacket;
	}

	public Integer getAlost() {
		return alost;
	}

	public void setAlost(Integer alost) {
		this.alost = alost;
	}

	public Integer getVlost() {
		return vlost;
	}

	public void setVlost(Integer vlost) {
		this.vlost = vlost;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getIsVphone() {
		return isVphone;
	}

	public void setIsVphone(String isVphone) {
		this.isVphone = isVphone;
	}

	public String getAudio() {
		return audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}

	public Integer getVcrType() {
		return vcrType;
	}

	public void setVcrType(Integer vcrType) {
		this.vcrType = vcrType;
	}

	public Integer getDisPlayMod() {
		return disPlayMod;
	}

	public void setDisPlayMod(Integer disPlayMod) {
		this.disPlayMod = disPlayMod;
	}

	public Integer getMeetMode() {
		return meetMode;
	}

	public void setMeetMode(Integer meetMode) {
		this.meetMode = meetMode;
	}

	public Integer getStartVCR() {
		return startVCR;
	}

	public void setStartVCR(Integer startVCR) {
		this.startVCR = startVCR;
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

	public String getOldUuid() {
		return oldUuid;
	}

	public void setOldUuid(String oldUuid) {
		this.oldUuid = oldUuid;
	}

	public String getOldName() {
		return oldName;
	}

	public void setOldName(String oldName) {
		this.oldName = oldName;
	}

	public String getDevType() {
		return devType;
	}

	public void setDevType(String devType) {
		this.devType = devType;
	}

	public String getDevName() {
		return devName;
	}

	public void setDevName(String devName) {
		this.devName = devName;
	}

	public String getPlanTime() {
		return planTime;
	}

	public void setPlanTime(String planTime) {
		this.planTime = planTime;
	}

	public String getRemindMsg() {
		return remindMsg;
	}

	public void setRemindMsg(String remindMsg) {
		this.remindMsg = remindMsg;
	}

	public String getDevRegionId() {
		return devRegionId;
	}

	public void setDevRegionId(String devRegionId) {
		this.devRegionId = devRegionId;
	}

	public String getOldCreatorId() {
		return oldCreatorId;
	}

	public void setOldCreatorId(String oldCreatorId) {
		this.oldCreatorId = oldCreatorId;
	}

	public Integer getVersionMode() {
		return versionMode;
	}

	public void setVersionMode(Integer versionMode) {
		this.versionMode = versionMode;
	}

	public Integer getLoginMode() {
		return loginMode;
	}

	public void setLoginMode(Integer loginMode) {
		this.loginMode = loginMode;
	}

	public Integer getProcess() {
		return process;
	}

	public void setProcess(Integer process) {
		this.process = process;
	}

	public String getDevno() {
		return devno;
	}

	public void setDevno(String devno) {
		this.devno = devno;
	}

	public Integer getPlatformType() {
		return platformType;
	}

	public void setPlatformType(Integer platformType) {
		this.platformType = platformType;
	}

	public String getPlatformId() {
		return platformId;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	public String getDevZoneno() {
		return devZoneno;
	}

	public void setDevZoneno(String devZoneno) {
		this.devZoneno = devZoneno;
	}

	public String getMonstorDev() {
		return monstorDev;
	}

	public void setMonstorDev(String monstorDev) {
		this.monstorDev = monstorDev;
	}

	public String getDescribeInfo() {
		return describeInfo;
	}

	public void setDescribeInfo(String describeInfo) {
		this.describeInfo = describeInfo;
	}

	public String getRecFileName() {
		return recFileName;
	}

	public void setRecFileName(String recFileName) {
		this.recFileName = recFileName;
	}

	public String getRecMeetName() {
		return recMeetName;
	}

	public void setRecMeetName(String recMeetName) {
		this.recMeetName = recMeetName;
	}

	public String getRecUserId() {
		return recUserId;
	}

	public void setRecUserId(String recUserId) {
		this.recUserId = recUserId;
	}

	public String getRecUserName() {
		return recUserName;
	}

	public void setRecUserName(String recUserName) {
		this.recUserName = recUserName;
	}

	public Integer getPrivilege() {
		return privilege;
	}

	public void setPrivilege(Integer privilege) {
		this.privilege = privilege;
	}

	public String getDevRegionName() {
		return devRegionName;
	}

	public void setDevRegionName(String devRegionName) {
		this.devRegionName = devRegionName;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getMasterId() {
		return masterId;
	}

	public void setMasterId(String masterId) {
		this.masterId = masterId;
	}

	public Integer getDevStatus() {
		return devStatus;
	}

	public void setDevStatus(Integer devStatus) {
		this.devStatus = devStatus;
	}

	public String getMsgIdZoneno() {
		return msgIdZoneno;
	}

	public void setMsgIdZoneno(String msgIdZoneno) {
		this.msgIdZoneno = msgIdZoneno;
	}

	public String getMsgIdNo() {
		return msgIdNo;
	}

	public void setMsgIdNo(String msgIdNo) {
		this.msgIdNo = msgIdNo;
	}

	public Integer getMsgId() {
		return msgId;
	}

	public void setMsgId(Integer msgId) {
		this.msgId = msgId;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public Integer getPtzCmd() {
		return ptzCmd;
	}

	public void setPtzCmd(Integer ptzCmd) {
		this.ptzCmd = ptzCmd;
	}

	public String getMeetStartTime() {
		return meetStartTime;
	}

	public void setMeetStartTime(String meetStartTime) {
		this.meetStartTime = meetStartTime;
	}

	public String getMsgNo() {
		return msgNo;
	}

	public void setMsgNo(String msgNo) {
		this.msgNo = msgNo;
	}

	public String getMonitorId() {
		return monitorId;
	}

	public void setMonitorId(String monitorId) {
		this.monitorId = monitorId;
	}

	public String getDevNo() {
		return devNo;
	}

	public void setDevNo(String devNo) {
		this.devNo = devNo;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Integer getOperationType() {
		return operationType;
	}

	public void setOperationType(Integer operationType) {
		this.operationType = operationType;
	}

	public String getRegionList() {
		return regionList;
	}

	public void setRegionList(String regionList) {
		this.regionList = regionList;
	}

	public Integer getThreeMeetingMode() {
		return threeMeetingMode;
	}

	public void setThreeMeetingMode(Integer threeMeetingMode) {
		this.threeMeetingMode = threeMeetingMode;
	}

	public Integer getStopStatus() {
		return stopStatus;
	}

	public void setStopStatus(Integer stopStatus) {
		this.stopStatus = stopStatus;
	}

	public Integer getScreenType() {
		return screenType;
	}

	public void setScreenType(Integer screenType) {
		this.screenType = screenType;
	}

	public String getMonitorInfo() {
		return monitorInfo;
	}

	public void setMonitorInfo(String monitorInfo) {
		this.monitorInfo = monitorInfo;
	}

	public Boolean getHandSpeakSwitch() {
		return handSpeakSwitch;
	}

	public void setHandSpeakSwitch(Boolean handSpeakSwitch) {
		this.handSpeakSwitch = handSpeakSwitch;
	}

	public Integer getMeetSubMode() {
		return meetSubMode;
	}

	public void setMeetSubMode(Integer meetSubMode) {
		this.meetSubMode = meetSubMode;
	}

	public Integer getAllowManyMeeting() {
		return allowManyMeeting;
	}

	public void setAllowManyMeeting(Integer allowManyMeeting) {
		this.allowManyMeeting = allowManyMeeting;
	}

	public Integer getVodMode() {
		return vodMode;
	}

	public void setVodMode(Integer vodMode) {
		this.vodMode = vodMode;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Integer getOldMust() {
		return oldMust;
	}

	public void setOldMust(Integer oldMust) {
		this.oldMust = oldMust;
	}

	public Integer getNewMust() {
		return newMust;
	}

	public void setNewMust(Integer newMust) {
		this.newMust = newMust;
	}

	public Integer getTerminalDataLength() {
		return terminalDataLength;
	}

	public void setTerminalDataLength(Integer terminalDataLength) {
		this.terminalDataLength = terminalDataLength;
	}

	public String getTerminalData() {
		return terminalData;
	}

	public void setTerminalData(String terminalData) {
		this.terminalData = terminalData;
	}

	public Integer getMonitorPosition() {
		return monitorPosition;
	}

	public void setMonitorPosition(Integer monitorPosition) {
		this.monitorPosition = monitorPosition;
	}

	public Integer getRemoveDeviceDataLength() {
		return removeDeviceDataLength;
	}

	public void setRemoveDeviceDataLength(Integer removeDeviceDataLength) {
		this.removeDeviceDataLength = removeDeviceDataLength;
	}

	public String getRemoveDeviceData() {
		return removeDeviceData;
	}

	public void setRemoveDeviceData(String removeDeviceData) {
		this.removeDeviceData = removeDeviceData;
	}

	public List<CaptionsVO> getCaptionsList() {
		return captionsList;
	}

	public void setCaptionsList(List<CaptionsVO> captionsList) {
		this.captionsList = captionsList;
	}

	public String getMeetingCreatorId() {
		return meetingCreatorId;
	}

	public void setMeetingCreatorId(String meetingCreatorId) {
		this.meetingCreatorId = meetingCreatorId;
	}

	public String getIsSendPamir() {
		return isSendPamir;
	}

	public void setIsSendPamir(String isSendPamir) {
		this.isSendPamir = isSendPamir;
	}
}

