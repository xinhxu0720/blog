package com.visionvera.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.visionvera.bean.base.BaseReturn;
import com.visionvera.bean.base.ReturnData;
import com.visionvera.dao.xinhxu.ArticleDao;
import com.visionvera.vo.ArticleVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ArticleServiceImpl
 * @Description TODO
 * @Author 徐鑫辉
 * @Date 2020年04月02日 14:04
 **/
@Service
public class ArticleServiceImpl implements ArticleService{

    @Resource
    ArticleDao articleDao;

    @Override
    public int addArticle(ArticleVO articleVO) {
        articleVO.setCreateTime(new Date());
        articleVO.setVersion(0);
       return articleDao.addArticle(articleVO);
    }

    @Override
    public ReturnData getArticleList(ArticleVO articleVO,Integer pageSize,Integer pageNum) {
        BaseReturn dataReturn = new BaseReturn();
        List<ArticleVO> articleList = null;
        if (null != articleVO.getId()){
            articleList = articleDao.getArticleList(articleVO);
            articleVO.setClicks(articleList.get(0).getClicks()+1);
            articleDao.updateArticle(articleVO);
        }
        articleList = articleDao.getArticleList(articleVO);
        return dataReturn.returnResult(0,"获取列表成功",null,articleList);
    }

    @Override
    public void updateArticle(ArticleVO articleVO) {
        articleVO.setVersion(articleVO.getVersion()+1);
        articleDao.updateArticle(articleVO);
    }

    @Override
    public ReturnData getArticleListData(ArticleVO articleVO,Integer pageSize,Integer pageNum) {
        BaseReturn dataReturn = new BaseReturn();
        if (pageSize != -1) {//pageSize为-1表示不分页
            Map<String, Object> hashMap = new HashMap<>();
            hashMap.put("pageSize",pageSize);
            hashMap.put("pageNum",pageNum);
            PageHelper.startPage(hashMap);
        }
        PageInfo<ArticleVO> headlinesInfo = new PageInfo<>(articleDao.getArticleList(articleVO));

        return dataReturn.returnResult(0,"获取列表成功",null,headlinesInfo.getList(),headlinesInfo.getTotal());
    }

    @Override
    public ReturnData deleteArticle(ArticleVO articleVO) {
        BaseReturn dataReturn = new BaseReturn();
        articleDao.deleteArticle(articleVO);
        return dataReturn.returnSuccess("删除成功");
    }

}
