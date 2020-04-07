package com.visionvera.bean.slweoms;

import java.util.Date;

/**
 * 服务器信息
 * @author dql
 *
 */
public class ServerHardwareVO {
	
	private Long id;     //服务器id
	private String serverName;		//服务器名称
	private String serverProvince;	//服务器省级行政区域编码
	private String serverDistrict;	//服务器三级行政区域编码，用逗号分隔	
	private String serverSite;		//服务器地址
	private String serverPlatforms; 	//平台名称
	private String platformsRegisterid; //平台对应的唯一标识
	private String platformProcessState;    //平台进程状态
	private String serverCPUType;	//服务器Cpu类型
	private Integer serverCPUnumber;		//服务器CPU个数
	private String serverCPUSumRate;  //服务器cpu占用率
	private String serverCPUEveryRate;	//服务器每个cpu的占用率
	private Long serverDDRUsable;  //可用内存
	private Long serverDDRUsage;	//已使用内存
	private Long serverDDRGross;	//服务器内存总量
	private String serverDDRRate;	//内存占用率
	private String serverHDDName;	//硬盘名称，多个用逗号分隔
	private String serverHDDVolume;	//每个硬盘的总量，多个用逗号分隔
	private String serverHDDRate;	//每个硬盘的使用率，多个用逗号分隔
	private String serverHDDUsage;	//每个硬盘使用量
	private Long serverHDDUsageLong;	//硬盘的总使用量
	private Long serverHDDGross;	//服务器硬盘总量
	private String serverHDDAllRate;	//硬盘占用率
	private String netWorkMacAddr;	//网卡mac地址
	private String netCardName;		//网卡名称
	private String serverNETIP;		//服务器网卡ip
	private String serverNETUpData;	//网络上行数据
	private String serverNETDownData;	//网络下行数据
	private String serverUnique;	//服务器唯一标识key
	private Integer serverOnLine;	//服务器在线状态  1在线，2离线
	
	private Date createTime;		//创建时间
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	
	public String getServerProvince() {
		return serverProvince;
	}
	public void setServerProvince(String serverProvince) {
		this.serverProvince = serverProvince;
	}
	
	public String getServerDistrict() {
		return serverDistrict;
	}
	public void setServerDistrict(String serverDistrict) {
		this.serverDistrict = serverDistrict;
	}
	
	public String getServerSite() {
		return serverSite;
	}
	public void setServerSite(String serverSite) {
		this.serverSite = serverSite;
	}
	
	public String getServerPlatforms() {
		return serverPlatforms;
	}
	public void setServerPlatforms(String serverPlatforms) {
		this.serverPlatforms = serverPlatforms;
	}
	
	public String getPlatformsRegisterid() {
		return platformsRegisterid;
	}
	public void setPlatformsRegisterid(String platformsRegisterid) {
		this.platformsRegisterid = platformsRegisterid;
	}
	
	public String getPlatformProcessState() {
		return platformProcessState;
	}
	public void setPlatformProcessState(String platformProcessState) {
		this.platformProcessState = platformProcessState;
	}
	public String getServerCPUType() {
		return serverCPUType;
	}
	public void setServerCPUType(String serverCPUType) {
		this.serverCPUType = serverCPUType;
	}
	
	public Integer getServerCPUnumber() {
		return serverCPUnumber;
	}
	public void setServerCPUnumber(Integer serverCPUnumber) {
		this.serverCPUnumber = serverCPUnumber;
	}
	
	public String getServerCPUSumRate() {
		return serverCPUSumRate;
	}
	public void setServerCPUSumRate(String serverCPUSumRate) {
		this.serverCPUSumRate = serverCPUSumRate;
	}
	
	public String getServerCPUEveryRate() {
		return serverCPUEveryRate;
	}
	public void setServerCPUEveryRate(String serverCPUEveryRate) {
		this.serverCPUEveryRate = serverCPUEveryRate;
	}
	
	public Long getServerDDRUsable() {
		return serverDDRUsable;
	}
	public void setServerDDRUsable(Long serverDDRUsable) {
		this.serverDDRUsable = serverDDRUsable;
	}
	
	public Long getServerDDRUsage() {
		return serverDDRUsage;
	}
	public void setServerDDRUsage(Long serverDDRUsage) {
		this.serverDDRUsage = serverDDRUsage;
	}
	
	public Long getServerDDRGross() {
		return serverDDRGross;
	}
	public void setServerDDRGross(Long serverDDRGross) {
		this.serverDDRGross = serverDDRGross;
	}
	
	public String getServerDDRRate() {
		return serverDDRRate;
	}
	public void setServerDDRRate(String serverDDRRate) {
		this.serverDDRRate = serverDDRRate;
	}
	
	public String getServerHDDName() {
		return serverHDDName;
	}
	public void setServerHDDName(String serverHDDName) {
		this.serverHDDName = serverHDDName;
	}
	
	public String getServerHDDVolume() {
		return serverHDDVolume;
	}
	public void setServerHDDVolume(String serverHDDVolume) {
		this.serverHDDVolume = serverHDDVolume;
	}
	
	public String getServerHDDRate() {
		return serverHDDRate;
	}
	public void setServerHDDRate(String serverHDDRate) {
		this.serverHDDRate = serverHDDRate;
	}
	
	public String getServerHDDUsage() {
		return serverHDDUsage;
	}
	public void setServerHDDUsage(String serverHDDUsage) {
		this.serverHDDUsage = serverHDDUsage;
	}
	
	public Long getServerHDDUsageLong() {
		return serverHDDUsageLong;
	}
	public void setServerHDDUsageLong(Long serverHDDUsageLong) {
		this.serverHDDUsageLong = serverHDDUsageLong;
	}
	
	public Long getServerHDDGross() {
		return serverHDDGross;
	}
	public void setServerHDDGross(Long serverHDDGross) {
		this.serverHDDGross = serverHDDGross;
	}
	
	public String getServerHDDAllRate() {
		return serverHDDAllRate;
	}
	public void setServerHDDAllRate(String serverHDDAllRate) {
		this.serverHDDAllRate = serverHDDAllRate;
	}
	
	public String getNetWorkMacAddr() {
		return netWorkMacAddr;
	}
	public void setNetWorkMacAddr(String netWorkMacAddr) {
		this.netWorkMacAddr = netWorkMacAddr;
	}
	
	public String getNetCardName() {
		return netCardName;
	}
	public void setNetCardName(String netCardName) {
		this.netCardName = netCardName;
	}
	
	public String getServerNETIP() {
		return serverNETIP;
	}
	public void setServerNETIP(String serverNETIP) {
		this.serverNETIP = serverNETIP;
	}
	
	public String getServerNETUpData() {
		return serverNETUpData;
	}
	public void setServerNETUpData(String serverNETUpData) {
		this.serverNETUpData = serverNETUpData;
	}
	
	public String getServerNETDownData() {
		return serverNETDownData;
	}
	public void setServerNETDownData(String serverNETDownData) {
		this.serverNETDownData = serverNETDownData;
	}
	
	public String getServerUnique() {
		return serverUnique;
	}
	public void setServerUnique(String serverUnique) {
		this.serverUnique = serverUnique;
	}
	
	public Integer getServerOnLine() {
		return serverOnLine;
	}
	public void setServerOnLine(Integer serverOnLine) {
		this.serverOnLine = serverOnLine;
	}
	
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
