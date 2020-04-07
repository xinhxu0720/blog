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
public class ScheduleMsgVO {
	
	private String uuid;	    //主键uuid
	private String scheduleId;	//预约id
	private String message;	    //留言内容
	private String createTime;	//留言时间
	private String userId;	    //创建人ID
	private String userName;	//创建人
	private String imgUrl;	    //创建人头像url
	private Integer permitted;	//是否审批通过，0未通过，1通过
	private String meetings;
	
	public String getMeetings() {
		return meetings;
	}
	public void setMeetings(String meetings) {
		this.meetings = meetings;
	}
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
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Integer getPermitted() {
		return permitted;
	}
	public void setPermitted(Integer permitted) {
		this.permitted = permitted;
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
