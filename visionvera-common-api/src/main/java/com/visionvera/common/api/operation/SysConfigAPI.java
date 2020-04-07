package com.visionvera.common.api.operation;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.visionvera.bean.base.ReturnData;

/**
 * 系统配置相关的API
 *
 */
@RequestMapping("/rest/sysConfig")
public interface SysConfigAPI {
	/**
	 * 根据类型获取服务器配置信息
	 * @param serverType 类型.1会管中心服务 2网管服务 3调度服务 4消息转发服务器
	 * @return
	 */
	@RequestMapping(value = "/{serverType}/getServer", method = RequestMethod.GET)
	public ReturnData getServer(@PathVariable("serverType") String serverType);
	
	/** <pre>getAlarmMeetCount(获取告警阈值)   
	 * 创建人：周逸芳       
	 * 创建时间：2018年4月16日 下午2:37:48    
	 * 修改人：周逸芳        
	 * 修改时间：2018年4月16日 下午2:37:48    
	 * 修改备注： 
	 * @return</pre>    
	 */
	@RequestMapping(value = "/getAlarmMeetCount", method = RequestMethod.GET)
	public ReturnData getAlarmMeetCount();
}
