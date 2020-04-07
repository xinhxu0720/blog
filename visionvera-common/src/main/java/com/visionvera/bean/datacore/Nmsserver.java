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

public class Nmsserver {

private static final long serialVersionUID = 1L;

	private String omcid;
	private String omcid2;
	private String regionid;
	private String name;
	private String weburl;
	private Integer synctype;
	/**
	 * 时间戳
	 */
	private Date recordtime;

	public String getOmcid() {
		return omcid;
	}
	public void setOmcid(String omcid) {
		this.omcid = omcid;
	}
	public String getOmcid2() {
		return omcid2;
	}
	public void setOmcid2(String omcid2) {
		this.omcid2 = omcid2;
	}
	public String getRegionid() {
		return regionid;
	}
	public void setRegionid(String regionid) {
		this.regionid = regionid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWeburl() {
		return weburl;
	}
	public void setWeburl(String weburl) {
		this.weburl = weburl;
	}
	public Integer getSynctype() {
		return synctype;
	}
	public void setSynctype(Integer synctype) {
		this.synctype = synctype;
	}
	public Date getRecordtime() {
		return recordtime;
	}
	public void setRecordtime(Date recordtime) {
		this.recordtime = recordtime;
	}

	@Override
	public String toString() {
		return "Nmsserver{" +
			   "omcid=" + omcid +
			   ", omcid2=" + omcid2 +
			   ", regionid=" + regionid +
			   ", name=" + name +
			   ", weburl=" + weburl +
			   ", synctype=" + synctype +
			   ", recordtime=" + recordtime +
			"}";
	}
}
