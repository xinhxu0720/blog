package com.visionvera.bean.base;

import java.io.Serializable;
import java.util.List;

public class ReturnData implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer errcode;//状态码；0表示成功，1表示失败
	private String errmsg;//提示信息
	private String access_token;//访问令牌
	private String sysBit;//系统类型，16或者64
	private Object data;//封装data数据
	
	public ReturnData() {
	}

	public ReturnData(Integer errcode, String errmsg, List<?> itemList, String access_token, Object data) {
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.access_token = access_token;
		this.data = data;
	}

	public Integer getErrcode() {
		return errcode;
	}

	public void setErrcode(Integer errcode) {
		this.errcode = errcode;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getSysBit() {
		return sysBit;
	}

	public void setSysBit(String string) {
		this.sysBit = string;
	}
}
