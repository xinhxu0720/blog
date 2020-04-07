package com.visionvera.bean.datacore;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


/**
 * <p>
 *
 * </p>
 *
 * @author zhanghui
 * @since 2018-12-06
 */

public class ReportBaseVo implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 业务唯一ID
	 */
	private String uniqId;
	/**
	 * 虚拟终端号
	 */
	private String virtualNo;
	/**
	 * 视频名称
	 */
	private String vedioName;
	/**
	 * 协转主消息号
	 */
	private String msgNo;
	/**
	 * 终端号码
	 */
	private String devNo;
	/**
	 * 终端唯一ID
	 */
	private String devId;
	
	/**
	 * 终端名称
	 */
	private String devName;
	/**
	 * 终端位置
	 */
	private String devAddr;
	/**
	 * 终端MAC
	 */
	private String devMac;
	/**
	 * 协转所属服务器号码
	 */
	private String svrNo;
	/**
	 * 协转所属服务器名称
	 */
	private String svrName;
	/**
	 * 协转所属服务器名称
	 */
	private String svrAddr;
	
	/**
	 * 开始时间
	 */
	private String startTime;
	/**
	 * 结束时间
	 */
	private String endTime;
	/**
	 * 发布、收看、录制、点播的用户
	 */
	private String userName;
	/**
	 * 正在升级的文件名称
	 */
	private String filename;
	/**
	 * 正在升级的文件大小
	 */
	private String filesize;
	/**
	 * 正在升级的版本号
	 */
	private String fileversion;
	/**
	 * 正在升级的文件类型名称
	 */
	private String filetypename;
	/**
	 * 创建时间
	 */
	private Date creatTime;
	/**
	 * 收看人数
	 */
	private Integer watchNum;
	/**
	 * 平台类型
	 */
	private Integer platformType;
	/**
	 * 设备区号
	 */
	private String zoneno;
	/**
	 * 8位设备号码
	 */
	private String zonedevno;
	
	/**
	 * 设备状态信息
	 */
	private String deviceStatusInfo;
	/**
	 * 设备状态码
	 */
	private Integer deviceStatus;
	/**
	 * 服务器状态信息
	 */
	private String serverStatusInfo;
	

	
	public String getUniqId() {
		return uniqId;
	}

	public void setUniqId(String uniqId) {
		this.uniqId = uniqId;
	}

	public String getVirtualNo() {
		return virtualNo;
	}

	public void setVirtualNo(String virtualNo) {
		this.virtualNo = virtualNo;
	}

	public String getVedioName() {
		return vedioName;
	}

	public void setVedioName(String vedioName) {
		this.vedioName = vedioName;
	}

	public String getMsgNo() {
		return msgNo;
	}

	public void setMsgNo(String msgNo) {
		this.msgNo = msgNo;
	}

	public String getDevNo() {
		return devNo;
	}

	public void setDevNo(String devNo) {
		this.devNo = devNo;
	}

	public String getDevId() {
		return devId;
	}

	public void setDevId(String devId) {
		this.devId = devId;
	}

	public String getDevName() {
		return devName;
	}

	public void setDevName(String devName) {
		this.devName = devName;
	}

	public String getDevAddr() {
		return devAddr;
	}

	public void setDevAddr(String devAddr) {
		this.devAddr = devAddr;
	}

	public String getDevMac() {
		return devMac;
	}

	public void setDevMac(String devMac) {
		this.devMac = devMac;
	}

	public String getSvrName() {
		return svrName;
	}

	public void setSvrName(String svrName) {
		this.svrName = svrName;
	}

	public String getSvrAddr() {
		return svrAddr;
	}

	public void setSvrAddr(String svrAddr) {
		this.svrAddr = svrAddr;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFilesize() {
		return filesize;
	}

	public void setFilesize(String filesize) {
		this.filesize = filesize;
	}

	public String getFileversion() {
		return fileversion;
	}

	public void setFileversion(String fileversion) {
		this.fileversion = fileversion;
	}

	public String getFiletypename() {
		return filetypename;
	}

	public void setFiletypename(String filetypename) {
		this.filetypename = filetypename;
	}

	public Date getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getSvrNo() {
		return svrNo;
	}

	public void setSvrNo(String svrNo) {
		this.svrNo = svrNo;
	}

	public Integer getWatchNum() {
		return watchNum;
	}

	public void setWatchNum(Integer watchNum) {
		this.watchNum = watchNum;
	}

	public Integer getPlatformType() {
		return platformType;
	}

	public void setPlatformType(Integer platformType) {
		this.platformType = platformType;
	}

	public String getZoneno() {
		return zoneno;
	}

	public void setZoneno(String zoneno) {
		this.zoneno = zoneno;
	}

	public String getZonedevno() {
		return zonedevno;
	}

	public void setZonedevno(String zonedevno) {
		this.zonedevno = zonedevno;
	}

	public String getDeviceStatusInfo() {
		return deviceStatusInfo;
	}

	public void setDeviceStatusInfo(String deviceStatusInfo) {
		this.deviceStatusInfo = deviceStatusInfo;
	}

	public String getServerStatusInfo() {
		return serverStatusInfo;
	}
	
	public Integer getDeviceStatus() {
		return deviceStatus;
	}

	public void setDeviceStatus(Integer deviceStatus) {
		this.deviceStatus = deviceStatus;
	}

	public void setServerStatusInfo(String serverStatusInfo) {
		this.serverStatusInfo = serverStatusInfo;
	}
	
	

}
