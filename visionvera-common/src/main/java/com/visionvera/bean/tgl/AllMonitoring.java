package com.visionvera.bean.tgl;
/**
 * 唐古拉监控数据统计表
 * @author zhangkai
 *
 */
public class AllMonitoring {

	 private String Name ;           //   区域名称 
	 private Integer Level;              //   区域级别
	 private String AreaCode;       // 	   区域编码
     private Integer  Count;        // 	   监控总数
     private Integer   OnlineCount;  	// 	   监控在线数
     private Integer  GroupCount;    	// 	   协转总数
     private Integer  GroupOnlineCount; //   协转在线数
     private Integer FaultCount;        //   故障总数
     private Integer  FaultOnlineCount; //   故障解决数
     public Integer getLevel() {
 		return Level;
 	}
 	public void setLevel(Integer level) {
 		this.Level = level;
 	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAreaCode() {
		return AreaCode;
	}
	public void setAreaCode(String areaCode) {
		AreaCode = areaCode;
	}
	
	
	public Integer getCount() {
		return Count;
	}
	public void setCount(Integer count) {
		Count = count;
	}
	public Integer getOnlineCount() {
		return OnlineCount;
	}
	public void setOnlineCount(Integer onlineCount) {
		OnlineCount = onlineCount;
	}
	public Integer getGroupCount() {
		return GroupCount;
	}
	public void setGroupCount(Integer groupCount) {
		GroupCount = groupCount;
	}
	public Integer getGroupOnlineCount() {
		return GroupOnlineCount;
	}
	public void setGroupOnlineCount(Integer groupOnlineCount) {
		GroupOnlineCount = groupOnlineCount;
	}
	public Integer getFaultCount() {
		return FaultCount;
	}
	public void setFaultCount(Integer faultCount) {
		FaultCount = faultCount;
	}
	public Integer getFaultOnlineCount() {
		return FaultOnlineCount;
	}
	public void setFaultOnlineCount(Integer faultOnlineCount) {
		FaultOnlineCount = faultOnlineCount;
	}
     
}
