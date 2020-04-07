package com.visionvera.common.api.operation;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.visionvera.bean.cms.UserVO;

@RequestMapping("/rest/user")
public interface OperationUserAPI {
	/**
	 * 通过loginName获取用户信息，携带对应的权限信息
	 * @param uuid 用户UUID
	 * @param token
	 * @return
	 */
	@RequestMapping(value = "/{loginName}/getHgUserInfo", method = RequestMethod.GET)
	public UserVO getHgUserInfo(@PathVariable("loginName") String loginName, @RequestParam(name = "access_token") String token);
	
	/**
	 * 添加用户与设备组关联关系
	 * @param user
	 * @param token
	 * @return
	 */
	@RequestMapping(value = "/addUserGroupDev", method = RequestMethod.POST)
	public int addUserGroupDev( UserVO user, @RequestParam(name = "access_token") String token);
	
	/**
	 * 修改用户与设备组关联关系
	 * @param user
	 * @param token
	 * @return
	 */
	@RequestMapping(value = "/updateUserGroupDev", method = RequestMethod.POST)
	public int updateUserGroupDev( UserVO user, @RequestParam(name = "access_token") String token);
	
	/**
	 * 设置视联汇用户最大允许参会终端数
	 * @param user
	 * @param token
	 * @return
	 */
	@RequestMapping(value = "/updateMaxDevNumByLoginName", method = RequestMethod.POST)
	public int updateMaxDevNumByLoginName( UserVO user, @RequestParam(name = "access_token") String token);
}
