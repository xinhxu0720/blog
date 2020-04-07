package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/** 
 * <pre>项目名称：cmsweb    
 * 类名称：EmployeeVO    
 * 类描述：    OA端员工信息
 * 创建人：周逸芳1981769658@qq.com    
 * 创建时间：2017年5月10日 下午1:45:00    
 * 修改人：周逸芳1981769658@qq.com      
 * 修改时间：2017年5月10日 下午1:45:00    
 * 修改备注：       
 * @version </pre>    
 */
@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class EmployeeVO {
	
	private String id;  //员工id
	
	private String updateTime; //信息更新时间
	
	private String name; //员工姓名
	
	private String phoneNumber; //员工手机号
	
 	private String empPost; //员工岗位职级
 	
	private String empUnit; //员工所属部门
	
	private String areaId; //员工所属行政区域
	
	
	
	
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	public String getEmpUnit() {
		return empUnit;
	}
	public void setEmpUnit(String empUnit) {
		this.empUnit = empUnit;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmpPost() {
		return empPost;
	}
	public void setEmpPost(String empPost) {
		this.empPost = empPost;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	
}
