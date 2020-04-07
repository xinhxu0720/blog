package com.visionvera.bean.analysis;

import java.io.Serializable;

public class SlwYwMaxVO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;					//主键ID
	private String groupId;				//1.会议预约最多账号（场）2.热点会议主题（场）3.发起会议最多终端（场）4.最大规模会议（点位）5.最繁忙的视联网服务器（项）6.被收看最多监控（次）
	private String dateId;				//1.本日，2.本周，3.本月，4.本季度，5.本半年，6.本年。
	private String name;				//名称
	private String count;				//次数
	private String updateTime;			//最后一次更新时间
	
	public SlwYwMaxVO() {
	}

	public SlwYwMaxVO(String id, String groupId, String dateId, String name, String count, String updateTime) {
		this.id = id;
		this.groupId = groupId;
		this.dateId = dateId;
		this.name = name;
		this.count = count;
		this.updateTime = updateTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getDateId() {
		return dateId;
	}

	public void setDateId(String dateId) {
		this.dateId = dateId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
}
