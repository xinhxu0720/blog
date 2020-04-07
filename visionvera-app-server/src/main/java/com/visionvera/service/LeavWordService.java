package com.visionvera.service;


import com.visionvera.vo.LeavWord;

public interface LeavWordService {
    int insert(LeavWord record);

    int insertSelective(LeavWord record);
}
