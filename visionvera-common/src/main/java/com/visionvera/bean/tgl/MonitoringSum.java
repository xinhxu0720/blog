package com.visionvera.bean.tgl;

/**
 * 获取唐古拉监控数据信息总数统计      max min 
 * @author zhangkai
 *
 */
public class MonitoringSum {
	private String Name ;          //   区域名称 
    private String AreaCode;       // 	   区域编码
    private int   Count;           // 	   监控总数
    private int   OnlineCount;     // 	   监控在线数
    private int  GroupCount;       // 	   协转总数
    private int  GroupOnlineCount; //   协转在线数
    private int FaultCount;        //   故障总数
    private int  FaultOnlineCount; //   故障解决数
    private int maxCount;          //最大监控总数
    private int minCount;          //最小监控总数
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public MonitoringSum() {
		super();
	
	}
	public MonitoringSum( int count,
			int onlineCount, int groupCount, int groupOnlineCount,
			int faultCount, int faultOnlineCount, int maxCount, int minCount) {
		this.Count = count;
		this.OnlineCount = onlineCount;
		this.GroupCount = groupCount;
		this.GroupOnlineCount = groupOnlineCount;
		this.FaultCount = faultCount;
		this.FaultOnlineCount = faultOnlineCount;
		this.maxCount = maxCount;
		this.minCount = minCount;
	}
	@Override
	public String toString() {
		return "MonitoringSum [Name=" + Name + ", AreaCode=" + AreaCode
				+ ", Count=" + Count + ", OnlineCount=" + OnlineCount
				+ ", GroupCount=" + GroupCount + ", GroupOnlineCount="
				+ GroupOnlineCount + ", FaultCount=" + FaultCount
				+ ", FaultOnlineCount=" + FaultOnlineCount + ", maxCount="
				+ maxCount + ", minCount=" + minCount + "]";
	}
	public String getAreaCode() {
		return AreaCode;
	}
	public void setAreaCode(String areaCode) {
		AreaCode = areaCode;
	}
	public int getCount() {
		return Count;
	}
	public void setCount(int count) {
		Count = count;
	}
	public int getOnlineCount() {
		return OnlineCount;
	}
	public void setOnlineCount(int onlineCount) {
		OnlineCount = onlineCount;
	}
	public int getGroupCount() {
		return GroupCount;
	}
	public void setGroupCount(int groupCount) {
		GroupCount = groupCount;
	}
	public int getGroupOnlineCount() {
		return GroupOnlineCount;
	}
	public void setGroupOnlineCount(int groupOnlineCount) {
		GroupOnlineCount = groupOnlineCount;
	}
	public int getFaultCount() {
		return FaultCount;
	}
	public void setFaultCount(int faultCount) {
		FaultCount = faultCount;
	}
	public int getFaultOnlineCount() {
		return FaultOnlineCount;
	}
	public void setFaultOnlineCount(int faultOnlineCount) {
		FaultOnlineCount = faultOnlineCount;
	}
	public int getMaxCount() {
		return maxCount;
	}
	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}
	public int getMinCount() {
		return minCount;
	}
	public void setMinCount(int minCount) {
		this.minCount = minCount;
	}
    
    
}
