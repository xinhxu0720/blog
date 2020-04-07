package com.visionvera.bean.restful;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 自定义webservice发送短信格式
 * @author 谢程算
 * 创建日期 2017.03.30
 */
@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class VphoneVO {
	private String name; //拨打可视电话人的姓名，最多5个字
	private String boxnum; //源终端号码
	private String destboxnum; //目标终端号码
	private String userId; //开会用户ID
	private String userGroupId; //开会用户组ID
	private String scheduleId; //会议ID
	private Integer calltype; //1是强制2是普通
	private String dev1;					//可视电话拨打方完整的8位设备号码
	private String dev2;					//可视电话接听方完整的8位设备号码
	private String areano1;				//可视电话拨打方区域号
	private String areano2;				//可视电话接听方区域号
	private String boxnumZone;		    //源终端号码地区号码
	private String destboxnumZone;		//目标终端地区号码
	private String startTime;		//可视电话开始时间
	private String endTime;		    //可视电话结束时间
	private String createTime;		//可视电话创建时间
	private Integer phoneStatus;		//可视电话状态
	private String zoneDevno1;		//主叫方设备唯一号码
	private String zoneDevno2;		//被叫方设备唯一号码
	private String devname1;		//主叫方设备名称
	private String devname2;		//被叫方设备名称
	private String devAlias1;		//主叫方设备昵称
	private String devAlias2;		//被叫方设备昵称
	private String devIp1;		//主叫方设备ip
	private String devIp2;		//被叫方设备ip
	private String devMac1;		//主叫方设备mac
	private String devMac2;		//被叫方设备mac
	private Integer devType1;		//主叫方设备类型
	private Integer devType2;		//被叫方设备类型
	private Integer devRole1;		//主叫方设备角色
	private Integer devRole2;		//被叫方设备角色
	private Integer devId1;		//主叫方设备号码
	private Integer devId2;		//被叫方设备号码
	private String systemTime; //服务器系统时间

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBoxnum() {
		return boxnum;
	}

	public void setBoxnum(String boxnum) {
		this.boxnum = boxnum;
	}

	public String getDestboxnum() {
		return destboxnum;
	}

	public void setDestboxnum(String destboxnum) {
		this.destboxnum = destboxnum;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserGroupId() {
		return userGroupId;
	}

	public void setUserGroupId(String userGroupId) {
		this.userGroupId = userGroupId;
	}

	public String getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}

	public Integer getCalltype() {
		return calltype;
	}

	public void setCalltype(Integer calltype) {
		this.calltype = calltype;
	}

	public String getDev1() {
		return dev1;
	}

	public void setDev1(String dev1) {
		this.dev1 = dev1;
	}

	public String getDev2() {
		return dev2;
	}

	public void setDev2(String dev2) {
		this.dev2 = dev2;
	}

	public String getAreano1() {
		return areano1;
	}

	public void setAreano1(String areano1) {
		this.areano1 = areano1;
	}

	public String getAreano2() {
		return areano2;
	}

	public void setAreano2(String areano2) {
		this.areano2 = areano2;
	}

	public String getBoxnumZone() {
		return boxnumZone;
	}

	public void setBoxnumZone(String boxnumZone) {
		this.boxnumZone = boxnumZone;
	}

	public String getDestboxnumZone() {
		return destboxnumZone;
	}

	public void setDestboxnumZone(String destboxnumZone) {
		this.destboxnumZone = destboxnumZone;
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

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Integer getPhoneStatus() {
		return phoneStatus;
	}

	public void setPhoneStatus(Integer phoneStatus) {
		this.phoneStatus = phoneStatus;
	}

	public String getZoneDevno1() {
		return zoneDevno1;
	}

	public void setZoneDevno1(String zoneDevno1) {
		this.zoneDevno1 = zoneDevno1;
	}

	public String getZoneDevno2() {
		return zoneDevno2;
	}

	public void setZoneDevno2(String zoneDevno2) {
		this.zoneDevno2 = zoneDevno2;
	}

	public String getDevname1() {
		return devname1;
	}

	public void setDevname1(String devname1) {
		this.devname1 = devname1;
	}

	public String getDevname2() {
		return devname2;
	}

	public void setDevname2(String devname2) {
		this.devname2 = devname2;
	}

	public String getDevAlias1() {
		return devAlias1;
	}

	public void setDevAlias1(String devAlias1) {
		this.devAlias1 = devAlias1;
	}

	public String getDevAlias2() {
		return devAlias2;
	}

	public void setDevAlias2(String devAlias2) {
		this.devAlias2 = devAlias2;
	}

	public String getDevIp1() {
		return devIp1;
	}

	public void setDevIp1(String devIp1) {
		this.devIp1 = devIp1;
	}

	public String getDevIp2() {
		return devIp2;
	}

	public void setDevIp2(String devIp2) {
		this.devIp2 = devIp2;
	}

	public String getDevMac1() {
		return devMac1;
	}

	public void setDevMac1(String devMac1) {
		this.devMac1 = devMac1;
	}

	public String getDevMac2() {
		return devMac2;
	}

	public void setDevMac2(String devMac2) {
		this.devMac2 = devMac2;
	}

	public Integer getDevType1() {
		return devType1;
	}

	public void setDevType1(Integer devType1) {
		this.devType1 = devType1;
	}

	public Integer getDevType2() {
		return devType2;
	}

	public void setDevType2(Integer devType2) {
		this.devType2 = devType2;
	}

	public Integer getDevRole1() {
		return devRole1;
	}

	public void setDevRole1(Integer devRole1) {
		this.devRole1 = devRole1;
	}

	public Integer getDevRole2() {
		return devRole2;
	}

	public void setDevRole2(Integer devRole2) {
		this.devRole2 = devRole2;
	}

	public Integer getDevId1() {
		return devId1;
	}

	public void setDevId1(Integer devId1) {
		this.devId1 = devId1;
	}

	public Integer getDevId2() {
		return devId2;
	}

	public void setDevId2(Integer devId2) {
		this.devId2 = devId2;
	}

	public String getSystemTime() {
		return systemTime;
	}

	public void setSystemTime(String systemTime) {
		this.systemTime = systemTime;
	}
}
