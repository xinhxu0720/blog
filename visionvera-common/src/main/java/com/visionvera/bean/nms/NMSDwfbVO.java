package com.visionvera.bean.nms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/** 
 * <pre>项目名称：    
 * 类名称：NMSDwfbVO    
 * 类描述： 视联网点位分布图bean实例 
 * 创建人：王思萌
 * 创建时间：2018年6月4日
 * 修改备注：       
 * @version </pre>    
 */
@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class NMSDwfbVO {
	
	public NMSDwfbVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private String id;//行政区域id
	private String name;//行政区域名字
	private int gid;//行政区域级别
	private int dwsl;//终端总数
	private int value;//终端总数
	private int dwzx;//终端在线数
	private int fwqsl;
	private int fwqzx;
	private int day;//日变化量
	private int week;//周变化量
	private int month;//月变化量
	private String projectname;//项目名称
	private String projectid;//项目id
	private String industrybid;//行业id
	private String industryname;//行业名字
	
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getProjectid() {
		return projectid;
	}
	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}
	public String getIndustrybid() {
		return industrybid;
	}
	public void setIndustrybid(String industrybid) {
		this.industrybid = industrybid;
	}
	public String getIndustryname() {
		return industryname;
	}
	public void setIndustryname(String industryname) {
		this.industryname = industryname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public int getDwsl() {
		return dwsl;
	}
	public void setDwsl(int dwsl) {
		this.dwsl = dwsl;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getDwzx() {
		return dwzx;
	}
	public void setDwzx(int dwzx) {
		this.dwzx = dwzx;
	}
	public int getFwqsl() {
		return fwqsl;
	}
	public void setFwqsl(int fwqsl) {
		this.fwqsl = fwqsl;
	}
	public int getFwqzx() {
		return fwqzx;
	}
	public void setFwqzx(int fwqzx) {
		this.fwqzx = fwqzx;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getWeek() {
		return week;
	}
	public void setWeek(int week) {
		this.week = week;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	
	
}
