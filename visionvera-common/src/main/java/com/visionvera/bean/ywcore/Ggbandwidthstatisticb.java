package com.visionvera.bean.ywcore;

import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhanghui
 * @since 2018-07-20
 */

public class Ggbandwidthstatisticb {

private static final long serialVersionUID = 1L;

	private Integer id;
	private String omcid;
	private String date;
	private String svrmac;
	private Integer svrno;
	private String prov;
	private String regionid;
	private String spantime;
	private Integer weekrate;
	private Integer monthrate;
	private Date updatetime;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOmcid() {
		return omcid;
	}
	public void setOmcid(String omcid) {
		this.omcid = omcid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSvrmac() {
		return svrmac;
	}
	public void setSvrmac(String svrmac) {
		this.svrmac = svrmac;
	}
	public Integer getSvrno() {
		return svrno;
	}
	public void setSvrno(Integer svrno) {
		this.svrno = svrno;
	}
	public String getProv() {
		return prov;
	}
	public void setProv(String prov) {
		this.prov = prov;
	}
	public String getRegionid() {
		return regionid;
	}
	public void setRegionid(String regionid) {
		this.regionid = regionid;
	}
	public String getSpantime() {
		return spantime;
	}
	public void setSpantime(String spantime) {
		this.spantime = spantime;
	}
	public Integer getWeekrate() {
		return weekrate;
	}
	public void setWeekrate(Integer weekrate) {
		this.weekrate = weekrate;
	}
	public Integer getMonthrate() {
		return monthrate;
	}
	public void setMonthrate(Integer monthrate) {
		this.monthrate = monthrate;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	@Override
	public String toString() {
		return "Ggbandwidthstatisticb{" +
			   "id=" + id +
			   ", omcid=" + omcid +
			   ", date=" + date +
			   ", svrmac=" + svrmac +
			   ", svrno=" + svrno +
			   ", prov=" + prov +
			   ", regionid=" + regionid +
			   ", spantime=" + spantime +
			   ", weekrate=" + weekrate +
			   ", monthrate=" + monthrate +
			   ", updatetime=" + updatetime +
			"}";
	}
}
