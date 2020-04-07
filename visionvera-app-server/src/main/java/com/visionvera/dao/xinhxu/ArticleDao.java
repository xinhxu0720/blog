package com.visionvera.dao.xinhxu;

import com.visionvera.vo.ArticleVO;

import java.util.List;

/**
 * @ClassName ArticleDao
 * @Description TODO
 * @Author 徐鑫辉
 * @Date 2020年04月02日 12:04
 **/
public interface ArticleDao {

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

    List<ArticleVO> getArticleList(ArticleVO articleVO);

    /**
     * @Description TODO 修改文章
     * @param articleVO
     * @return: void
     * @Author: Xinhxu
     * @Date: 14:41 2020/4/2
    */

    void updateArticle(ArticleVO articleVO);

    /**
     * @Description TODO 删除文章
     * @param articleVO
     * @return: void
     * @Author: Xinhxu
     * @Date: 15:11 2020/4/6
    */

    void deleteArticle(ArticleVO articleVO);
}

