package com.visionvera.service;


import com.github.pagehelper.PageInfo;
import com.visionvera.vo.Message;

import java.util.List;

public interface MessageService {

    int insert(Message record);

    int insertSelective(Message record);

    PageInfo<Message> querAll(Integer pageSize, Integer pageNum);

    List<Message> findNewestMessage(String createDate);
}
