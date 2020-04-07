package com.visionvera.bean.cms;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/** 
 * <pre>项目名称：cmsweb    
 * 类名称：LogKeyValueVO   
 * 类描述： 日志分析参数bean实例
 * 创建人：周逸芳  
 * 创建时间：2019年6月3日 下午5:55:27    
 * 修改人：周逸芳     
 * 修改时间：2019年6月3日 下午5:55:27        
 * 修改备注：       
 * @version </pre>    
 */
@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class LogKeyValueVO {
	
	private String uuid;
	private Integer deviceType;
	private String logKey;
	private String logValue;
	
	

	public Integer getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(Integer deviceType) {
		this.deviceType = deviceType;
	}
	public String getLogKey() {
		return logKey;
	}
	public void setLogKey(String logKey) {
		this.logKey = logKey;
	}
	public String getLogValue() {
		return logValue;
	}
	public void setLogValue(String logValue) {
		this.logValue = logValue;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
	
}
