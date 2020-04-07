package com.visionvera.common.api.alarm;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.visionvera.bean.alarm.AlarmDomain;
import com.visionvera.bean.base.ReturnData;

@RequestMapping(value = { "/rest/alarm" })
public interface AlarmAPI {
	
	/**
	 * 
	 * @param alarmDomains
	 * @return
	 */
	@RequestMapping(value = "/addAlarmBatch", method = RequestMethod.POST)
	Object addAlarmBatch(@RequestBody List<AlarmDomain> alarmDomains);

	/**
	 * 添加告警
	 * @param alarmDomain
	 * @return
	 */
	@RequestMapping(value = "/addAlarm")
	Map<String, Object> addAlarm(@RequestBody AlarmDomain alarmDomain);
}
