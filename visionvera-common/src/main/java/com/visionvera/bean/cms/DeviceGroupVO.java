package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @ClassName: DeviceGroupVO
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author xiechs
 * @date 2016年9月14日
 * 
 */
@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class DeviceGroupVO {

	public DeviceGroupVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String uuid; 				//设备分组uuid
	private String name; 				//设备分组名称
	private String temporarily;			//是否临时创建设备分组。0-否；1-是；
	private String description;			//备注
	private String devices; 			//设备分组包含的设备
	private Integer devCount;           //组内设备数
	private String userId;              //对该会场签到的用户ID
	private String userName;            //对该会场签到的用户名
	private String imgUrl;              //对该会场签到的用户头像
	private String createTime;          //签到的时间
	private String userGroupId;         //用户分组ID
	private Integer isUsed;         	//会场是否已被占用。0否，1是
	private Integer dataType;         	//群组类型：1默认，2私有
	private String masterNo;			//设备作用：主席
	private String speakerOne;			//发一
	private String speakerTwo;			//发二
	private String updateTime;			//更新时间（用于置顶功能）
	private String scheduleId;			//预约ID
	private String status;			    //预约状态
	private String startTime;			//预约开始时间
	private String endTime;			    //预约结束时间
	private String masterZonenoNo;		//主席设备区号
	private String speakerZonenoOne;	//发一设备区号
	private String speakerZonenoTwo;	//发二设备区号
	private String zoneno ;             //设备区号
	private String meetType ;			//普通会议,四方会议

	public String getMasterZonenoNo() {
		return masterZonenoNo;
	}

	public void setMasterZonenoNo(String masterZonenoNo) {
		this.masterZonenoNo = masterZonenoNo;
	}

	public String getSpeakerZonenoOne() {
		return speakerZonenoOne;
	}

	public void setSpeakerZonenoOne(String speakerZonenoOne) {
		this.speakerZonenoOne = speakerZonenoOne;
	}

	public String getSpeakerZonenoTwo() {
		return speakerZonenoTwo;
	}

	public void setSpeakerZonenoTwo(String speakerZonenoTwo) {
		this.speakerZonenoTwo = speakerZonenoTwo;
	}

	public String getZoneno() {
		return zoneno;
	}

	public void setZoneno(String zoneno) {
		this.zoneno = zoneno;
	}

	public String getMeetType() {
		return meetType;
	}

	public void setMeetType(String meetType) {
		this.meetType = meetType;
	}

	public String getMasterNo() {
		return masterNo;
	}
	public void setMasterNo(String masterNo) {
		this.masterNo = masterNo;
	}
	public String getSpeakerOne() {
		return speakerOne;
	}
	public void setSpeakerOne(String speakerOne) {
		this.speakerOne = speakerOne;
	}
	public String getSpeakerTwo() {
		return speakerTwo;
	}
	public void setSpeakerTwo(String speakerTwo) {
		this.speakerTwo = speakerTwo;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTemporarily() {
		return temporarily;
	}
	public void setTemporarily(String temporarily) {
		this.temporarily = temporarily;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDevices() {
		return devices;
	}
	public void setDevices(String devices) {
		this.devices = devices;
	}
	public Integer getDevCount() {
		return devCount;
	}
	public void setDevCount(Integer devCount) {
		this.devCount = devCount;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getUserGroupId() {
		return userGroupId;
	}
	public void setUserGroupId(String userGroupId) {
		this.userGroupId = userGroupId;
	}
	public Integer getIsUsed() {
		return isUsed;
	}
	public void setIsUsed(Integer isUsed) {
		this.isUsed = isUsed;
	}
	public Integer getDataType() {
		return dataType;
	}
	public void setDataType(Integer dataType) {
		this.dataType = dataType;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	
}
