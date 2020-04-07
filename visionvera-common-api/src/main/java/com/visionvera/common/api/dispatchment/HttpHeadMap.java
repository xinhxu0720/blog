package com.visionvera.common.api.dispatchment;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.HashMap;
import java.util.Map;

/**
 * Http头的Map
 */
public class HttpHeadMap {

    /**
     * 获取请求类型是FORM表单的请求头
     * @return
     */
    public static Map<String, String> getFormRequestHeaderMap() {
        Map<String, String> requestHeaderMap = new HashMap<>(2);
        requestHeaderMap.put(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_FORM_URLENCODED_VALUE);
        return requestHeaderMap;
    }
}
