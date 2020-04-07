package com.visionvera.bean.datacore;

import java.io.Serializable;

/**
 * 数据中心设备表实体类
 *
 */
public class TTerminalInfoVO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String regionid;				//行政区域ID
	private String id;						//设备ID
	private String devno;					//设备号码
	private String name;					//设备名称
	private String ip;						//设备IP
	private String mac;						//设备MAC
	private String devtype;					//设备类型
	private String svrid;					//服务器ID
	private String updatetime;				//更新时间
	private String longitude;				//经度
	private String latitude;				//维度
	private String xxdz;					//详细地址
	private String isonline;				//是否在线，0：不在线；1：在线
	private String createtime;				//创建时间
	private String whfzr1;					//维护负责人
	private String whfzrtel1;				//维护负责人电话
	private String xmname;					//项目名称
	private String ssjgid;					//所属机构ID
	private String omcid2;					//区号
	public String getRegionid() {
		return regionid;
	}
	public void setRegionid(String regionid) {
		this.regionid = regionid;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getDevtype() {
		return devtype;
	}
	public void setDevtype(String devtype) {
		this.devtype = devtype;
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
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getXxdz() {
		return xxdz;
	}
	public void setXxdz(String xxdz) {
		this.xxdz = xxdz;
	}
	public String getIsonline() {
		return isonline;
	}
	public void setIsonline(String isonline) {
		this.isonline = isonline;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getWhfzr1() {
		return whfzr1;
	}
	public void setWhfzr1(String whfzr1) {
		this.whfzr1 = whfzr1;
	}
	public String getWhfzrtel1() {
		return whfzrtel1;
	}
	public void setWhfzrtel1(String whfzrtel1) {
		this.whfzrtel1 = whfzrtel1;
	}
	public String getXmname() {
		return xmname;
	}
	public void setXmname(String xmname) {
		this.xmname = xmname;
	}
	public String getSsjgid() {
		return ssjgid;
	}
	public void setSsjgid(String ssjgid) {
		this.ssjgid = ssjgid;
	}
	public String getOmcid2() {
		return omcid2;
	}
	public void setOmcid2(String omcid2) {
		this.omcid2 = omcid2;
	}
}
