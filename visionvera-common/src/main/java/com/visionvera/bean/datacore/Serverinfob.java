package com.visionvera.bean.datacore;

import java.util.Date;


/**
 * <p>
 * 
 * </p>
 *
 * @author zhanghui
 * @since 2019-07-23
 */

public class Serverinfob {

private static final long serialVersionUID = 1L;

	private String omcid;
	private Integer id;
	private Integer pid;
	/**
	 * 运营网络类型对应t_systemparamb groupid为0021
	 */
	private String network;
	private String sn;
	private String name;
	private String mac0;
	private String mac1;
	private Integer devtype;
	private Integer svrno;
	private Integer bandwith0;
	private Integer bandwith1;
	private Integer ssxmid;
	private String ktywqf;
	private Date ktywsj;
	private Integer groupno;
	private String regionid;
	private String jfxxdz;
	private String jgh;
	private String longitude;
	private String latitude;
	private String yysm;
	private String yyslxr;
	private String yyslxrdh;
	private String khlxr;
	private String khlxrdh;
	private String verno;
	/**
	 * 0:unlock;1:error;2:wait lock;3:lock
	 */
	private String lockflg;
	private Date locktime;
	private String whfzr1;
	private String whfzrtel1;
	private String azr;
	private String azrtel;
	/**
	 * 0:off;1:on
	 */
	private String online;
	private String servertime;
	/**
	 * 0: unreachable; 1: reachable
	 */
	private String reachable;
	private String ethernettype;
	private String frametype;
	private String refreshtime;
	private String linelevel;
	private String linebw;
	private String openid;
	private String linkid0;
	private String linkid1;
	private String deleteflg;
	private String createid;
	private Date createtime;
	private String updateid;
	private Date updatetime;
	private String isfirst;
	private Date syncdatatime;

	public String getOmcid() {
		return omcid;
	}
	public void setOmcid(String omcid) {
		this.omcid = omcid;
	}
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
	public String getNetwork() {
		return network;
	}
	public void setNetwork(String network) {
		this.network = network;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMac0() {
		return mac0;
	}
	public void setMac0(String mac0) {
		this.mac0 = mac0;
	}
	public String getMac1() {
		return mac1;
	}
	public void setMac1(String mac1) {
		this.mac1 = mac1;
	}
	public Integer getDevtype() {
		return devtype;
	}
	public void setDevtype(Integer devtype) {
		this.devtype = devtype;
	}
	public Integer getSvrno() {
		return svrno;
	}
	public void setSvrno(Integer svrno) {
		this.svrno = svrno;
	}
	public Integer getBandwith0() {
		return bandwith0;
	}
	public void setBandwith0(Integer bandwith0) {
		this.bandwith0 = bandwith0;
	}
	public Integer getBandwith1() {
		return bandwith1;
	}
	public void setBandwith1(Integer bandwith1) {
		this.bandwith1 = bandwith1;
	}
	public Integer getSsxmid() {
		return ssxmid;
	}
	public void setSsxmid(Integer ssxmid) {
		this.ssxmid = ssxmid;
	}
	public String getKtywqf() {
		return ktywqf;
	}
	public void setKtywqf(String ktywqf) {
		this.ktywqf = ktywqf;
	}
	public Date getKtywsj() {
		return ktywsj;
	}
	public void setKtywsj(Date ktywsj) {
		this.ktywsj = ktywsj;
	}
	public Integer getGroupno() {
		return groupno;
	}
	public void setGroupno(Integer groupno) {
		this.groupno = groupno;
	}
	public String getRegionid() {
		return regionid;
	}
	public void setRegionid(String regionid) {
		this.regionid = regionid;
	}
	public String getJfxxdz() {
		return jfxxdz;
	}
	public void setJfxxdz(String jfxxdz) {
		this.jfxxdz = jfxxdz;
	}
	public String getJgh() {
		return jgh;
	}
	public void setJgh(String jgh) {
		this.jgh = jgh;
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
	public String getYysm() {
		return yysm;
	}
	public void setYysm(String yysm) {
		this.yysm = yysm;
	}
	public String getYyslxr() {
		return yyslxr;
	}
	public void setYyslxr(String yyslxr) {
		this.yyslxr = yyslxr;
	}
	public String getYyslxrdh() {
		return yyslxrdh;
	}
	public void setYyslxrdh(String yyslxrdh) {
		this.yyslxrdh = yyslxrdh;
	}
	public String getKhlxr() {
		return khlxr;
	}
	public void setKhlxr(String khlxr) {
		this.khlxr = khlxr;
	}
	public String getKhlxrdh() {
		return khlxrdh;
	}
	public void setKhlxrdh(String khlxrdh) {
		this.khlxrdh = khlxrdh;
	}
	public String getVerno() {
		return verno;
	}
	public void setVerno(String verno) {
		this.verno = verno;
	}
	public String getLockflg() {
		return lockflg;
	}
	public void setLockflg(String lockflg) {
		this.lockflg = lockflg;
	}
	public Date getLocktime() {
		return locktime;
	}
	public void setLocktime(Date locktime) {
		this.locktime = locktime;
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
	public String getAzr() {
		return azr;
	}
	public void setAzr(String azr) {
		this.azr = azr;
	}
	public String getAzrtel() {
		return azrtel;
	}
	public void setAzrtel(String azrtel) {
		this.azrtel = azrtel;
	}
	public String getOnline() {
		return online;
	}
	public void setOnline(String online) {
		this.online = online;
	}
	public String getServertime() {
		return servertime;
	}
	public void setServertime(String servertime) {
		this.servertime = servertime;
	}
	public String getReachable() {
		return reachable;
	}
	public void setReachable(String reachable) {
		this.reachable = reachable;
	}
	public String getEthernettype() {
		return ethernettype;
	}
	public void setEthernettype(String ethernettype) {
		this.ethernettype = ethernettype;
	}
	public String getFrametype() {
		return frametype;
	}
	public void setFrametype(String frametype) {
		this.frametype = frametype;
	}
	public String getRefreshtime() {
		return refreshtime;
	}
	public void setRefreshtime(String refreshtime) {
		this.refreshtime = refreshtime;
	}
	public String getLinelevel() {
		return linelevel;
	}
	public void setLinelevel(String linelevel) {
		this.linelevel = linelevel;
	}
	public String getLinebw() {
		return linebw;
	}
	public void setLinebw(String linebw) {
		this.linebw = linebw;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getLinkid0() {
		return linkid0;
	}
	public void setLinkid0(String linkid0) {
		this.linkid0 = linkid0;
	}
	public String getLinkid1() {
		return linkid1;
	}
	public void setLinkid1(String linkid1) {
		this.linkid1 = linkid1;
	}
	public String getDeleteflg() {
		return deleteflg;
	}
	public void setDeleteflg(String deleteflg) {
		this.deleteflg = deleteflg;
	}
	public String getCreateid() {
		return createid;
	}
	public void setCreateid(String createid) {
		this.createid = createid;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getUpdateid() {
		return updateid;
	}
	public void setUpdateid(String updateid) {
		this.updateid = updateid;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	public String getIsfirst() {
		return isfirst;
	}
	public void setIsfirst(String isfirst) {
		this.isfirst = isfirst;
	}
	public Date getSyncdatatime() {
		return syncdatatime;
	}
	public void setSyncdatatime(Date syncdatatime) {
		this.syncdatatime = syncdatatime;
	}

	@Override
	public String toString() {
		return "Serverinfob{" +
			   "omcid=" + omcid +
			   ", id=" + id +
			   ", pid=" + pid +
			   ", network=" + network +
			   ", sn=" + sn +
			   ", name=" + name +
			   ", mac0=" + mac0 +
			   ", mac1=" + mac1 +
			   ", devtype=" + devtype +
			   ", svrno=" + svrno +
			   ", bandwith0=" + bandwith0 +
			   ", bandwith1=" + bandwith1 +
			   ", ssxmid=" + ssxmid +
			   ", ktywqf=" + ktywqf +
			   ", ktywsj=" + ktywsj +
			   ", groupno=" + groupno +
			   ", regionid=" + regionid +
			   ", jfxxdz=" + jfxxdz +
			   ", jgh=" + jgh +
			   ", longitude=" + longitude +
			   ", latitude=" + latitude +
			   ", yysm=" + yysm +
			   ", yyslxr=" + yyslxr +
			   ", yyslxrdh=" + yyslxrdh +
			   ", khlxr=" + khlxr +
			   ", khlxrdh=" + khlxrdh +
			   ", verno=" + verno +
			   ", lockflg=" + lockflg +
			   ", locktime=" + locktime +
			   ", whfzr1=" + whfzr1 +
			   ", whfzrtel1=" + whfzrtel1 +
			   ", azr=" + azr +
			   ", azrtel=" + azrtel +
			   ", online=" + online +
			   ", servertime=" + servertime +
			   ", reachable=" + reachable +
			   ", ethernettype=" + ethernettype +
			   ", frametype=" + frametype +
			   ", refreshtime=" + refreshtime +
			   ", linelevel=" + linelevel +
			   ", linebw=" + linebw +
			   ", openid=" + openid +
			   ", linkid0=" + linkid0 +
			   ", linkid1=" + linkid1 +
			   ", deleteflg=" + deleteflg +
			   ", createid=" + createid +
			   ", createtime=" + createtime +
			   ", updateid=" + updateid +
			   ", updatetime=" + updatetime +
			   ", isfirst=" + isfirst +
			   ", syncdatatime=" + syncdatatime +
			"}";
	}
}
