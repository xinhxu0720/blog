package com.visionvera.service;

import com.visionvera.bean.base.ReturnData;
import com.visionvera.vo.LabelVO;

import java.awt.*;
import java.util.List;

public interface LabelService {

    /**
     * @Description TODO 添加标签
     * @param labelVO
     * @return: void
     * @Author: Xinhxu
     * @Date: 14:02 2020/4/2
     */

    ReturnData addLabel(LabelVO labelVO);

    /**
     * @Description TODO 获取标签
     * @param labelVO
     * @return: java.util.List<com.visionvera.vo.ArticleVO>
     * @Author: Xinhxu
     * @Date: 14:03 2020/4/2
     */

    ReturnData getLabelList(LabelVO labelVO);

    /**
     * @Description TODO 修改文章
     * @param labelVO
     * @return: void
     * @Author: Xinhxu
     * @Date: 14:41 2020/4/2
     */

    ReturnData updateLabel(LabelVO labelVO);
}
