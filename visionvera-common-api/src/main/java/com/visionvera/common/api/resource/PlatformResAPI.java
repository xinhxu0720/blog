package com.visionvera.common.api.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.visionvera.bean.datacore.PlatformResourceVO;
import com.visionvera.bean.restful.DataInfo;
import com.visionvera.bean.restful.ResponseInfo;

/**
 * 平台管理API定义
 *
 */
@RequestMapping("/rest/platformres")
public interface PlatformResAPI {
	/**
	 * 通过主键ID获取平台资源
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/{id}/getPlatformResource", method = RequestMethod.GET)
	public ResponseInfo<DataInfo<PlatformResourceVO>> getPlatformResource(@PathVariable("id") String id);
}
