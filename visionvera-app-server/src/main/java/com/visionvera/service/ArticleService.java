package com.visionvera.service;

import com.visionvera.bean.base.ReturnData;
import com.visionvera.vo.ArticleVO;


/**
 * @ClassName ArticleService
 * @Description TODO
 * @Author 徐鑫辉
 * @Date 2020年04月02日 14:04
 **/
public interface ArticleService {

    /**
     * @Description TODO 添加文章
     * @param articleVO
     * @return: void
     * @Author: Xinhxu
     * @Date: 14:02 2020/4/2
     */

    int addArticle(ArticleVO articleVO);

    /**
     * @Description TODO 获取文章列表
     * @param articleVO
     * @return: java.util.List<com.visionvera.vo.ArticleVO>
     * @Author: Xinhxu
     * @Date: 14:03 2020/4/2
     */

    ReturnData getArticleList(ArticleVO articleVO,Integer pageSize,Integer pageNum);

    /**
     * @Description TODO 修改文章
     * @param articleVO
     * @return: void
     * @Author: Xinhxu
     * @Date: 14:41 2020/4/2
     */

    void updateArticle(ArticleVO articleVO);

    ReturnData getArticleListData(ArticleVO articleVO,Integer pageSize,Integer pageNum);

    ReturnData deleteArticle(ArticleVO articleVO);

    ReturnData getInquireArticle(ArticleVO articleVO);
}
