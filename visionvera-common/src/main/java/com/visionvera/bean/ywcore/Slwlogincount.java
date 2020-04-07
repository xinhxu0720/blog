package com.visionvera.bean.ywcore;

import java.util.Date;


/**
 * <p>
 * 
 * </p>
 *
 * @author zhanghui
 * @since 2018-07-23
 */

public class Slwlogincount{

private static final long serialVersionUID = 1L;

private String id;
/**
 * 1：网管， 2：会管，3：雪亮，4：gis，5：存储网关，6：唐古拉
 */
private Integer platid;
private String platname;
private Integer dateid;
private String timesolename1;
private Integer logincount1;
private String timesolename2;
private Integer logincount2;
private String timesolename3;
private Integer logincount3;
private String timesolename4;
private Integer logincount4;
private String timesolename5;
private Integer logincount5;
private String timesolename6;
private Integer logincount6;
private Date updatetime;

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public Integer getPlatid() {
	return platid;
}
public void setPlatid(Integer platid) {
	this.platid = platid;
}
public String getPlatname() {
	return platname;
}
public void setPlatname(String platname) {
	this.platname = platname;
}
public Integer getDateid() {
	return dateid;
}
public void setDateid(Integer dateid) {
	this.dateid = dateid;
}
public String getTimesolename1() {
	return timesolename1;
}
public void setTimesolename1(String timesolename1) {
	this.timesolename1 = timesolename1;
}
public Integer getLogincount1() {
	return logincount1;
}
public void setLogincount1(Integer logincount1) {
	this.logincount1 = logincount1;
}
public String getTimesolename2() {
	return timesolename2;
}
public void setTimesolename2(String timesolename2) {
	this.timesolename2 = timesolename2;
}
public Integer getLogincount2() {
	return logincount2;
}
public void setLogincount2(Integer logincount2) {
	this.logincount2 = logincount2;
}
public String getTimesolename3() {
	return timesolename3;
}
public void setTimesolename3(String timesolename3) {
	this.timesolename3 = timesolename3;
}
public Integer getLogincount3() {
	return logincount3;
}
public void setLogincount3(Integer logincount3) {
	this.logincount3 = logincount3;
}
public String getTimesolename4() {
	return timesolename4;
}
public void setTimesolename4(String timesolename4) {
	this.timesolename4 = timesolename4;
}
public Integer getLogincount4() {
	return logincount4;
}
public void setLogincount4(Integer logincount4) {
	this.logincount4 = logincount4;
}
public String getTimesolename5() {
	return timesolename5;
}
public void setTimesolename5(String timesolename5) {
	this.timesolename5 = timesolename5;
}
public Integer getLogincount5() {
	return logincount5;
}
public void setLogincount5(Integer logincount5) {
	this.logincount5 = logincount5;
}
public String getTimesolename6() {
	return timesolename6;
}
public void setTimesolename6(String timesolename6) {
	this.timesolename6 = timesolename6;
}
public Integer getLogincount6() {
	return logincount6;
}
public void setLogincount6(Integer logincount6) {
	this.logincount6 = logincount6;
}
public Date getUpdatetime() {
	return updatetime;
}
public void setUpdatetime(Date updatetime) {
	this.updatetime = updatetime;
}

@Override
public String toString() {
	return "Slwlogincount{" +
		   "id=" + id +
		   ", platid=" + platid +
		   ", platname=" + platname +
		   ", dateid=" + dateid +
		   ", timesolename1=" + timesolename1 +
		   ", logincount1=" + logincount1 +
		   ", timesolename2=" + timesolename2 +
		   ", logincount2=" + logincount2 +
		   ", timesolename3=" + timesolename3 +
		   ", logincount3=" + logincount3 +
		   ", timesolename4=" + timesolename4 +
		   ", logincount4=" + logincount4 +
		   ", timesolename5=" + timesolename5 +
		   ", logincount5=" + logincount5 +
		   ", timesolename6=" + timesolename6 +
		   ", logincount6=" + logincount6 +
		   ", updatetime=" + updatetime +
		"}";
}
}
