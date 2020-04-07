package com.visionvera.bean.base;

import java.io.Serializable;

public class BaseTimeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/** 以下是非持久化属性 */
    private String startCreateTime;//开始创建时间(查询条件)
    
    private String endCreateTime;//结束创建时间(查询条件)
    
    private String startUpdateTime;//开始修改时间(查询条件)
    
    private String endUpdateTime;//结束修改时间(查询条件)

	public BaseTimeEntity() {
	}

	public BaseTimeEntity(String startCreateTime, String endCreateTime, String startUpdateTime, String endUpdateTime) {
		this.startCreateTime = startCreateTime;
		this.endCreateTime = endCreateTime;
		this.startUpdateTime = startUpdateTime;
		this.endUpdateTime = endUpdateTime;
	}

	public String getStartCreateTime() {
		return startCreateTime;
	}

	public void setStartCreateTime(String startCreateTime) {
		this.startCreateTime = startCreateTime;
	}

	public String getEndCreateTime() {
		return endCreateTime;
	}

	public void setEndCreateTime(String endCreateTime) {
		this.endCreateTime = endCreateTime;
	}

	public String getStartUpdateTime() {
		return startUpdateTime;
	}

	public void setStartUpdateTime(String startUpdateTime) {
		this.startUpdateTime = startUpdateTime;
	}

	public String getEndUpdateTime() {
		return endUpdateTime;
	}

	public void setEndUpdateTime(String endUpdateTime) {
		this.endUpdateTime = endUpdateTime;
	}
}
