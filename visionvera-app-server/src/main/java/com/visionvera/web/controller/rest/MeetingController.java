package com.visionvera.web.controller.rest;

import com.visionvera.bean.base.BaseReturn;
import com.visionvera.bean.base.ReturnData;
import com.visionvera.config.AppServerConfig;
import com.visionvera.service.ArticleService;
import com.visionvera.service.TrackService;
import com.visionvera.util.FileUploadUtil;
import com.visionvera.util.IPUtils;
import com.visionvera.util.StringUtil;
import com.visionvera.util.TimeUtil;
import com.visionvera.vo.ArticleVO;
import com.visionvera.vo.IPEntity;
import com.visionvera.vo.Track;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.crypto.MacSpi;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

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

    @Resource
    TrackService trackService;

    /**
     * @param articleVO
     * @Description TODO 添加文章
     * @return: com.visionvera.bean.base.ReturnData
     * @Author: Xinhxu
     * @Date: 14:12 2020/4/2
     */

    @RequestMapping(value = "/addArticle", method = RequestMethod.POST)
    public ReturnData addArticle(@RequestBody ArticleVO articleVO) {
        if (null != articleVO.getId()) {
            articleService.updateArticle(articleVO);
            return super.returnResult(0, "编辑文章成功", null, articleVO);
        }
        articleService.addArticle(articleVO);
        return super.returnResult(0, "添加文章成功", null, articleVO);
    }

    /**
     * @param
     * @Description TODO 获取文章列表
     * @return: com.visionvera.bean.base.ReturnData
     * @Author: Xinhxu
     * @Date: 14:13 2020/4/2
     */

    @RequestMapping(value = "/getArticleList", method = RequestMethod.GET)
    public ReturnData getArticleList(@RequestParam(value = "pageSize", defaultValue = "-1", required = false) Integer pageSize,
                                     @RequestParam(value = "pageNum", defaultValue = "1", required = false) Integer pageNum,
                                     @RequestParam(value = "id", required = false) Integer id,
                                     HttpServletRequest request) {
        ArticleVO articleVO = new ArticleVO();
        if (null != id) {
            articleVO.setId(id);
        }

        //登录成功设置
        String ipAddress = LoginController.getIpAddress(request);
        Track ip = trackService.findIp(ipAddress);
        Track track = new Track();
        if (null == ip) {
            IPEntity msg = IPUtils.getIPMsg(ipAddress);
            track.setIp(ipAddress);
            track.setVersion(1);
            track.setCreateDate(new Date());
            track.setCounty("初次游览网页");
            //添加城市数据
            setCityData(track,msg);
            trackService.add(track);
        } else {
            IPEntity msg = IPUtils.getIPMsg(ipAddress);
            track.setVersion(ip.getVersion() + 1);
            track.setModifyDate(new Date());
            track.setCounty("当前是第：" + ip.getVersion() + 1 + "次游览网页");
            //添加城市数据
            setCityData(track,msg);
            track.setId(ip.getId());
            trackService.update(track);
        }
        return articleService.getArticleList(articleVO, pageSize, pageNum);
    }

    public static String setMessage(String message){
         if (StringUtil.isNull(message)){
             return "";
         }
         return message;
    }

    public static void setCityData(Track track,IPEntity msg){
        track.setCountryName(setMessage(msg.getCountryName()));
        track.setCountryCode(setMessage(msg.getCountryCode()));
        track.setProvinceName(setMessage(msg.getProvinceName()));
        track.setCityName(setMessage(msg.getCityName()));
        track.setPostalCode(setMessage(msg.getPostalCode()));
        track.setLongitude(msg.getLongitude() == null ? "" : String.valueOf(msg.getLongitude()));
        track.setLatitude(msg.getLatitude() == null ? "" : String.valueOf(msg.getLatitude()));
    }

    /**
     * @param request
     * @param remark
     * @Description TODO 上传图片
     * @return: java.util.Map<java.lang.String, java.lang.Object>
     * @Author: Xinhxu
     * @Date: 15:03 2020/4/15
     */

    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST, consumes = "multipart/form-data")
    public Map<String, Object> uploadFile(HttpServletRequest request,
                                          @RequestParam(value = "remark", required = false) String remark) {
        try {
            LOGGER.info("开始上传图片...");
            Map<String, Object> map = new HashMap<>();
            Map<String, Object> uploadFile = FileUploadUtil.uploadFile(request, null, appServerConfig.getPublishImages());
            //图片上传文件完成 数据库插入数据
            map.put("code", 0);
            map.put("msg", "上传成功");
            return map;
        } catch (Exception e) {
            LOGGER.error("HomeController ===== uploadFile ===== 上传文件失败 =>", e);
            e.printStackTrace();
            return null;
        }
    }

    /**
     * @param pageSize
     * @param pageNum
     * @Description TODO 获取文章分页
     * @return: java.util.Map<java.lang.String, java.lang.Object>
     * @Author: Xinhxu
     * @Date: 19:54 2020/4/6
     */

    @RequestMapping(value = "/getArticleListData", method = RequestMethod.GET)
    public Map<String, Object> getArticleListData(@RequestParam(value = "limit", defaultValue = "5", required = false) Integer pageSize,
                                                  @RequestParam(value = "page", defaultValue = "1", required = false) Integer pageNum,
                                                  @RequestParam(value = "access_token", required = false) String access_token) {
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("code", 0);
        hashMap.put("mgs", "");
        System.out.println(access_token);
        try {
            ArticleVO articleVO = new ArticleVO();
            ReturnData articleList = articleService.getArticleListData(articleVO, pageSize, pageNum);
            Map<String, Object> data = (HashMap) articleList.getData();
            List<ArticleVO> items = (ArrayList) data.get("items");
            hashMap.put("count", (Long) data.get("extra"));
            hashMap.put("data", items);
            return hashMap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * @param articleVO
     * @Description TODO 删除文章
     * @return: com.visionvera.bean.base.ReturnData
     * @Author: Xinhxu
     * @Date: 15:31 2020/4/6
     */

    @RequestMapping(value = "/deleteArticle", method = RequestMethod.POST)
    public ReturnData deleteArticle(@RequestBody ArticleVO articleVO) {
        return articleService.deleteArticle(articleVO);
    }

    /**
     * @param title
     * @Description TODO 模糊查询文章
     * @return: com.visionvera.bean.base.ReturnData
     * @Author: Xinhxu
     * @Date: 15:31 2020/4/6
     */
    @RequestMapping(value = "/getInquireArticle", method = RequestMethod.GET)
    public ReturnData getInquireArticle(@RequestParam(value = "title") String title) {
        ArticleVO articleVO = new ArticleVO();
        articleVO.setTitle(title);
        return articleService.getInquireArticle(articleVO);
    }

}
