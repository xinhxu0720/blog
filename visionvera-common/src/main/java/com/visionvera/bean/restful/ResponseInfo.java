package com.visionvera.bean.restful;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * 自定义webservice错误返回信息
 * @author xiechengsuan
 * 创建日期 2016.11.10
 */
/*@XmlRootElement(name = "result")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
@XmlSeeAlso({DataInfo.class}) */ 
public class ResponseInfo<T> {
	private int errcode;
	private String errmsg;
	private String access_token;
	private T data;

	public int getErrcode() {
		return errcode;
	}
	public void setErrcode(int errcode) {
		this.errcode = errcode;
	}
	public String getErrmsg() {
		return errmsg;
	}
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
}
