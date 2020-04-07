package com.visionvera.bean.cms;

/** 
 * @ClassName: MeetRecordVO 
 * @Description: TODO 用户角色实体 
 * @author xiechs
 * @date 2016年12月8日 
 *  
 */
public class MeetRecordVO {
	private String uuid;  		        //主键
	private String scheduleId;  		//会议ID
	private String scheduleName;  		//会议名称
	private String creatorId;  		    //记录人ID
	private String creatorName;  		//记录人名称
	private String record;  		    //记录内容
	private String type;  		        //记录类型
	private String createTime; 		    //记录时间
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
	public String getScheduleName() {
		return scheduleName;
	}
	public void setScheduleName(String scheduleName) {
		this.scheduleName = scheduleName;
	}
	public String getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}
	public String getCreatorName() {
		return creatorName;
	}
	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}
	public String getRecord() {
		return record;
	}
	public void setRecord(String record) {
		this.record = record;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
}
