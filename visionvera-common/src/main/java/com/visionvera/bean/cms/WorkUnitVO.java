package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class WorkUnitVO {
	public WorkUnitVO()
	{
		super();
	}
	private String id;
	private String pId;
	private String name;
	private String description;
	private String devCount; //点位数
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDevCount() {
		return devCount;
	}
	public void setDevCount(String devCount) {
		this.devCount = devCount;
	}
	
	
	
}
