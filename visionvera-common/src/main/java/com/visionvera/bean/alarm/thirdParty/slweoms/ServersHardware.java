package com.visionvera.bean.alarm.thirdParty.slweoms;

import java.util.Date;


/**
 *  
 * @ClassName:ServersHardware
 * @Description:服务器硬件信息
 * @author:zhangkai
 * @date:2018年3月26日上午10:03:51
 */
public class ServersHardware {
	/**
	 * 主键ID
	 */
	private Long id;
	
	/**
     * CPU类别
     */
	private String serverCPUType; 
	/**
	 * CPU的个数
	 */
	private int serverCPUnumber;
	/**
	 * CPU总的使用率
	 */
	private String   serverCPUSumRate;
	
	/**
	 * CPU每一个的使用率 以, 隔开
	 */
	private  String   serverCPUEveryRate;
	
	/**
	 * 内存总量
	 */
	private  long  serverDDRGross;
	 /**
	  * 内存使用率
	  */
	private  String  serverDDRRate; 
	
	 /**
	  * 可用内存
	  */
	private long   serverDDRUsable;
	 
	/**
	 * 硬盘总容量 
	 */
	private long  serverHDDGross; 
	
	/**
	 *硬盘每个名称
	 */
	private String  serverHDDName ;
	
	/**
	 * 硬盘每个总大小
	 */
	private String  serverHDDVolume;
	
	/**硬盘每个使用量
	 * 
	 */
	private String   serverHDDUsage;
	
	/**
	 * 硬盘每个使用率
	 */
	private String    serverHDDRate  ;
	
	/**
	 * 硬盘总使用率
	 */
	private String  serverHDDAllRate;
	
	/**
	 * 读出的速度
	 */
	private String   serverHDDReads;  
	
	/**
	 * 写入的速度
	 */
	private String   serverHDDWrites;
	
	/**
	 * 网卡Mac地址，多个用“,”分隔
	 */
	private String netWorkMacAddr;
	
    
	/**
	 * 网络IP 
	 */
	private String   serverNETIP;
	
	/**
	 * 网络上行数据
	 */
	private String   serverNETUpData;
	   
	/**
	 * 网络下行数据 
	 */
	private String   serverNETDownData;

	/**
	 * 服务器唯一标识
	 */
	private String serverUnique ;
	  
	private Integer state; // 状态 0正常 -1以删除
	private Integer version; // 版本号
	private Date createTime; // 创建时间
	private Date modifyTime; // 最后修改时间
	//add by shao wei 2018-4-13 17:19:43

	private String serverCtrlPlatforms; //服务器管理的平台
	private String serverOs; //服务器操作系统
	private long serverOnlineTime; //服务器在线时间
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getServerCtrlPlatforms() {
		return serverCtrlPlatforms;
	}

	public void setServerCtrlPlatforms(String serverCtrlPlatforms) {
		this.serverCtrlPlatforms = serverCtrlPlatforms;
	}

	public String getServerOs() {
		return serverOs;
	}

	public void setServerOs(String serverOs) {
		this.serverOs = serverOs;
	}

	public long getServerOnlineTime() {
		return serverOnlineTime;
	}

	public void setServerOnlineTime(long serverOnlineTime) {
		this.serverOnlineTime = serverOnlineTime;
	}
	
	public String getServerCPUType() {
		return serverCPUType;
	}

	public void setServerCPUType(String serverCPUType) {
		this.serverCPUType = serverCPUType;
	}

	public int getServerCPUnumber() {
		return serverCPUnumber;
	}

	public void setServerCPUnumber(int serverCPUnumber) {
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

	public long getServerDDRGross() {
		return serverDDRGross;
	}

	public void setServerDDRGross(long serverDDRGross) {
		this.serverDDRGross = serverDDRGross;
	}

	public String getServerDDRRate() {
		return serverDDRRate;
	}

	public void setServerDDRRate(String serverDDRRate) {
		this.serverDDRRate = serverDDRRate;
	}

	public long getServerDDRUsable() {
		return serverDDRUsable;
	}

	public void setServerDDRUsable(long serverDDRUsable) {
		this.serverDDRUsable = serverDDRUsable;
	}

	public long getServerHDDGross() {
		return serverHDDGross;
	}

	public void setServerHDDGross(long serverHDDGross) {
		this.serverHDDGross = serverHDDGross;
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

	public String getServerHDDUsage() {
		return serverHDDUsage;
	}

	public void setServerHDDUsage(String serverHDDUsage) {
		this.serverHDDUsage = serverHDDUsage;
	}

	public String getServerHDDRate() {
		return serverHDDRate;
	}

	public void setServerHDDRate(String serverHDDRate) {
		this.serverHDDRate = serverHDDRate;
	}

	public String getServerHDDAllRate() {
		return serverHDDAllRate;
	}

	public void setServerHDDAllRate(String serverHDDAllRate) {
		this.serverHDDAllRate = serverHDDAllRate;
	}

	public String getServerHDDReads() {
		return serverHDDReads;
	}

	public void setServerHDDReads(String serverHDDReads) {
		this.serverHDDReads = serverHDDReads;
	}

	public String getServerHDDWrites() {
		return serverHDDWrites;
	}

	public void setServerHDDWrites(String serverHDDWrites) {
		this.serverHDDWrites = serverHDDWrites;
	}
	
	public String getNetWorkMacAddr() {
		return netWorkMacAddr;
	}

	public void setNetWorkMacAddr(String netWorkMacAddr) {
		this.netWorkMacAddr = netWorkMacAddr;
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

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	
}  
