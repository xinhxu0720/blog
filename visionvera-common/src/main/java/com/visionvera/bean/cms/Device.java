package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @ClassName: DeviceVO
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author xiechs
 * @date 2017年11月13日
 * 
 */
@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class Device {

	private String id;					//设备视联号码（主键）
	private String name; 				//设备名称
	private String mac;					//设备MAC
	private String ip;					//设备IP
	private Integer type;				//设备类型
	private String description;			//备注
	private String alias;			    //设备别名
	private Integer role;			    //设备角色ID
	private String p_x;			        //gis x坐标值
	private String p_y;			        //gis y坐标值
	private String p_z;			        //gis z坐标值
	private Integer p_layer;			    //gis 层级
	private String svrid;			    //设备所属服务器ID
	private String updatetime;			//设备信息更新时间
	private String svr_region_id;		//数据来源-子系统行政区域ID
	private String region_id;			//设备行政区域
	private String devno;              //8位设备号码
	private String zoneno;           	//设备区号
	private String ssjgid;        		//所属机构id
	private String zonedevno;           //8位设备号码
	
	public String getZonedevno() {
		return zonedevno;
	}
	public void setZonedevno(String zonedevno) {
		this.zonedevno = zonedevno;
	}
	public String getSsjgid() {
		return ssjgid;
	}
	public void setSsjgid(String ssjgid) {
		this.ssjgid = ssjgid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDevno() {
		return devno;
	}
	public void setDevno(String devno) {
		this.devno = devno;
	}
	public String getZoneno() {
		return zoneno;
	}
	public void setZoneno(String zoneno) {
		this.zoneno = zoneno;
	}
	public String getRegion_id() {
		return region_id;
	}
	public void setRegion_id(String region_id) {
		this.region_id = region_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public Integer getRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role = role;
	}
	public String getP_x() {
		return p_x;
	}
	public void setP_x(String p_x) {
		this.p_x = p_x;
	}
	public String getP_y() {
		return p_y;
	}
	public void setP_y(String p_y) {
		this.p_y = p_y;
	}
	public String getP_z() {
		return p_z;
	}
	public void setP_z(String p_z) {
		this.p_z = p_z;
	}
	public Integer getP_layer() {
		return p_layer;
	}
	public void setP_layer(Integer p_layer) {
		this.p_layer = p_layer;
	}
	public String getSvrid() {
		return svrid;
	}
	public void setSvrid(String svrid) {
		this.svrid = svrid;
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
