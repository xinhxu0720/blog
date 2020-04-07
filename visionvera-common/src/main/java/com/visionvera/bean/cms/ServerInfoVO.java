package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @ClassName: ServerInfoVO
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author xiechs
 * @date 2017年2月10日
 * 
 */
@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class ServerInfoVO {

	public ServerInfoVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Integer id;					//服务器视联号码（主键）
	private Integer pid;				//主服务器视联号码
	private String name; 				//设备名称
	private Integer devType;			//设备类型
	private String regionId;			//服务器所属区域ID
	private String updateTime;			//服务器信息更新时间
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getDevType() {
		return devType;
	}
	public void setDevType(Integer devType) {
		this.devType = devType;
	}
	public String getRegionId() {
		return regionId;
	}
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

}
