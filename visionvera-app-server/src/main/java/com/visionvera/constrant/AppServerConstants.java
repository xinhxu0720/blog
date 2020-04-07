package com.visionvera.constrant;

/**
 * @ClassName AppServerConstants
 * @Description TODO
 * @Author 徐鑫辉
 * @Date 2019年10月30日 15:05
 **/
public class AppServerConstants {

    private AppServerConstants(){

    }

    /** 提供给PamirMobile申请加入虚拟会议室默认最大次数*/
    public static final Integer APPLY_MEETING_COUNT = 3;

    /** 提供给PamirMobile申请退出虚拟会议室默认最大次数*/
    public static final Integer QUIT_MEETING_COUNT = 3;

    /** Redis的网管用户审批令牌前缀: netWork_Check_userId */
    public static final String NETWORK_CHECK_USERID = "netWork_check_userId";

    /** 视联汇APP的平台ID */
    public static final String SLH_APP_PLATFORM_ID = "55639d09f8994b49973a7d095e8f09be";

    /** 网管审批权限缓存默认过期时间 三天*/
    public static final Integer NETWORK_CHECK_TIME = 259200;

    /** 录播服务器主键ID */
    public static final int LB_SERVER_ID = 33;

    /** 网管服务主键ID */
    public static final int NET_WORK_ID = 34;

    /** 掌上通务器主键ID */
    public static final int PSERVER_SERVER_ID = 35;

    /** 设备管理务器主键ID */
    public static final int SBGL_SERVER_ID = 36;

    /** 智慧大脑务器主键ID */
    public static final int ZHDN_SERVER_ID = 37;

    /** 智慧大脑脑图务器主键ID */
    public static final int ZHDNNT_SERVER_ID = 38;
}
