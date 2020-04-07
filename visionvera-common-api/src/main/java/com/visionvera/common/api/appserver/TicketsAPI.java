package com.visionvera.common.api.appserver;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.visionvera.bean.base.ReturnData;

@RequestMapping("/rest/ticket")
public interface TicketsAPI {
	@RequestMapping(value = "/getObjectByOql", method = RequestMethod.POST)
	public ReturnData getObjectByOql(@RequestBody Map<String ,Object> map) ;
}
