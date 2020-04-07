package com.visionvera.constrant;

public class LogTypeConstrant {

	private LogTypeConstrant(){
	}
	
	/** 会管用户的日志类型===start */
	public static final int OPERATE_OK = 1;//操作成功
	public static final int OPERATE_ERROR = 0;//操作失败

	public static final int LOGIN = 1;//登录
	public static final int LOGOUT = 2;//退出
	public static final int ADD_FUNCTION = 3;//新增功能
	public static final int EDIT_FUNCTION = 4;//修改功能
	public static final int DEL_FUNCTION = 1;//删除功能
	public static final int ADD_USER = 6;//新增用户
	public static final int EDIT_USER = 7;//修改用户
	public static final int DEL_USER = 8;//删除用户
	public static final int ADD_ROLE = 9;//新增角色
	public static final int EDIT_ROLE = 10;//修改角色
	public static final int DEL_ROLE = 11;//删除角色
	public static final int ADD_SCHEDULE = 12;//新增预约
	public static final int EDIT_SCHEDULE = 13;//修改预约
	public static final int DEL_SCHEDULE = 14;//删除预约
	public static final int AUDIT_SCHEDULE = 15;//审批预约
	public static final int ADD_DEVICE = 16;//新增设备
	public static final int EDIT_DEVICE = 17;//修改设备
	public static final int DEL_DEVICE = 18;//删除设备
	public static final int ADD_DEVICES = 19;//批量新增设备
	public static final int ADD_USER_GROUP = 20;//新增用户组
	public static final int EDIT_USER_GROUP = 21;//修改用户组
	public static final int DEL_USER_GROUP = 22;//删除用户组
	public static final int ADD_DEV_GROUP = 23;//新增设备组
	public static final int EDIT_DEV_GROUP = 24;//修改设备组
	public static final int DEL_DEV_GROUP = 25;//删除设备组
	public static final int START_MEETING = 26;//开启会议
	public static final int STOP_MEETING = 27;//停止会议

	public static final int SYN_DEVICE = 34;//同步设备
	public static final int ADD_AUTH_DEVICE = 35;//授权
	public static final int DEL_AUTH_DEVICE = 36;//取消授权
	public static final int GEN_DEV_GROUPS = 37;//快速生成会场
	public static final int MV_DEVICE = 38;//移动设备
	public static final int LOCK_USER_GROUP = 39;//锁定用户组
	public static final int UNLOCK_USER_GROUP = 40;//解锁用户组
	public static final int EDIT_SYS_CONFIG = 41;//修改系统配置
	
	public static final int SYNC_SYS_REGISTER = 50;//分级系统注册
	public static final int SYNC_SYS_UNREGISTER = 51;//分级系统解注册
	public static final int SYNC_SYS_SYNCDATA = 52;//分级系统同步数据
	public static final int SYNC_SYS_DEL = 53;//分级系统删除服务
	public static final int SYNC_SYS_EDIT = 54;//分级系统编辑服务
	
	public static final int UOGRADE_DOWNLOAD = 55;//下载升级包
	/** 同步会管用户的日志类型 */
	public static final int SYNC_HUIGUAN_USER = 56;
	public static final int DEL_USERBYLOGINNAME = 57;//按用户名删除用户
	
	/** 会管用户的日志类型===end */
	
	
	/** 运维工作站的日志类型===start */
	public static final int YW_LOGIN = 1001;//登录
	public static final int YW_LOGOUT = 1002;//退出
	public static final int YW_ADD_PLATFORM = 1003;//新增平台
	public static final int YW_UPDATE_PLATFORM = 1004;//修改平台
	public static final int YW_DEL_PLATFORM = 1005;//删除平台
	public static final int YW_ADD_USER = 1006;//新增用户
	public static final int YW_UPDATE_USER = 1007;//修改用户
	public static final int YW_DEL_USER = 1008;//删除用户
	public static final int YW_SYNC_USER = 1009;//同步用户
	public static final int YW_ADD_ROLE = 1010;//新增角色
	public static final int YW_UPDATE_ROLE = 1011;//修改角色
	public static final int YW_DEL_ROLE = 1012;//删除角色
	public static final int YW_UPDATE_MEETING_THRESHOLD = 1013;//会议报警阈值修改 
	public static final int YW_UPDATE_APR = 1014;//审批配置修改
	public static final int YW_UPDATE_REGIONBANDWIDTH = 1015;//国干流量修改  
	public static final int YW_UPDATE_SERVERCONFIG = 1016;//服务配置修改  
	public static final int YW_UPDATE_BUSINESSRULE = 1017;//业务掐断修改  
	public static final int YW_ADD_SCHEDULE = 1018;//新建预约  
	public static final int YW_AGREE_MEETINGPR = 1019;//会议审批同意
	public static final int YW_REJECT_MEETINGPR = 1020;//会议审批驳回
	public static final int YW_DEL_SCHEDULE = 1021;//删除预约  
	public static final int YW_ADD_SERVER = 1022;//新建应用服务器 
	public static final int YW_UPDATE_SERVER = 1023;//修改应用服务器 
	public static final int YW_DEL_SERVER = 1024;//删除应用服务器  
	public static final int YW_ADDBATCH_SERVER = 1025;//批量导入应用服务器  
	public static final int YW_EXPORTBATCH_SERVER = 1026;//批量导出应用服务器
	public static final int YW_DISPLAYBATCH_PROBE = 1027;//批量部署监测探针 
	public static final int YW_UPGRADEBATCH_PROBE = 1028;//批量升级监测探针  
	public static final int YW_DISPLAY_PROBE = 1029;//部署探针  
	public static final int YW_UPGRADE_PROBE = 1030;//升级探针  
	public static final int YW_CLOSE_PROBE = 1031;//关闭探针  
	public static final int YW_OPEN_PROBE = 1032;//开启探针
	public static final int YW_UPDATE_PROBE_THRESHOLD = 1033;//探针告警阈值修改  
	public static final int YW_UPTATE_PROCESS = 1034;//进程修改
	public static final int YW_RESTART_PROCESS = 1035;//重启进程  
	public static final int YW_DEL_PROCESS = 1036;//删除进程  
	public static final int YW_ADD_GROUPBOOK = 1037;//添加群   
	public static final int YW_UPDATE_GROUPBOOK = 1038;//修改群   
	public static final int YW_DEL_GROUPBOOK = 1039;//删除群
	public static final int YW_DELBATCH_GROUPBOOK = 1040;//批量删除群组 
	public static final int YW_ADD_PORT = 1041;//添加端口
	public static final int YW_UPDATE_PORT = 1042;//修改端口 
	public static final int YW_DEL_PORT = 1043;//删除端口 
	public static final int YW_DEL_PROBE = 1044;//移除探针 
	
	/** 运维工作站的日志类型===end */
	
}
