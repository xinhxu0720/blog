package com.visionvera.bean.ywcore;

import java.io.Serializable;

/**
 * 视联网医疗数据总览表实体类
 *
 */
public class VHospitalCountChangeVO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String regionId;						//行政区域ID

    private String pid;								//行政区域父ID

    private String gradeId;							//行政等级ID
    
    private String terCount;						//终端总数

    private String svrCount;						//服务器总数

    private String hosCount;						//医院总数

    private String docCount;						//医生总数

    private String terDay;							//终端日增长量

    private String terWeek;							//终端周增长量

    private String terMonth;						//终端月增长量

    private String recordTime;						//记录时间
    
    
    /** 非持久化字段 */
    private String regionName;						//区域名称

	public VHospitalCountChangeVO() {
	}

	public VHospitalCountChangeVO(String regionId, String pid, String gradeId, String terCount, String svrCount,
			String hosCount, String docCount, String terDay, String terWeek, String terMonth, String recordTime,
			String regionName) {
		this.regionId = regionId;
		this.pid = pid;
		this.gradeId = gradeId;
		this.terCount = terCount;
		this.svrCount = svrCount;
		this.hosCount = hosCount;
		this.docCount = docCount;
		this.terDay = terDay;
		this.terWeek = terWeek;
		this.terMonth = terMonth;
		this.recordTime = recordTime;
		this.regionName = regionName;
	}

	public String getRegionId() {
		return regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getGradeId() {
		return gradeId;
	}

	public void setGradeId(String gradeId) {
		this.gradeId = gradeId;
	}

	public String getTerCount() {
		return terCount;
	}

	public void setTerCount(String terCount) {
		this.terCount = terCount;
	}

	public String getSvrCount() {
		return svrCount;
	}

	public void setSvrCount(String svrCount) {
		this.svrCount = svrCount;
	}

	public String getHosCount() {
		return hosCount;
	}

	public void setHosCount(String hosCount) {
		this.hosCount = hosCount;
	}

	public String getDocCount() {
		return docCount;
	}

	public void setDocCount(String docCount) {
		this.docCount = docCount;
	}

	public String getTerDay() {
		return terDay;
	}

	public void setTerDay(String terDay) {
		this.terDay = terDay;
	}

	public String getTerWeek() {
		return terWeek;
	}

	public void setTerWeek(String terWeek) {
		this.terWeek = terWeek;
	}

	public String getTerMonth() {
		return terMonth;
	}

	public void setTerMonth(String terMonth) {
		this.terMonth = terMonth;
	}

	public String getRecordTime() {
		return recordTime;
	}

	public void setRecordTime(String recordTime) {
		this.recordTime = recordTime;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
}
