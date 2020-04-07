package com.visionvera.bean.slweoms;

/**
 * 平台进程的关联表
 * @author dql714099655
 *
 */
public class TposProcessRelation {
	
	private Integer tposProcessId;	//平台进程id
	
	private String tposRegisterid;	//平台唯一标识

	public Integer getTposProcessId() {
		return tposProcessId;
	}

	public void setTposProcessId(Integer tposProcessId) {
		this.tposProcessId = tposProcessId;
	}

	public String getTposRegisterid() {
		return tposRegisterid;
	}

	public void setTposRegisterid(String tposRegisterid) {
		this.tposRegisterid = tposRegisterid;
	}
	
}
