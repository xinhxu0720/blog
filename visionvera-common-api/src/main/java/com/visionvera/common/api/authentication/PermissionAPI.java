package com.visionvera.common.api.authentication;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.visionvera.bean.base.ReturnData;

@RequestMapping("/rest/permission")
public interface PermissionAPI {
	
	/**
	 * 通过平台类型和角色ID获取角色在该平台下的权限信息
	 * @param systemId 平台ID
	 * @param roleId 角色ID
	 * @return
	 */
	@RequestMapping(value = "/{systemId}/{roleId}/getRolePermissionExist", method = RequestMethod.GET)
	public ReturnData getRolePermissionExist(@PathVariable("systemId") String systemId, @PathVariable("roleId") String roleId);
}
