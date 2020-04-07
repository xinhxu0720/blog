package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @ClassName: ScheduleDevVO 
 * @Description: TODO 会议关联设备
 * @author xiechs
 * @date 2017年11月13日
 *
 */
@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class ScheduleDev {
	
	private String uuid; //主键
	private String schedule_id; //预约ID
	private String dev_id; //终端号码
	private Integer dev_role; //终端角色ID
	private String dev_name; //终端名称
	private Integer status;  //终端状态
	private String svr_region_id;		//数据来源-子系统行政区域ID
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getSchedule_id() {
		return schedule_id;
	}
	public void setSchedule_id(String schedule_id) {
		this.schedule_id = schedule_id;
	}
	public String getDev_id() {
		return dev_id;
	}
	public void setDev_id(String dev_id) {
		this.dev_id = dev_id;
	}
	public Integer getDev_role() {
		return dev_role;
	}
	public void setDev_role(Integer dev_role) {
		this.dev_role = dev_role;
	}
	public String getDev_name() {
		return dev_name;
	}
	public void setDev_name(String dev_name) {
		this.dev_name = dev_name;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getSvr_region_id() {
		return svr_region_id;
	}
	public void setSvr_region_id(String svr_region_id) {
		this.svr_region_id = svr_region_id;
	}
}
