package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class VolumeVO {
	private Integer  deviceId;              //设备号码
	private Integer type;                  //目标类型 ：1麦克风，2扬声器
	private Integer opt;                   //操作类型 ：1加，2减，3指定值
	private Integer data;                  //设定值0-100。如果act为增加或减少，则data为增加或减少的刻度；如 果act为设置指定值，则data为设置的指定值的大小
	
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getData() {
		return data;
	}
	public void setData(Integer data) {
		this.data = data;
	}
	public Integer getOpt() {
		return opt;
	}
	public void setOpt(Integer opt) {
		this.opt = opt;
	}
	public Integer getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(Integer deviceId) {
		this.deviceId = deviceId;
	}
	
}
