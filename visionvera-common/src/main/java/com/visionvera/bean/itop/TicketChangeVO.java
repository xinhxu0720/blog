package com.visionvera.bean.itop;

/**
 * 工单
 * @author cyq
 *
 */
public class TicketChangeVO {

	private Integer id;
	private String operationTime;
	private String userInfo;
	private Integer privOpId;
	private String objClass;
	private String objKey;
	private String attCode;
	private String oldValue;
	private String newValue;
	private String callerId;
	private String ticketId;
	
	
	public TicketChangeVO() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}
	public Integer getPirvOpid() {
		return privOpId;
	}
	public void setPirvOpid(Integer privOpId) {
		this.privOpId = privOpId;
	}
	public String getObjClass() {
		return objClass;
	}
	public void setObjClass(String objClass) {
		this.objClass = objClass;
	}
	public String getObjKey() {
		return objKey;
	}
	public void setObjKey(String objKey) {
		this.objKey = objKey;
	}
	public String getAttCode() {
		return attCode;
	}
	public void setAttCode(String attCode) {
		this.attCode = attCode;
	}
	public String getOldValue() {
		return oldValue;
	}
	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}
	public String getNewValue() {
		return newValue;
	}
	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}
	public Integer getPrivOpId() {
		return privOpId;
	}
	public void setPrivOpId(Integer privOpId) {
		this.privOpId = privOpId;
	}
	public String getCallerId() {
		return callerId;
	}
	public void setCallerId(String callerId) {
		this.callerId = callerId;
	}
	public String getTicketId() {
		return ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	public String getOperationTime() {
		return operationTime;
	}
	public void setOperationTime(String operationTime) {
		this.operationTime = operationTime;
	}
	
	
	
}
