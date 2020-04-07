package com.visionvera.dao.xinhxu;


import com.visionvera.vo.Trait;

import java.util.List;

public interface TraitDao {
    int insert(Trait record);

    int insertSelective(Trait record);

    List<Trait> querAll();
}