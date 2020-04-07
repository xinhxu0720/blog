package com.visionvera.bean.operation;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhanghui
 * @since 2018-07-05
 */

public class BreakdownMeeting implements Serializable{

private static final long serialVersionUID = 1L;

	/**
	 * 会议ID
	 */
	private String meetingId;
	/**
	 * 故障数量
	 */
	private Integer breakDownCount;
	/**
	 * 已解决数据
	 */
	private Integer solveCount;
	/**
	 * 所需回访总数
	 */
	private Integer needVisitTotal;
	/**
	 * 已回访数量
	 */
	private Integer visitCount;
	/**
	 * 解决状态(0-未解决；1-已经解决)
	 */
	private Integer solveStatus;
	/**
	 * 回访状态(0-无；1-已回访；2-部分回访；3-已超时；4-未回访)
	 */
	private Integer visitStatus;
	
	/**
	 * 会议名称
	 */
	private String name ;
	/**
	 * 会议级别(1-5)
	 */
	private Integer level ;
	/**
	 * 主席
	 */
	private String compere ;
	/**
	 * 会议设备数
	 */
	private Integer devNum ;
	/**
	 * 会议开始时间
	 */
	private String startTime ;
	/**
	 * 会议结果时间
	 */
	private String endTime ;
	/**
	 * 1预约会议，2即时会议
	 */
	private Integer type ;
	/**
	 * 开始会议的开始时间
	 */
	private String startStartMeetingTime ;
	/**
	 * 开始会议的结束时间
	 */
	private String endStartMeetingTime ;
	/**
	 * 是否维护故障(0-否；1-是；)
	 */
	private Integer isMaintainBreakdown ;
	
	/**
	 * 主席名称
	 */
	private Integer masterNo;
	
	/**
	 * 故障ID
	 */
	private String breakdownId;

	public Integer getBreakDownCount() {
		return breakDownCount;
	}
	public void setBreakDownCount(Integer breakDownCount) {
		this.breakDownCount = breakDownCount;
	}
	public Integer getSolveCount() {
		return solveCount;
	}
	public void setSolveCount(Integer solveCount) {
		this.solveCount = solveCount;
	}
	public Integer getNeedVisitTotal() {
		return needVisitTotal;
	}
	public void setNeedVisitTotal(Integer needVisitTotal) {
		this.needVisitTotal = needVisitTotal;
	}
	public Integer getVisitCount() {
		return visitCount;
	}
	public void setVisitCount(Integer visitCount) {
		this.visitCount = visitCount;
	}
	public Integer getSolveStatus() {
		return solveStatus;
	}
	public void setSolveStatus(Integer solveStatus) {
		this.solveStatus = solveStatus;
	}
	public Integer getVisitStatus() {
		return visitStatus;
	}
	public void setVisitStatus(Integer visitStatus) {
		this.visitStatus = visitStatus;
	}
	public String getMeetingId() {
		return meetingId;
	}
	public void setMeetingId(String meetingId) {
		this.meetingId = meetingId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public String getCompere() {
		return compere;
	}
	public void setCompere(String compere) {
		this.compere = compere;
	}
	public Integer getDevNum() {
		return devNum;
	}
	public void setDevNum(Integer devNum) {
		this.devNum = devNum;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getStartStartMeetingTime() {
		return startStartMeetingTime;
	}
	public void setStartStartMeetingTime(String startStartMeetingTime) {
		this.startStartMeetingTime = startStartMeetingTime;
	}
	public Integer getIsMaintainBreakdown() {
		return isMaintainBreakdown;
	}
	public void setIsMaintainBreakdown(Integer isMaintainBreakdown) {
		this.isMaintainBreakdown = isMaintainBreakdown;
	}
	public String getEndStartMeetingTime() {
		return endStartMeetingTime;
	}
	public void setEndStartMeetingTime(String endStartMeetingTime) {
		this.endStartMeetingTime = endStartMeetingTime;
	}
	public Integer getMasterNo() {
		return masterNo;
	}
	public void setMasterNo(Integer masterNo) {
		this.masterNo = masterNo;
	}
	public String getBreakdownId() {
		return breakdownId;
	}
	public void setBreakdownId(String breakdownId) {
		this.breakdownId = breakdownId;
	}
	@Override
	public String toString() {
		return "BreakdownMeeting [meetingId=" + meetingId + ", breakDownCount=" + breakDownCount + ", solveCount="
				+ solveCount + ", needVisitTotal=" + needVisitTotal + ", visitCount=" + visitCount + ", solveStatus="
				+ solveStatus + ", visitStatus=" + visitStatus + ", name=" + name + ", level=" + level + ", compere="
				+ compere + ", devNum=" + devNum + ", startTime=" + startTime + ", endTime=" + endTime + ", type="
				+ type + ", startStartMeetingTime=" + startStartMeetingTime + ", endStartMeetingTime="
				+ endStartMeetingTime + ", isMaintainBreakdown=" + isMaintainBreakdown + ", masterNo=" + masterNo
				+ ", breakdownId=" + breakdownId + "]";
	}
}
