package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class TaskFormVO {
	private String uuid ;                   //uuid
	private String processId;             	//流程ID
	private String formId;             		//表单编号
	private String name;             		//表单标题
	private String id;             			//任务ID
	private String creatorName;             	//发起人
	private String creatorId;             	//发起人
	private String approveUser;            	//审批人
	private String comment;            		//处理意见
	private String taskName;                  	//任务名称
//	private String assignee;                //处理人
	private String createTime;              //创建时间
	private String startTime;  				//开始时间
	private String endTime;              	//结束时间
	private Integer state;					//审批状态：1拒绝，2同意，3待审批，4已完成
	private Integer chooseNext;				//是否需要选择下一级审批人。1不需要，2需要
	private Integer editForm;				//是否有表单的编辑权限。0只能查看，1可以编辑申请表的“网络部填写”部分，2可以编辑总结表
	private Integer status;                 //预约状态 1-审批中，2、4、5-审批通过，3-未通过, 6-变更申请操作
	
	
	
	
	
	
	public String getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getCreatorName() {
		return creatorName;
	}
	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getProcessId() {
		return processId;
	}
	public void setProcessId(String processId) {
		this.processId = processId;
	}
	public String getFormId() {
		return formId;
	}
	public void setFormId(String formId) {
		this.formId = formId;
	}
	public String getApproveUser() {
		return approveUser;
	}
	public void setApproveUser(String approveUser) {
		this.approveUser = approveUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Integer getChooseNext() {
		return chooseNext;
	}
	public void setChooseNext(Integer chooseNext) {
		this.chooseNext = chooseNext;
	}
	public Integer getEditForm() {
		return editForm;
	}
	public void setEditForm(Integer editForm) {
		this.editForm = editForm;
	}
	
}
