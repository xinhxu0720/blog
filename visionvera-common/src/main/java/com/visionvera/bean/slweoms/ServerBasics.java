package com.visionvera.bean.slweoms;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 服务器基本信息
 * @author dql
 *
 */
public class ServerBasics {
	
	private Integer id;			//服务器ID
	private String serverName;	//服务器名称
	private String serverUnique;	//服务器唯一key
	private String serverHostname;  	//主机名称
	private String serverSite;		//服务器地址
	private String serverHostGroup;	//服务器主机组
	private String serverManageIp;	//服务器管理ip
	private Integer port;			//服务器检测端端口号
	private String serverElseIp;	//其他ip
	private String serverTheirRoom;	//服务器所属机房
	private String serverManufacturer;	//服务器设备厂商
	private String serverProvince;	//服务器所属省级行政区域编码
	private String serverDistrict;	//服务器所属行政区域编码
	private String serverDistrictName;	//服务器所属行政区域，省市县三级文字标识
	private Integer gradeid;	//行政级别
	private String serverOs;	//服务器操作系统
	private String serverPrincipal;	//负责人
	private String serverPhone;		//负责人联系方式
	private String serverEmail;		//联系邮箱
	private Date createTime;		//创建时间
	private Date modifyTime;		//修改时间
	private Integer serverOnLine;	//在线状态，1在线，2离线
	private Date onLineStartTime;	//服务器开始在线时间
	private Date offLineTime;		//服务器离线时间
	private String user;	//远程登陆用户
	private String password;	//远程登陆用户密码
	
	
	private String cpuThreshold;	//cpu阈值设置
	private String hddThreshold;	//硬盘阈值
	private String ddrThreshold;	//内存阈值
	private String netUpThreshold;	//网络上行阈值
	private String netDownThreshold;	//网络下行阈值
	
	private Integer state;	//状态 0正常，-1删除
	private String version;		//检测端版本号	
	private Integer openState;	//启动状态，0关闭，1启动
	
	private String operationIp;	//探针管理IP
	
	/**
	 * 视联网需要字段
	 */
	private Integer reuseXzNo;	//是否复用协转终端号码 0:不复用 1:复用
	private String transferType;	//监测探针环境
	private String terminalCode;	//终端号码
	private String netMac;	//视联网通讯网卡名称
	private String v2vNetMac;	//网卡视联网Mac
	
	private String serverNETIP;		//服务器ip
	private String netWorkMacAddr;	//服务器mac
	private String pid;			//服务器上级行政区域编码
//	private Integer isTransfer; //是否复用协转号码
	private String serverPlatforms;	//服务器平台名称
	private String platformsRegisterid;	//平台唯一标识
	private String platformProcessState;	//平台进程状态 0正常，1异常
	private List<PlatformVO> platformVOList;
	private Map<String,List<String>> macAndIpMap;	//Mac和ip的对应关系，key为mac,value为ip
	
	private Integer platformNum;//管理平台数量
	
	private Integer processNum;//服务器进程数量
	
	private Integer bits;//服务器系统类型: 16:16位 64: 64位

	private String ywUuid;

	public String getYwUuid() {
		return ywUuid;
	}

	public void setYwUuid(String ywUuid) {
		this.ywUuid = ywUuid;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	
	public String getServerUnique() {
		return serverUnique;
	}
	public void setServerUnique(String serverUnique) {
		this.serverUnique = serverUnique;
	}
	
	public String getServerHostname() {
		return serverHostname;
	}
	public void setServerHostname(String serverHostname) {
		this.serverHostname = serverHostname;
	}
	
	public String getServerSite() {
		return serverSite;
	}
	public void setServerSite(String serverSite) {
		this.serverSite = serverSite;
	}
	
	public String getServerHostGroup() {
		return serverHostGroup;
	}
	public void setServerHostGroup(String serverHostGroup) {
		this.serverHostGroup = serverHostGroup;
	}
	
	public String getServerManageIp() {
		return serverManageIp;
	}
	public void setServerManageIp(String serverManageIp) {
		this.serverManageIp = serverManageIp;
	}
	
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	
	public String getServerElseIp() {
		return serverElseIp;
	}
	public void setServerElseIp(String serverElseIp) {
		this.serverElseIp = serverElseIp;
	}
	
	public String getServerTheirRoom() {
		return serverTheirRoom;
	}
	public void setServerTheirRoom(String serverTheirRoom) {
		this.serverTheirRoom = serverTheirRoom;
	}
	
	public String getServerManufacturer() {
		return serverManufacturer;
	}
	public void setServerManufacturer(String serverManufacturer) {
		this.serverManufacturer = serverManufacturer;
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
	
	public Integer getGradeid() {
		return gradeid;
	}
	public void setGradeid(Integer gradeid) {
		this.gradeid = gradeid;
	}
	
	public String getServerDistrictName() {
		return serverDistrictName;
	}
	public void setServerDistrictName(String serverDistrictName) {
		this.serverDistrictName = serverDistrictName;
	}
	
	public String getServerOs() {
		return serverOs;
	}
	public void setServerOs(String serverOs) {
		this.serverOs = serverOs;
	}
	
	public String getServerPrincipal() {
		return serverPrincipal;
	}
	public void setServerPrincipal(String serverPrincipal) {
		this.serverPrincipal = serverPrincipal;
	}
	
	public String getServerPhone() {
		return serverPhone;
	}
	public void setServerPhone(String serverPhone) {
		this.serverPhone = serverPhone;
	}
	
	public String getServerEmail() {
		return serverEmail;
	}
	public void setServerEmail(String serverEmail) {
		this.serverEmail = serverEmail;
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
	
	public Integer getServerOnLine() {
		return serverOnLine;
	}
	public void setServerOnLine(Integer serverOnLine) {
		this.serverOnLine = serverOnLine;
	}
	
	public Date getOnLineStartTime() {
		return onLineStartTime;
	}
	public void setOnLineStartTime(Date onLineStartTime) {
		this.onLineStartTime = onLineStartTime;
	}
	
	public Date getOffLineTime() {
		return offLineTime;
	}
	public void setOffLineTime(Date offLineTime) {
		this.offLineTime = offLineTime;
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getCpuThreshold() {
		return cpuThreshold;
	}
	public void setCpuThreshold(String cpuThreshold) {
		this.cpuThreshold = cpuThreshold;
	}
	
	public String getHddThreshold() {
		return hddThreshold;
	}
	public void setHddThreshold(String hddThreshold) {
		this.hddThreshold = hddThreshold;
	}
	
	public String getDdrThreshold() {
		return ddrThreshold;
	}
	public void setDdrThreshold(String ddrThreshold) {
		this.ddrThreshold = ddrThreshold;
	}
	
	public String getNetUpThreshold() {
		return netUpThreshold;
	}
	public void setNetUpThreshold(String netUpThreshold) {
		this.netUpThreshold = netUpThreshold;
	}
	
	public String getNetDownThreshold() {
		return netDownThreshold;
	}
	public void setNetDownThreshold(String netDownThreshold) {
		this.netDownThreshold = netDownThreshold;
	}
	
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	public Integer getOpenState() {
		return openState;
	}
	public void setOpenState(Integer openState) {
		this.openState = openState;
	}
	
	public String getOperationIp() {
		return operationIp;
	}
	public void setOperationIp(String operationIp) {
		this.operationIp = operationIp;
	}
	
	public String getTransferType() {
		return transferType;
	}
	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}


	public Integer getReuseXzNo() {
		return reuseXzNo;
	}

	public void setReuseXzNo(Integer reuseXzNo) {
		this.reuseXzNo = reuseXzNo;
	}

	public String getTerminalCode() {
		return terminalCode;
	}
	public void setTerminalCode(String terminalCode) {
		this.terminalCode = terminalCode;
	}

	public String getNetMac() {
		return netMac;
	}

	public void setNetMac(String netMac) {
		this.netMac = netMac;
	}

	public String getV2vNetMac() {
		return v2vNetMac;
	}
	public void setV2vNetMac(String v2vNetMac) {
		this.v2vNetMac = v2vNetMac;
	}
	
	public String getServerNETIP() {
		return serverNETIP;
	}
	public void setServerNETIP(String serverNETIP) {
		this.serverNETIP = serverNETIP;
	}
	
	public String getNetWorkMacAddr() {
		return netWorkMacAddr;
	}
	public void setNetWorkMacAddr(String netWorkMacAddr) {
		this.netWorkMacAddr = netWorkMacAddr;
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
	
	public List<PlatformVO> getPlatformVOList() {
		return platformVOList;
	}
	public void setPlatformVOList(List<PlatformVO> platformVOList) {
		this.platformVOList = platformVOList;
	}
	
	public Map<String, List<String>> getMacAndIpMap() {
		return macAndIpMap;
	}
	public void setMacAndIpMap(Map<String, List<String>> macAndIpMap) {
		this.macAndIpMap = macAndIpMap;
	}
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public Integer getPlatformNum() {
		return platformNum;
	}
	public void setPlatformNum(Integer platformNum) {
		this.platformNum = platformNum;
	}
	public Integer getProcessNum() {
		return processNum;
	}
	public void setProcessNum(Integer processNum) {
		this.processNum = processNum;
	}
	public Integer getBits() {
		return bits;
	}
	public void setBits(Integer bits) {
		this.bits = bits;
	}
	
	
//	public Integer getIsTransfer() {
//		return isTransfer;
//	}
//
//	public void setIsTransfer(Integer isTransfer) {
//		this.isTransfer = isTransfer;
//	}
}
