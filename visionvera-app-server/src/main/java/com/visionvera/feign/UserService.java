package com.visionvera.feign;

import com.visionvera.common.api.authentication.UserAPI;
import com.visionvera.constrant.CommonConstrant;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = CommonConstrant.AUTHENTICATION_SERVICE_NAME)//用户服务
public interface UserService extends UserAPI {

}
