package com.visionvera.bean.ywcore;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;

/**
 * 抓包机设备状态
 *
 */
public class RemoteReportVO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String funName;					//
	private String row;						//主键ID，自动增长
	private String id;						//废弃
	private String date;					//日期
	private String time;					//时间
	private String dateTime;				//数据采集时间
	private String capture;					//抓包机的ID
	private String ip;						//抓包机的IP
	private String mac;						//所抓的视联网服务器的MAC
	private String pid;						//所属网管的PID
	private String no;						//所抓的视联网服务器的号码
	private String omcId;					//所属网管的全网ID
	private String tm;						//时间（距离1970年的秒数）
	private String machine;					//服务器名称
	private String provId;					//省ID
	private String provName;				//省ID
	private String region;					//省区域ID
	private String realProvId;				//抓包机所在真实的省ID
	private String realProvName;			//抓包机所在真实的省名称
	private String realRegionId;			//抓包机所在真实的行政区域ID
	private String mac0;					//所抓的视联网服务器的mac0
	private String mac1;					//所抓的视联网服务器的mac1
	private String isLead;					//是否lead服务器（0、1）
	private String packet;					//包个数
	private String bytes;					//字节数
	private String online;					//是否在线（0，1）
	private String onlineFirst;				//在线的开始时间
	private String onlineTick;				//在线的结束时间
	private String platformAbbr;			//
	private String platformName;			//部署平台名称
	private String cpu;						//CPU占用率
	private String memory;					//内存占用率
	private String disk;					//硬盘占用率
	private String net;						//网络占用率
	private String report;					//具体数据
	private JSONObject reportJsonObject;	//具体数据JSONObject
	
	/** 以下是非持久化数据 */
	private String orderBy;					//排序的字段
	private String orderType;				//排序规则。DESC和ASC
	private String gradeId;					//行政级别
	
	public RemoteReportVO() {
	}

	public String getFunName() {
		return funName;
	}

	public void setFunName(String funName) {
		this.funName = funName;
	}

	public String getRow() {
		return row;
	}

	public void setRow(String row) {
		this.row = row;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getCapture() {
		return capture;
	}

	public void setCapture(String capture) {
		this.capture = capture;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getOmcId() {
		return omcId;
	}

	public void setOmcId(String omcId) {
		this.omcId = omcId;
	}

	public String getTm() {
		return tm;
	}

	public void setTm(String tm) {
		this.tm = tm;
	}

	public String getMachine() {
		return machine;
	}

	public void setMachine(String machine) {
		this.machine = machine;
	}

	public String getProvId() {
		return provId;
	}

	public void setProvId(String provId) {
		this.provId = provId;
	}

	public String getProvName() {
		return provName;
	}

	public void setProvName(String provName) {
		this.provName = provName;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getRealProvId() {
		return realProvId;
	}

	public void setRealProvId(String realProvId) {
		this.realProvId = realProvId;
	}

	public String getRealProvName() {
		return realProvName;
	}

	public void setRealProvName(String realProvName) {
		this.realProvName = realProvName;
	}

	public String getRealRegionId() {
		return realRegionId;
	}

	public void setRealRegionId(String realRegionId) {
		this.realRegionId = realRegionId;
	}

	public String getMac0() {
		return mac0;
	}

	public void setMac0(String mac0) {
		this.mac0 = mac0;
	}

	public String getMac1() {
		return mac1;
	}

	public void setMac1(String mac1) {
		this.mac1 = mac1;
	}

	public String getIsLead() {
		return isLead;
	}

	public void setIsLead(String isLead) {
		this.isLead = isLead;
	}

	public String getPacket() {
		return packet;
	}

	public void setPacket(String packet) {
		this.packet = packet;
	}

	public String getBytes() {
		return bytes;
	}

	public void setBytes(String bytes) {
		this.bytes = bytes;
	}

	public String getOnline() {
		return online;
	}

	public void setOnline(String online) {
		this.online = online;
	}

	public String getOnlineFirst() {
		return onlineFirst;
	}

	public void setOnlineFirst(String onlineFirst) {
		this.onlineFirst = onlineFirst;
	}

	public String getOnlineTick() {
		return onlineTick;
	}

	public void setOnlineTick(String onlineTick) {
		this.onlineTick = onlineTick;
	}

	public String getPlatformAbbr() {
		return platformAbbr;
	}

	public void setPlatformAbbr(String platformAbbr) {
		this.platformAbbr = platformAbbr;
	}

	public String getPlatformName() {
		return platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getDisk() {
		return disk;
	}

	public void setDisk(String disk) {
		this.disk = disk;
	}

	public String getNet() {
		return net;
	}

	public void setNet(String net) {
		this.net = net;
	}

	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public JSONObject getReportJsonObject() {
		return reportJsonObject;
	}

	public void setReportJsonObject(JSONObject reportJsonObject) {
		this.reportJsonObject = reportJsonObject;
	}

	public String getGradeId() {
		return gradeId;
	}

	public void setGradeId(String gradeId) {
		this.gradeId = gradeId;
	}
}
