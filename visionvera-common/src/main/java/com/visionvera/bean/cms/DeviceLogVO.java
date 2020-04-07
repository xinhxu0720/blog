package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/** 
 * <pre>项目名称：cmsweb    
 * 类名称：   DeviceLogVO
 * 类描述： 终端日志bean实例
 * 创建人：周逸芳  
 * 创建时间：2019年3月5日 下午5:55:27    
 * 修改人：周逸芳     
 * 修改时间：2019年3月5日 下午5:55:27    
 * 修改备注：       
 * @version </pre>    
 */
@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class DeviceLogVO {
	
	private String uuid; //唯一标识
	private String devid; //设备号码
	private String filename;//日志名称
	private String filesize;//文件总大小
	private String downloadsize;//已下载的文件大小
	private int filetype; //文件类型：1日志 2配置文件
	private String downstarttime;//下载开始时间
	private String downendtime;//下载结束时间
	private int downstate; //下载状态：0：未开始 1：正在获取  2：完成获取  3：获取失败
	private String savepath;//文件保存路径
	private int isAnalyze;//日志是否已分析 0是 1否
	
	
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getDevid() {
		return devid;
	}
	public void setDevid(String devid) {
		this.devid = devid;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getFilesize() {
		return filesize;
	}
	public void setFilesize(String filesize) {
		this.filesize = filesize;
	}
	public int getFiletype() {
		return filetype;
	}
	public void setFiletype(int filetype) {
		this.filetype = filetype;
	}
	public String getDownstarttime() {
		return downstarttime;
	}
	public void setDownstarttime(String downstarttime) {
		this.downstarttime = downstarttime;
	}
	public String getDownendtime() {
		return downendtime;
	}
	public void setDownendtime(String downendtime) {
		this.downendtime = downendtime;
	}
	public int getDownstate() {
		return downstate;
	}
	public void setDownstate(int downstate) {
		this.downstate = downstate;
	}
	public String getSavepath() {
		return savepath;
	}
	public void setSavepath(String savepath) {
		this.savepath = savepath;
	}
	public String getDownloadsize() {
		return downloadsize;
	}
	public void setDownloadsize(String downloadsize) {
		this.downloadsize = downloadsize;
	}
	public int getIsAnalyze() {
		return isAnalyze;
	}
	public void setIsAnalyze(int isAnalyze) {
		this.isAnalyze = isAnalyze;
	}
}
