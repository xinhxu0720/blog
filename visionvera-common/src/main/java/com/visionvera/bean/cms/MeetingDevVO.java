package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class MeetingDevVO {
	public MeetingDevVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private int id;
	private String name;
	private int devType;
	private int devRole;
	private int defaultVDecMode;
	private int videoDecMode;
	private int videoEncMode;
	private int autioEncMode;
	private int hFlux;
	private int cifFlux;
	private int audioFlux;
	private int wallNo;
	private int sifFlux;
	private String ip;
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getSifFlux() {
		return sifFlux;
	}
	public void setSifFlux(int sifFlux) {
		this.sifFlux = sifFlux;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDevType() {
		return devType;
	}
	public void setDevType(int devType) {
		this.devType = devType;
	}
	public int getDevRole() {
		return devRole;
	}
	public void setDevRole(int devRole) {
		this.devRole = devRole;
	}
	public int getDefaultVDecMode() {
		return defaultVDecMode;
	}
	public void setDefaultVDecMode(int defaultVDecMode) {
		this.defaultVDecMode = defaultVDecMode;
	}
	public int getVideoDecMode() {
		return videoDecMode;
	}
	public void setVideoDecMode(int videoDecMode) {
		this.videoDecMode = videoDecMode;
	}
	public int getVideoEncMode() {
		return videoEncMode;
	}
	public void setVideoEncMode(int videoEncMode) {
		this.videoEncMode = videoEncMode;
	}
	public int getAutioEncMode() {
		return autioEncMode;
	}
	public void setAutioEncMode(int autioEncMode) {
		this.autioEncMode = autioEncMode;
	}
	public int gethFlux() {
		return hFlux;
	}
	public void sethFlux(int hFlux) {
		this.hFlux = hFlux;
	}
	public int getCifFlux() {
		return cifFlux;
	}
	public void setCifFlux(int cifFlux) {
		this.cifFlux = cifFlux;
	}
	public int getAudioFlux() {
		return audioFlux;
	}
	public void setAudioFlux(int audioFlux) {
		this.audioFlux = audioFlux;
	}
	public int getWallNo() {
		return wallNo;
	}
	public void setWallNo(int wallNo) {
		this.wallNo = wallNo;
	}

	
	
}
