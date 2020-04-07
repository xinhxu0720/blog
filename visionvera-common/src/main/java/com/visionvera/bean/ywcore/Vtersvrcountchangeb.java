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

public class Vtersvrcountchangeb {

	private String regionid;
	private String pid;
	private Integer gradeid;
	private Integer tercount;
	private Integer teronline;
	private Integer svrcount;
	private Integer svronline;
	private Integer terday;
	private Integer terweek;
	private Integer termonth;
	private Integer terquarter;
	private Integer terhalfyear;
	private Integer teryear;
	private Integer svrday;
	private Integer svrweek;
	private Integer svrmonth;
	private Integer svrquarter;
	private Integer svrhalfyear;
	private Integer svryear;
	private Date recordtime;
	
	//扩展字段
	private Integer teroffline;//离线数量
		
	private String regionName;//行政区域名称

	public String getRegionid() {
		return regionid;
	}
	public void setRegionid(String regionid) {
		this.regionid = regionid;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public Integer getGradeid() {
		return gradeid;
	}
	public void setGradeid(Integer gradeid) {
		this.gradeid = gradeid;
	}
	public Integer getTercount() {
		return tercount;
	}
	public void setTercount(Integer tercount) {
		this.tercount = tercount;
	}
	public Integer getTeronline() {
		return teronline;
	}
	public void setTeronline(Integer teronline) {
		this.teronline = teronline;
	}
	public Integer getSvrcount() {
		return svrcount;
	}
	public void setSvrcount(Integer svrcount) {
		this.svrcount = svrcount;
	}
	public Integer getSvronline() {
		return svronline;
	}
	public void setSvronline(Integer svronline) {
		this.svronline = svronline;
	}
	public Integer getTerday() {
		return terday;
	}
	public void setTerday(Integer terday) {
		this.terday = terday;
	}
	public Integer getTerweek() {
		return terweek;
	}
	public void setTerweek(Integer terweek) {
		this.terweek = terweek;
	}
	public Integer getTermonth() {
		return termonth;
	}
	public void setTermonth(Integer termonth) {
		this.termonth = termonth;
	}
	public Integer getTerquarter() {
		return terquarter;
	}
	public void setTerquarter(Integer terquarter) {
		this.terquarter = terquarter;
	}
	public Integer getTerhalfyear() {
		return terhalfyear;
	}
	public void setTerhalfyear(Integer terhalfyear) {
		this.terhalfyear = terhalfyear;
	}
	public Integer getTeryear() {
		return teryear;
	}
	public void setTeryear(Integer teryear) {
		this.teryear = teryear;
	}
	public Integer getSvrday() {
		return svrday;
	}
	public void setSvrday(Integer svrday) {
		this.svrday = svrday;
	}
	public Integer getSvrweek() {
		return svrweek;
	}
	public void setSvrweek(Integer svrweek) {
		this.svrweek = svrweek;
	}
	public Integer getSvrmonth() {
		return svrmonth;
	}
	public void setSvrmonth(Integer svrmonth) {
		this.svrmonth = svrmonth;
	}
	public Integer getSvrquarter() {
		return svrquarter;
	}
	public void setSvrquarter(Integer svrquarter) {
		this.svrquarter = svrquarter;
	}
	public Integer getSvrhalfyear() {
		return svrhalfyear;
	}
	public void setSvrhalfyear(Integer svrhalfyear) {
		this.svrhalfyear = svrhalfyear;
	}
	public Integer getSvryear() {
		return svryear;
	}
	public void setSvryear(Integer svryear) {
		this.svryear = svryear;
	}
	public Date getRecordtime() {
		return recordtime;
	}
	public void setRecordtime(Date recordtime) {
		this.recordtime = recordtime;
	}

	public Integer getTeroffline() {
		return teroffline;
	}
	public void setTeroffline(Integer teroffline) {
		this.teroffline = teroffline;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	@Override
	public String toString() {
		return "Vtersvrcountchangeb{" +
			   "regionid=" + regionid +
			   ", pid=" + pid +
			   ", gradeid=" + gradeid +
			   ", tercount=" + tercount +
			   ", teronline=" + teronline +
			   ", svrcount=" + svrcount +
			   ", svronline=" + svronline +
			   ", terday=" + terday +
			   ", terweek=" + terweek +
			   ", termonth=" + termonth +
			   ", terquarter=" + terquarter +
			   ", terhalfyear=" + terhalfyear +
			   ", teryear=" + teryear +
			   ", svrday=" + svrday +
			   ", svrweek=" + svrweek +
			   ", svrmonth=" + svrmonth +
			   ", svrquarter=" + svrquarter +
			   ", svrhalfyear=" + svrhalfyear +
			   ", svryear=" + svryear +
			   ", recordtime=" + recordtime +
			"}";
	}
}
