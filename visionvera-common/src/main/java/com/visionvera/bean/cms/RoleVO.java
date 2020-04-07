/**   
 * @Title: RoleVO.java 
 * @Package com.visionvera.cms.bean 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author zhaolei
 * @date 2016年8月12日 下午5:27:24 
 * @version V1.0   
 */
package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/** 
 * @ClassName: RoleVO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author zhaolei
 * @date 2016年8月12日 下午5:27:24 
 *  
 */
@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class RoleVO {
	private String uuid;	//角色uuid
	
	
	public String getUuid() {
		return uuid;
	}


	public void setUuid(String uuid) {
		this.uuid = uuid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	private String name;	//角色名称
}
