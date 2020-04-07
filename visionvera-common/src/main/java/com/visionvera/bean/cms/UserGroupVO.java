package com.visionvera.bean.cms;

/**
 * @ClassName: UserGroupVO
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author xiechs
 * @date 2016年9月14日 下午1:26:56
 * 
 */
public class UserGroupVO {

	public UserGroupVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String uuid; 				//用户分组uuid
	private String name; 				//用户分组名称
	private String temporarily;			//是否临时创建用户分组。0-否；1-是；
	private String description;			//备注
	private String users;				//用户组包含的用户
	private String deviceGroups;		//用户组包含的设备组
	private String isLock;				//用户组是否被当前登录的用户锁定，"0"-否；1-是
	

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
	public String getTemporarily() {
		return temporarily;
	}
	public void setTemporarily(String temporarily) {
		this.temporarily = temporarily;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUsers() {
		return users;
	}
	public void setUsers(String users) {
		this.users = users;
	}
	public String getDeviceGroups() {
		return deviceGroups;
	}
	public void setDeviceGroups(String deviceGroups) {
		this.deviceGroups = deviceGroups;
	}
	public String getIsLock() {
		return isLock;
	}
	public void setIsLock(String isLock) {
		this.isLock = isLock;
	}

}
