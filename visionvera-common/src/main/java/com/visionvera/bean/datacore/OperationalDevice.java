package com.visionvera.bean.datacore;

import java.io.Serializable;

/**
 * 操作(关闭/重启)终端参数
 * @author Bianjf
 *
 */
public class OperationalDevice implements Serializable {
	private static final long serialVersionUID = 1L;

	private String userid;						//用户ID
	
	private String pwd;							//密码
	
	private String zoneno;						//终端区号
	
	private String devno;						//终端五位号码
	
	private String zonedevno;					//终端对应的8位号码
	
	private String type;						//操作类型。1表示重启终端，2表示关闭终端

	public OperationalDevice() {
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getZoneno() {
		return zoneno;
	}

	public void setZoneno(String zoneno) {
		this.zoneno = zoneno;
	}

	public String getDevno() {
		return devno;
	}

	public void setDevno(String devno) {
		this.devno = devno;
	}

	public String getZonedevno() {
		return zonedevno;
	}

	public void setZonedevno(String zonedevno) {
		this.zonedevno = zonedevno;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
