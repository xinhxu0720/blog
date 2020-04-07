package com.visionvera.bean.ywcore;
import java.util.Date;


/**
 * <p>
 * 
 * </p>
 *
 * @author zhanghui
 * @since 2018-06-25
 */

public class Voffterinfob {

	private String regionid;
	private String devno;
	private String khname;
	private String whfzr;
	private String whfzrtel;
	private String xxdz;
	private Date recordtime;

	public String getRegionid() {
		return regionid;
	}
	public void setRegionid(String regionid) {
		this.regionid = regionid;
	}
	public String getDevno() {
		return devno;
	}
	public void setDevno(String devno) {
		this.devno = devno;
	}
	public String getKhname() {
		return khname;
	}
	public void setKhname(String khname) {
		this.khname = khname;
	}
	public String getWhfzr() {
		return whfzr;
	}
	public void setWhfzr(String whfzr) {
		this.whfzr = whfzr;
	}
	public String getWhfzrtel() {
		return whfzrtel;
	}
	public void setWhfzrtel(String whfzrtel) {
		this.whfzrtel = whfzrtel;
	}
	public String getXxdz() {
		return xxdz;
	}
	public void setXxdz(String xxdz) {
		this.xxdz = xxdz;
	}
	public Date getRecordtime() {
		return recordtime;
	}
	public void setRecordtime(Date recordtime) {
		this.recordtime = recordtime;
	}

	@Override
	public String toString() {
		return "Voffterinfob{" +
			   "regionid=" + regionid +
			   ", devno=" + devno +
			   ", khname=" + khname +
			   ", whfzr=" + whfzr +
			   ", whfzrtel=" + whfzrtel +
			   ", xxdz=" + xxdz +
			   ", recordtime=" + recordtime +
			"}";
	}
}
