package com.visionvera.service;

import com.visionvera.dao.xinhxu.LeavWordDao;
import com.visionvera.vo.LeavWord;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LeavWordServiceImpl implements LeavWordService {

    @Resource
    LeavWordDao leavWordMapper;

    @Override
    public int insert(LeavWord record) {
        return leavWordMapper.insert(record);
    }

    @Override
    public int insertSelective(LeavWord record) {
        return leavWordMapper.insert(record);
    }
}
