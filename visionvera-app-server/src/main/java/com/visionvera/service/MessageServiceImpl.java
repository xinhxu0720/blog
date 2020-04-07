package com.visionvera.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.visionvera.dao.xinhxu.MessageDao;
import com.visionvera.vo.Message;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Resource
    MessageDao messageMapper;

    @Override
    public int insert(Message record) {
        return messageMapper.insert(record);
    }

    @Override
    public int insertSelective(Message record) {
        return messageMapper.insertSelective(record);
    }

    @Override
    public PageInfo<Message> querAll(Integer pageSize,Integer pageNum) {
        if (!pageSize.equals(-1)) {
            PageHelper.startPage(pageNum, pageSize);
        }
        return new PageInfo<>(messageMapper.querAll());
    }

    @Override
    public List<Message> findNewestMessage(String createDate) {
        return messageMapper.findone(createDate);
    }
}
