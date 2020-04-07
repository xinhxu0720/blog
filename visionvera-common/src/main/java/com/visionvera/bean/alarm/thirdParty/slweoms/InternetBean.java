package com.visionvera.bean.alarm.thirdParty.slweoms;

public class InternetBean {
	private String IP;//网口Ip
	private String upstream;//上行数据
	private String downriver;//下行数据
	
	
	public String getIP() {
		return IP;
	}
	public void setIP(String iP) {
		IP = iP;
	}
	public String getUpstream() {
		return upstream;
	}
	public void setUpstream(String upstream) {
		this.upstream = upstream;
	}
	public String getDownriver() {
		return downriver;
	}
	public void setDownriver(String downriver) {
		this.downriver = downriver;
	}
	@Override
	public String toString() {
		return "InternetBean [IP=" + IP + ", upstream=" + upstream + ", downriver=" + downriver + "]";
	}

	
}
