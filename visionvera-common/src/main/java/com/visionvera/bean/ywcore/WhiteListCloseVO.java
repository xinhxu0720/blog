package com.visionvera.bean.ywcore;

import com.visionvera.bean.base.BaseTimeEntity;

/**
 * 封网时，白名单预案表实体类
 * @author Bianjf
 *
 */
public class WhiteListCloseVO extends BaseTimeEntity {
	private static final long serialVersionUID = 1L;

	private String uuid;								//主键UUID
	
	private String preplanName;							//预案名称
	
	private String businessType;						//业务类型。1表示会议，2表示可视电话，3表示直播
	
	private String deviceType;							//终端类型。1表示会议(会议不涉及终端类型)，2表示实体终端，3表示虚拟终端
	
	private String otherId;								//关联其他业务的ID。当business_type为1时表示会议的ID，为2或3时表示实体终端或虚拟终端的ID
	
	private String otherName;							//关联其他业务的名称。会议表示会议名称，可视电话或直播表示终端名称
	
	private String userId;								//创建/修改人员的用户ID
	
	private String status;								//是否禁用。1表示启用，2表示禁用
	
	private String startTime;							//预案执行开始时间
	
	private String endTime;								//预案执行结束时间
	
	private String createTime;							//创建时间
	
	private String updateTime;							//最后一次更新时间
	
	private String ext1;								//扩展字段1
	
	private String ext2;								//扩展字段2
	
	private String ext3;								//扩展字段3

	public WhiteListCloseVO() {
	}

	public WhiteListCloseVO(String uuid, String preplanName, String businessType, String deviceType, String otherId,
			String otherName, String userId, String status, String startTime, String endTime, String createTime,
			String updateTime, String ext1, String ext2, String ext3) {
		this.uuid = uuid;
		this.preplanName = preplanName;
		this.businessType = businessType;
		this.deviceType = deviceType;
		this.otherId = otherId;
		this.otherName = otherName;
		this.userId = userId;
		this.status = status;
		this.startTime = startTime;
		this.endTime = endTime;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.ext1 = ext1;
		this.ext2 = ext2;
		this.ext3 = ext3;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getPreplanName() {
		return preplanName;
	}

	public void setPreplanName(String preplanName) {
		this.preplanName = preplanName;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getOtherId() {
		return otherId;
	}

	public void setOtherId(String otherId) {
		this.otherId = otherId;
	}

	public String getOtherName() {
		return otherName;
	}

	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
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
}
