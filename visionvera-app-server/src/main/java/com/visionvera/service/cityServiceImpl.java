package com.visionvera.service;

import com.visionvera.dao.xinhxu.cityDao;
import com.visionvera.vo.cityVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName cityServiceImpl
 * @Description TODO
 * @Author 徐鑫辉
 * @Date 2019年12月12日 13:07
 **/
@Service
public class cityServiceImpl implements cityService {
    @Resource
    private cityDao cityDao;

    @Override
    public List<cityVO> getRegionList(cityVO cityVO) {
        return cityDao.getRegionList(cityVO);
    }
}
