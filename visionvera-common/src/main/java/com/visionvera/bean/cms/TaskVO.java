package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class TaskVO {
	private String processId;             	//流程ID
	private String formId;             		//表单编号
	private String title;             		//表单标题
	private String id;             			//任务ID
	private String startUser;             	//发起人
	private String approveUser;            	//审批人
	private String comment;            		//处理意见
	private String name;                  	//任务名称
//	private String assignee;                //处理人
	private String createTime;              //创建时间
	private String endTime;              	//结束时间
	private Integer state;					//审批状态：1拒绝，2同意，3待审批，4已完成
	private Integer chooseNext;				//是否需要选择下一级审批人。1不需要，2需要
	private Integer editForm;				//是否有表单的编辑权限。0只能查看，1可以编辑申请表的“网络部填写”部分，2可以编辑总结表
	private Integer status;                 //预约表状态：1待审核  2已通过   3驳回   4开会  5停会
	private Integer todoFlag;               //是否为待办：0不是；1是
	
	
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
	public String getStartUser() {
		return startUser;
	}
	public void setStartUser(String startUser) {
		this.startUser = startUser;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public Integer getTodoFlag() {
		return todoFlag;
	}
	public void setTodoFlag(Integer todoFlag) {
		this.todoFlag = todoFlag;
	}
	
}
