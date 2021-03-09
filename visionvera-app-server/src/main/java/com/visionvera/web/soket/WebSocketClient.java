package com.visionvera.web.soket;

import com.visionvera.bean.base.BaseReturn;
import com.visionvera.bean.base.ReturnData;
import com.visionvera.constrant.AppServerConstants;
import com.visionvera.util.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.websocket.*;
import java.io.IOException;
import java.net.URI;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName WebSocketClient
 * @Description TODO
 * @Author 徐鑫辉
 * @Date 2020年03月11日 13:37
 **/
public class WebSocketClient {


    private static final Logger LOGGER = LoggerFactory.getLogger(WebSocketClient.class);

    public static ConcurrentHashMap<String, Session> userConnection = new ConcurrentHashMap<>();

    /**
     * WebSocket连接的超时时间
     */
    private static final long webSocketTimeout = 5000;

    /**
     * 建立webSocket连接或直接发送消息
     *
     * @param url
     * @param userId
     * @param message
     * @return
     */
    public static ReturnData connection(String url, String userId, String message) throws BusinessException {
        BaseReturn dataReturn = new BaseReturn();
        try {
            if (userConnection.containsKey(userId)) {
                Session userSession = userConnection.get(userId);
                LOGGER.info("当前用户已建立过连接，现所需发送数据：" + message);
                userSession.getBasicRemote().sendText(message);
                LOGGER.info("发送数据完毕....");
                return dataReturn.returnSuccess("发送数据成功...");
            } else {
                LOGGER.info("当前用户未建立过连接，开始建立连接....");
                WebSocketContainer container = ContainerProvider.getWebSocketContainer();
                //  container.setDefaultAsyncSendTimeout(webSocketTimeout);
                Session session = container.connectToServer(new WebSocketClientListener(), URI.create(url));
                if (session.isOpen()) {
                    userConnection.put(userId, session);
                } else {
                    LOGGER.error("建立webSocket连接异常。。。");
                    throw new BusinessException("建立webSocket连接异常。。。");
                }
            }
            LOGGER.info("建立连接完成....");
            LOGGER.info("有新连接加入！当前在线人数为：" + userConnection.size());
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
        } catch (DeploymentException e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
        }
        return dataReturn.returnSuccess("建立连接成功...");
    }

    /**
     * 获取全部用户链接
     *
     * @return
     */
    public static Map<String, Session> getUserSessionAll() {
        return userConnection;
    }

    /**
     * 获取用户指定链接
     *
     * @param userId
     * @return
     */
    public static Session getUserSessionId(String userId) {
        return userConnection.get(userId);
    }

    /**
     * 删除用户链接
     *
     * @param userId
     */
    public static void delUserSession(String userId) {
        userConnection.remove(userId);
    }

    /**
     * 关闭指定用户链接
     *
     * @param userId
     */
    public static void closeUserConnection(String userId, String message) throws BusinessException {
        try {
            Session userSessionId = getUserSessionId(userId);
            if (null == userSessionId) {
                LOGGER.error("当前用户未建立过webSocket连接。。。");
                throw new BusinessException("当前用户未建立过webSocket连接。。。");
            } else {
                //断开终端连接
                userSessionId.getBasicRemote().sendText(message);
                userSessionId.close(new CloseReason(CloseReason.CloseCodes.NORMAL_CLOSURE, "用户正常断开连接"));
            }
            //清除用户消息
            WebSocketClientListener.delUserSessionMessage(getUserSessionId(userId));
            //清除用户链接记录
            delUserSession(userId);
            LOGGER.info("有一连接关闭！当前在线人数为：" + userConnection.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取用户消息
     *
     * @param userId
     * @return
     */
    public static String getUserMessage(String userId) throws BusinessException {
        String message = null;
        try {
            Session userSessionId = getUserSessionId(userId);
            LOGGER.info("这是通过用户id获取的session连接：" + userSessionId.getId());
            message = WebSocketClientListener.getMessage(userSessionId);
            if (null == message) {
                for (int i = 1; i <= AppServerConstants.WEB_SOCKET_TIMEOUT; i++) {
                    if (i == AppServerConstants.WEB_SOCKET_TIMEOUT) {
                        LOGGER.error("获取消息转发返回数据等待超时。。。");
                        throw new BusinessException("获取消息转发返回数据等待超时。。。");
                    }
                    Thread.sleep(1000);
                    message = WebSocketClientListener.getMessage(userSessionId);
                    if (message != null) {
                        break;
                    }
                }
            }
            //获取数据之后要清空上个session
            WebSocketClientListener.delUserSessionMessage(userSessionId);
            LOGGER.error("当前清空数据后的map：" + WebSocketClientListener.getUserSessionAll().size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOGGER.info("这是通过用户session获取的消息：" + message);
        return message;
    }

}
