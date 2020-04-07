package com.visionvera.bean.alarm.thirdParty.slweoms;

import java.io.Serializable;
import java.util.List;

/**
 * 报警信息表
 * 
 * @author XUAN
 * 
 */
public class AlarmInformation implements Serializable {

	private static final long serialVersionUID = -978733088072575362L;
	private Integer id; // 主键ID
	private String endpoint; // 监控主机名称
	private String metric; // 主机监控项名称
	private String note; // 报警内容
	private String status; // 状态[OK(正常)PROBLEM（不正常）]
	private Long timestamp; // Unix时间戳(Unix timestamp)
	private String registerid; // 我方平台识别第三方平台的唯一标识
	private String topsName; // 第三方平台的名称
	private Integer alarmType;
	// 报警类型：”0”: 正常
	// “1”：CPU报警“2”：内存报警“3”：存储容量报警“4”：服务器宕机“5”：终端（终端提供版本支持丢包率）“6”：服务器掉线“7”：监控不可用“8”：协转掉线“9”：会议异常“10”：会议中终端异常“11”：带宽丢包严重“12”：硬盘报警
	// “13” : 其他
	private Integer tposPlatformType; // 第三方平台种类 1：录播 2：网管 3：唐古拉 4：会馆
	private String platformTypeName; // 平台类型名称
	private Integer state; // 状态 0正常 -1以删除
	private Integer version; // 版本号
	private Long createTime; // 创建时间
	private Long modifyTime; // 最后修改时间
	private String coordinateLng; // 报警经度
	private String coordinateLat; // 报警纬度
	private String regionbids; // 报警来源区域id
	private String source;// 报警来源地

	private String tposPlatformRegionbIds;// 行政区id集合
	private Integer tposPlatformGradeid;// 行政级别id
	private String tposPlatformRegionbName;// 行政级名称
	private String tposAddress;// 平台地址
	private Integer treatmentStates; // 处理状态:0未处理,1为处理
	private Integer kindType; // 区分报警与通知:报警为 1,通知为 2

	private String serverManageIp;// 平台ip
	private String serverCPUSumRate;// CPU总的使用率
	private String serverHDDAllRate;// 硬盘总使用率
	private String serverDDRRate;// 内存使用率
	private String serverNETIP;// 网络IP,以逗号隔开
	private String serverNETUpData;// 网络上行数据
	private String serverNETDownData;// 网络下行数据

	private String serverHDDName;// 硬盘每个名称,以,隔开
	private String serverHDDVolume;// 硬盘每个总大小 以, 隔开
	private String serverHDDUsage;// 硬盘每个使用量

	private List<InternetBean> serverCommList;// 网口集合
	private List<PartitionInfo> serverHDDList;// 盘符信息

	private String cpuThreshold;// cpu报警阈值
	private String hddThreshold;// 硬盘报警阈值
	private String ddrThreshold;// 内存报警阈值
	private String netUpThreshold;// 网络上行流量报警阈值
	private String netDownThreshold;// 网络下行流量报警阈值
	private String serverSite;// 详细地址
	// add by shaowei 2018-4-20 17:29:15
	private Integer alarmLevel;

	public Integer getAlarmLevel() {
		return alarmLevel;
	}

	public void setAlarmLevel(Integer alarmLevel) {
		this.alarmLevel = alarmLevel;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public String getMetric() {
		return metric;
	}

	public void setMetric(String metric) {
		this.metric = metric;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getRegisterid() {
		return registerid;
	}

	public void setRegisterid(String registerid) {
		this.registerid = registerid;
	}

	public String getTopsName() {
		return topsName;
	}

	public void setTopsName(String topsName) {
		this.topsName = topsName;
	}

	public Integer getAlarmType() {
		return alarmType;
	}

	public void setAlarmType(Integer alarmType) {
		this.alarmType = alarmType;
	}

	public Integer getTposPlatformType() {
		return tposPlatformType;
	}

	public void setTposPlatformType(Integer tposPlatformType) {
		this.tposPlatformType = tposPlatformType;
	}

	public String getPlatformTypeName() {
		return platformTypeName;
	}

	public void setPlatformTypeName(String platformTypeName) {
		this.platformTypeName = platformTypeName;
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

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Long getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Long modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getCoordinateLng() {
		return coordinateLng;
	}

	public void setCoordinateLng(String coordinateLng) {
		this.coordinateLng = coordinateLng;
	}

	public String getCoordinateLat() {
		return coordinateLat;
	}

	public void setCoordinateLat(String coordinateLat) {
		this.coordinateLat = coordinateLat;
	}

	public String getRegionbids() {
		return regionbids;
	}

	public void setRegionbids(String regionbids) {
		this.regionbids = regionbids;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTposPlatformRegionbIds() {
		return tposPlatformRegionbIds;
	}

	public void setTposPlatformRegionbIds(String tposPlatformRegionbIds) {
		this.tposPlatformRegionbIds = tposPlatformRegionbIds;
	}

	public Integer getTposPlatformGradeid() {
		return tposPlatformGradeid;
	}

	public void setTposPlatformGradeid(Integer tposPlatformGradeid) {
		this.tposPlatformGradeid = tposPlatformGradeid;
	}

	public String getTposPlatformRegionbName() {
		return tposPlatformRegionbName;
	}

	public void setTposPlatformRegionbName(String tposPlatformRegionbName) {
		this.tposPlatformRegionbName = tposPlatformRegionbName;
	}

	public String getTposAddress() {
		return tposAddress;
	}

	public void setTposAddress(String tposAddress) {
		this.tposAddress = tposAddress;
	}

	public Integer getTreatmentStates() {
		return treatmentStates;
	}

	public void setTreatmentStates(Integer treatmentStates) {
		this.treatmentStates = treatmentStates;
	}

	public Integer getKindType() {
		return kindType;
	}

	public void setKindType(Integer kindType) {
		this.kindType = kindType;
	}

	public String getServerManageIp() {
		return serverManageIp;
	}

	public void setServerManageIp(String serverManageIp) {
		this.serverManageIp = serverManageIp;
	}

	public String getServerCPUSumRate() {
		return serverCPUSumRate;
	}

	public void setServerCPUSumRate(String serverCPUSumRate) {
		this.serverCPUSumRate = serverCPUSumRate;
	}

	public String getServerHDDAllRate() {
		return serverHDDAllRate;
	}

	public void setServerHDDAllRate(String serverHDDAllRate) {
		this.serverHDDAllRate = serverHDDAllRate;
	}

	public String getServerDDRRate() {
		return serverDDRRate;
	}

	public void setServerDDRRate(String serverDDRRate) {
		this.serverDDRRate = serverDDRRate;
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

	public List<InternetBean> getServerCommList() {
		return serverCommList;
	}

	public void setServerCommList(List<InternetBean> serverCommList) {
		this.serverCommList = serverCommList;
	}

	public List<PartitionInfo> getServerHDDList() {
		return serverHDDList;
	}

	public void setServerHDDList(List<PartitionInfo> serverHDDList) {
		this.serverHDDList = serverHDDList;
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

	public String getServerSite() {
		return serverSite;
	}

	public void setServerSite(String serverSite) {
		this.serverSite = serverSite;
	}

	@Override
	public String toString() {
		return "AlarmInformation [id=" + id + ", endpoint=" + endpoint + ", metric=" + metric + ", note=" + note + ", status=" + status + ", timestamp=" + timestamp + ", registerid=" + registerid
				+ ", topsName=" + topsName + ", alarmType=" + alarmType + ", tposPlatformType=" + tposPlatformType + ", platformTypeName=" + platformTypeName + ", state=" + state + ", version="
				+ version + ", createTime=" + createTime + ", modifyTime=" + modifyTime + ", coordinateLng=" + coordinateLng + ", coordinateLat=" + coordinateLat + ", regionbids=" + regionbids
				+ ", source=" + source + ", tposPlatformRegionbIds=" + tposPlatformRegionbIds + ", tposPlatformGradeid=" + tposPlatformGradeid + ", tposPlatformRegionbName=" + tposPlatformRegionbName
				+ ", tposAddress=" + tposAddress + ", treatmentStates=" + treatmentStates + ", kindType=" + kindType + ", serverManageIp=" + serverManageIp + ", serverCPUSumRate=" + serverCPUSumRate
				+ ", serverHDDAllRate=" + serverHDDAllRate + ", serverDDRRate=" + serverDDRRate + ", serverNETIP=" + serverNETIP + ", serverNETUpData=" + serverNETUpData + ", serverNETDownData="
				+ serverNETDownData + ", serverHDDName=" + serverHDDName + ", serverHDDVolume=" + serverHDDVolume + ", serverHDDUsage=" + serverHDDUsage + ", serverCommList=" + serverCommList
				+ ", serverHDDList=" + serverHDDList + ", cpuThreshold=" + cpuThreshold + ", hddThreshold=" + hddThreshold + ", ddrThreshold=" + ddrThreshold + ", netUpThreshold=" + netUpThreshold
				+ ", netDownThreshold=" + netDownThreshold + ", alarmLevel=" + alarmLevel + "]";
	}



}
