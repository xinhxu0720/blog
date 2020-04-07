package com.visionvera.bean.alarm.thirdParty.slweoms;

public class PartitionInfo {
		
	private String Informatio; //硬盘信息
	private String usage; //使用率
	private String serverVolume;// 硬盘总大小 
	private String serverUsage;// 硬盘使用量
	
	
	
	public String getServerVolume() {
		return serverVolume;
	}
	public void setServerVolume(String serverVolume) {
		this.serverVolume = serverVolume;
	}
	public String getServerUsage() {
		return serverUsage;
	}
	public void setServerUsage(String serverUsage) {
		this.serverUsage = serverUsage;
	}
	public String getInformatio() {
		return Informatio;
	}
	public void setInformatio(String informatio) {
		Informatio = informatio;
	}
	public String getUsage() {
		return usage;
	}
	public void setUsage(String usage) {
		this.usage = usage;
	}
	@Override
	public String toString() {
		return "PartitionInfo [Informatio=" + Informatio + ", usage=" + usage + ", serverVolume=" + serverVolume + ", serverUsage=" + serverUsage + "]";
	}
	
}
