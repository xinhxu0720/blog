package com.visionvera.dao.xinhxu;


import com.visionvera.bean.cms.UserVO;
import com.visionvera.vo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {

    List<User> querAll();

    /**
     * 通过数据库表的唯一键获取用户数据
     * @param paramsMap {"uuid":"","loginName":"","phone":""}
     * @return
     */
    UserVO selectUserByUniqueKey(Map<String, Object> paramsMap);

    /**
     * 更新用户基本信息
     * @param user
     * @return
     */
    int updateUser(UserVO user);
}
