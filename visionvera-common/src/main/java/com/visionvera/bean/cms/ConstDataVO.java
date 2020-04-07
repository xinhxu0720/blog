package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class ConstDataVO {
	private String constId;
	private String display;
	private String value;
	private Integer valueType;
	private String empPost;
	
	
	public String getEmpPost() {
		return empPost;
	}

	public void setEmpPost(String empPost) {
		this.empPost = empPost;
	}

	public String getConstId() {
		return constId;
	}

	public void setConstId(String constId) {
		this.constId = constId;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Integer getValueType() {
		return valueType;
	}

	public void setValueType(Integer valueType) {
		this.valueType = valueType;
	}

	public ConstDataVO() {
		super();
	}

}
