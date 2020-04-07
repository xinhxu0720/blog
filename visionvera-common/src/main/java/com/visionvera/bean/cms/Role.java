/**   
 * @Title: Role.java 
 * @Package com.visionvera.cms.bean 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author zhaolei
 * @date 2016年8月12日 下午5:27:36 
 * @version V1.0   
 */
package com.visionvera.bean.cms;

import java.util.List;

/** 
 * @ClassName: Role 
 * @Description: TODO 用户角色实体 
 * @author zhaolei
 * @date 2016年8月12日 下午5:27:36 
 *  
 */
public class Role {
	private String uuid;  				// uuid
	private String name;  				//角色名称
	private Integer grade;				//角色级别
	private String description; 		//角色描述
	private List<String> functions;		//角色权限uuid集合
	
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
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getFunctions() {
		return functions;
	}
	public void setFunctions(List<String> functions) {
		this.functions = functions;
	}
	
	
}
