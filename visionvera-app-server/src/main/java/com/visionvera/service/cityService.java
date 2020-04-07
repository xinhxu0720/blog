package com.visionvera.service;

import com.visionvera.vo.cityVO;

import java.util.List;

/**
 * @ClassName cityService
 * @Description TODO
 * @Author 徐鑫辉
 * @Date 2019年12月12日 13:07
 **/
public interface cityService {

    List<cityVO> getRegionList(cityVO cityVO);

}
