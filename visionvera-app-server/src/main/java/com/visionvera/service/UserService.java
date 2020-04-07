package com.visionvera.service;


import com.visionvera.bean.base.ReturnData;
import com.visionvera.bean.cms.UserVO;
import com.visionvera.vo.User;

import java.util.List;

public interface UserService {
    List<User> querAll();

    /**
     * 用户登录操作
     *
     * @param user
     *            用户信息
     * @param loginType
     *            登陆类型。1: 表示用户名密码登录；2: 表示手机号密码登录；3: 表示手机号验证码登录； 4: 表示用户名验证码登陆
     * @param sessionTimeoutMinute
     *            Session过期时间，分钟
     * @return
     */
    public ReturnData userLogin(UserVO user, Integer loginType, Integer sessionTimeoutMinute);

    /**
     * 用户登出
     * @param accessToken 访问令牌
     * @param platformId 平台标识/ID
     * @return
     */
    public ReturnData userLogout(String accessToken, String platformId);

}
