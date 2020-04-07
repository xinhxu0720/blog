package com.visionvera.bean.operation;

import java.io.Serializable;
import java.util.Date;


/**
 * <p>
 * 
 * </p>
 *
 * @author zhanghui
 * @since 2018-07-05
 */

public class BreakdownHistory implements Serializable{

private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	private Integer id;
	/**
	 *  故障id
	 */
	private String breakdownId;
	/**
	 * 会议id
	 */
	private String meetingId;
	/**
	 * 故障简述
	 */
	private String sketch;
	/**
	 * 故障详情
	 */
	private String detail;
	/**
	 * 当前状态信息
	 */
	private String statusInfo;
	/**
	 * 回访状态（0-无；1-已回访；2-部分回访；3-已超时；4-未回访）
	 */
	private Integer visitStatus ;
	/**
	 * 是否解决
	 */
	private Integer isSolve;
	/**
	 * 是否需要回访
	 */
	private Integer isNeedVisit;
	/**
	 * 是否回访
	 */
	private Integer isVisit;
	/**
	 * 预计回访时间
	 */
	private String expectVisitTime;
	/**
	 * 实际回访时间
	 */
	private String actualVisitTime;
	/**
	 * 回访内容
	 */
	private String visitContent;
	/**
	 * 创建时间
	 */
	private String creatTime;
	/**
	 * 最后修改时间
	 */
	private String lastUpdateTime;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBreakdownId() {
		return breakdownId;
	}
	public void setBreakdownId(String breakdownId) {
		this.breakdownId = breakdownId;
	}
	public String getMeetingId() {
		return meetingId;
	}
	public void setMeetingId(String meetingId) {
		this.meetingId = meetingId;
	}
	public String getSketch() {
		return sketch;
	}
	public void setSketch(String sketch) {
		this.sketch = sketch;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Integer getIsSolve() {
		return isSolve;
	}
	public void setIsSolve(Integer isSolve) {
		this.isSolve = isSolve;
	}
	public Integer getIsNeedVisit() {
		return isNeedVisit;
	}
	public void setIsNeedVisit(Integer isNeedVisit) {
		this.isNeedVisit = isNeedVisit;
	}
	public Integer getIsVisit() {
		return isVisit;
	}
	public void setIsVisit(Integer isVisit) {
		this.isVisit = isVisit;
	}
	public String getVisitContent() {
		return visitContent;
	}
	public void setVisitContent(String visitContent) {
		this.visitContent = visitContent;
	}
	public String getStatusInfo() {
		return statusInfo;
	}
	public void setStatusInfo(String statusInfo) {
		this.statusInfo = statusInfo;
	}
	public Integer getVisitStatus() {
		return visitStatus;
	}
	public void setVisitStatus(Integer visitStatus) {
		this.visitStatus = visitStatus;
	}
	public String getExpectVisitTime() {
		return expectVisitTime;
	}
	public void setExpectVisitTime(String expectVisitTime) {
		this.expectVisitTime = expectVisitTime;
	}
	public String getActualVisitTime() {
		return actualVisitTime;
	}
	public void setActualVisitTime(String actualVisitTime) {
		this.actualVisitTime = actualVisitTime;
	}
	public String getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(String creatTime) {
		this.creatTime = creatTime;
	}
	public String getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	@Override
	public String toString() {
		return "BreakdownHistory [id=" + id + ", breakdownId=" + breakdownId + ", meetingId=" + meetingId + ", sketch="
				+ sketch + ", detail=" + detail + ", statusInfo=" + statusInfo + ", visitStatus=" + visitStatus
				+ ", isSolve=" + isSolve + ", isNeedVisit=" + isNeedVisit + ", isVisit=" + isVisit
				+ ", expectVisitTime=" + expectVisitTime + ", actualVisitTime=" + actualVisitTime + ", visitContent="
				+ visitContent + ", creatTime=" + creatTime + ", lastUpdateTime=" + lastUpdateTime + "]";
	}
	
}
