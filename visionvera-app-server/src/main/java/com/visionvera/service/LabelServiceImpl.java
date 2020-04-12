package com.visionvera.service;

import com.visionvera.bean.base.BaseReturn;
import com.visionvera.bean.base.ReturnData;
import com.visionvera.dao.xinhxu.LabelDao;
import com.visionvera.vo.LabelVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.awt.*;
import java.util.List;

@Service
public class LabelServiceImpl implements LabelService {

    @Resource
    LabelDao labelDao;

    @Override
    public ReturnData addLabel(LabelVO labelVO) {
        BaseReturn baseReturn = new BaseReturn();
        labelDao.addLabel(labelVO);
        return baseReturn.returnSuccess("添加成功");
    }

    @Override
    public ReturnData getLabelList(LabelVO labelVO) {
        List<LabelVO> labelList = labelDao.getLabelList(labelVO);
        if ( null != labelVO.getId()){
            if (!labelList.isEmpty()){
                labelVO.setClickNumber(labelList.get(0).getClickNumber()+1);
                labelDao.updateLabel(labelVO);
            }
        }
        return new BaseReturn().returnResult(0, "获取成功", null, labelList);
    }

    @Override
    public ReturnData updateLabel(LabelVO labelVO) {
        labelDao.updateLabel(labelVO);
        return new BaseReturn().returnSuccess("修改成功");
    }
}
