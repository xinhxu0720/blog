package com.visionvera.bean.nms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/** 
 * <pre>项目名称：    
 * 类名称：wgDwfbLoginVO    
 * 类描述： 网管点位分布登录bean实例 
 * 创建人：王思萌
 * 创建时间：2018年6月4日
 * 修改备注：       
 * @version </pre>    
 */
@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class NMSDwfbLoginVO {
	
	public NMSDwfbLoginVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private String userid;//用户id
	private String userpwd;//用户密码   
	
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	

	
}
