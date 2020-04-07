package com.visionvera.service;

import com.visionvera.dao.xinhxu.TraitDao;
import com.visionvera.vo.Trait;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TraitServiceImpl implements TraitService {

    @Resource
    TraitDao traitMapper;

    @Override
    public int insert(Trait record) {
        return traitMapper.insert(record);
    }

    @Override
    public int insertSelective(Trait record) {
        return traitMapper.insertSelective(record);
    }

    @Override
    public List<Trait> querAll() {
        return traitMapper.querAll();
    }
}
