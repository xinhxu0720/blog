package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class LogVO {
	
	private String uuid;
	private String operateUser;			//操作账户
	private String operateTime;			//操作时间
	private String operateType;		//操作类型
	private String description;			//操作描述
	private String meetName;			//会议名称
	private boolean result;				//操作结果
	
	/** 非持久化数据 */
	private String startCreateTime;		//创建开始时间
	private String endCreateTime;		//创建开始时间
	private String types;
	private String loginName;			//用户账号
	private String[] typesArr;
	
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getOperateUser() {
		return operateUser;
	}
	public void setOperateUser(String operateUser) {
		this.operateUser = operateUser;
	}
	public String getOperateTime() {
		return operateTime;
	}
	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}
	public String getOperateType() {
		return operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMeetName() {
		return meetName;
	}
	public void setMeetName(String meetName) {
		this.meetName = meetName;
	}
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public String getStartCreateTime() {
		return startCreateTime;
	}
	public void setStartCreateTime(String startCreateTime) {
		this.startCreateTime = startCreateTime;
	}
	public String getEndCreateTime() {
		return endCreateTime;
	}
	public void setEndCreateTime(String endCreateTime) {
		this.endCreateTime = endCreateTime;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	public String[] getTypesArr() {
		return typesArr;
	}
	public void setTypesArr(String[] typesArr) {
		this.typesArr = typesArr;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
}
