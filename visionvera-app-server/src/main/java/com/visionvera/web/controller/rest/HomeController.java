package com.visionvera.web.controller.rest;

import com.visionvera.bean.base.BaseReturn;
import com.visionvera.bean.base.ReturnData;
import com.visionvera.config.AppServerConfig;
import com.visionvera.service.MessageService;
import com.visionvera.util.ChineseDateUtil;
import com.visionvera.util.FileUploadUtil;
import com.visionvera.util.HttpUtils;
import com.visionvera.vo.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/rest/home")
public class HomeController extends BaseReturn {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);


    @Autowired
    AppServerConfig appServerConfig;

    @Autowired
    MessageService messageService;

    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ReturnData uploadFile(HttpServletRequest request,
                                 @RequestParam(value = "remark",required = false) String remark){
        try {
            Map<String, Object> uploadFile = FileUploadUtil.uploadFile(request, null, appServerConfig.getPublishImages());
            Date date = new Date();
            Message message = new Message();
            message.setCreateDate(date);
            message.setModifyDate(date);
            message.setVersion(1);
            message.setTitly(ChineseDateUtil.getCurrentCNDate());
            if (remark.contains(";")){
             message.setContent(remark.substring(0,remark.indexOf(";")));
             message.setSoup(remark.substring(remark.indexOf(";")+1,remark.length()));
            }else if (remark.contains("；")){
             message.setContent(remark.substring(0,remark.indexOf("；")));
             message.setSoup(remark.substring(remark.indexOf("；")+1,remark.length()));
            }else {
                message.setContent(remark);
            }
            message.setImg((String) uploadFile.get("fileName"));
            messageService.insertSelective(message);
            return super.returnResult(0, "上传文件成功");
        }  catch (Exception e) {
            LOGGER.error("HomeController ===== uploadFile ===== 上传文件失败 =>", e);
            return super.returnError("上传文件失败,系统内部异常");
        }
    }

    @RequestMapping(value = "/addOrUpdateImage", method = RequestMethod.POST)
    public Map<String, Object> addOrUpdateImage(@RequestParam(value = "file") MultipartFile[] file,
                                                @RequestParam(value = "netWork_token", required = false) String token) {
        return HttpUtils.postSendFiles("http://192.168.1.111:8989/Xinhxu_war_exploded/find/uploadPictures.do",null, file);
    }

    @RequestMapping(value = "/getTest", method = RequestMethod.GET)
    public String getTest(String name){
        try {
            System.out.println(name);
          return name;
            //  return super.returnResult(0, "上传文件成功",null,null,name);
        }  catch (Exception e) {
            LOGGER.error("HomeController ===== uploadFile ===== 上传文件失败 =>", e);
            return "错误";
            //return super.returnError("上传文件失败,系统内部异常");
        }
    }


    @RequestMapping(value = "/getDataAll", method = RequestMethod.GET)
    public ReturnData getDataAll(@RequestParam(value = "pageSize",required = false,defaultValue = "10") Integer pageSize,
                             @RequestParam(value = "pageNum",required = false,defaultValue = "1") Integer pageNum){
        try {
            return super.returnResult(0, "获取数据成功",null,messageService.querAll(pageSize, pageNum));
        }  catch (Exception e) {
            LOGGER.error("HomeController ===== uploadFile ===== 上传文件失败 =>", e);
            return super.returnError("获取数据失败,系统内部异常");
        }
    }
}
