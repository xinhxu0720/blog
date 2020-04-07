package com.visionvera.bean.datacore;

import java.io.Serializable;
import java.util.List;

import com.visionvera.bean.base.BaseTimeEntity;

/**
 * 角色表
 *
 */
public class TRoleVO extends BaseTimeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private String uuid;//主键UUID

    private String roleName;//角色名

    private String description;//描述

    private String createTime;//创建时间

    private String updateTime;//最后一次更新时间
    
    private String createName;//创建人
    
    private String platformId;//平台ID
    
    private String permissionId;//权限ID
    
    private String isDefault;//是否是默认角色。0表示不是默认角色；1表示是默认角色
    
    private String isDelete;//前端是否允许删除。0表示允许删除；1表示不允许删除
    
    private List<TApplicationdevicebVO> platformList;//平台列表
    
    private List<TPermissionVO> permissionList;//权限列表

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

	public String getPlatformId() {
		return platformId;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	public String getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(String permissionId) {
		this.permissionId = permissionId;
	}

	public List<TApplicationdevicebVO> getPlatformList() {
		return platformList;
	}

	public void setPlatformList(List<TApplicationdevicebVO> platformList) {
		this.platformList = platformList;
	}

	public List<TPermissionVO> getPermissionList() {
		return permissionList;
	}

	public void setPermissionList(List<TPermissionVO> permissionList) {
		this.permissionList = permissionList;
	}

	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public String getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}
}