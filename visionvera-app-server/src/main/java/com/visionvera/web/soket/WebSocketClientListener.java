package com.visionvera.web.soket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.websocket.*;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName WebSocketClientListener
 * @Description TODO
 * @Author 徐鑫辉
 * @Date 2020年03月13日 19:01
 **/
@ClientEndpoint
public class WebSocketClientListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebSocketClientListener.class);

    public  static ConcurrentHashMap<Session,Object> userSession = new ConcurrentHashMap<>();

    @OnOpen
    public void onOpen(Session session) {
        LOGGER.info("用户建立连接: " + session.getBasicRemote());
    }

    @OnMessage
    public void processMessage(String message, Session session) {
        LOGGER.info("这是返回的sessionID" + session.getId());
        //WebSocketClientListener.setUserSession(session, message);
        LOGGER.info("这是返回的processMessage: " + message);
    }

    @OnError
    public void processError(Throwable t) {
        LOGGER.error("失败的连接", t);
        t.printStackTrace();
    }

    @OnClose
    public void onClosing(CloseReason closeReason) {
        LOGGER.info("关闭连接。关闭原因: [" + closeReason.getReasonPhrase() + "]");
    }

    /**
     * 存储返回给用户的消息
     * @param session
     * @param message
     */
    public static void setUserSession(Session session, String message){
        userSession.put(session,message);
        LOGGER.info("往队列里添加"+session.getId()+"用户session成功,队列长度：" + userSession.size());
    }

    /**
     * 获取所有数据
     * @return
     */
    public static Map<Session,Object> getUserSessionAll(){
        return userSession;
    }

    /**
     * 获取用户消息
     * @param session
     * @return
     */
    public static String getMessage(Session session){
        return (String) userSession.get(session);
    }

    /**
     * 删除用户消息
     * @param session
     */
    public static void	delUserSessionMessage(Session session){
        userSession.remove(session);
    }
}
