package com.visionvera.constrant;

public class VSMeet64 {
	public final static short VSM_STARTMEETING = 0x1600;       // 开始多点会议
	public final static short VSM_STARTMEETING2 = 0x1602;      // 开始两点会议
	public final static short VSM_STARTMEETING_IMMEDIAT = 0x2000;    // 开始及时会议
	public final static short VSM_STOPMEETING = 0x2001;        // 停会
	public final static short VSM_CHANGESPEAKER = 0x0105;      // 切换发言人
	public final static short VSM_SECONDSPEAKER = 0x0110;      // 第二发言人
	public final static short VSM_CLEAN_SECONDSPEAKER = 0x0123;      // 清除第二发言人
	public final static short VSM_DYNADDSTB = 0x0114;          // 会议中动态添加设备
	public final static short VSM_DYNDELSTB = 0x0115;          // 会议中动态删除设备
	//public final static short VSM_DYNDELMONITOR = 0x2003;          // 会议中动态删除监控（唐古拉四画面）
	public final static short VSM_SET_MONITOR_PLAY = 0x2004;   // 设置监播信息
	public final static short VSM_SETOSD = 0x1612;             // 设置会议终端字幕
	public final static short VMS_SETALLOSD = 0x1614;          // 设置会议所有终端字幕
	public final static short VSM_CONTROLCAMERA = 0x1616;      // 远程控制摄像头
	public final static short VSM_SETCAMPREPOS = 0x1618;       // 设置摄像头预置位
	public final static short VSM_GO2CAMPREPOS = 0x1642;       // 跳转摄像头预置位
	public final static short VSM_SYNMEETING = 0x1620;         // 同步会议
	public final static short VSM_ADDMICVOL = 0x1622;           // 增加MIC音量
	public final static short VSM_SUBMICVOL = 0x1624;           // 减少MIC音量
	public final static short VSM_ADDSPEAKERVOL = 0x1626;       // 增加扬声器音量
	public final static short VSM_SUBSPEAKERVOL = 0x1628;       // 减少扬声器音量
	public final static short VSM_SETVOLUME = 0x1640;       // 设置麦克风、扬声器增益
	public final static short VSM_SETDEVVMODE = 0x1630;         // 设置终端显示模式
	public final static short VSM_GETMEETSTATUS = 0x1632;       // 获取会议状态
	public final static short VSM_STARTVCR = 0x0106;           // 开始录制服务
	public final static short VSM_STOPVCR = 0x0107;            // 停止录制服务
	public final static short VMS_SETVCRMODEL = 0x0108;        // 录播切换分屏
	public final static short VMS_SETSTREAM = 0x0133;        // 设置录播显示模式（切流）
	public final static short VMS_SETVEDIOAUDIOINFO = 0x0201;        // 设置四方会议音视频信息
	public final static short VMS_MONITOR_RESOURCE = 0x0118;      //获取监控资源
	
	public final static short VMS_CHANGETHREEMEETING = 0x0318;    //三方会议切换
	public final static short VMS_REMOTECONTROLMONITOR = 0x0145;    //遥控器控制监控摄像头
	public final static short VMS_SETMONITORPOSITION = 0x0143;    //设置监控摄像头预置位
	public final static short VMS_GOTOMONITORPOSITION = 0x0144;    //跳转监控摄像头预制位
	public final static short VMS_DEVICEREMOVEMEETING = 0x0320;    //终端申请退会(透传接口)
	public final static short VMS_TCPMONITORNUM = 0x0118;    //监控资源数量推送
	public final static short VMS_TCPMONITORRESOURCE = 0x0319;    //监控资源数据推送
	public final static short VMS_PUSHRECSERVERERROR = 0x0107;    //推送录播服务异常信息
	public final static short VMS_CHANGEMONITORSCREENMODE = 0x0131;    //设置监播显示(切换监播显示)
	public final static short VMS_SETMONITORSCREENMODE = 0x0132;    //设置监播显示模式
	public final static short VMS_SETHANDSPEAKSWITCH = 0x0134;    //设置举手发言开关
	public final static short VMS_SETHANDSPEAKTOMASTER = 0x0126;    //设置举手列表给主席
	public final static short VMS_HANDSPEAKDATA = 0x0300;    //举手发言推送消息
	public final static short VMS_SENDDEVICESUBTITLE = 0x0128;    //向终端发送字幕
	public final static short VMS_SETBATCHDEVICEDISSOSD = 0x0330;    //批量设置终端不同字幕信息
	public final static short VMS_ISSTARTVCR = 0x1669;    //是否正在录制
	
	public final static short VSM_WEBSERVICE = 0x0040;         //webservice链接标识
	public final static short VSM_STARTMEET_EX_XY = 0x1644;    //新医定制开2点会议接口
	public final static short VMS_DYNADDSTB_EX_XY = 0x1646;    //新医定义动态入会接口，第二参会方入会后自动切换大小屏显示，发言人切换第二参会方
	public final static short VMS_ADD_SCHEDULE = 0x0600;    //创建预约
	public final static short VMS_MEETING_START = 0x1500;    //开启会议
//	public final static short VMS_ADD_SCHEDULE_RESP = 0x1105;    //创建预约返回值
	public final static short VMS_EDIT_SCHEDULE = 0x0601;    //修改预约
	public final static short VMS_DEVICE_ALARMSTATUS = 0x0606;    //获取终端状态(终端告警信息)
//	public final static short VMS_EDIT_SCHEDULE_RESP = 0x1107;    //修改预约返回值
	public final static short VSM_ADDDYNSTB = 0x2002;          // 会议中添加动态资源（监控、手机等）
	public final static short VMS_DYNADDSTBEX = 0x1648;        // 动态入会扩展指令，比照原1608增加设备名称参数
	public final static short VSM_CHANGE_SEC_STREAM = 0x0146;      // 切换辅流(开、关用同一指令，标志位控制）
	public final static short VSM_STOP_SEC_STREAM = 0x1658;      // 停止辅流
	public final static short VMS_PAMIR_LOGIN = 0x0010;    //pamir登录请求
	public final static short VMS_PAMIR_LOGIN_RESP = 0x0011;    //pamir登录返回
	public final static short VMS_VPHONE_START = 0x1660;    //可视电话拨打
	public final static short VMS_VPHONE_STOP = 0x1662;    //可视电话挂断
	public final static short VMS_SETMULTIDEVMODE = 0x1664;      //一键设置多个终端的显示模式
	public final static short VMS_MEETING_STATE_CHANGE = 0x1500;    //会议状态改变（会议开启、停止、切发言人等）
	
	public final static short VSM_ADDMONRTOR = 0x0119;          // 监控入会
	public final static short VSM_DYNMONRTOR = 0x0120;          // 监控退会
	public final static short VMS_CONTACT = 0x5007;      //点调功能
	
	//发布直播相关
	public final static short VMS_START_RELEASELIVE = 0x1663;	//开启发布直播
	public final static short VMS_STOP_RELEASELIVE = 0x1665;	//停止发布直播
	public final static short VMS_START_WATCHLIVE = 0x1666;		//开启收看直播
	public final static short VMS_STOP_WATCHLIVE = 0x1667;		//停止收看直播
	
	//返回值编码
	public final static short ERR_SUCCESS = 0; //执行成功
	public final static short ERR_SCHEDULE_TIME_LESS_NOW = 2010; //预约时间小于当前时间
	public final static short ERR_SCHEDULE_TIME_ERROR = 2011; //预约结束时间小于开始时间
	public final static short ERR_SCHEDULE_TIME_CONFLICT = 2012; //预约时间冲突
	public final static short ERR_SCHEDULE_NAME_REPEAT = 2015; //预约名称重复
	public final static short ERR_SCHEDULE_DEVICE_CONFLICT = 2013; //预约设备冲突（会返回设备列表）
	public final static short ERR_SCHEDULE_DEVICE_NOT_RIGHT = 2016; //用户对设备无权限（会返回设备列表）
	public final static short ERR_SCHEDULE_NOT_EXIST = 2017; //预约不存在
	public final static short ERR_SCHEDULE_CANT_MODIFY = 2018; //预约已经被执行不允许修改
	public final static short ERR_DEVICE_NOT_EXIST = 2030; //设备不存在
	public final static short ERR_OA_NOT_EXIST = 2095; //OA不存在该用户
	public final static short ERR_UNKNOWN = 1502; //未知错误
	public final static short ERR_SCHEDULE_DEVICE_NULL = 7100; //设备号为空
	public final static short ERR_SCHEDULE_LOGIN_WG = 7101; //登录网管失败
	public final static short ERR_SCHEDULE_TOKEN_WG = 7102; //获取网管token失败
	public final static short ERR_SCHEDULE_DATA_WG = 7103; //获取网管数据失败
	
	public final static short ERR_USERNAME_NULL = 8000; //用户名为空
	public final static short ERR_AUTHEN_FAIL = 8001; //认证失败
	public final static short ERR_CHALLENGE_FAIL = 8002; //挑战失败
	public final static short ERR_ISADMIN = 8003; //该用户不是超级管理员
	
	//推送消息定义
	public final static int MSG_PUSH = -1;                     // 推送消息类型
	public final static short MSG_DEVGROUP_ADD = 0x5001;       //设备分组增加设备
	public final static short MSG_DEVGROUP_DEL = 0x5002;       //设备分组移除设备
	public final static short MSG_DELMEET = 0x5003;            //删除会议
	public final static short MSG_USERGROUP_ADDDEV = 0x5004;   //用户组增加设备
	public final static short MSG_USERGROUP_DELDEV = 0x5005;   //用户组移除设备
	public final static short MSG_USERGROUP_RESCHANGE = 0x5006;//用户组设备资源改变
	public final static int MSG_USER_VERIFICODE_SUCCESS = 1; 			//用户验证码获取成功
	public final static int MSG_USER_VERIFICODE_ERROR = 0; 	//验证码获取失败
	
	public final static short PAMIR_CHALLENGE = 0x0014;       //挑战
	public final static short PAMIR_ATTESTATION = 0x0015;       //认证
}
