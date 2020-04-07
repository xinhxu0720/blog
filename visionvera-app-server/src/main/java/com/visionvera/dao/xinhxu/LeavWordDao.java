package com.visionvera.dao.xinhxu;


import com.visionvera.vo.LeavWord;

public interface LeavWordDao {
    int insert(LeavWord record);

    int insertSelective(LeavWord record);
}