package com.visionvera.bean.cms;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class InformVO {
	
	public InformVO() {
		super();
	}
	private String informTitle;//通知消息  会议标题
	private String informCreatorId;//通知发送方(用户)创建预约的用户
	private String informContact; //通知发送方联系方式 手机号码
	private String informContent;//通知内容   通知来源区域id （主席地区id）+未定+会议名称（手机端）
	private Integer informType;//  会管默认为1  会议
	private Integer informDetailType;//通知细节类型：当type为1时此字段( 1.帕米尔预约2.会管预约.3手机端预约4其他) 当type为2时此字段(1:其他)
	private Integer informStatus;//通知状态:1预约中，2审批通过，3审批驳回4:其他
	private Date informCreateTime;//通知创建时间
	private Integer informRank;//会议级别
	private String registerId;//唯一标识（由运维平台提供）做成可配
	private Date informStartTime;//预约开会时间
	private Date informEndTime;//预约结束时间
	private String coordinateLng;//设备经度
	private String coordinateLat;//设备纬度
	private String informRegionbids;//通知来源区域id （主席所在地区id）
	private String informSource;//主席地址
	private String processId;//流程ID
	public String getProcessId() {
		return processId;
	}
	public void setProcessId(String processId) {
		this.processId = processId;
	}
	public String getInformTitle() {
		return informTitle;
	}
	public void setInformTitle(String informTitle) {
		this.informTitle = informTitle;
	}
	public String getInformCreatorId() {
		return informCreatorId;
	}
	public void setInformCreatorId(String informCreatorId) {
		this.informCreatorId = informCreatorId;
	}
	public String getInformContact() {
		return informContact;
	}
	public void setInformContact(String informContact) {
		this.informContact = informContact;
	}
	public String getInformContent() {
		return informContent;
	}
	public void setInformContent(String informContent) {
		this.informContent = informContent;
	}
	public Integer getInformType() {
		return informType;
	}
	public void setInformType(Integer informType) {
		this.informType = informType;
	}
	public Integer getInformDetailType() {
		return informDetailType;
	}
	public void setInformDetailType(Integer informDetailType) {
		this.informDetailType = informDetailType;
	}
	public Integer getInformStatus() {
		return informStatus;
	}
	public void setInformStatus(Integer informStatus) {
		this.informStatus = informStatus;
	}
	public Date getInformCreateTime() {
		return informCreateTime;
	}
	public void setInformCreateTime(Date informCreateTime) {
		this.informCreateTime = informCreateTime;
	}
	public Integer getInformRank() {
		return informRank;
	}
	public void setInformRank(Integer informRank) {
		this.informRank = informRank;
	}
	public String getRegisterId() {
		return registerId;
	}
	public void setRegisterId(String registerId) {
		this.registerId = registerId;
	}
	public Date getInformStartTime() {
		return informStartTime;
	}
	public void setInformStartTime(Date informStartTime) {
		this.informStartTime = informStartTime;
	}
	public Date getInformEndTime() {
		return informEndTime;
	}
	public void setInformEndTime(Date informEndTime) {
		this.informEndTime = informEndTime;
	}
	public String getCoordinateLng() {
		return coordinateLng;
	}
	public void setCoordinateLng(String coordinateLng) {
		this.coordinateLng = coordinateLng;
	}
	public String getCoordinateLat() {
		return coordinateLat;
	}
	public void setCoordinateLat(String coordinateLat) {
		this.coordinateLat = coordinateLat;
	}
	public String getInformRegionbids() {
		return informRegionbids;
	}
	public void setInformRegionbids(String informRegionbids) {
		this.informRegionbids = informRegionbids;
	}
	public String getInformSource() {
		return informSource;
	}
	public void setInformSource(String informSource) {
		this.informSource = informSource;
	}
	
	
}
