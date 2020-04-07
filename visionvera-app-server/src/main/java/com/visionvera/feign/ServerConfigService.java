package com.visionvera.feign;

import com.visionvera.common.api.authentication.ServerConfigAPI;
import com.visionvera.constrant.CommonConstrant;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = CommonConstrant.AUTHENTICATION_SERVICE_NAME)//运维服务
public interface ServerConfigService extends ServerConfigAPI {

}
