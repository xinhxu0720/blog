package com.visionvera.constrant;


public class CommonConstrant {
	/** 静态资源服务名: VISIONVERA-RESOURCE */
	public static final String RESOURCE_SERVICE_NAME = "VISIONVERA-RESOURCE";
	
	/** 认证中心Eureka服务名:  VISIONVERA-AUTHENTICATION*/
	public static final String AUTHENTICATION_SERVICE_NAME = "VISIONVERA-AUTHENTICATION";
	
	/** 调度中心服务名: VISIONVERA-DISPATCHMENT */
	public static final String DISPATCHMENT_SERVICE_NAME = "VISIONVERA-DISPATCHMENT";
	/** 设备管理服务名: VISIONVERA-DISPATCHMENT */
	public static final String VISIONVERA_DEVICE_MANAGE = "VISIONVERA-DEVICE-MANAGE";
	
	/** 运维中心服务名: VISIONVERA-OPERATION */
	public static final String OPERATION_SERVICE_NAME = "VISIONVERA-OPERATION";
	
	/** 告警中心服务名: VISIONVERA-ALARM */
	public static final String ALARM_SERVICE_NAME = "VISIONVERA-ALARM";
	
	/** 数据收集,智能分析服务名: VISIONVERA-ANALYSIS */
	public static final String ANALYSIS_SERVICE_NAME = "VISIONVERA-ANALYSIS";
	
	/** 移动端接口服务名：VISIONVERA-APP-SERVER */
	public static final String APP_SERVICE_NAME = "VISIONVERA-APP-SERVER";
	
	public static final String PERCEPTION_SERVICE_NAME = "VISIONVERA-PERCEPTION";
	
	/** Redis的登录访问令牌access_token前缀: auth_web_token */
	public static final String PREFIX_TOKEN = "auth_web_token";
	
	/** Redis的登录用户名及其对应的信息前缀： auth_web_login_name */
	public static final String PREFIX_LOGIN_NAME = "auth_web_login_name";
	/** Redis的用户uuid及其对应的信息前缀： auth_web_user_uuid */
	public static final String PREFIX_USER_UUID = "auth_web_user_uuid";
	
	/** Redis验证码前缀： auth_web_verifi_code*/
	public static final String PREFIX_VERIFICATION_CODE = "auth_web_verifi_code";
	
	/** Redis存放验证码的失效时间,单位为分钟： 1 */
	public static final int VERIFICATION_CODE_TIMEOUT_MINUTES = 1;
	
	/** Redis保存Session信息的默认失效时间: 默认半小时=1800 3天=259200*/
	public static final int REDIS_SESSION_TIMEOUT_DEFAULT = 1800;
	
	/** Redis的登陆存储平台ID前缀: auth_web_platform_id */
	public static final String PREFIX_PLATFORM_ID = "auth_web_platform_id";
	
	/** RabbitMQ日志交换器名: logExchange */
	public static final String RABBITMQ_LOG_EXCHANGE_NAME = "logExchange";
	
	/** RabbitMQ日志队列名: logQueue */
	public static final String RABBITMQ_LOG_QUEUE_NAME = "logQueue";
	
	/** RabbitMQ智能运维队列：intelligentOperationQueue */
	public static final String RABBITMQ_INTELLIGENT_OPERATION_QUEUE_NAME = "intelligentOperationQueue";
	
	/** RabbitMQ会管预约信息队列：huiguanToMicroQueue */
	public static final String RABBITMQ_HUIGUAN_2_MICRO_QUEUE_NAME = "huiguanToMicroQueue";
	
	/** RabbitMQ智能运维队列和Business队列的路由名：intelligentOperationBindingKey */
	public static final String RABBIT_INTELLIGENT_OPERATION_QUEUE_BINDING_NAME = "intelligentOperationBindingKey";
	
	/** RabbitMQ业务交换器名: businessExchange */
	public static final String RABBITMQ_BUSINESS_EXCHANGE_NAME = "businessExchange";
	
	/** RabbitMQ会管对列名: huiguanQueue */
	public static final String RABBIT_HUIGUAN_QUEUE_NAME = "huiguanQueue";
	
	/** RabbitMQ用户交换器与会管队列的路由名: huiguanBindingKey */
	public static final String RABBIT_USER_EXCHANGE_HUIGUAN_QUEUE_BINDING_NAME = "huiguanBindingKey";
	
	/** RabbitMQ消息: 用户添加操作的类型: 1 */
	public static final int RABBIT_USER_ADD_OPERATION_TYPE = 1;
	
	/** RabbitMQ消息: 用户修改操作的类型: 2 */
	public static final int RABBIT_USER_EDIT_OPERATION_TYPE = 2;
	
	/** RabbitMQ消息: 用户删除操作的类型: 3 */
	public static final int RABBIT_USER_DEL_OPERATION_TYPE = 3;
	
	/** 同步用户时，将失败的结果存放Redis的前缀 */
	public static final String PREFIX_SYNC_USER = "sync_user_key";
	
	/** 平台、角色、用户，默认的类型: 1 */
	public static final String DEFAULT_IS_DEFAULT_TYPE = "1";
	
	/** 平台、角色、用户，非默认的类型: 0 */
	public static final String NON_DEFAULT_IS_DEFAULT_TYPE = "0";
	
	/** 平台、角色、用户，前端允许删除: 0 */
	public static final String DELETE_IS_DELETE_TYPE = "0";
	
	/** 平台、角色、用户，前端不允许删除: 1 */
	public static final String NON_DELETE_IS_DELETE_TYPE = "1";
	
	/** 已完成的流程历史数据缓存的前缀 */
	public static final String REDIS_CACHE_TASK_DONE_LIST = "task_done_list";
	
	/** 全国的行政区域ID */
	public static final String WHOLE_COUNTRY_REGION_ID = "000000000000";
	
	/** 北京的行政区域ID */
	public static final String BEIJING_REGION_ID = "110000000000";
	
	/** 上海的行政区域ID */
	public static final String SHANGHAI_REGION_ID = "310000000000";
	
	/** 天津的行政区域ID */
	public static final String TIANJIN_REGION_ID = "120000000000";
	
	/** 重庆的行政区域ID */
	public static final String CHONGQING_REGION_ID = "500000000000";
	
	/** 全国行政区域名称 */
	public static final String WHOLE_COUNTRY_REGION_NAME = "全国";
	
	/** 验证码超时时间的上限值: 30 */
	public static final Integer VERIFICATION_CODE_TIMEOUT_UPPER_LIMIT = 30;

	/** 向其他平台推送用户信息时，其他平台登录的token的前缀 */
	public static final String PUSH_USER_PREFIX_OTHER_PLATFORM = "push_user_other_platform_token";

	/** RabbitMQ网管推送消息队列: netWorkQueue */
	public static final String RABBIT_NETWORK_QUEUE_NAME  = "netWork_check_queue";

	/** RabbitMQ网管推送消息交换机: netWorkExchange */
	public static final String RABBIT_NETWORK_EXCHANGE_NAME = "netWorkExchange";

	/** RabbitMQ网管交换器与队列绑定的Routing Key: netWorkBindingKey */
	public static final String RABBIT_NETWORK_EXCHANGE_QUEUE_ROUTINGKEY_NAME = "netWorkBindingKey";
	
	/** RabbitMQ运维工作站推送告警消息交换机: netWorkExchange */
	public static final String RABBIT_ALARM_EXCHANGE_NAME = "alarmExchange";
	
	/** RabbitMQ运维工作站推送告警交换器与队列绑定的Routing Key: netWorkBindingKey */
	public static final String RABBIT_ALARM_EXCHANGE_QUEUE_ROUTINGKEY_NAME = "alarm_report_key";

}
