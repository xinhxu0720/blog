package com.visionvera.constrant;

public class GlobalConstants {
	
	private GlobalConstants(){
	}
	
	public static final int CREATE_TYPE_PAMIRE = 1;//pamir创建的预约
	public static final int CREATE_TYPE_HYT = 2;//会易通创建的预约
	public static final int CREATE_TYPE_GIS = 3;//GIS创建的预约
	public static final int CREATE_TYPE_WS = 4;//通过webservice接口创建的预约

	public static final int MODIFY_STATUS_YES = 1;//预约是否有变更：有
	public static final int MODIFY_STATUS_NO = 0;//预约是否有变更：无

	public static final String ADMIN_LOGIN_NAME = "admin";//默认会场名称
	public static final String DEFAULT_GROUP_NAME = "默认会场";//默认会场名称
	public static final String COMPONENT_CMSWEB = "cmsweb";//会管服务名称
	public static final String FILE_DIR_ROOT = "/cmsweb_file_manager";//会管文件存放根路径
	public static final String FILE_DIR_ATTACHMENT = "/cmsweb_file_manager/attachment";//会管附件存放路径
	public static final String FILE_NAME_REG = "^[A-Z]{1,}_V[0-9]{1,}(.([0-9]{1,})){2,3}.[a-zA-Z]{1,}$";//pamir升级包文件命名规范
	public static final Integer COMPLETE_START = 0;//发起
	public static final Integer COMPLETE_AGREE = 2;//审批中
	public static final Integer COMPLETE_REJECT = 1;//被拒绝
	public static final Integer COMPLETE_WAIT = 3;//待审批
	public static final Integer COMPLETE_END = 4;//已完成
	public static final Integer COMPLETE_SUMMARY = 5;//待总结
	
	public static final Integer CHOOSE_NEXT_YES = 2;//需要选择下一节点审批人
	public static final Integer CHOOSE_NEXT_NO = 1;//不需要选择下一节点审批人
	public static final Integer EDIT_FORM_NO = 0;//是否有表单的编辑权限。0只能查看，1可以编辑申请表的“网络部填写”部分，2可以编辑总结表
	public static final Integer EDIT_FORM_APPLY = 1;//可以编辑申请表的“网络部填写”部分
	public static final Integer EDIT_FORM_SUMMARY = 2;//可以编辑总结表

	public static final Integer FOREIGN_KEY_CHECKS_ON = 1;//数据库外键约束启用
	public static final Integer FOREIGN_KEY_CHECKS_OFF = 0;//数据库外键约束禁用
	
	
	
	public static final Integer SERVER_ONLINE_STATE = 1; //服务器在线状态
	public static final Integer SERVER_OFFLINE_STATE = 2;	//服务器离线状态
	
	/** 智能运维统一平台的平台ID */
	public static final String INTELLIGENT_OPERATION_PLATFORM_ID = "69ee8f98103e4637bd563b71b8eaa35e";
	
	/** 会管的超级管理员概念上的权限ID */
	public static final String INTELLIGENT_OPERATION_ADMIN_PERMISSION_ID = "92395402e67d11e8b1baac1f6b6c76c6";
	
	/** 会管的普通用户概念上的权限ID */
	public static final String INTELLIGENT_OPERATION_ORDINARY_PERMISSION_ID = "6ca93bd4e67d11e8b1baac1f6b6c76c6";
	
	public static final String CMS_ADMIN_ROLE_ID = "40288a1155ed98550155ed9d01d50006";//会管超级管理员角色ID
	
	/** 会管的超级管理员角色，对应运维工作站的所有功能 */
	public static final String INTELLIGENT_OPERATION_ADMIN_ROLE_ID = "38549368797b46d7ad9e7066d36c25f7";
	
	/** 兼容会管：对应会管普通用户的角色ID */
	public static final String INTELLIGENT_OPERATION_ORDINARY_ROLE_ID = "29245595cd2411e89b73ac1f6b6c76c6";
	
	/** 视联汇V观大数据权限的角色ID */
	public static final String INTELLIGENT_OPERATION_ME_APP_V_BIG_ROLE_ID = "cc33acf8d5ee46f88628fec9f6a012b8";
	
	/** 视联汇会控权限的角色ID */
	public static final String INTELLIGENT_OPERATION_ME_APP_CONFERENCE_CONTROL_ROLE_ID = "1abb84939b5246f098b195bc7d033db4";
	
	/** 视联汇遥控器权限的角色ID */
	public static final String INTELLIGENT_OPERATION_ME_APP_REMOTE_CONTROL_ROLE_ID = "c1afd04027d54da9a2e03b87751d8524";
	
	/** 视联汇点播回放权限的角色ID */
	public static final String INTELLIGENT_OPERATION_ME_APP_REPLAY_ROLE_ID = "c35c1e53024d4541baff40f87b00943b";
	
	/** 视联汇分布图权限的角色ID */
	public static final String INTELLIGENT_OPERATION_ME_APP_DIAGRAM_ROLE_ID = "d40b38e49fc6424eb318147eb0a49939";
	
	/** 视联汇唐古拉监控权限的角色ID */
	public static final String INTELLIGENT_OPERATION_ME_APP_TGL_MONITOR_ROLE_ID = "0eff7e39ef0c476d90b426204f909bf1";
	
	/** 视联汇运维工具权限的角色ID */
	public static final String INTELLIGENT_OPERATION_ME_APP_OPERATION_TOOLS_ROLE_ID = "496786d913244771bee72b72f0b8ece0";
	
	/** 视联汇会议信息权限的角色ID */
	public static final String INTELLIGENT_OPERATION_ME_APP_CONFERENCE_INFO_ROLE_ID = "b9389a59dd0c4de5aacd3e831f666e24";
	
	/** 视联汇智能音箱权限的角色ID */
	public static final String INTELLIGENT_OPERATION_ME_APP_SOUND_BOX_ROLE_ID = "4996b39cf38e493db3599f283ad911fb";
	
	/** 视联管家VIP权限的角色ID */
//	public static final String PAMIR_MOBILE_VIP_ROLE_ID = "2deb57adcd3511e89b73ac1f6b6c76c6";
	
	/** 视联管家普通用户权限的角色ID */
	public static final String PAMIR_MOBILE_COMMON_ROLE_ID = "efe333f3a64f447bae0586fa32537dbc";
	
	/** 视联汇VIP权限的角色ID */
	public static final String ME_APP_VIP_ROLE_ID = "1dd4e89abd244f43b0083470e0bd5f4c";
	
	/** 流媒体专用的角色，对应的权限是智能运维的感知中心的点位分布权限 */
	public static final String MEDIA_SERVER_RESERVED_ROLE_ID = "163de2808a55405ea2f96743ec67444a";
	
	/** 流媒体登录权限ID */
	public static final String MEDIA_SERVER_LOGIN_PERMISSION_ID = "2db16ce71eb447a4b94832571a3effb6";
	
	/** 对应会管平台的登录权限的权限ID */
	public static final String CMS_LOGIN_PERMISSION_ID = "1ff4fc2879584cfaa621db2c4e056532";
	
	/** 导出哪个平台的系统类型。1表示与会管平台用户同步的标志。前端将这个值传递给后端，后端根据这个值生成与会管同步用户失败的Excel */
	public static final String EXPORT_TYPE_HUIGUAN_SYSTEM = "1";
	
	/** 导出哪个平台的系统类型。2表示与流媒体平台用户同步的标志。前端将这个值传递给后端，后端根据这个值生成与流媒体同步用户失败的Excel */
	public static final String EXPORT_TYPE_LIUMEITI_SYSTEM = "2";

	/** 导出哪个平台的系统类型。3表示与网管平台用户同步的标志。前端将这个值传递给后端，后端根据这个值生成与网管同步用户失败的Excel */
	public static final String EXPORT_TYPE_NET_MANAGER_SYSTEM = "3";

	/** 导出哪个平台的系统类型。4表示与一机一档平台用户同步的标志。前端将这个值传递给后端，后端根据这个值生成与一机一档同步用户失败的Excel */
	public static final String EXPORT_TYPE_VSDC_SYSTEM = "4";

	/** 导出哪个平台的系统类型。5表示与会易通平台用户同步的标志。前端将这个值传递给后端，后端根据这个值生成与会易通同步用户失败的Excel */
	public static final String EXPORT_TYPE_HUIYITONG_SYSTEM = "5";
	
	/** 导出哪个平台的系统类型Key */
	public static final String EXPORT_TYPE_KEY = "exportSystemType";
	
	/** 同步用户时，被同步平台失败用户，会管平台失败用户的Redis键:huiguan_other */
	public static final String SYNC_USER_HUIGUAN_OTHER = "huiguan_other";
	
	/** 同步用户时，双方平台同步失败用户，会管平台与本地平台失败用户的Redis键:huiguan_local */
	public static final String SYNC_USER_HUIGUAN_LOCAL = "huiguan_local";
	
	/** 同步用户时，被同步平台失败用户，流媒体平台失败用户的Redis键:liumeiti_other */
	public static final String SYNC_USER_LIUMEITI_OTHER = "liumeiti_other";
	
	/** 同步用户时，双方平台同步失败用户，流媒体平台与本地平台失败用户的Redis键:liumeiti_local */
	public static final String SYNC_USER_LIUMEITI_LOCAL = "liumeiti_local";

	/** 同步用户时，被同步平台失败用户，网管平台失败用户的Redis键:net_manager_other */
	public static final String SYNC_USER_NET_MANAGER_OTHER = "net_manager_other";

	/** 同步用户时，双方平台同步失败用户，网管平台与本地平台失败用户的Redis键:net_manager_local */
	public static final String SYNC_USER_NET_MANAGER_LOCAL = "net_manager_local";

	/** 同步用户时，被同步平台失败用户，一机一档平台失败用户的Redis键:vsdc_other */
	public static final String SYNC_USER_VSDC_OTHER = "vsdc_other";

	/** 同步用户时，双方平台同步失败用户，一机一档平台与本地平台失败用户的Redis键:vsdc_local */
	public static final String SYNC_USER_VSDC_LOCAL = "vsdc_local";

	/** 同步用户时，被同步平台失败用户，会易通平台失败用户的Redis键:vsdc_other */
	public static final String SYNC_USER_HUIYITONG_OTHER = "hyt_other";

	/** 同步用户时，双方平台同步失败用户，一机一档平台与本地平台失败用户的Redis键:vsdc_local */
	public static final String SYNC_USER_HUIYITONG_LOCAL = "hyt_local";
	
	//系统配置文件路径
//	public static final String SYS_BATH_PATH = GlobalConstants.class.getClassLoader().getResource("/").getPath();
//	public static final String SYS_CONFIG_FILE_PATH = SYS_BATH_PATH + "properties/sysConfig.properties";
	/** 会议的业务信息的业务类型：1 */
	public static final String MEET_BUSINESS_TYPE_BUSINESS_INFO = "1";
	/** 点播直播的业务信息的业务类型：2 */
	public static final String BROADCAST_BUSINESS_TYPE_BUSINESS_INFO = "2";
	/** 可视电话的业务信息的业务类型：3 */
	public static final String VIDEO_PHONE_BUSINESS_TYPE_BUSINESS_INFO = "3";
	/** 监控的业务信息的业务类型：4 */
	public static final String MONITOR_BUSINESS_TYPE_BUSINESS_INFO = "4";

	/** 从网管同步过来的用户，需要具有视联汇APP的"网管APP模块"的角色。这个ID表示视联汇APP的"网管APP模块"的权限ID */
	public static final String NETWORK_MANAGER_ME_APP_PERMISSION_ID = "cc483a04168e4e38ae6aa3cebe052896";

	/** 从会易通同步过来的用户，需要具有视联汇APP的"会易通模块"的角色。这个ID表示视联汇APP的"会易通模块"的权限ID */
	public static final String HUIYITONG_ME_APP_PERMISSION_ID = "675e596d46824f27a36dc6bb7edcd13e";

	/** 从一机一档同步过来的用户，需要具有视联汇APP的"一机一档模块"的角色。这个ID表示视联汇APP的"一机一档模块"的权限ID */
	public static final String VSDC_ME_APP_PERMISSION_ID = "506c7104d09f478d97a2d14aa5c55158";

	/** 网管同步用户的时候，首先需要登录，该权限表示网管平台的登录权限 */
	public static final String NET_MANAGER_LOGIN_PERMISSION_ID = "6f081115971c4213a753bd3f760c7ed3";

	/** 会易通同步用户的时候，首先需要登录，该权限表示会易通平台的登录权限 */
	public static final String HUIYITONG_LOGIN_PERMISSION_ID = "76a39a2bb144409b8502c39b44cd4172";

	/** 一机一档同步用户的时候，首先需要登录，该权限表示一机一档平台的登录权限 */
	public static final String VSDC_LOGIN_PERMISSION_ID = "c4e540aab9344cebbb8302388e71a104";

	/** 视联汇APP的平台ID */
	public static final String ME_APP_PLATFORM_ID = "55639d09f8994b49973a7d095e8f09be";
	
	/** 兼容会管：对应会管待审核普通用户的角色ID */
	public static final String INTELLIGENT_OPERATION_NOLOGIN_ROLE_ID = "af4d7ff1eb894f4285caf2767c43d0eb";
	
}
