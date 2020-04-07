package com.visionvera.feign;

import com.visionvera.common.api.operation.SysConfigAPI;
import com.visionvera.constrant.CommonConstrant;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = CommonConstrant.OPERATION_SERVICE_NAME)//运维服务
public interface SysConfigService extends SysConfigAPI {

}
