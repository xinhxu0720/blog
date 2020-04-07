package com.visionvera.feign;

import com.visionvera.common.api.resource.PlatformResAPI;
import com.visionvera.constrant.CommonConstrant;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author Administrator
 * @date 2018年11月23日 15:47
 */
@FeignClient(name = CommonConstrant.RESOURCE_SERVICE_NAME)//运维服务
public interface PlatformResService extends PlatformResAPI {
}
