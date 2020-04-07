package com.visionvera.bean.datacore;

import java.io.Serializable;

/**
 * 平台资源信息
 * @author dql
 *
 */
public class PlatformResourceVO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;	//主键id
	private String devName;	//平台资源名称
	private String url;	//平台资源地址
	private Integer devType;   //平台类别
	private String platformName;  	//平台名称
	private String createid;	//创建人
	private String createName;	//创建人姓名
	private String createtime;	//创建时间
	private String updateid;	//修改人
	private String updateName;	//修改人姓名
	private String updatetime;	//更新时间
	private String isDefault;//是否是默认平台。0表示不是默认平台；1表示是默认平台
    private String isDelete;//前端是否允许删除。0表示允许删除；1表示不允许删除
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getDevName() {
		return devName;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public Integer getDevType() {
		return devType;
	}
	public void setDevType(Integer devType) {
		this.devType = devType;
	}
	
	public String getPlatformName() {
		return platformName;
	}
	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}
	
	public String getCreateid() {
		return createid;
	}
	public void setCreateid(String createid) {
		this.createid = createid;
	}
	
	public String getCreateName() {
		return createName;
	}
	public void setCreateName(String createName) {
		this.createName = createName;
	}
	
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	
	public String getUpdateid() {
		return updateid;
	}
	public void setUpdateid(String updateid) {
		this.updateid = updateid;
	}
	
	public String getUpdateName() {
		return updateName;
	}
	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}
	
	public String getUpdatetime() {
		return updatetime;
	}
	
	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}
	
	public String getIsDefault() {
		return isDefault;
	}
	
	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}
	
	public String getIsDelete() {
		return isDelete;
	}
	
	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}
}
