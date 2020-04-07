package com.visionvera.web.controller.rest;

import com.visionvera.bean.base.BaseReturn;
import com.visionvera.bean.base.ReturnData;
import com.visionvera.config.AppServerConfig;
import com.visionvera.service.ArticleService;
import com.visionvera.util.FileUploadUtil;
import com.visionvera.vo.ArticleVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName MeetingController
 * @Description TODO
 * @Author 徐鑫辉
 * @Date 2019年12月23日 9:51
 **/
@RestController
@RequestMapping("/rest")
@CrossOrigin
public class MeetingController extends BaseReturn {

    private static final Logger LOGGER = LoggerFactory.getLogger(MeetingController.class);

    @Resource
    ArticleService articleService;

    @Resource
    AppServerConfig appServerConfig;

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public Object test(@RequestParam(value = "title") String title,
                       @RequestParam(value = "content", required = false) String content,
                       @RequestBody Map<String, String> message) {
        //            String regEx_script="<script[^>]*?>[\\s\\S]*?<\\/script>"; //定义script的正则表达式

        System.out.println("过滤前：" + message.get("message"));
        System.out.println(title);
        System.out.println(123123);
        return "ok";
    }

    /**
     * @Description TODO 添加文章
     * @param articleVO
     * @return: com.visionvera.bean.base.ReturnData
     * @Author: Xinhxu
     * @Date: 14:12 2020/4/2
    */

    @RequestMapping(value = "/addArticle", method = RequestMethod.POST)
    public ReturnData addArticle(@RequestBody ArticleVO articleVO) {
        if (null != articleVO.getId()){
            articleService.updateArticle(articleVO);
            return super.returnResult(0,"编辑文章成功",null,articleVO);
        }
        articleService.addArticle(articleVO);
        return super.returnResult(0,"添加文章成功",null,articleVO);
    }

    /**
     * @Description TODO 获取文章列表
     * @param
     * @return: com.visionvera.bean.base.ReturnData
     * @Author: Xinhxu
     * @Date: 14:13 2020/4/2
    */

    @RequestMapping(value = "/getArticleList", method = RequestMethod.GET)
    public ReturnData getArticleList(@RequestParam(value = "pageSize",defaultValue = "-1",required = false) Integer pageSize,
                                     @RequestParam(value = "pageNum",defaultValue = "1",required = false) Integer pageNum,
                                     @RequestParam(value = "id",required = false) Integer id) {
        ArticleVO articleVO = new ArticleVO();
        if (null != id){
            articleVO.setId(id);
        }
        return articleService.getArticleList(articleVO,pageSize,pageNum);
    }

    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST, consumes = "multipart/form-data")
    public Map<String,Object> uploadFile(HttpServletRequest request,
                                 @RequestParam(value = "remark",required = false) String remark){
        try {
            LOGGER.info("开始上传图片...");
            Map<String, Object> map = new HashMap<>();
            Map<String, Object> uploadFile = FileUploadUtil.uploadFile(request, null, appServerConfig.getPublishImages());

            map.put("code",0);
            map.put("msg","上传成功");
            return map;
        }  catch (Exception e) {
            LOGGER.error("HomeController ===== uploadFile ===== 上传文件失败 =>", e);
            e.printStackTrace();
            return null;
        }
    }

    /**
     * @Description TODO 获取文章分页
     * @param pageSize
     * @param pageNum
     * @return: java.util.Map<java.lang.String,java.lang.Object>
     * @Author: Xinhxu
     * @Date: 19:54 2020/4/6
    */

    @RequestMapping(value = "/getArticleListData", method = RequestMethod.GET)
    public Map<String,Object> getArticleListData(@RequestParam(value = "limit",defaultValue = "5",required = false) Integer pageSize,
                                                 @RequestParam(value = "page",defaultValue = "1",required = false) Integer pageNum) {
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("code",0);
        hashMap.put("mgs","");
        try {
            ArticleVO articleVO = new ArticleVO();
            ReturnData articleList = articleService.getArticleListData(articleVO,pageSize,pageNum);
            Map<String,Object> data = (HashMap)articleList.getData();
            List<ArticleVO> items = (ArrayList)data.get("items");
            hashMap.put("count",(Long)data.get("extra"));
            hashMap.put("data",items);
            return hashMap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * @Description TODO 删除文章
     * @param articleVO
     * @return: com.visionvera.bean.base.ReturnData
     * @Author: Xinhxu
     * @Date: 15:31 2020/4/6
    */

    @RequestMapping(value = "/deleteArticle", method = RequestMethod.POST)
    public ReturnData deleteArticle(@RequestBody ArticleVO articleVO) {
        return articleService.deleteArticle(articleVO);
    }
}
