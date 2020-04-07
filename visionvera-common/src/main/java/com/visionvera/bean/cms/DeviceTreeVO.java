package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class DeviceTreeVO {
	private String id;          //树节点id
	private String pId;         //树节点父id
	private boolean folder;   //是否文件夹
	private String name;        //名称
	private int type;           //设备类型
	private String alias;       //设备别名
	private int grade;          //等级
	private int leaf;         //是否叶子节点
	
	public String getId() {
		return id;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getleaf() {
		return leaf;
	}
	public void setIsleaf(int leaf) {
		this.leaf = leaf;
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
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public boolean getFolder() {
		return folder;
	}
	public void setFolder(boolean folder) {
		this.folder = folder;
	}
	
}
