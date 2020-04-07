package com.visionvera.bean.slweoms;

import java.util.Date;

/**
 * 平台类型
 * @author dql
 *
 */
public class PlatformTypeVO {
	private String platformName;    //平台名称
	private Integer platformType;	//平台类型编码
	private String abbreviation;   //平台类型简称
	private Date createTime;
	private Date modifyTime;
	
	public String getPlatformName() {
		return platformName;
	}
	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}
	
	public Integer getPlatformType() {
		return platformType;
	}
	public void setPlatformType(Integer platformType) {
		this.platformType = platformType;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	
}
