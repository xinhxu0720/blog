package com.visionvera.bean.analysis;

import java.io.Serializable;

public class BusinessInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	private String regionId;						//行政区域ID
	
	private String regionName;						//区域名称
	
	private String businessCount;					//业务量
	
	private String zoneDeviceNo;					//8位设备号码
	
	private String deviceName;						//设备名称
	
	private String month;							//年度对应的月份
	
	private String projectName;						//项目名称
	
	private String industryName;					//行业名称
	
	private String totalBusinessCount;				//会议时表示会议召开场次；监控表示总介入设备次；可视电话和直播表示调度次数
	
	private String totalCount;						//会议表示多少人次参会；监控表示多少次调度；可视电话、直播表示累计时长
	
	private String zoneno;                            //终端区号
	/** 扩展字段 */
	private String ext1;							//扩展字段1
	
	private String ext2;							//扩展字段2
	
	private String ext3;							//扩展字段3
	
	private String ext4;							//扩展字段4
	
	private String ext5;							//扩展字段5
	
	public BusinessInfo() {
	}

	public String getRegionId() {
		return regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getBusinessCount() {
		return businessCount;
	}

	public void setBusinessCount(String businessCount) {
		this.businessCount = businessCount;
	}

	public String getZoneDeviceNo() {
		return zoneDeviceNo;
	}

	public void setZoneDeviceNo(String zoneDeviceNo) {
		this.zoneDeviceNo = zoneDeviceNo;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getIndustryName() {
		return industryName;
	}

	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

	public String getTotalBusinessCount() {
		return totalBusinessCount;
	}

	public void setTotalBusinessCount(String totalBusinessCount) {
		this.totalBusinessCount = totalBusinessCount;
	}

	public String getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getExt1() {
		return ext1;
	}

	public void setExt1(String ext1) {
		this.ext1 = ext1;
	}

	public String getExt2() {
		return ext2;
	}

	public void setExt2(String ext2) {
		this.ext2 = ext2;
	}

	public String getExt3() {
		return ext3;
	}

	public void setExt3(String ext3) {
		this.ext3 = ext3;
	}

	public String getExt4() {
		return ext4;
	}

	public void setExt4(String ext4) {
		this.ext4 = ext4;
	}

	public String getExt5() {
		return ext5;
	}

	public void setExt5(String ext5) {
		this.ext5 = ext5;
	}

	public String getZoneno() {
		return zoneno;
	}

	public void setZoneno(String zoneno) {
		this.zoneno = zoneno;
	}

	
	
}
