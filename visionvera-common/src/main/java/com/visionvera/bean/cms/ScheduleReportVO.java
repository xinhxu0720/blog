/**   
 * @Title: RoleVO.java 
 * @Package com.visionvera.cms.bean 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author zhaolei
 * @date 2016年8月12日 下午5:27:24 
 * @version V1.0   
 */
package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/** 
 * @ClassName: MessageVO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author xiechengsuan
 * @date 2016年11月18日
 *  
 */
@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class ScheduleReportVO {
	
	private String uuid;	//主键uuid
	private String scheduleId;	//预约id
	private String devgroupId;	//设备分组ID
	private String devgroupName;	//设备分组名
	private String devId;	//设备ID
	private String devName;	//设备名称
	private String resUrl;	//图片、视频路径
	private String status;	//设备状态，多个值用逗号分割
	private String other;	//“其它”的内容
	private String createTime;	//上报的时间
	private String userId;	//创建人ID
	private String userName;	//创建人
	private String imgUrl;	//创建人头像url
	
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getDevgroupId() {
		return devgroupId;
	}
	public void setDevgroupId(String devgroupId) {
		this.devgroupId = devgroupId;
	}
	public String getDevId() {
		return devId;
	}
	public void setDevId(String devId) {
		this.devId = devId;
	}
	public String getResUrl() {
		return resUrl;
	}
	public void setResUrl(String resUrl) {
		this.resUrl = resUrl;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
	public String getDevgroupName() {
		return devgroupName;
	}
	public void setDevgroupName(String devgroupName) {
		this.devgroupName = devgroupName;
	}
	public String getDevName() {
		return devName;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
}
