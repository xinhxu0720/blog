package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @ClassName: UserApproveVO 待审批用户列表
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author xiechs
 * @date 2016年12月9日
 * 
 */
@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class UserApproveVO {

	private String uuid; 				//用户uuid
	private String imgUrl; 				//用户头像url
	
	private String name; 				//用户名称
	private String newName;             //用户新名称   
	
	private String orgId;               //工作单位编号
	private String orgName;             //工作单位名称
	private String newOrgId;            //申请变更的工作单位编号
	private String newOrgName;          //申请变更的用户工作单位名称
	
	private String areaId;              //所在区域ID
	private String areaName;            //所在区域名称
	private String newAreaId;           //申请变更的所在区域ID
	private String newAreaName;         //申请变更的所在区域名称
	
	private String departId;            //部门ID
	private String departName;          //所在部门名称
	private String newDepartId;         //申请变更的部门ID
	private String newDepartName;       //申请变更的工作部门名称
	
	private String roleId;              //用户当前角色ID
	private String roleName;            //用户当前角色名称
	private String newRoleId;           //申请变更的角色ID
	private String newRoleName;         //申请变更的角色名称
	
	private String operatorId;          //操作人ID（webservice调用时须传递该参数）
	private Integer roleType;           //角色类型。0普通用户，1管理员
	private Integer editType;           //用户修改操作的类型。1审核（注册、申请成为管理员），2修改审批（修改用户基本信息）
	private Integer isvalid;            //webservice专用，判断注册的用户是否生效（0无效，1有效）

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

	public String getNewName() {
		return newName;
	}

	public void setNewName(String newName) {
		this.newName = newName;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getNewOrgId() {
		return newOrgId;
	}

	public void setNewOrgId(String newOrgId) {
		this.newOrgId = newOrgId;
	}

	public String getNewOrgName() {
		return newOrgName;
	}

	public void setNewOrgName(String newOrgName) {
		this.newOrgName = newOrgName;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getNewAreaId() {
		return newAreaId;
	}

	public void setNewAreaId(String newAreaId) {
		this.newAreaId = newAreaId;
	}

	public String getNewAreaName() {
		return newAreaName;
	}

	public void setNewAreaName(String newAreaName) {
		this.newAreaName = newAreaName;
	}

	public String getDepartId() {
		return departId;
	}

	public void setDepartId(String departId) {
		this.departId = departId;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public String getNewDepartId() {
		return newDepartId;
	}

	public void setNewDepartId(String newDepartId) {
		this.newDepartId = newDepartId;
	}

	public String getNewDepartName() {
		return newDepartName;
	}

	public void setNewDepartName(String newDepartName) {
		this.newDepartName = newDepartName;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getNewRoleId() {
		return newRoleId;
	}

	public void setNewRoleId(String newRoleId) {
		this.newRoleId = newRoleId;
	}

	public String getNewRoleName() {
		return newRoleName;
	}

	public void setNewRoleName(String newRoleName) {
		this.newRoleName = newRoleName;
	}

	public Integer getEditType() {
		return editType;
	}

	public void setEditType(Integer editType) {
		this.editType = editType;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public Integer getRoleType() {
		return roleType;
	}

	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
	}

	public Integer getIsvalid() {
		return isvalid;
	}

	public void setIsvalid(Integer isvalid) {
		this.isvalid = isvalid;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
}
