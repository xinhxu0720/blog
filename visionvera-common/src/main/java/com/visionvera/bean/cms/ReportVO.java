package com.visionvera.bean.cms;

/**
 * @ClassName: ReportVO
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author xiechs
 * @date 2016年9月27日
 * 
 */
public class ReportVO {

	private String name; 				//用户名称
	private String count;				//次数
	private String meetName;			//会议名称
	private String startTime;			//会议开始时间
	private String endTime;			//会议结束时间
	private Integer period;				//开会时长
	private String region;				//会议区域
	private String regionId;			//区域ID
	private Integer member;				//会议点位数
	private Integer personNum;			//参会人数
	private Integer level;			    //会议等级：1-5级
	private Integer customerComment;    //客户满意度：1非常满意；2满意；3一般；4不满意

	public String getMeetName() {
		return meetName;
	}
	public void setMeetName(String meetName) {
		this.meetName = meetName;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public Integer getPeriod() {
		return period;
	}
	public void setPeriod(Integer period) {
		this.period = period;
	}
	public Integer getMember() {
		return member;
	}
	public void setMember(Integer member) {
		this.member = member;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public Integer getPersonNum() {
		return personNum;
	}
	public void setPersonNum(Integer personNum) {
		this.personNum = personNum;
	}
	public String getRegionId() {
		return regionId;
	}
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Integer getCustomerComment() {
		return customerComment;
	}
	public void setCustomerComment(Integer customerComment) {
		this.customerComment = customerComment;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

}
