package com.visionvera.bean.datacore;

import java.util.Date;


/**
 * <p>
 * 当前正在进行的可视电话
 * </p>
 *
 * @author zhanghui
 * @since 2018-07-24
 */

public class Videophonerealtimeb{

private static final long serialVersionUID = 1L;

	private String recordid;
	private Date recordtime;
	private Integer devnoA;
	private Integer devnoB;
	private Integer starttime;
	private String omcid;

	public String getRecordid() {
		return recordid;
	}
	public void setRecordid(String recordid) {
		this.recordid = recordid;
	}
	public Date getRecordtime() {
		return recordtime;
	}
	public void setRecordtime(Date recordtime) {
		this.recordtime = recordtime;
	}
	public Integer getDevnoA() {
		return devnoA;
	}
	public void setDevnoA(Integer devnoA) {
		this.devnoA = devnoA;
	}
	public Integer getDevnoB() {
		return devnoB;
	}
	public void setDevnoB(Integer devnoB) {
		this.devnoB = devnoB;
	}
	public Integer getStarttime() {
		return starttime;
	}
	public void setStarttime(Integer starttime) {
		this.starttime = starttime;
	}
	public String getOmcid() {
		return omcid;
	}
	public void setOmcid(String omcid) {
		this.omcid = omcid;
	}

	@Override
	public String toString() {
		return "Videophonerealtimeb{" +
			   "recordid=" + recordid +
			   ", recordtime=" + recordtime +
			   ", devnoA=" + devnoA +
			   ", devnoB=" + devnoB +
			   ", starttime=" + starttime +
			   ", omcid=" + omcid +
			"}";
	}
}
