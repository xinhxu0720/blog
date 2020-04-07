package com.visionvera.bean.ywcore;

import com.visionvera.bean.base.BaseTimeEntity;

/**
 * 视联头条实体类
 * @author Bianjf
 *
 */
public class HeadlinesVO extends BaseTimeEntity {
	private static final long serialVersionUID = 1L;

	private String uuid;									//主键UUID
	
	private String newsName;								//头条名称
	
	private String newsLevel;								//新闻级别， 对应1、2、3、4、5
	
	private String regionId;								//行政区域ID(地址)
	
	private String reportUserId;							//上报人员用户ID
	
	private String reportUserName;							//上报人员用户名称
	
	private String securityPersonnel;						//安保人员
	
	private String remarks;									//备注信息
	
	private String startTime;								//开始时间
	
	private String endTime;									//结束时间
	
	private String createTime;								//创建时间
	
	private String updateTime;								//最后一次更新时间
	
	private String isTop;									//是否置顶。0表示不是置顶，1表示是置顶
	
	private Integer topCount;								//置顶的Count
	
	private String ext1;									//扩展字段1
	
	private String ext2;									//扩展字段2
	
	private String ext3;									//扩展字段3
	
	/** 以下是扩展字段 */
	private String regionName;								//行政区域名称，对应前端的地址
	
	private String dateTime;								//日期
	
	private String beginQueryTime;							//开始查询时间
	
	private String finishQueryTime;							//结束查询时间

	public HeadlinesVO() {
	}

	public HeadlinesVO(String uuid, String newsName, String newsLevel, String regionId, String reportUserId,
			String reportUserName, String securityPersonnel, String remarks, String startTime, String endTime,
			String createTime, String updateTime, String isTop, Integer topCount, String ext1, String ext2, String ext3,
			String regionName) {
		this.uuid = uuid;
		this.newsName = newsName;
		this.newsLevel = newsLevel;
		this.regionId = regionId;
		this.reportUserId = reportUserId;
		this.reportUserName = reportUserName;
		this.securityPersonnel = securityPersonnel;
		this.remarks = remarks;
		this.startTime = startTime;
		this.endTime = endTime;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.isTop = isTop;
		this.topCount = topCount;
		this.ext1 = ext1;
		this.ext2 = ext2;
		this.ext3 = ext3;
		this.regionName = regionName;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getNewsName() {
		return newsName;
	}

	public void setNewsName(String newsName) {
		this.newsName = newsName;
	}

	public String getNewsLevel() {
		return newsLevel;
	}

	public void setNewsLevel(String newsLevel) {
		this.newsLevel = newsLevel;
	}

	public String getRegionId() {
		return regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getReportUserId() {
		return reportUserId;
	}

	public void setReportUserId(String reportUserId) {
		this.reportUserId = reportUserId;
	}

	public String getReportUserName() {
		return reportUserName;
	}

	public void setReportUserName(String reportUserName) {
		this.reportUserName = reportUserName;
	}

	public String getSecurityPersonnel() {
		return securityPersonnel;
	}

	public void setSecurityPersonnel(String securityPersonnel) {
		this.securityPersonnel = securityPersonnel;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getIsTop() {
		return isTop;
	}

	public void setIsTop(String isTop) {
		this.isTop = isTop;
	}

	public Integer getTopCount() {
		return topCount;
	}

	public void setTopCount(Integer topCount) {
		this.topCount = topCount;
	}

	public String getExt1() {
		return ext1;
	}

	public void setExt1(String ext1) {
		this.ext1 = ext1;
	}

	public String getExt2() {
		return ext2;
	}

	public void setExt2(String ext2) {
		this.ext2 = ext2;
	}

	public String getExt3() {
		return ext3;
	}

	public void setExt3(String ext3) {
		this.ext3 = ext3;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getBeginQueryTime() {
		return beginQueryTime;
	}

	public void setBeginQueryTime(String beginQueryTime) {
		this.beginQueryTime = beginQueryTime;
	}

	public String getFinishQueryTime() {
		return finishQueryTime;
	}

	public void setFinishQueryTime(String finishQueryTime) {
		this.finishQueryTime = finishQueryTime;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
}
