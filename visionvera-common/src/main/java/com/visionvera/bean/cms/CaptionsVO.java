 package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class CaptionsVO {
	private Integer deviceId;    //设备号码
	private Integer pos;        //显示位置
	private Integer size;       //大小
	private boolean backGround; //是否透明
	private String osd;      //字幕内容
	private boolean sendAll; //发送所有终端
	private Integer remainTime; //显示时间 （秒），16位值为65535时一直显示  ，64位值为0时一直显示
	private Integer length;  //字幕长度
	private Integer type; //字幕类型(0:会中显示字幕，1：退会后显示字幕)
	private Integer sendToAll ;//是否发送所有终端（0给制定终端发送 1给所有终端发送）

	public Integer getSendToAll() {
		return sendToAll;
	}

	public void setSendToAll(Integer sendToAll) {
		this.sendToAll = sendToAll;
	}

	public Integer getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(Integer deviceId) {
		this.deviceId = deviceId;
	}
	public Integer getPos() {
		return pos;
	}
	public void setPos(Integer pos) {
		this.pos = pos;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public boolean isBackGround() {
		return backGround;
	}
	public void setBackGround(boolean backGround) {
		this.backGround = backGround;
	}
	public String getOsd() {
		return osd;
	}
	public void setOsd(String osd) {
		this.osd = osd;
	}
	public boolean isSendAll() {
		return sendAll;
	}
	public void setSendAll(boolean sendAll) {
		this.sendAll = sendAll;
	}
	public Integer getRemainTime() {
		return remainTime;
	}
	public void setRemainTime(Integer remainTime) {
		this.remainTime = remainTime;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	
}
