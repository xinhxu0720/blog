package com.visionvera.common.api.authentication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.visionvera.bean.base.ReturnData;

/**
 * 系统配置相关的API
 *
 */
@RequestMapping("/rest/serverConfig")
public interface ServerConfigAPI {
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	ReturnData getServerConfig(@RequestParam(value="otherPlatformId") String otherPlatformId );
}
