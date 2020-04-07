package com.visionvera.common.api.authentication;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.visionvera.bean.base.ReturnData;
import com.visionvera.bean.datacore.TRoleVO;

@RequestMapping("/rest/role")
public interface RoleAPI {
	/**
	 * 添加角色
	 * @param role
	 * @return
	 */
	@RequestMapping(value = "/addRole", method = RequestMethod.POST, consumes = "application/json;charset=utf-8")
	public ReturnData addRole(@RequestBody TRoleVO role, @RequestParam("access_token") String access_token);
	
	/**
	 * 只会添加角色和平台与角色和平台权限的关系
	 * @param role 角色信息
	 * @param access_token
	 * @return
	 */
	@RequestMapping(value = "/addRoleOtherRel", method = RequestMethod.POST, consumes = "application/json;charset=utf-8")
	public ReturnData addRoleOtherRel(@RequestBody TRoleVO role, @RequestParam("access_token") String access_token);
	
	/**
	 * 通过平台ID查询默认的角色信息，包含其对应的权限
	 * @param platformId 平台ID
	 * @return
	 */
	@RequestMapping(value = "/{platformId}/getDefaultRoleByPlatformId", method = RequestMethod.GET)
	public ReturnData getDefaultRoleByPlatformId(@PathVariable("platformId") String platformId);
	
	/**
	 * 修改角色
	 * @param role
	 * @return
	 */
	@RequestMapping(value = "/updateRole", method = RequestMethod.POST, consumes = "application/json;charset=utf-8")
	public ReturnData updateRole(@RequestBody TRoleVO role);
	
	/**
	 * 删除角色（多个值uuid用,分割）
	 * @param role
	 * @return
	 */
	@RequestMapping(value = "/deleteRole", method = RequestMethod.POST, consumes = "application/json;charset=utf-8")
	public ReturnData deleteRole(@RequestBody TRoleVO role);
	
	/**
	 * 通过平台ID查询默认的角色信息，包含其对应的权限
	 * @param platformId 平台ID
	 * @return
	 */
	@RequestMapping(value = "/updateDfRoleName", method = RequestMethod.POST)
	public ReturnData updateDfRoleName(@RequestBody TRoleVO role);
}
