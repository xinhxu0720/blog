package com.visionvera.bean.cms;

public class ServerTypeVO {
	private Integer id;//服务器类型序号
	private String name;//服务器类型名称
	private String description;//服务器类型描述
	
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}
