package com.visionvera.constrant;


public class WsConstants {

	private WsConstants(){
	}
	//Webservice服务端使用的常量定义
	public static final int OK = 0;//操作成功
	public static final int ERROR = 1;//操作失败
	public static final int OTHER_LOGINED = 2;//其他用户登录同一账号，当前用户被迫下线
	public static final int CLIENT_PC = 2;//PC端访问webservice
	public static final int CLIENT_MOBILE = 1;//移动端访问webservice
	public static final int CLIENT_HKZS = 4;//会控助手访问webservice
	public static final int CLIENT_HYT = 5;//会易通访问webservice
	public static final int CLIENT_ZST = 6;//掌上通访问webservice
	public static final int HG_TYPE_64 = 64; //64位会管
	public static final int HG_TYPE_16 = 16; //16位会管


	//WebService客户端使用的常量定义
	public static final String URL_LOGIN = "party3Session";//登录接口URL
	public static final String URL_LOGOUT = "party3Session";//退出接口URL
	public static final String URL_REGION_GET = "regions";//获取行政组织接口URL
	public static final String URL_SERVER_GET = "servers";//获取服务器接口URL
	public static final String URL_DEVICE_GET = "devices";//获取设备接口URL
	public static final String UNIT_URL = "http://%s:%s/wgplat/restful/mix/cusunit/platname/huiguan/getcusunit.do";//客户成员单位查询地址
	public static final String URL_DEVDETAIL = "DevicesCustomer";//登录接口URL
	public static final String DEVICE_URL = "http://%s:%s/wgplat/cmsweb/devices.do";//丢包率数据查询地址

	public static final String KEY_TOKEN = "access_token";//token的key
	public static final String KEY_USER = "userid";//登录用户名的key
	public static final String KEY_PWD = "pwd";//登录密码的key
	public static final String KEY_RESP_CODE = "errcode";//webservice返回错误码的key
	public static final String KEY_RESP_MSG = "errmsg";//webservice返回错消息的key
	public static final String CHARSET_UTF8 = "charset=utf-8";//请求数据格式：application/json
	public static final String METHOD_GET = "GET";//请求方式：GET
	public static final String METHOD_POST = "POST";//请求方式：POST
	public static final String METHOD_PUT = "PUT";//请求方式：POST
	public static final String METHOD_DELETE = "DELETE";//请求方式：POST
	public static final String PROP_CONTENT_TYPE = "Content-Type";//请求属性：Content-Type
	public static final String PROP_CONTENT_JSON = "application/json;charset=utf-8";//请求数据格式：application/json
	public static final String PROP_ACCEPT = "Accept";//请求属性：Accept
	public static final String PROP_ACCEPT_JSON = "application/json";//返回数据格式：application/json

	public static final int BATCH_SIZE = 200;//批量操作，每次操作的数量
	public static final int NM_QUERY_BATCH_SIZE = 30;//从网管接口批量查询数据，每次查询的数量

	public static final int FIRST_NODE_SIZE = 8;//一级节点path长度
	public static final int NODE_INSERT_SIZE = 4;//每级节点path增加的长度

	public static final String SMS_SIGNATURE = "【视联动力】";//默认的短信签名

	public static final String VHOSHT_URL = "http://%s:%s/selfhost/api/call";//消息转发服务器地址
	public static final String NET_HOST_URL = "http://%s:%s/terminalPM-web/restful/";//网管服务器地址
	public static final String DEVICE_LOSS_RATE_URL = "http://%s:%s/wgplat/cmsweb/devicelossrate.do";//丢包率数据查询地址
	/** 丢包率查询地址。其中access_token为固定 */
	public static final String URL_DEVICE_LOSS_RATE = "http://%s:%s/wgplat/microser/terlossrate.do?access_token=8c0061b4956e11e88589001e67fcaea7";
	/** 网管查询设备离线接口, 其中access_token为固定 */
	public static final String URL_DEVICE_OFFLINE = "http://%s:%s/wgplat/microser/teronline.do?access_token=8c0061b4956e11e88589001e67fcaea7";
	/** 调用网管设备离线批次 */
	public static final int WANGGUAN_OFF_LINE_BATCH_SIZE = 20;
	/** 调用网管获取终端、终端所属服务器信息接口, 其中access_token为固定 */
	public static final String URL_DEVICE_AND_SERVER_INFO = "http://%s:%s/wgplat/microser/getallinfo.do?access_token=8c0061b4956e11e88589001e67fcaea7";
	/** 调用网管获取设备版本号接口, 其中access_token为固定 */
	public static final String URL_DEVICE_VERSION = "http://%s:%s/wgplat/microser/terversion.do?access_token=8c0061b4956e11e88589001e67fcaea7";
	/** 调用网管获取设备对应的服务器在线离线状态, 其中access_token为固定 */
	public static final String URL_DEVICE_SERVER_OFFLINE = "http://%s:%s/wgplat/microser/svronline.do?access_token=8c0061b4956e11e88589001e67fcaea7";
	/** 调用网管获取设备对应的服务器转发配置情况地址, 其中access_token为固定 */
	public static final String URL_DEVICE_SERVER_CONFIG = "http://%s:%s/wgplat/microser/svrconfig.do?access_token=8c0061b4956e11e88589001e67fcaea7";
	/** 调用网管获取设备音频和视频有流无流的情况地址, 其中access_token为固定 */
	public static final String URL_DEVICE_FLOW = "http://%s:%s/wgplat/microser/teralarm.do?access_token=8c0061b4956e11e88589001e67fcaea7";
	/** 调用网管重启终端，关闭终端业务接口地址, 其中access_token为固定 */
	public static final String URL_OPERATE_DEVICE = "http://%s:%s/wgplat/restful/meeting/operationter.do?access_token=ed165836ab2d11e89af7001e67fcaea7";
	/** 调用网管获取终端业务状态接口地址，其中access_token为固定 */
	public static final String URL_TERMINAL_BUSINESS_STATUS = "http://%s:%s/wgplat/microser/getterywstatus.do?access_token=8c0061b4956e11e88589001e67fcaea7";
	/** 调用网管备用通道操作终端接口地址，其中access_token为固定 */
	public static final String URL_BACKUPCHANNEL_OPERATIONTER = "http://%s:%s/wgplat/restful/spg/operationter.do?access_token=8c0061b4956e11e88589001e67fcaea7";

	/** 拼接的URL：http://ip:port */
	public static final String URL_SERVER = "://%s:%s";
	/** 获取会管相同用户List的URL */
	public static final String URL_GET_SAME_PHONE_USER_HUIGUAN = "/cmsweb/restful/user/getSamePhoneUser.json";
	/** 获取会管所有用户信息的URL */
	public static final String URL_GET_ALL_USER_HUIGUAN = "/cmsweb/restful/user/getAllUser.json";

	//分级系统常量定义
	public static final String CMS_HOST_URL = "http://%s:%s/cmsweb/restful/";//会管服务器地址
	public static final String KEY_CMS_USER = "loginName";//登录用户名的key
	public static final String KEY_CMS_PWD = "loginPwd";//登录密码的key
	public static final String KEY_CMS_IP = "ip";//多级系统IP的key
	public static final String KEY_CMS_PORT = "port";//多级系统端口的key
	public static final String KEY_CMS_ACCOUNT = "account";//多级系统登录账号的key
	public static final String KEY_CMS_PASSWORD = "password";//多级系统登录密码的key
	public static final String KEY_CMS_AREA_ID = "areaId";//多级系统行政区域ID的key
	public static final String KEY_CMS_AREA_NAME = "areaName";//多级系统行政区域名称的key
	public static final String KEY_CMS_REGISTER_ID = "uuid";//多级系统，子系统在父系统中的uuid的key
	public static final String URL_CMS_LOGIN = "user/regist.json";//登录会管接口URL
	public static final String URL_CMS_REGISTER = "register/register.json";//会管服务注册接口URL
	public static final String URL_CMS_UNREGISTER = "register/unregister.json";//会管服务解注册接口URL
	public static final String URL_CMS_DEVICE_GET = "syncData/devices.json";//获取设备接口URL
	public static final String URL_CMS_DEVICE_ADD = "reportData/devices/addEdit.json";//上报新增/修改的设备接口URL
	public static final String URL_CMS_DEVICE_DEL = "reportData/devices/del.json";//上报删除的设备接口URL
	public static final String URL_CMS_SERVER_INFO_GET = "syncData/serverInfos.json";//获取设备所属服务器接口URL
	public static final String URL_CMS_SERVER_INFO_ADD = "reportData/serverInfos/addEdit.json";//上报新增/修改的设备所属服务器接口URL
	public static final String URL_CMS_SERVER_INFO_DEL = "reportData/serverInfos/del.json";//上报删除的设备所属服务器接口URL
	public static final String URL_CMS_SCHEDULE_GET = "syncData/schedules.json";//获取预约列表接口URL
	public static final String URL_CMS_SCHEDULE_ADD = "reportData/schedules/addEdit.json";//上报新增/修改的预约接口URL
	public static final String URL_CMS_SCHEDULE_DEL = "reportData/schedules/del.json";//上报删除的预约接口URL
	public static final String URL_CMS_SCHEDULE_DEV_GET = "syncData/scheduleDevs.json";//获取预约设备列表接口URL
	public static final String URL_CMS_SCHEDULE_DEV_ADD = "reportData/scheduleDevs/addEdit.json";//上报新增/修改的预约设备列表接口URL
	public static final String URL_CMS_SCHEDULE_DEV_DEL = "reportData/scheduleDevs/del.json";//上报删除的预约设备列表接口URL
	public static final String URL_CMS_MEETING_GET = "syncData/meetings.json";//获取会议列表接口URL
	public static final String URL_CMS_MEETING_ADD = "reportData/meetings/addEdit.json";//上报新增/修改的会议接口URL
	public static final String URL_CMS_MEETING_DEL = "reportData/meetings/del.json";//上报删除的会议接口URL
	public static final String URL_CMS_SUMMARY_GET = "syncData/summarys.json";//获取总结表列表接口URL
	public static final String URL_CMS_SUMMARY_ADD = "reportData/summarys/addEdit.json";//上报新增/修改的总结表接口URL
	public static final String URL_CMS_SUMMARY_DEL = "reportData/summarys/del.json";//上报删除的总结表接口URL
	public static final String URL_CMS_USER_GET = "syncData/users.json";//获取用户列表接口URL
	public static final String URL_CMS_USER_ADD = "reportData/users/addEdit.json";//上报新增/修改的用户接口URL
	public static final String URL_CMS_USER_DEL = "reportData/users/del.json";//上报删除的用户接口URL
	public static final String URL_CMS_USERGROUP_GET = "syncData/userGroups.json";//获取用户组列表接口URL
	public static final String URL_CMS_USERGROUP_USER_GET = "syncData/userGroupUsers.json";//获取用户组-用户关系列表接口URL
	public static final String URL_CMS_SCHEDULE_STATE_GET = "syncData/scheduleState.json";//获取预约主席，发一，发二列表接口URL
	public static final String URL_CMS_SCHEDULE_STATE_ADD = "reportData/scheduleState/addEdit.json";//上报新增/修改的用户接口URL
	public static final String URL_CMS_SCHEDULE_STATE_DEL = "syncData/scheduleState/del.json";//上报删除的用户接口URL
	public static final String URL_CMS_GET_USER_DEVICE = "/cmsweb/restful/device/%s/devices/get.json";//根据用户id获取联系人列表
	public static final String URL_CMS_GET_USER_DEVICE_GROUPS = "/cmsweb/restful/device/%s/devGroups/get.json";//根据用户id获取群组列表(支持分页)，包含默认群组及私有群组
	public static final String URL_CMS_ADD_DEVICE_GROUP = "/cmsweb/restful/device/%s/devGroups/add.json";//新增私有群组接口
	public static final String URL_CMS_GET_GROUP_DEVICES = "/cmsweb/restful/device/%s/%s/groupDevs/get.json";//根据群组id获取联系人列表(支持分页)
	public static final String URL_CMS_UPDATE_DEVICE_GROUPS = "/cmsweb/restful/device/%s/devGroups/edit.json";//修改私有群组接口
	public static final String URL_CMS_DELETE_DEVICE_GROUPS = "/cmsweb/restful/device/%s/devGroups/%s/del.json";//删除私有群组接口
	public static final String URL_CMS_GET_USER_INFO = "/cmsweb/restful/user/%s/info/get.json";//根据用户ID获取用户接口
	public static final String URL_CMS_DEL_USER_DEV_GROUPS = "/cmsweb/restful/device/%s/devGroups/dft/%s/del.json";//删除联系人（设备）群组（默认）
	public static final String URL_CMS_UPDATE_DTF_USER_DEV_GROUPS = "/cmsweb/restful/device/%s/devGroups/dft/edit.json";//修改联系人（设备）群组列表（默认）
	public static final String URL_CMS_UPDATE_DEV_GROUP = "/cmsweb/restful/device/%s/%s/setOrder/%s.json";//置顶（取消置顶）群组
	public static final String URL_CMS_PUSHMESSAGETOQUEUE = "/cmsweb/restful/util/mq/sendMessageToQueue.json";//将推送消息推送给MQ
	public static final String URL_CMS_GETVIDIOAUDIO = "/cmsweb/restful/schedule/%s/%s/getVedioAudioInfo.json";//获取四方会议音视频信息
	public static final String URL_CMS_GETMONITORRESOURCE = "/cmsweb/restful/schedule/%s/%s/getMonitorResource.json";//获取协转监控资源
	public static final String URL_CMS_SCHEDULESTATEGET ="/cmsweb/restful/device/%s/%s/scheduleState/get.json";//获取主席、发言人_64位
	public static final String URL_CMS_REMOTECONTROLMONITOR = "/cmsweb/restful/schedule/%s/%s/remoteControlMonitor.json";//遥控器控制监控摄像头
	public static final String URL_CMS_CHANGETHREEMEETING = "/cmsweb/restful/schedule/%s/%s/changeThreeMeeting.json";//三方会议切换
	public static final String URL_CMS_SETMONITORPLAYER16 = "/cmsweb/restful/schedule/%s/%s/setMonitorPlayer.json";//设置监播信息(轮询用) 16位
	public static final String URL_CMS_SETMONITORPLAYER64 = "/cmsweb/restful/schedule/%s/%s/setMonitorPlay.json";//设置监播信息(轮询用)  64位
	public static final String URL_CMS_SETVEDIOAUDIOINFO = "/cmsweb/restful/schedule/%s/%s/setVedioAudioInfo.json";//设置四方会议音视频信息
	public static final String URL_CMS_GETMEETINGDEVS = "/cmsweb/restful/schedule/%s/getMeetingByDevs.json";//通过设备获取正在进行的会议
	public static final String URL_CMS_GETMEETINGDEV = "/cmsweb/restful/schedule/%s/%s/getMeetingByDev.json";//64位通过设备获取所在会议信息
	public static final String URL_CMS_GETMONITORSCREENINFO = "/cmsweb/restful/schedule/%s/%s/getMonitorScreenInfo.json";//获取监播设置信息
	public static final String URL_CMS_CHANGEMONITORSCREENMODE = "/cmsweb/restful/schedule/%s/%s/changeMonitorScreenMode.json";
	public static final String URL_CMS_SETMONITORSCREENMODE = "/cmsweb/restful/schedule/%s/%s/setMonitorScreenMode.json";//设置监播分屏模式
	public static final String URL_CMS_SETVCRMODE = "/cmsweb/restful/schedule/%s/%s/setVcrModel.json";//设置录制显示模式(切流)64
	public static final String URL_CMS_DYNADDSTREAMMEDIA = "/cmsweb/restful/schedule/%s/%s/dynAddStreamMedia.json";//设置录制显示模式
	public static final String URL_CMS_CHANGEDEVICE = "/cmsweb/restful/schedule/%s/%s/changeDevice.json";//切换绑定终端  16
	public static final String URL_CMS_SETDEVIEVEVASTATUS = "/cmsweb/restful/schedule/%s/%s/setDeviveVAStatus.json";//通知终端流状态  16
	public static final String URL_CMS_GETONLIST = "/cmsweb/restful/schedule/%s/getOnList.json";//获取正在拨打的可视电话 16
//	public static final String URL_CMS_ADDMONITORDEVICE = "cmsweb/restful/schedule/%s/%s/addMonitorDevice.json";//会议控制相关接口-监控入会(不绑定监控)
	public static final String URL_CMS_STOPDEV = "/cmsweb/restful/schedule/stopDev.json";//强制停止当前终端业务
	public static final String URL_CMS_SETHANDSPERKSWITCH = "/cmsweb/restful/schedule/%s/%s/setHandSpeakSwitch.json";//设置举手发言开关
	public static final String URL_CMS_SETHANDSPERKTOMASTER = "/cmsweb/restful/schedule/%s/%s/setHandSpeakToMaster.json";//设置举手列表给主席
	public static final String URL_CMS_SETBATCHDEVICEDISSOSD = "/cmsweb/restful/schedule/%s/%s/setBatchDeviceDissOSD.json"; //批量设置终端字幕信息
	public static final String URL_CMS_SETDEVICEOSD = "/cmsweb/restful/schedule/%s/%s/setDevOsd.json"; //设置指定终端字幕信息
	public static final String URL_CMS_SETMONITORPOSITION = "/cmsweb/restful/schedule/%s/%s/setMonitorPosition.json"; //设置监控摄像头预置位
	public static final String URL_CMS_GOTOMONITORPOSITION = "/cmsweb/restful/schedule/%s/%s/gotoMonitorPosition.json"; //跳转监控摄像头预制位
	public static final String URL_CMS_SENDDATATOTERMINAL = "/cmsweb/restful/schedule/%s/%s/sendDataToTerminal.json"; //透传数据给终端
	public static final String URL_CMS_GETREGIONBYID = "/cmsweb/restful/device/%s/getRegionById.json"; //64位通过父节点获取子节点信息
	public static final String URL_CMS_GETDEVICESBYREGION = "/cmsweb/restful/device/%s/getDevicesByRegion.json"; //64位通过区域信息查询设备
	public static final String URL_CMS_GETDEVSTATUSBYWG = "/cmsweb/restful/device/%s/devStatus/getDevStatusByWG.json"; //通过post从网管获取终端业务状态
	public static final String URL_CMS_GETSCHEDULEBYID = "/cmsweb/restful/schedule/%s/%s/getScheduleById.json"; //通过会议ID获取会议信息
	public static final String URL_CMS_ISSTARTVCR = "/cmsweb/restful/schedule/%s/%s/rec/isStartVcr.json"; //查询是否正在录制
	public static final String URL_CMS_SEPARATEMEETING = "/cmsweb/restful/schedule/%s/%s/separateMeeting.json"; //设置分隔会议 64位
	public static final String URL_CMS_STARTMEETING5 = "/cmsweb/restful/schedule/%s/startMeeting5.json"; //会议控制相关接口-开五方会议
	public static final String URL_CMS_DYNADDDEVICEEX = "/cmsweb/restful/schedule/%s/%s/dynAddDeviceEx.json"; //会议控制相关接口-新增参会方（扩展接口）
	public static final String URL_CMS_DYNDELDEVICEEXT = "/cmsweb/restful/schedule/%s/%s/dynDelDeviceExt.json"; //会议控制相关接口-移除参会方（兼容监控和普通参会方）
	public static final String URL_CMS_OPERATEUSERDEV = "/cmsweb/restful/device/%s/operateUserDev.json"; //更新终端设备(如果设备存在就修改，如果不存在就插入)
	public static final String URL_CMS_GETSTREAMMEDIASVRNO = "/cmsweb/restful/schedule/%s/getStreamMediaSvrno"; //获取流媒体虚拟信息
    public static final String URL_CMS_GETAIDATADETAIL = "/cmsweb/restful/schedule/%s/%s/getAIDataDetail"; //智能分析每个批次的人头数（64位接口）
    public static final String URL_CMS_GETAIDATALIST = "/cmsweb/restful/schedule/%s/%s/getAIDataList"; //智能分析每个省的人头数（64位接口）
	public static final String URL_CMS_SENDBATCHDATATOTERMINAL =  "/cmsweb/restful/schedule/%s/%s/sendBatchDataToTerminal"; //批量透传数据给终端


    /** 会管为微服务提供的审批接口地址 */
	public static final String URL_CMS_COMPLETE = "/cmsweb/restful/schedule/loginUser/%s/userId/%s/micro/complete.json";

	
	public static final String URL_CMS_REJECT = "/cmsweb/restful/schedule/loginUser/%s/userId/%s/micro/reject.json";

	//上报数据的方法名定义
	public static final String METHOD_CMS_SERVER_INFO_ADD = "addServerInfos";//上报新增的设备所属服务器信息
	public static final String METHOD_CMS_SERVER_INFO_DEL = "delServerInfos";//上报删除的设备所属服务器信息
	public static final String METHOD_CMS_DEVICE_ADD = "addDevices";//上报新增的设备信息
	public static final String METHOD_CMS_DEVICE_DEL = "delDevices";//上报删除的设备信息
	public static final String METHOD_CMS_SCHEDULE_ADD = "addSchedules";//上报新增的预约信息
	public static final String METHOD_CMS_SCHEDULE_DEL = "delSchedules";//上报删除的预约信息
	public static final String METHOD_CMS_SCHEDULE_DEV_ADD = "addScheduleDevs";//上报新增的预约设备列表信息
	public static final String METHOD_CMS_SCHEDULE_DEV_DEL = "delScheduleDevs";//上报删除的预约设备列表信息
	public static final String METHOD_CMS_MEETING_ADD = "addMeetings";//上报新增的会议信息
	public static final String METHOD_CMS_MEETING_DEL = "delMeetings";//上报删除的会议信息
	public static final String METHOD_CMS_SUMMARY_ADD = "addSummarys";//上报新增的设备所属服务器信息
	public static final String METHOD_CMS_SUMMARY_DEL = "delSummarys";//上报删除的设备所属服务器信息
	public static final String METHOD_CMS_USER_ADD = "addUsers";//上报新增的用户信息
	public static final String METHOD_CMS_USER_DEL = "delUsers";//上报删除的用户信息
	public static final String METHOD_CMS_SCHEDULE_STATE_ADD = "addScheduleState";//上报新增的会议状态信息
	public static final String METHOD_CMS_SCHEDULE_STATE_DEL = "delScheduleState";//上报删除的会议状态信息

	//会管调度相关接口
	public static final String URL_CMS_USER_LOGIN = "/cmsweb/restful/user/login.json";//用户登录接口
	public static final String URL_CMS_USER_LOGOUT = "/cmsweb/restful/user/logout.json";//用户登出接口
	public static final String URL_CMS_START_MEETING = "/cmsweb/restful/schedule/%s/startMeeting.json";//开会接口：{userId}
	public static final String URL_CMS_CHANGE_SPEAKER = "/cmsweb/restful/schedule/%s/%s/%s/changeSpeaker.json";//切换发言人接口：{userId}/{scheduleId}/{deviceId}
	public static final String URL_CMS_STOP_MEETING = "/cmsweb/restful/schedule/%s/%s/stopMeeting.json";//停会接口：{userId}/{scheduleId}
	public static final String URL_CMS_STOP_MEETING_WITH_SUBSYSTEM = "/cmsweb/meet/stopMeetingWithSubSystem.do";//一键停会接口，包含停子系统会议
	public static final String URL_CMS_SECOND_SPEAKER = "/cmsweb/restful/schedule/%s/%s/%s/secondSpeaker.json";//设置第二发言人接口：{userId}/{scheduleId}/{deviceId}
	public static final String URL_CMS_CLEAN_SECOND_SPEAKER = "/cmsweb/restful/schedule/%s/%s/%s/cleanSecondSpeaker.json";//清空第二发言人接口：{userId}/{scheduleId}/{deviceId}
	public static final String URL_CMS_SET_DISP_MODE = "/cmsweb/restful/schedule/%s/%s/setDispMode.json";//设置终端显示模式接口：{userId}/{scheduleId}
	public static final String URL_CMS_SET_SCHEDULE_STATE = "/cmsweb/restful/device/%s/scheduleState/update.json";//设置主席、发一、发二接口：{userId}
	public static final String URL_CMS_GET_SCHEDULE_STATE = "/cmsweb/restful/device/%s/%s/scheduleState/get.json";//获取主席、发一、发二接口：{userId}/{scheduleId}
	public static final String URL_CMS_GET_MEETING_DEVS = "/cmsweb/restful/schedule/%s/%s/meetingDevs.json";//获取参会终端列表接口：{userId}/{scheduleId}
	public static final String URL_CMS_CHANGE_SEC_STREAM = "/cmsweb/restful/schedule/%s/%s/%s/changeSecStream.json";//切换辅流接口：{userId}/{scheduleId}/{deviceId}
	public static final String URL_CMS_STOP_SEC_STREAM = "/cmsweb/restful/schedule/%s/%s/stopSecStream.json";//停止辅流接口：{userId}/{scheduleId}
	public static final String URL_CMS_SET_DISP_MODELIST = "/cmsweb/restful/schedule/%s/%s/setDispModeList.json";//批量设置终端显示模式接口：{userId}/{scheduleId}
	public static final String URL_CMS_GET_MEETING_IN_PROCESS = "/cmsweb/restful/schedule/%s/schedulesInProcess.json";//获取用户进行中的会议接口：{userId}
	public static final String URL_CMS_GET_PER_SERVER = "/cmsweb/restful/util/sysConfig/getPerServer.json";//获取视联汇各服务权限的接口
	public static final String URL_CMS_GET_UPGRADE_INFO = "/cmsweb/restful/util/file/fileCheckVersion.json";//从会管获取版本升级信息的接口
	public static final String URL_CMS_PSOT_DEVICE_UPDATEUSERDEV = "/cmsweb/restful/device/updateUserDev.json";//置顶/取消置顶用户下设备
	public static final String URL_CMS_PSOT_DEVICE_DISTRIBUTEDEV = "/cmsweb/restful/device/distributeDev.json";//根据用户uuid分配设备
	public static final String URL_CMS_PSOT_DEVICE_DELETEDEVOFUSER = "/cmsweb/restful/device/deleteDevOfUser.json";//根据用户uuid和设备id删除分配的设备
	public static final String URL_CMS_PSOT_DEVICE_UPDATEBYID = "/cmsweb/restful/device/updateById.json";//根据设备id更新联系人昵称
	public static final String URL_CMS_PSOT_DEVICE_GETDEVINFO = "/cmsweb/restful/device/getDevInfo.json";//搜索设备列表(支持分页)
	public static final String URL_CMS_SET_PWD_BY_PHONE = "/cmsweb/restful/user/phone/%s/pwd/reset.json";//根据手机号设置密码:{num}
	public static final String URL_CMS_GET_VERIFY_CODE = "/cmsweb/restful/user/phone/%s/verifiCode/get.json";//获取短信验证码:{num}
	public static final String URL_CMS_CHECK_VERIFY_CODE = "/cmsweb/restful/user/phone/%s/%s/checkVerifiCode.json";//校验短信验证码:{num}/{verifiCode}
	public static final String URL_CMS_USER_REGISTER = "/cmsweb/restful/user/register.json";//注册用户
	public static final String URL_CMS_CREATE_SCHEDULE = "/cmsweb/restful/schedule/process/create.json";//PAMIR、视联汇创建预约
	public static final String URL_CMS_SJHKCREATE = "/cmsweb/restful/schedule/hkzsStartProcess/get.json";//64位创建预约
	public static final String URL_CMS_UPDATE_SCHEDULE = "/cmsweb/restful/schedule/process/update.json";//PAMIR、视联汇创建预约
	public static final String URL_CMS_GET_MEETING_INFO = "/cmsweb/restful/schedule/%s/meetingInfo.json";//获取所有正在进行的会议列表：{userId}
	public static final String URL_CMS_GET_MEETING_DEV_LIST = "/cmsweb/restful/schedule/%s/%s/devList.json";//获取所有正在进行的会议列表：{userId}/{scheduleId}
	public static final String URL_CMS_MEETINFOUNION = "/cmsweb/main/reportData/meetInfoUnion.do";//首页统计（含中国地图）
	public static final String URL_CMS_MEET_LOGLIST = "/cmsweb/meet/logList.do?scheduleId=%s";//根据会议ID查询会议操作日志（不分页）
	public static final String URL_CMS_CHECK_VERSION = "/cmsweb/restful/util/file/fileCheckVersion.json";//查询版本升级信息
	public static final String URL_CMS_NOE_EXPIRED_SCHEDULES = "/cmsweb/restful/schedule/%s/schedules/notExpired.json";//获取所有未过期的预约{userId}
	public static final String URL_CMS_NOE_GET_REGIONDEVICES = "/cmsweb/restful/device/%s/%s/regionDevices/get.json";//获取行政区域及联系人列表
	public static final String URL_CMS_RABBITMQPRORERTIES_GET = "/cmsweb/restful/schedule/rabbitMQProrerties/get.json";//获取RabbitMQ登录配置
	public static final String URL_CMS_GET_SCHEDULEPHONE = "/cmsweb/restful/schedule/%s/%s/getSchedulePhone.json";//获取正在进行的可视电话
	public static final String URL_CMS_VPHONE_GETONLIST ="/cmsweb/restful/schedule/%s/vPhone/getOnList.json";//64位获取正在进行的可视电话
	public static final String URL_CMS_VPHONE_START = "/cmsweb/restful/schedule/vPhone/start.json";//拨打可视电话
	public static final String URL_CMS_VPHONE_STOP = "/cmsweb/restful/schedule/vPhone/stop.json";//挂断可视电话
	public static final String URL_CMS_HKZSSTARTPROCESS_GET = "/cmsweb/restful/schedule/hkzsStartProcess/get.json";//会控助手创建会议
	public static final String URL_CMS_DYNADDDEVICE = "/cmsweb/restful/schedule/%s/%s/dynAddDevice.json";//动态向会议中添加参会方
	public static final String URL_CMS_ADDMONITORDEVICE = "/cmsweb/restful/schedule/%s/%s/addMonitorDevice.json";//动态向会议中添加监控并且绑定
	public static final String URL_CMS_DYNDELDEVICE = "/cmsweb/restful/schedule/%s/%s/%s/dynDelDevice.json";//动态向会议中移除参会方
	public static final String URL_CMS_DYNMONITORDEVICE = "/cmsweb/restful/schedule/%s/%s/dynMonitorDevice.json";//动态向会议T出监控
	public static final String URL_CMS_MONITORCHANGESPEAKER= "/cmsweb/restful/schedule/%s/monitorChangeSpeaker.json";//64位监控切发1
	public static final String URL_CMS_MEETINGSTATUS = "/cmsweb/restful/schedule/%s/%s/meetingStatus.json";//获取会议的状态的接口
	public static final String URL_CMS_SCHEDULE_CANCEL = "/cmsweb/restful/schedule/%s/cancel.json";//取消预约接口
	public static final String URL_CMS_SCHEDULE_DELETE = "/cmsweb/restful/schedule/%s/delete.json";//删除预约接口
	public static final String URL_CMS_SCHEDULE_DEVICECONTACT = "/cmsweb/restful/schedule/deviceContact.json";//一键点调
	public static final String URL_CMS_DEVICE_GETREGIONDEVICES = "/cmsweb/restful/device/%s/getRegionDevices.json";//一键点调,根据行政区域获取子节点及相关会议中设备信息
	public static final String URL_CMS_DEVICE_GETDEVREGION = "/cmsweb/restful/device/%s/%s/%s/getDevRegion.json";//一键点调,根据设备号码或名称获取查询其设备及所有父级行政区域
	public static final String URL_CMS_SCHEDULE_GETDEVMEETINGDETAIL = "/cmsweb/restful/schedule/%s/getDevMeetingDetail.json";//一键点调,获取某会议中设备会议详情
	public static final String URL_CMS_SCHEDULE_GETMEETINGSCHEDULE = "/cmsweb/restful/schedule/%s/getMeetingSchedule.json";//一键点调,获取所有正在开会中的会议信息
	public static final String URL_CMS_TELMEDICENSTARTMEETING = "/cmsweb/restful/schedule/%s/telMedicineStartMeeting.json";//开会接口：带录制
	public static final String URL_CMS_STARTVCR = "/cmsweb/restful/schedule/%s/%s/rec/startVcr.json";//开始录制接口
	public static final String URL_CMS_STOPVCR = "/cmsweb/restful/schedule/%s/%s/rec/stopVcr.json";//停止录制
	public static final String URL_CMS_UPDATEUSERDEVICE = "/cmsweb/restful/device/%s/%s/updateUserDevice.json";//修改用户设备信息（vc_user表）
	/** 告警相关 Start */
	public static final String URL_CMS_UPDATE_ALARM_THRESHOULD = "/cmsweb/sysConfig/updateMeetCount.do";//更新告警阈值接口
	/** 告警相关 End */

	/** 会议相关 Start */
	public static final String URL_CMS_DEVICE_GETMASTERBYSCHEDULE = "/cmsweb/device/getMasterBySchedule.do";//以会议主席设备为单位查询所有以此设备为主席的会议
	/** 会议相关 End */

	//统一用户
	public static final String SS_SERVER_URL = "http://%s:%s/sso-server/";//用户平台地址
	public static final String SS_AUTH="auth";//获取用户平台接口URL
	public static final String SS_SYSTEMID="huiguan";//会管id
	public static final int SS_WEB=1;
	public static final int SS_APP=0;
	public static final String SS_REGONLINE="userRegisterOnline.do";//平台在线注册
	public static final String SS_REGOFFLINE="userRegisterOffline.do";//离线注册
	public static final String SS_LOGIN="login.do";//平台登录接口
	public static final String SS_REFRESH="refreshGlobalTicket.do";//平台ticket刷新接口
	public static final String SS_LOGOUT="logout.do";//注销
	public static final String SS_GETUSERINFO="getUserInfo.do";//获取用户信息
	public static final String SS_VERCODE="sendVirificationCode.do";//发送验证码
	public static final String SS_UPPDATEUSER="userUpdate.do";//修改用户信息
	public static final String SS_DELETEUSER="deleteUser.do";//删除用户
	public static final String SS_GETINFOBYTICKET="getUserInfo.do";//根据ticket获取用户信息
	public static final String SS_DISTRIBUTEREGION="distributeRegion.do";//分配行政区域
	public static final String SS_IMPORT="importUserInfo.do";//导入会管数据
	public static final String SS_SYNCHRO="synchroUserInfo.do";//同步基础服务数据
	public static final String SS_RESETPASSWORD="modifyPassword.do";//同步基础服务数据

	//运维平台
	public static final String SLWEOMS_SERVER_URL = "http://%s:%s/slweoms/";//运维平台url
	public static final String ALAMINFORMATIONl = "AlamInformatin/";//运维平台报警URL
	public static final String ADD = "add.do";//运维平台报警接口
	public static final String ALAMPARAM = "paraUrlCoded";//运维平台报警接口参数名

	public static final String SERVER_COUNT_URL = "/slweoms/Server/selectsProvince.do";   //获取省级服务器统计信息
	public static final String SERVERINFO_AREA_URL = "/slweoms/Server/findServerName.do"; //获取行政编码查询区域服务器信息
	public static final String SERVER_CPU_URL = "/slweoms/Servers/getServerCPU.do";   //根据服务器唯一key获取服务器Cpu信息
	public static final String SERVER_DDR_URL = "/slweoms/Servers/getServerDDR.do";   //根据服务器唯一key获取内存信息
	public static final String SERVER_HDD_URL = "/slweoms/Servers/getServerHDD.do";   //根据服务器唯一key获取硬盘信息
	public static final String SERVER_NET_URL = "/slweoms/Servers/getServerNET.do";	  //根据服务器唯一key获取网络信息
	public static final String SERVER_BASIC_URL = "/slweoms/Server/getServerBasicsById.do";   //根据服务器id获取服务器基础信息
	//
	public static final String INFORMATION = "Information/";//运维平台预约上报接口
	public static final String ADDINFORMATION = "addInformationList.do";//运维平台预约上报接口
	public static final String INFORMATIONPARAM = "Information";//运维平台报警接口参数名

	//会管平台升级（从存储网关）
	public static final String URL_GW_HOST = "http://%s:%s/cms/api/upgrade/%s?fileTypeId=%s&sessionID=%s";//存储网关服务器地址
	public static final String METHOD_GW_GET_UPGRADE_INFO = "getUpgradeInfo.do";//从存储网关服务器获取本平台升级文件信息的接口
	public static final String METHOD_GW_HOST_URL = "downLoadFile.do";//从存储网关服务器下载本平台升级文件的接口


	//唐古拉
	public static final String URL_TGL_WEIXIN_GETORGANIZATIONLIST= "/API/WeiXin/GetOrganizationList";//获取下级目录列表接口
	public static final String URL_TGL_WEIXIN_GETMONITORBYORGANIZATION= "/API/WeiXin/GetMonitorByOrganization";//获取组织机构下的监控资源
	public static final String URL_TGL_WEIXIN_USERLOGIN= "/API/WeiXin/UserLogin";//根据用户名和密码登录获取userid
	public static final String URL_TGL_ALL_MON="/api/monitor/GetMonitorAllCount";//获取所有监控
	public static final String URL_TGL_SEARCH_MON="/api/weixin/SearchList";//搜索监控资源

	//网管
	public static final String POST_WG_DWFB_LOGIN = "/terminalPM-web/restful/DBFBlogin";//网管点位分布登录
	public static final String GET_REGION = "/terminalPM-web/restful/regions/parentid/%s";//获取下级行政区域接口,{id}父级regionid
	public static final String GET_REGION_ID = "/terminalPM-web/restful/XZdetails/name/%s";//根据行政区域名称获取行政区域id接口,{name}行政区域名称
	public static final String GET_DWSL = "/terminalPM-web/restful/ZDZXnumber/gradeid/%s/xzjb/%s/id/%s";//获取点位数据, {gradeid}{xzjb}{id}
	public static final String GET_DWSL_ST_TEM = "/terminalPM-web/restful/ZDZXnumber/zzb/xzjb/%s/id/%s";//实体终端数量（临时用，假数据）
	public static final String GET_DWSL_XN_TEM = "/terminalPM-web/restful/ZDZXnumber/zzb/xzjb/%s/id/%s";//虚拟终端数量（临时用，假数据）

	//告警中心相关接口
	public static final String URL_ALARM_GET_BY_ID = "/alarm/getAlarmById";//根据ID获取报警
	public static final String URL_ALARM_GET_COUNT = "/alarm/getAlarmCount";//查询所有报警总数
	public static final String URL_ALARM_GET_BY_PAGE = "/alarm/getAlarmsByPage";//分页获取报警列表
	public static final String URL_ALARM_UPDATE_STATE = "/alarm/updateAlarmState";//分页获取报警列表

	//内容管理平台相关接口
	public static final String URL_CONTENT_LOGIN = "/cms/api/user/logon.do?name=%s&pwd=%s";//登录
	public static final String URL_CONTENT_LOGOUT = "/cms/api/user/logout.do?sessionID=%s";//登出
	public static final String URL_VEDIO_GET_BY_PAGE = "/cms/api/videoResource/list.do";//分页获取录像资源列表
	public static final String URL_RECORD_TASK_GET_BY_PAGE = "/cms/api/recordingTask/list.do";//分页获取录制任务列表
	public static final String URL_VEDIO_PLAY = "/cms/api/videoVodPlay/getRtmpProxyPath.do";//页面点播开始
	public static final String URL_VEDIO_STOP = "/cms/api/videoVodPlay/stopRTMPConnection.do";//页面点播停止
	public static final String URL_VEDIO_STATUS_GET = "/cms/api/videoVodPlay/QueryRTMPStatus.do";//页面点播获取点播状态
	public static final String URL_VEDIO_PLAY_BY_PHONE = "/cms/api/videoVodPlay/startPhoneVod.do";//手机点播开始
	public static final String URL_VEDIO_PAUSE_OR_CONTINUE_BY_PHONE = "/cms/api/videoVodPlay/operatePhoneVod.do";//手机点播暂停或继续播放
	public static final String URL_VEDIO_SEEK_BY_PHONE = "/cms/api/videoVodPlay/seekPhoneVod.do";//手机点播快进或快退
	public static final String URL_VEDIO_STOP_BY_PHONE = "/cms/api/videoVodPlay/stopPhoneVod.do";//手机点播停止播放
	public static final String URL_VEDIO_STATUS_GET_BY_PHONE = "/cms/api/videoVodPlay/queryPhoneVod.do";//手机点播获取点播状态
	public static final String URL_VEDIO_RECORDING_GET = "/cms/api/operationManagement/serviceState/getRecordingResourceList.do";//获取正在录制的资源列表
	public static final String URL_VEDIO_PLAYING_GET = "/cms/api/operationManagement/serviceState/getPlayResourceList.do";//获取正在点播的资源列表
	public static final String URL_SERVER_UPGRADING_GET = "/cms/api/operationManagement/serviceState/getUpgradeVeraVisionList.do";//获取正在升级的资源列表

	//流媒体相关接口
	public static final String URL_LMT_PLATFORMUSER_GETUSERLIST = "/api/PlatformUser/GetUserList";//分页获取用户信息接口
	public static final String URL_LMT_PLATFORMUSER_REGISTER = "/api/PlatformUser/Register";//用户注册接口
	public static final String URL_LMT_PLATFORMUSER_UPDATEUSER = "/api/PlatformUser/UpdateUser";//修改用户信息接口
	public static final String URL_LMT_PLATFORMUSER_DELETEUSER = "/api/PlatformUser/DeleteUser";//删除用户接口
	public static final String URL_LMT_PLATFORMUSER_LOGIN = "/api/PlatformUser/Login";//用户登录接口

//网管相关接口
	public static final String URL_WG_TERMAPPLICATIONS_USER ="/termApplications/user/%s"; //获得终端注册申请列表
	public static final String URL_WG_TERMAPPLICATIONS_USER_ID_SHZT = "/termApplications/user/%s/id/%s/shzt/%s"; //终端申请修改
	public static final String URL_WG_TERMAPPLICATIONS_USERID_SEARCH = "/termApplications/userid/%s/search/%s"; //搜索终端
	public static final String URL_WG_TERMAPPLICATIONS_USER_ID = "/termApplications/user/%s/id/%s"; //获得特定终端注册申请
	public static final String URL_WG_REGIONS_PARENTID = "/regions/parentid/%s"; //取得下级行政区域
	public static final String URL_WG_TERMMACS_DEVGROUP_SEARCH = "/termMACs/devgroup/%s/search/%s"; //取得终端MAC
	public static final String URL_WG_PROJECTS = "/projects"; //取得项目列表
	public static final String URL_WG_TESTTERMS = "/testTerms"; //取得大网测试终端列表
	public static final String URL_WG_TESTMEN = "/testMen"; //取得大网测试人员列表
	public static final String URL_WG_INDUSTRIES = "/industries"; //取得行业列表
	public static final String URL_WG_XZLEVELS = "/xZLevels"; //取得行政级别列表
	public static final String URL_WG_TERMMACS = "/termMACs"; //取得终端MAC
	public static final String URL_WG_IMAGES_USER_BSHXID_TYPE = "/images/user/%s/bshxid/%s/type/%s"; //上传或修改图片

	//网管64位相关接口
	public static final String URL_WG_APPLOGIN_POST ="/wgplat/64/user/applogin.do"; //账号密码登录
	public static final String URL_WG_APPLOGOUT_POST = "/wgplat/64/user/applogout.do";	//退出登录
	public static final String URL_WG_APPTERMLIST_GET ="/wgplat/wgappserver/apptermall/user/%s/thirduserid/%s/apptermlist.do"; //通过用户id获取手机app申请的终端列表
	public static final String URL_WG_ADDTERM_POST = "/wgplat/wgappserver/apptermall/user/%s/addterm.do"; //手机app申请终端
	public static final String URL_WG_PUTTERM_POST = "/wgplat/wgappserver/apptermall/user/%s/id/%s/putterm.do"; //手机app修改终端信息
	public static final String URL_WG_PUTIMG_POST ="/wgplat/wgappserver/apptermall/user/%s/id/%s/putimg.do"; //上传或修改图片
	public static final String URL_WG_GETTERM_GET = "/wgplat/wgappserver/apptermall/user/%s/thirduserid/%s/id/%s/getterm.do"; //获取手机app某个终端信息
	public static final String URL_WG_GETTERMINFO_GET = "/wgplat/wgappserver/apptermall/user/%s/thirduserid/%s/search/%s/gettermInfo.do"; //搜索终端,首页搜索功能
	public static final String URL_WG_GETPROJIECTLIST_GET = "/wgplat/wgappserver/appcustagg/getprojiectlist.do"; //获取项目列表
	public static final String URL_WG_GETORGANIZATIONLIST_GET = "/wgplat/wgappserver/appcustagg/getorganizationlist.do"; //获取客户单位，客户机构列表
	public static final String URL_WG_GETINDUSTRYLIST_GET = "/wgplat/wgappserver/appcustagg/getindustrylist.do"; //获取客户行业列表
	public static final String URL_WG_GETXZJBLIST_GET = "/wgplat/wgappserver/appcustagg/getxzjblist.do"; //获取客户单位行政级别列表
	public static final String URL_WG_GETNETWORKLIST_GET = "/wgplat/wgappserver/apptermagg/getnetworklist.do"; //获取运营网络类型列表
	public static final String URL_WG_GETUSETYPELIST_GET = "/wgplat/wgappserver/apptermagg/getusetypelist.do"; //获取设备用途表
	public static final String URL_WG_GETTERMMAC_GET = "/wgplat/wgappserver/apptermagg/user/%s/devgroup/%s/search/%s/gettermmac.do"; //获取设备用途表
	public static final String URL_WG_GETALLREGIONS_GET = "/wgplat/64/regions/getallregions.do"; //	获取所有行政组织结构
	public static final String URL_WG_PARENTID_REGION_GET = "/wgplat/64/regions/parentid/%s/region.do"; //获取下级行政组织结构
	public static final String URL_WG_GETSVRLIST_GET = "/wgplat/wgappserver/apptermagg/getSvrList.do"; //获取微云服务器下拉列表
	public static final String URL_WG_AUDIT_GET = "/wgplat/wgappserver/apptermall/device/audit.do"; //手机app审核终端开通申请
	public static final String URL_WG_GETAPPLYLISTS_GET = "/wgappserver/apptermall/apply/%s/getApplyLists.do"; //视联汇app获取待审批 / 待开通 / 已开通的申请列表
	public static final String URL_WG_GETUNUSEDDEVNOLIST_GET = "/wgplat/wgappserver/apptermagg/getUnusedDevnoList.do"; //获取微云服务器下可用终端列表
    public static final String URL_WG_GETUNOPENENDLIST_GET = "/wgplat/wgappserver/apptermall/device/getUnopenEndList.do"; //获取微云 服务器下未开通终端列表
    public static final String URL_WG_OPENTER_POST = "/wgplat/wgappserver/apptermall/device/openTer.do"; //手机app开通 终端
	public static final String URL_WG_GETWAITAUDITAPPTERMLIST_GET = "/wgplat/wgappserver/apptermall/getWaitAuditApptermList.do"; //用 户获取手机app申请的待审核终端列表

	/**
	 * 业务统一管控查询可视电话
	 */
	public static final String URL_VPHONE_GET = "/api/rest/vphone/get";
	/**
	 * 业务统一管控查询发布直播
	 */
	public static final String URL_MONITOR_PUBLISH_GET = "/slwcms/api/rest/monitor/publish/get.do";
	/**
	 * 业务统一管控查询收看直播
	 */
	public static final String URL_MONITOR_SUBSCRIBE_GET = "/api/Inspection/GetSubscribe";

	/**
	 * 业务统一管控查询录制
	 */
	public static final String URL_MONITOR_RECORD_GET = "/slwcms/api/rest/vedio/record/get.do";

	/**
	 * 业务统一管控查询点播
	 */
	public static final String URL_MONITOR_PLAY_GET = "/slwcms/api/rest/vedio/play/get.do";
	/**
	 * 业务统一管控查询会议
	 */
	public static final String URL_MEET_GET = "/api/rest/meet/get";

	/**
	 * 业务统一管控停止可视电话（流媒体）
	 */
	public static final String URL_VPHONE_STOP = "api/rest/business/%business%/stop";
	/**
	 * 业务统一管控停止发布直播（唐古拉）
	 */
	public static final String URL_MONITOR_PUBLISH_STOP = "api/rest/business/%business%/stop";
	/**
	 * 业务统一管控停止收看直播（流媒体）
	 */
	public static final String URL_MONITOR_SUBSCRIBE_STOP = "api/rest/business/%business%/stop";

	/**
	 * 业务统一管控停止录制（内容管理）
	 */
	public static final String URL_MONITOR_RECORD_STOP = "/slwcms/api/rest/vedio/record/stop.do";


	/**
	 * 业务统一管控停止会议（流媒体）
	 */
	public static final String URL_MEET_STOP = "api/rest/business/%business%/stop";


	/**
	 * 改变终端显示模式
	 */
	public static final String CHANGEVCRDISPLAYMODE = "/cmsweb/restful/schedule/%s/%s/changeVcrDisplayModel.json";


	/**
	 * 切换流显示的位置
	 */
	public static final String SETVCRSTREAM = "/cmsweb/restful/schedule/%s/%s/changeVcrDisplayModel.json";

	/** 获取网管所有用户的URL */
	public static final String SYNC_USER_FOR_NET_MANAGER_URL = "/terminalPM-web/restful/user/getuserlist/{pathparam}?pageNum={pageNum}&pageSize={pageSize}&access_token={token}";

	/** 网管登录/下发TOKEN的URL */
	public static final String NET_MANAGER_LOGIN_URL = "/terminalPM-web/restful/session/postpasslogin";

	/** 一机一档的登录URL */
	public static final String VSDC_LOGIN_URL = "/vsdc-api/uniOut/getAuthToken";

	/** 会易通的登录URL */
	public static final String HUIYITONG_LOGIN_URL = "/hyt_union/thirdparty/opsworkstation/login.do";

	/** 一机一档下发TOKEN的URL */
	public static final String VSDC_PUSH_TOKEN_URL = "/vsdc-api/uniOut/userLoginFromUni";

	/** 会易通下发TOKEN的URL */
	public static final String HUIYITONG_PUSH_TOKEN_URL = "/hyt_union/thirdparty/opsworkstation/updateapptokenbyphone.do";

	/** 网管的用户添加URL */
	public static final String NET_MANAGER_USER_ADD_URL = "/terminalPM-web/restful/user/adduser/{pathparam}?access_token={token}";

	/** 一机一档的用户添加URL */
	public static final String VSDC_USER_ADD_URL = "/vsdc-api/uniOut/uniRegister";

	/** 会易通的用户添加URL */
	public static final String HUIYITONG_USER_ADD_URL = "/hyt_union/thirdparty/opsworkstation/useradd.do";

	/** 网管的用户修改URL */
	public static final String NET_MANAGER_USER_EDIT_URL = "/terminalPM-web/restful/user/updateuser/{pathparam}?access_token={token}";

	/** 一机一档的用户修改URL */
	public static final String VSDC_USER_EDIT_URL = "/vsdc-api/uniOut/uniUpdateUser";

	/** 会易通的用户修改URL */
	public static final String HUIYITONG_USER_EDIT_URL = "/hyt_union/thirdparty/opsworkstation/usermodify.do";

	/** 网管的用户删除URL */
	public static final String NET_MANAGER_USER_DEL_URL = "/terminalPM-web/restful/user/deleteuser/{pathparam}?userid={userId}&phone={phone}&access_token={token}";

	/** 一机一档的用户删除URL */
	public static final String VSDC_USER_DEL_URL = "/vsdc-api/uniOut/uniDelUser";

	/** 会易通的用户删除URL */
	public static final String HUIYITONG_USER_DEL_URL = "/hyt_union/thirdparty/opsworkstation/userdel.do";

	/** 获取一机一档所有用户的URL */
	public static final String SYNC_USER_FOR_VSDC_URL = "/vsdc-api/uniOut/getSyncUsers?accesstoken={token}&pageNum={pageNum}&pageSize={pageSize}";

	/** 获取会易通所有用户的URL */
	public static final String SYNC_USER_FOR_HYT_URL = "/hyt_union/thirdparty/opsworkstation/userlist.do";
	
	/*64位同步网管自制云信息*/
	public static final String URL_CLOUD_GET = "terminal/platname/huiguan/getclouds.do";//获取自治云接口URL
	
	public static final String URL_DEVICE_CPUMEMORY = "cmsweb/getterusagerate.do";//获取获取CPU，内存使用率URL
	
	public static final String URL_ALARM_GET = null;
	
	public static final String URL_CMS_DEVICE_DETAIL_GET = "syncData/devDetail.json";//获取设备联系人详情URL
	
	public static final String URL_DEVICELOG_POST = "/cmsweb/restful/device/%s/getDeviceLog.json";//会管获取终端日志文件

	public static final String URL_DEVICELOG_DELETE = "/cmsweb/restful/device/%s/deleteDeviceLog.json";//删除日志

	public static final String URL_DEVICELOG_AALYZSISLOG = "/cmsweb/restful/device/%s/getAalyzsisLog.json";//分析日志

	public static final String URL_DEVICELOG_DOWNLOAD = "/cmsweb/log/downloadDevLogToOpertion.do";//下载终端日志
	
	//public static final String UPLOAD_FILE = "/cmsweb/file/uploadFile.do";//上传文件路径
	
	public static final String CHECK_FILE = "/cmsweb/log/checkFile.do";//校验文件是否已被删除
	
	public static final String UPLOAD_FILE = "/cmsweb/file/uploadUpgradeFile.do";//上传文件

}
