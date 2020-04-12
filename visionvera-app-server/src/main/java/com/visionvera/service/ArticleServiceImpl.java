package com.visionvera.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.visionvera.bean.base.BaseReturn;
import com.visionvera.bean.base.ReturnData;
import com.visionvera.dao.xinhxu.ArticleDao;
import com.visionvera.dao.xinhxu.LabelDao;
import com.visionvera.vo.ArticleVO;
import com.visionvera.vo.LabelVO;
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

    @Resource
    LabelDao labelDao;

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
        //给文章添加标签
        addLabelName(articleList);
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
        //给文章添加标签
        addLabelName(headlinesInfo.getList());
        return dataReturn.returnResult(0,"获取列表成功",null,headlinesInfo.getList(),headlinesInfo.getTotal());
    }

    @Override
    public ReturnData deleteArticle(ArticleVO articleVO) {
        BaseReturn dataReturn = new BaseReturn();
        articleDao.deleteArticle(articleVO);
        return dataReturn.returnSuccess("删除成功");
    }

    @Override
    public ReturnData getInquireArticle(ArticleVO articleVO) {
        BaseReturn dataReturn = new BaseReturn();
        return dataReturn.returnResult(0,"查询成功",null,articleDao.getArticleList(articleVO));
    }

    /**
     * 给文章添加标签
     * @param articleList
     */
    public void addLabelName(List<ArticleVO> articleList){
        Map<String, Object> hashMap = new HashMap<>();
        for (LabelVO label : labelDao.getLabelList(new LabelVO())) {
            hashMap.put(String.valueOf(label.getId()),label.getName());
        }
        for (ArticleVO article : articleList) {
            String[] args =  article.getArticleType().split(",");
            for (String arg : args) {
                if (null == article.getArticleName()){
                    //当前是第一次添加
                    article.setArticleName((String) hashMap.get(arg));
                }else {
                    article.setArticleName(article.getArticleName()+","+hashMap.get(arg));
                }
            }
        }
    }
}
