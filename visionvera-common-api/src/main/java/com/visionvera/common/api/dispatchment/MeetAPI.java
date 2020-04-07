package com.visionvera.common.api.dispatchment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSONObject;

@RequestMapping("/rest/meet")
public interface MeetAPI {
	
	@RequestMapping(value = "/getOmcServerConfig", method = RequestMethod.GET)
	public JSONObject getServerConfig();

}
