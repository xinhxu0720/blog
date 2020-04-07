package com.visionvera.bean.datacore;

import java.io.Serializable;

/**
 * 自动掐断业务：会议、直播、可视电话、升级、录制、点播、监控等业务所使用的终端的抽象实体
 * @author Bianjf
 *
 */
public class AutoStopBusinessDeviceEntity implements Serializable {
	private static final long serialVersionUID = 1L;
    
	private String uuid;                         //主键
	
	private String deviceNo;					//5位设备号
	
	private String zoneNo;						//设备区号
	
	private String zoneDeviceNo;				//8位设备号码
	
	private String regionId;					//行政区域ID

	public AutoStopBusinessDeviceEntity() {
	}

	public AutoStopBusinessDeviceEntity(String uuid,String deviceNo, String zoneNo, String zoneDeviceNo, String regionId) {
		this.uuid =uuid;  
		this.deviceNo = deviceNo;
		this.zoneNo = zoneNo;
		this.zoneDeviceNo = zoneDeviceNo;
		this.regionId = regionId;
	}

	
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getDeviceNo() {
		return deviceNo;
	}

	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}

	public String getZoneNo() {
		return zoneNo;
	}

	public void setZoneNo(String zoneNo) {
		this.zoneNo = zoneNo;
	}

	public String getZoneDeviceNo() {
		return zoneDeviceNo;
	}

	public void setZoneDeviceNo(String zoneDeviceNo) {
		this.zoneDeviceNo = zoneDeviceNo;
	}

	public String getRegionId() {
		return regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}
}
