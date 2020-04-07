package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class FileGradeVO {
	private String uuid;					//主键
	private String fileName;				//文件名称
	private Integer type;					//文件状态1回退2升级3无需更新4回退下载5升级下载6下载完成
	private String remark;					//文件新特性
	private String fileVersion;				//文件版本
	private String version;					//当前使用版本
	private Long fileSize;					//文件大小
	private String dependDesc;				//依赖项内容描述
	private String userId;					//当前正在下载的用户ID
	private String rand;                    //文件md5加密值
	
	
	
	public String getRand() {
		return rand;
	}
	public void setRand(String rand) {
		this.rand = rand;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getDependDesc() {
		return dependDesc;
	}
	public void setDependDesc(String dependDesc) {
		this.dependDesc = dependDesc;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getFileVersion() {
		return fileVersion;
	}
	public void setFileVersion(String fileVersion) {
		this.fileVersion = fileVersion;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Long getFileSize() {
		return fileSize;
	}
	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}
	
	
	
}

