package com.visionvera.dao.xinhxu;

import com.visionvera.vo.cityVO;

import java.util.List;

/**
 * @ClassName cityDao
 * @Description TODO
 * @Author 徐鑫辉
 * @Date 2019年12月12日 11:38
 **/
public interface cityDao {

    List<cityVO> getRegionList(cityVO cityVO);
}
