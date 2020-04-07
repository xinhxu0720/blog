package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @ClassName: ServerInfoVO
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author xiechs
 * @date 2017年11月13日
 * 
 */
@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class ServerInfo {

	public ServerInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String id;					//服务器视联号码（主键）
	private String pid;				//主服务器视联号码
	private String name; 				//设备名称
	private Integer devtype;			//设备类型
	private String regionid;			//服务器所属区域ID
	private String updatetime;			//服务器信息更新时间
	private String svr_region_id;		//数据来源-子系统行政区域ID
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getDevtype() {
		return devtype;
	}
	public void setDevtype(Integer devtype) {
		this.devtype = devtype;
	}
	public String getRegionid() {
		return regionid;
	}
	public void setRegionid(String regionid) {
		this.regionid = regionid;
	}
	public String getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}
	public String getSvr_region_id() {
		return svr_region_id;
	}
	public void setSvr_region_id(String svr_region_id) {
		this.svr_region_id = svr_region_id;
	}
}
