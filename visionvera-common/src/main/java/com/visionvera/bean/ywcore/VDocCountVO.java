package com.visionvera.bean.ywcore;

import java.io.Serializable;

public class VDocCountVO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;							//医生ID

    private String docName;						//医生名称

    private String hosId;						//医院ID

    private String depName;						//科室名称

    private String sex;							//医生性别。1:男, 2:女

    private String docLevel;					//医生等级。1：主任医师 2：副主任医师

    private String docDesc;						//医生简介

    private String devNo;						//终端号码

    private String recordTime;					//记录时间

	public VDocCountVO() {
	}

	public VDocCountVO(String id, String docName, String hosId, String depName, String sex, String docLevel,
			String docDesc, String devNo, String recordTime) {
		this.id = id;
		this.docName = docName;
		this.hosId = hosId;
		this.depName = depName;
		this.sex = sex;
		this.docLevel = docLevel;
		this.docDesc = docDesc;
		this.devNo = devNo;
		this.recordTime = recordTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getHosId() {
		return hosId;
	}

	public void setHosId(String hosId) {
		this.hosId = hosId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDocLevel() {
		return docLevel;
	}

	public void setDocLevel(String docLevel) {
		this.docLevel = docLevel;
	}

	public String getDocDesc() {
		return docDesc;
	}

	public void setDocDesc(String docDesc) {
		this.docDesc = docDesc;
	}

	public String getDevNo() {
		return devNo;
	}

	public void setDevNo(String devNo) {
		this.devNo = devNo;
	}

	public String getRecordTime() {
		return recordTime;
	}

	public void setRecordTime(String recordTime) {
		this.recordTime = recordTime;
	}
}
