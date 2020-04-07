package com.visionvera.bean.cms;

import java.io.Serializable;

/**
 * 行业归属表
 *
 */
public class IndustryVO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String uuid;				//主键UUID
	private String name;				//行业归属名
	private String description;			//描述信息
	private String createTime;			//创建时间
	private String updateTime;			//最后一次修改时间
	
	public IndustryVO() {
	}

	public IndustryVO(String uuid, String name, String description, String createTime, String updateTime) {
		this.uuid = uuid;
		this.name = name;
		this.description = description;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
}
