package com.visionvera.bean.ywcore;

import java.io.Serializable;

/**
 * 视联网医院数据总览表实体类
 *
 */
public class VHosCountVO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;						//医院ID		

    private String regionId;				//行政区域ID

    private String hosName;					//医院名称

    private String hosLevel;				//医院等级ID

    private String hosLevelName;			//医院等级名称

    private String terCount;				//终端总数

    private String svrCount;				//服务器总数

    private String docCount;				//医生总数

    private String recordTime;				//记录时间

	public VHosCountVO() {
	}

	public VHosCountVO(String id, String regionId, String hosName, String hosLevel, String hosLevelName,
			String terCount, String svrCount, String docCount, String recordTime) {
		this.id = id;
		this.regionId = regionId;
		this.hosName = hosName;
		this.hosLevel = hosLevel;
		this.hosLevelName = hosLevelName;
		this.terCount = terCount;
		this.svrCount = svrCount;
		this.docCount = docCount;
		this.recordTime = recordTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRegionId() {
		return regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getHosName() {
		return hosName;
	}

	public void setHosName(String hosName) {
		this.hosName = hosName;
	}

	public String getHosLevel() {
		return hosLevel;
	}

	public void setHosLevel(String hosLevel) {
		this.hosLevel = hosLevel;
	}

	public String getHosLevelName() {
		return hosLevelName;
	}

	public void setHosLevelName(String hosLevelName) {
		this.hosLevelName = hosLevelName;
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

	public String getDocCount() {
		return docCount;
	}

	public void setDocCount(String docCount) {
		this.docCount = docCount;
	}

	public String getRecordTime() {
		return recordTime;
	}

	public void setRecordTime(String recordTime) {
		this.recordTime = recordTime;
	}
}
