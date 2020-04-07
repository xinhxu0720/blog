package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class FileVO {
	private String uuid;					//主键
	private String version;             	//版本号
	private String name;                    //文件名
	private Long size;                    	//文件大小
	private Integer type;					//文件类型。 0 增量包；1完整包
	private Integer force;				    //是否强制升级。 0 是；1否
	private String createTime;				//创建时间
	private String creator;					//创建人
	private String updateMsg;      			//应用更新信息
	private String lastUpdateTime; 			//最终更新应用时间
	private Long timeDiff;				    //当前时间与最终更新时间的时间差
	private String downLoadUrl;             //文件下载路径
	private Integer applyFlag;					//应用分类 1pamir 2手机控会
	private Integer spVersion;                  //此版本是否为特殊版本 0否 1是
	
	/**
	 * 用于下载唯一key
	 */
	private String downloadKey;
	/***
	 * 应用下载地址
	 */
	private String appDownloadPath;
	/***
	 * 应用包md5签名
	 */
	private String appMd5;
	/***
	 * 更新状态，默认0，0无更新，1有更新，2建议更新，3强制更新。一个app中最多只有一个版本的状态大于0
	 */
	private Integer updateType;
	/***
	 * 分类名称
	 */
	private String categoryName;

	
	
	
	
	public void setSize(Long size) {
		this.size = size;
	}
	public String getDownLoadUrl() {
		return downLoadUrl;
	}
	public void setDownLoadUrl(String downLoadUrl) {
		this.downLoadUrl = downLoadUrl;
	}
	public Long getTimeDiff() {
		return timeDiff;
	}
	public void setTimeDiff(Long timeDiff) {
		this.timeDiff = timeDiff;
	}
	public String getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public String getUpdateMsg() {
		return updateMsg;
	}
	public void setUpdateMsg(String updateMsg) {
		this.updateMsg = updateMsg;
	}
	public String getDownloadKey() {
		return downloadKey;
	}
	public void setDownloadKey(String downloadKey) {
		this.downloadKey = downloadKey;
	}
	public String getAppDownloadPath() {
		return appDownloadPath;
	}
	public void setAppDownloadPath(String appDownloadPath) {
		this.appDownloadPath = appDownloadPath;
	}
	public String getAppMd5() {
		return appMd5;
	}
	public void setAppMd5(String appMd5) {
		this.appMd5 = appMd5;
	}
	public Integer getUpdateType() {
		return updateType;
	}
	public void setUpdateType(Integer updateType) {
		this.updateType = updateType;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getSize() {
		return size;
	}
	public void setSize(long l) {
		this.size = l;
	}
	public Integer getForce() {
		return force;
	}
	public void setForce(Integer force) {
		this.force = force;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public Integer getApplyFlag() {
		return applyFlag;
	}
	public void setApplyFlag(Integer applyFlag) {
		this.applyFlag = applyFlag;
	}
	public Integer getSpVersion() {
		return spVersion;
	}
	public void setSpVersion(Integer spVersion) {
		this.spVersion = spVersion;
	}
	
	
}
