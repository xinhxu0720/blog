package com.visionvera.bean.log;

import java.util.List;
import java.util.Map;


/**
 *  Class Name: BusinessVO.java
 *  Description: 会管上报操作日志至RabbitMQ数据实体类
 *  @author ==zyf==
 *  @date 2019年10月21日 下午2:29:47   
 *  @version 1.0
 */
public class BusinessVO {
	
	public BusinessVO() {
		super();
	}
	
	private String platId;  //必填。平台唯一ID，各平台自己生成UUID，一经生成不可改变
	private String platType;   //必填。平台类型，由安全管理中心统一定义
    private List<Map<String,Object>> items;  //map为向MQ发送的一条条日志
    
    
	public String getPlatId() {
		return platId;
	}
	public void setPlatId(String platId) {
		this.platId = platId;
	}
	public String getPlatType() {
		return platType;
	}
	public void setPlatType(String platType) {
		this.platType = platType;
	}
	public List<Map<String, Object>> getItems() {
		return items;
	}
	public void setItems(List<Map<String, Object>> items) {
		this.items = items;
	}
    
    
}
