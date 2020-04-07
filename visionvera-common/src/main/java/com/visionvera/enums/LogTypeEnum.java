package com.visionvera.enums;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 操作日志枚举
 */
public enum LogTypeEnum {
	
	/**
	 * 注释内容为探针websocket上报
	 */
	
	//YW_LOGIN("", "1001","登录"),
	//YW_LOGOUT("", "1002","登出"),
	YW_ADD_PLATFORM("addPlatformResource", "1003","添加平台"),
	YW_UPDATE_PLATFORM("updatePlatformResource", "1004","修改平台"),
	YW_DEL_PLATFORM("deletePlatformResource", "1005","删除平台"),
	YW_ADD_USER("userAdd", "1006","添加用户"),
	YW_UPDATE_USER("userEdit", "1007","修改用户"),
	YW_DEL_USER("userDel", "1008","删除用户"),
	YW_SYNC_USER("syncUserForAppMixed", "1009","同步用户"),
	YW_ADD_ROLE("addRole", "1010","添加角色"),
	YW_UPDATE_ROLE("updateRole", "1011","修改角色"),
	YW_DEL_ROLE("deleteRole", "1012","删除角色"),
	YW_UPDATE_MEETING_THRESHOLD("editAlarmThreshold", "1013","会议报警阈值修改 "),
	YW_UPDATE_APR("updateApr", "1014","审批配置修改"),
	YW_UPDATE_REGIONBANDWIDTH("editRegionBandwidth", "1015","国干流量修改  "),
	YW_UPDATE_SERVERCONFIG("configAdd", "1016","服务配置修改  "),
	YW_UPDATE_BUSINESSRULE("updateBusinessRule", "1017","业务掐断修改"),
	YW_ADD_SCHEDULE("createSchedule", "1018","新建预约  "),
	YW_AGREE_MEETINGPR("complete", "1019","会议审批通过 "),
	YW_REJECT_MEETINGPR("reject", "1020","会议审批驳回 "),
	YW_DEL_SCHEDULE("delSchedule", "1021","删除预约"),
	YW_ADD_SERVER("insertServer", "1022","新建应用服务器 "),
	YW_UPDATE_SERVER("updateServer", "1023","修改应用服务器 "),
	//YW_DEL_SERVER("", "1024","删除应用服务器 "),
	YW_ADDBATCH_SERVER("addServerBasicsBatch", "1025","批量导入应用服务器 "),
	YW_EXPORTBATCH_SERVER("exportServerBasics", "1026","批量导出应用服务器"),
	//YW_DISPLAYBATCH_PROBE("", "1027","批量部署监测探针"),
	//YW_UPGRADEBATCH_PROBE("", "1028","批量升级监测探针"),
	//YW_DISPLAY_PROBE("", "1029","部署探针"),
	//YW_UPGRADE_PROBE("", "1030","升级探针"),
	//YW_CLOSE_PROBE("", "1031","关闭探针"),
	//YW_OPEN_PROBE("", "1032","开启探针"),
	YW_UPDATE_PROBE_THRESHOLD("updateServerThreshold", "1033","探针告警阈值修改"),
	//YW_UPTATE_PROCESS("", "1034","修改进程"),
	//YW_RESTART_PROCESS("", "1035","重启进程"),
	//YW_DEL_PROCESS("", "1036","删除进程"),
	YW_ADD_GROUPBOOK("addDevGroupBooks", "1037","添加群组"),
	YW_UPDATE_GROUPBOOK("updateDevGroupBooks", "1038","修改群组"),
	YW_DEL_GROUPBOOK("deleteDeviceGroup", "1039","删除群组"),
	//YW_ADD_PORT("", "1041","添加端口"),
	//YW_UPDATE_PORT("saveOrUpdatePortInfo", "1042","修改端口"),
	YW_DEL_PORT("delPortInfo", "1043","删除端口");
	//YW_DEL_PROBE("", "1044","删除探针"),
	
	

    //方法名称  必须唯一： 节点KEY
    private String methodName; 
    //操作类型
    private String operateType;
    //描述
    private String description; 
   
    private static final List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
	static {
		for (LogTypeEnum s : EnumSet.allOf(LogTypeEnum.class)) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("methodName", s.getMethodName());
			map.put("operateType", s.getOperateType());
			map.put("description", s.getDescription());
			list.add(map);
		}
	}
	// 构造方法  
    private LogTypeEnum(String methodName,String operateType, String description) {  
        this.methodName = methodName;  
        this.operateType = operateType; 
        this.description = description; 
    } 
	
    // 根据key获得
    public static String getOperateType(String key) {  
        for (LogTypeEnum c : LogTypeEnum.values()) {  
            if (c.getMethodName().equals(key)) {  
                return c.operateType;  
            }  
        }  
        return null;  
    }
 

    // 根据type获得methodName
    public static String getName(String operateType) {  
        for (LogTypeEnum c : LogTypeEnum.values()) {  
            if (c.getMethodName().equals(operateType)) {  
                return c.methodName;  
            }  
        }  
        return null;  
    }
    // 根据key获得Description
    public static String getDescription(String key) {  
    	for (LogTypeEnum c : LogTypeEnum.values()) {  
    		if (c.getMethodName().equals(key)) {  
    			return c.description;  
    		}  
    	}  
    	return null;  
    }
   
    public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public String getOperateType() {
		return operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public static List<Map<String, Object>> getList() {
		return list;
	}
	
}

