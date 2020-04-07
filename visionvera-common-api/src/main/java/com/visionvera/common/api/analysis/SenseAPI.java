package com.visionvera.common.api.analysis;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.visionvera.bean.base.ReturnData;

@RequestMapping("/rest/sense") 
public interface SenseAPI {
	/**
     * 感知中心获取链路详情接口
     * @param regionId 行政区域ID
     * @return
     */
    @RequestMapping(value = "/regionId/{regionId}/getLinkDetails", method = RequestMethod.GET)
    public ReturnData getLinkDetails(@PathVariable("regionId") String regionId);
}
