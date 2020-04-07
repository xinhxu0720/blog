package com.visionvera.common.api.authentication;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.visionvera.bean.base.ReturnData;

@RequestMapping("/rest/user")
public interface UserAPI {
	/**
	 * 通过Token获取用户信息
	 * @param token 访问令牌
	 * @return
	 */
	@RequestMapping(value = "/{token}/getUser", method = RequestMethod.GET)
	public ReturnData getUser(@PathVariable("token") String token);
	
	/**
	 * 通过Token获取平台ID和登录名
	 * @param token 访问令牌
	 * @return
	 */
	@RequestMapping(value = "/{token}/getPlatformId")
	public ReturnData getPlatformIdAndLoginNameByToken(@PathVariable("token") String token);
	
	/**
	 * 通过UUID获取用户信息，携带对应的权限信息
	 * @param uuid 用户UUID
	 * @param token
	 * @return
	 */
	@RequestMapping(value = "/{uuid}/getUserInfo", method = RequestMethod.GET)
	public ReturnData getUserInfo(@PathVariable("uuid") String uuid, @RequestParam(name = "access_token") String token);
}
