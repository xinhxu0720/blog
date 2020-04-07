package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class ConferenceVO {
	
	public ConferenceVO() {
		super();
	}
	private Integer businessType;//统计类型
	private Integer totalCount;//统计总数
	private Integer  auxiliaryCount;//实际数量
	public Integer getBusinessType() {
		return businessType;
	}
	public void setBusinessType(Integer businessType) {
		this.businessType = businessType;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getAuxiliaryCount() {
		return auxiliaryCount;
	}
	public void setAuxiliaryCount(Integer auxiliaryCount) {
		this.auxiliaryCount = auxiliaryCount;
	}
	
	
}
