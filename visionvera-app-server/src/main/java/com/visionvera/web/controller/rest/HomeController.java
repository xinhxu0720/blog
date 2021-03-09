package com.visionvera.web.controller.rest;

import com.alibaba.fastjson.JSONObject;
import com.visionvera.bean.base.BaseReturn;
import com.visionvera.bean.base.ReturnData;
import com.visionvera.config.AppServerConfig;
import com.visionvera.service.MessageService;
import com.visionvera.util.BusinessException;
import com.visionvera.util.ChineseDateUtil;
import com.visionvera.util.FileUploadUtil;
import com.visionvera.util.HttpUtils;
import com.visionvera.vo.Message;
import com.visionvera.web.soket.WebSocketClient;
import io.swagger.models.auth.In;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Maps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import scala.Int;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/rest/home")
@Slf4j
public class HomeController extends BaseReturn {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);


    @Autowired
    AppServerConfig appServerConfig;

    @Autowired
    MessageService messageService;

    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ReturnData uploadFile(HttpServletRequest request,
                                 @RequestParam(value = "remark", required = false) String remark) {
        try {
            Map<String, Object> uploadFile = FileUploadUtil.uploadFile(request, null, appServerConfig.getPublishImages());
            Date date = new Date();
            Message message = new Message();
            message.setCreateDate(date);
            message.setModifyDate(date);
            message.setVersion(1);
            message.setTitly(ChineseDateUtil.getCurrentCNDate());
            message.setType((Integer) uploadFile.get("type"));
            message.setBeautifulPicture((Integer) uploadFile.get("type") == 1 ? 1 : 0);
            if (remark.contains(";")) {
                message.setContent(remark.substring(0, remark.indexOf(";")));
                message.setSoup(remark.substring(remark.indexOf(";") + 1, remark.length()));
            } else if (remark.contains("；")) {
                message.setContent(remark.substring(0, remark.indexOf("；")));
                message.setSoup(remark.substring(remark.indexOf("；") + 1, remark.length()));
            } else {
                message.setContent(remark);
            }
            message.setImg((String) uploadFile.get("fileName"));
            messageService.insertSelective(message);
            return super.returnResult(0, "上传文件成功");
        } catch (Exception e) {
            LOGGER.error("HomeController ===== uploadFile ===== 上传文件失败 =>", e);
            return super.returnError("上传文件失败,系统内部异常");
        }
    }

    @RequestMapping(value = "/addOrUpdateImage", method = RequestMethod.POST)
    public Map<String, Object> addOrUpdateImage(@RequestParam(value = "file") MultipartFile[] file,
                                                @RequestParam(value = "netWork_token", required = false) String token) {
        return HttpUtils.postSendFiles("http://192.168.1.111:8989/Xinhxu_war_exploded/find/uploadPictures.do", null, file);
    }

    @RequestMapping(value = "/getTest", method = RequestMethod.GET)
    public String getTest(@RequestParam(value = "userId") String userId,
                          @RequestParam(value = "flag") Integer flag) {
        try {
            connection(userId, flag, Maps.newHashMap(userId, "2222"));
        } catch (Exception e) {
            LOGGER.error("HomeController ===== uploadFile ===== 上传文件失败 =>", e);
            return "错误";
        }
        return "成功";
    }

    @RequestMapping(value = "/send", method = RequestMethod.GET)
    public String send(@RequestParam(value = "val") Integer val,
                       @RequestParam(value = "end")Integer end) {
        try {
            for (int i = val; i < end; i++) {
                String s = HttpUtils.sendGet("http://localhost:8806/rest/home/getTest?userId=" + i + "&flag=2", null);
                System.out.println("响应数据：" + s);
            }
        } catch (Exception e) {
            LOGGER.error("HomeController ===== uploadFile ===== 上传文件失败 =>", e);
            return "错误";
        }
        return "成功";
    }

    public ReturnData connection(String userId, Integer connectionFlag, Map<String, Object> data) {
        try {
            if (null != connectionFlag && connectionFlag == 1) {
                WebSocketClient.closeUserConnection(userId, JSONObject.toJSONString(data));
                return super.returnSuccess("断开连接成功");
            } else if (null != connectionFlag && connectionFlag == 0) {
                ReturnData connection = WebSocketClient.connection(getPlatformTypeServer(1), userId, JSONObject.toJSONString(data));
                String userMessage = WebSocketClient.getUserMessage(userId);
                log.info("这是队列数据：" + userMessage);
                return super.returnResult(0, connection.getErrmsg(), null, userMessage);
            }
            WebSocketClient.connection(getPlatformTypeServer(1), userId, JSONObject.toJSONString(data));
            return super.returnResult(0, "发送指令成功", null, "");
        } catch (BusinessException b) {
            log.error(b.getMessage());
            return super.returnError(b.getMessage());
        } catch (Exception e) {
            log.error(e.getMessage());
            e.printStackTrace();
            return super.returnError("发送遥控器指令错误，系统内部异常");
        }
    }

    @RequestMapping(value = "/getDataAll", method = RequestMethod.GET)
    public ReturnData getDataAll(@RequestParam(value = "pageSize", required = false, defaultValue = "10") Integer pageSize,
                                 @RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                                 @RequestParam(value = "type", required = false) Integer type) {
        try {
            return super.returnResult(0, "获取数据成功", null, messageService.querAll(pageSize, pageNum, type).getList());
        } catch (Exception e) {
            LOGGER.error("HomeController ===== getDataAll ===== 获取图片文件成功 =>", e);
            return super.returnError("获取数据失败,系统内部异常");
        }
    }

    public String getPlatformTypeServer(int platformType) {
        return "ws://localhost:9111/websocket/user";
    }
}
