package com.visionvera.service;


import com.visionvera.vo.Trait;

import java.util.List;

public interface TraitService {
    int insert(Trait record);

    int insertSelective(Trait record);

    List<Trait> querAll();
}
