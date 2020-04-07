package com.visionvera.dao.xinhxu;


import com.visionvera.vo.Message;

import java.util.List;

public interface MessageDao {
    int insert(Message record);

    int insertSelective(Message record);

    List<Message> querAll();

    List<Message> findone(String createDate);
}