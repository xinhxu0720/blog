package com.visionvera.util;


import com.visionvera.config.AppServerConfig;
import com.visionvera.vo.WeatherListVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.*;

@Component
public class DoSend {

    private static final Logger log = LoggerFactory.getLogger(DoSend.class);

    private String from = "mymissingcontinues@163.com"; // 发件人邮箱地址
    private String user = "mymissingcontinues@163.com"; // 发件人称号，同邮箱地址
    private String password = "xuxinhui1997"; // 发件人邮箱客户端授权码

    public  String sendEmail(int i) {

        return "<body tabindex=\"0\" role=\"listitem\">\n" +
                "<table width=\"700\" border=\"0\" align=\"center\" cellspacing=\"0\" style=\"width:700px;\">\n" +
                "    <tbody>\n" +
                "    <tr>\n" +
                "        <td>\n" +
                "            <div style=\"width:700px;margin:0 auto;border-bottom:1px solid #ccc;margin-bottom:30px;\">\n" +
                "                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"700\" height=\"39\" style=\"font:12px Tahoma, Arial, 宋体;\">\n" +
                "                    <tbody>\n" +
                "                    <tr>\n" +
                "                        <td width=\"210\">\n" +
                "                           \n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "                    </tbody>\n" +
                "                </table>\n" +
                "            </div>\n" +
                "            <div style=\"width:680px;padding:0 10px;margin:0 auto;\">\n" +
                "                <div style=\"line-height:1.5;font-size:14px;margin-bottom:25px;color:#4d4d4d;\">\n" +
                "                    <strong style=\"display:block;margin-bottom:15px;\">\n" +
                "                        亲爱的会员：\n" +
                "                        <span style=\"color:#f60;font-size: 16px;\"></span>您好！\n" +
                "                    </strong>\n" +
                "\n" +
                "                    <strong style=\"display:block;margin-bottom:15px;\">\n" +
                "                        您正在修改安全邮箱，请在验证码输入框中输入：\n" +
                "                        <span style=\"color:#f60;font-size: 24px\">" + i + "</span>，以完成操作。\n" +
                "                    </strong>\n" +
                "                </div>\n" +
                "\n" +
                "                <div style=\"margin-bottom:30px;\">\n" +
                "                    <small style=\"display:block;margin-bottom:20px;font-size:12px;\">\n" +
                "                        <p style=\"color:#747474;\">\n" +
                "                            注意：此操作可能会修改您的密码、登录邮箱或绑定手机。如非本人操作，请及时登录并修改密码以保证帐户安全\n" +
                "                        </p>\n" +
                "                    </small>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div style=\"width:700px;margin:0 auto;\">\n" +
                "                <div style=\"padding:10px 10px 0;border-top:1px solid #ccc;color:#747474;margin-bottom:20px;line-height:1.3em;font-size:12px;\">\n" +
                "                    <p>此为系统邮件，请勿回复<br>\n" +
                "                        请保管好您的邮箱，避免账号被他人盗用\n" +
                "                    </p>\n" +
                "                    <p>Xinhxu;</p>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </td>\n" +
                "    </tr>\n" +
                "    </tbody>\n" +
                "</table>\n" +
                "<style type=\"text/css\">\n" +
                "body{font-size:14px;font-family:arial,verdana,sans-serif;line-height:1.666;padding:0;margin:0;overflow:auto;white-space:normal;word-wrap:break-word;min-height:100px}\n" +
                "td, input, button, select, body{font-family:Helvetica, 'Microsoft Yahei', verdana}\n" +
                "pre {white-space:pre-wrap;white-space:-moz-pre-wrap;white-space:-pre-wrap;white-space:-o-pre-wrap;word-wrap:break-word;width:95%}\n" +
                "th,td{font-family:arial,verdana,sans-serif;line-height:1.666}\n" +
                "img{ border:0}\n" +
                "header,footer,section,aside,article,nav,hgroup,figure,figcaption{display:block}\n" +
                "blockquote{margin-right:0px}\n" +
                "</style><style id=\"ntes_link_color\" type=\"text/css\">a,td a{color:#064977}</style></body>";
    }

    public  String sendUserMessage(String region,List<WeatherListVO> o) {
        String currentCNDate = ChineseDateUtil.getCurrentCNDate();
        String message ="记得要活得像风铃一样清脆哦";
        log.info("推送的消息是："+message);
        return "<body tabindex=\"0\" role=\"listitem\">" +
                "<table width=\"700\" border=\"0\" align=\"center\" cellspacing=\"0\" style=\"width:700px;\">" +
                "    <tbody>" +
                "    <tr>" +
                "        <td>" +
                "            <div style=\"width:700px;margin:0 auto;border-bottom:1px solid #ccc;margin-bottom:30px;\">" +
                "                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"700\" height=\"39\" style=\"font:12px Tahoma, Arial, 宋体;\">" +
                "                    <tbody>" +
                "                    <tr>" +
                "                        <td width=\"210\">" +
                "                        </td>" +
                "                    </tr>" +
                "                    </tbody>" +
                "                </table>" +
                "            </div>" +
                "            <div style=\"width:680px;padding:0 10px;margin:0 auto;\">" +
                "                <div style=\"line-height:1.5;font-size:14px;margin-bottom:25px;color:#4d4d4d;\">" +
                "                    <strong style=\"display:block;margin-bottom:15px;\">" +
                "                        Hi！" +
                "                        <span style=\"color:#f60;font-size: 16px;\"></span>今天是： "+currentCNDate +"<br> " +
                "<br>" +
                "<span style=\"color:#f60;font-size: 18px;\">"+region+"</span>天气：<span style=\"color:#649FCF;font-size: 16px;\">"+o.get(0).getDay()+o.get(0).getWea()+o.get(0).getTem()+" " +
                " "+o.get(1).getDay()+o.get(1).getWea()+o.get(1).getTem()+" " +
                " "+o.get(2).getDay()+o.get(2).getWea()+o.get(2).getTem()+" " +
                " "+o.get(3).getDay()+o.get(3).getWea()+o.get(3).getTem()+" " +
                " "+o.get(4).getDay()+o.get(4).getWea()+o.get(4).getTem()+" " +
                " "+o.get(5).getDay()+o.get(5).getWea()+o.get(5).getTem()+"</span>"+
                "                    </strong>" +
                "                    <strong style=\"display:block;margin-bottom:15px;\">" +
                "                        新的一天！今天也要好好吃饭,今天任然要保持学习  " +
                "                        <span style=\"color:#f60;font-size: 24px\">" + message + "</span> 祝好运." +
                "                    </strong>" +
                "                </div>" +
                "                <div style=\"margin-bottom:30px;\">" +
                "                    <small style=\"display:block;margin-bottom:20px;font-size:12px;\">" +
                "                        <p style=\"color:#747474;\">" +
                "                            切记：爱护ta人之前，要先学会爱护自己哦~~~" +
                "                        </p>" +
                "                    </small>" +
                "                </div>" +
                "            </div>" +
                "            <div style=\"width:700px;margin:0 auto;\">" +
                "                <div style=\"padding:10px 10px 0;border-top:1px solid #ccc;color:#747474;margin-bottom:20px;line-height:1.3em;font-size:12px;\">" +
                "                    <p>请勿回复，(当然如果你有想说的也是可以回复的)~~~<br>" +
                "                        记得多与家人保持联络哦~~~！" +
                "                    </p>" +
                "                    <p>Xinhxu;</p>" +
                "                </div>" +
                "            </div>" +
                "        </td>" +
                "    </tr>" +
                "    </tbody>" +
                "</table>" +
                "<style type=\"text/css\">" +
                "body{font-size:14px;font-family:arial,verdana,sans-serif;line-height:1.666;padding:0;margin:0;overflow:auto;white-space:normal;word-wrap:break-word;min-height:100px}" +
                "td, input, button, select, body{font-family:Helvetica, 'Microsoft Yahei', verdana}" +
                "pre {white-space:pre-wrap;white-space:-moz-pre-wrap;white-space:-pre-wrap;white-space:-o-pre-wrap;word-wrap:break-word;width:95%}" +
                "th,td{font-family:arial,verdana,sans-serif;line-height:1.666}" +
                "img{ border:0}" +
                "header,footer,section,aside,article,nav,hgroup,figure,figcaption{display:block}" +
                "blockquote{margin-right:0px}" +
                "</style><style id=\"ntes_link_color\" type=\"text/css\">a,td a{color:#064977}</style></body>";
    }

    /**
     * @param to
     * @param text
     * @param title
     */
    /* 发送验证信息的邮件 */
    public boolean sendMail(String to, String text, String title) {
        Properties props = new Properties();
        props.setProperty("mail.smtp.host", "smtp.163.com"); // 设置发送邮件的邮件服务器的属性（这里使用网易的smtp服务器）
        props.put("mail.smtp.host", "smtp.163.com"); // 需要经过授权，也就是有户名和密码的校验，这样才能通过验证（一定要有这一条）
        props.put("mail.smtp.auth", "true"); // 用刚刚设置好的props对象构建一个session
        props.setProperty("mail.smtp.port","465");
        props.put("mail.smtp.ssl.enable", true);
        Session session = Session.getDefaultInstance(props); // 有了这句便可以在发送邮件的过程中在console处显示过程信息，供调试使
        // 用（你可以在控制台（console)上看到发送邮件的过程）
        session.setDebug(true); // 用session为参数定义消息对象
        MimeMessage message = new MimeMessage(session); // 加载发件人地址
        try {
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to)); // 加载收件人地址
            message.setSubject(title); // 加载标题
            Multipart multipart = new MimeMultipart(); // 向multipart对象中添加邮件的各个部分内容，包括文本内容和附件
            BodyPart contentPart = new MimeBodyPart(); // 设置邮件的文本内容
            contentPart.setContent(text, "text/html;charset=utf-8");
            multipart.addBodyPart(contentPart);
            message.setContent(multipart);
            message.saveChanges(); // 保存变化
            Transport transport = session.getTransport("smtp"); // 连接服务器的邮箱
            transport.connect("smtp.163.com", user, password); // 把邮件发送出去
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        } catch (MessagingException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public static final Map<String,String> TYPE=new HashMap<String,String>(){
        {
            put("jpg","1");
            put("jfif","1");
            put("jpeg","1");
            put("png","1");
            put("gif","1");
            put("AVI","2");
            put("MOV","2");
            put("ASF","2");
            put("mp4","2");
        }
    };

    @Autowired
    AppServerConfig appServerConfig;


    public  String sendUserMessageTest(String region,List<WeatherListVO> o,List<com.visionvera.vo.Message> messages) {
        String currentCNDate = ChineseDateUtil.getCurrentCNDate();
        if (o.size() < 5){
            WeatherListVO wea1 = new WeatherListVO();
            wea1.setDay("");
            wea1.setWea("");
            wea1.setTem("");
            WeatherListVO wea2 = new WeatherListVO();
            wea2.setDay("");
            wea2.setWea("");
            wea2.setTem("");
            o.add(wea1);
            o.add(wea2);
        }
        log.info(appServerConfig.getWgIp());
        //空的则表示不传图片信息
        if (messages.isEmpty()){
            sendUserMessage1(region,o,messages,appServerConfig.getWgIp());
        }else {
            com.visionvera.vo.Message message = messages.get(0);
            String img = message.getImg();
            String imgSuffix = img.substring(img.indexOf(".") + 1, img.length());
            log.info("文件后缀："+imgSuffix);
            String s = TYPE.get(imgSuffix);
            //等于1则是图片类型
            if (s.equals("1")){
                log.info("推送的是图片消息："+messages.get(0).getImg());
                return sendUserMessage2(region,o,messages,appServerConfig.getWgIp());
                //等于2则是视频类型
            }else if (s.equals("2")){
                log.info("推送的是视频消息："+messages.get(0).getImg());
                return sendUserMessage3(region,o,messages,appServerConfig.getWgIp());
            }
            log.info("推送的普通消息是："+message.getContent());
        }
        String sendUserMessage= "<body tabindex='0' role='listitem'> " +
                "<table width='700' border='0' align='center' cellspacing='0' style='width:700px;'>" +
                "  <tbody><tr><td>" +
                "  <div style='width:700px;margin:0 auto;border-bottom:1px solid #ccc;margin-bottom:30px;'>" +
                "   <table border='0' cellpadding='0' cellspacing='0' width='700' height='39' style='font:12px Tahoma, Arial, 宋体;'>" +
                "    <tbody><tr>" +
                "     <td width='210'></td></tr></tbody></table></div>" +
                "     <div style='width:680px;padding:0 10px;margin:0 auto;'>" +
                "      <div style='line-height:1.5;font-size:14px;margin-bottom:25px;color:#4d4d4d;'>" +
                "       <strong style='display:block;margin-bottom:15px;'>" +
                "       Hi！<span style='color:#f60;font-size: 16px;'></span>今天是： "+currentCNDate+" <br><br>" +
                "        <span style='color:#f60;font-size: 18px;'>"+region+"</span>天气：<span style='color:#649FCF;font-size: 16px;'>" +
                "                "+o.get(0).getDay()+o.get(0).getWea()+o.get(0).getTem()+" " +
                "                "+o.get(1).getDay()+o.get(1).getWea()+o.get(1).getTem()+" " +
                "                "+o.get(2).getDay()+o.get(2).getWea()+o.get(2).getTem()+" " +
                "                "+o.get(3).getDay()+o.get(3).getWea()+o.get(3).getTem()+" " +
                "                "+o.get(4).getDay()+o.get(4).getWea()+o.get(4).getTem()+" " +
                "                "+o.get(5).getDay()+o.get(5).getWea()+o.get(5).getTem()+" " +"</span></strong>" +
                "       <strong style='display:block;margin-bottom:15px;'>" +
                "       新的一天！今天也要好好吃饭，<span style='color:#f60;font-size: 18px;'>"+appServerConfig.getWgIp()+"</span> 祝好运。<br/>"+
                "       "+"</strong></div>" +
                "       <div style='margin-bottom:30px;'>" +
                "       <small style='display:block;margin-bottom:20px;font-size:12px;'>" +
                "        <p style='color:#747474;'></p>" +
                "         </small></div></div>" +
                "         <div style='width:700px;margin:0 auto;'>" +
                "         <div style='padding:10px 10px 0;border-top:1px solid #ccc;color:#747474;margin-bottom:20px;line-height:1.3em;font-size:12px;'>" +
                "         <p>记得多与家人保持联络哦~~~！<br>" +
                "         爱他人之前，要先学会爱护自己哦~~~！ <br>" +
                "         </p>" +
                "         <p>请勿回复！</p></div></div></td></tr></tbody></table>" +
                "         <style type='text/css'>" +
                "          body{font-size:14px;font-family:arial,verdana,sans-serif;line-height:1.666;padding:0;margin:0;overflow:auto;white-space:normal;word-wrap:break-word;min-height:100px}" +
                "          td, input, button, select, body{font-family:Helvetica, 'Microsoft Yahei', verdana}" +
                "          pre {white-space:pre-wrap;white-space:-moz-pre-wrap;white-space:-pre-wrap;white-space:-o-pre-wrap;word-wrap:break-word;width:95%}" +
                "          th,td{font-family:arial,verdana,sans-serif;line-height:1.666}" +
                "          img{ border:0}" +
                "          header,footer,section,aside,article,nav,hgroup,figure,figcaption{display:block}" +
                "          blockquote{margin-right:0px}" +
                "          </style><style id='ntes_link_color' type='text/css'>a,td a{color:#064977}</style></body>";
        log.info("推送成功:"+ sendUserMessage);
        return sendUserMessage;
    }

    public  String sendUserMessage1(String region,List<WeatherListVO> o,List<com.visionvera.vo.Message> messages,String info) {
        String currentCNDate = ChineseDateUtil.getCurrentCNDate();
        String sendUserMessage= "<body tabindex='0' role='listitem'> " +
                "<table width='700' border='0' align='center' cellspacing='0' style='width:700px;'>" +
                "  <tbody><tr><td>" +
                "  <div style='width:700px;margin:0 auto;border-bottom:1px solid #ccc;margin-bottom:30px;'>" +
                "   <table border='0' cellpadding='0' cellspacing='0' width='700' height='39' style='font:12px Tahoma, Arial, 宋体;'>" +
                "    <tbody><tr>" +
                "     <td width='210'></td></tr></tbody></table></div>" +
                "     <div style='width:680px;padding:0 10px;margin:0 auto;'>" +
                "      <div style='line-height:1.5;font-size:14px;margin-bottom:25px;color:#4d4d4d;'>" +
                "       <strong style='display:block;margin-bottom:15px;'>" +
                "       Hi！<span style='color:#f60;font-size: 16px;'></span>今天是： "+currentCNDate+" <br><br>" +
                "        <span style='color:#f60;font-size: 18px;'>"+region+"</span>天气：<span style='color:#649FCF;font-size: 16px;'>" +
                "                "+o.get(0).getDay()+o.get(0).getWea()+o.get(0).getTem()+" " +
                "                "+o.get(1).getDay()+o.get(1).getWea()+o.get(1).getTem()+" " +
                "                "+o.get(2).getDay()+o.get(2).getWea()+o.get(2).getTem()+" " +
                "                "+o.get(3).getDay()+o.get(3).getWea()+o.get(3).getTem()+" " +
                "                "+o.get(4).getDay()+o.get(4).getWea()+o.get(4).getTem()+" " +
                "                "+o.get(5).getDay()+o.get(5).getWea()+o.get(5).getTem()+" " +"</span></strong>" +
                "       <strong style='display:block;margin-bottom:15px;'>" +
                "       新的一天！今天也要好好吃饭，<span style='color:#f60;font-size: 18px;'>"+info+"</span> 祝好运。<br/>"+
                "       </strong></div>" +
                "       <div style='margin-bottom:30px;'>" +
                "       <small style='display:block;margin-bottom:20px;font-size:12px;'>" +
                "        <p style='color:#747474;'></p>" +
                "           </small></div></div>" +
                "         <div style='width:700px;margin:0 auto;'>" +
                "         <div style='padding:10px 10px 0;border-top:1px solid #ccc;color:#747474;margin-bottom:20px;line-height:1.3em;font-size:12px;'>" +
                "         <p>记得多与家人保持联络哦~~~！<br>" +
                "         爱他人之前，要先学会爱护自己哦~~~！</p>" +
                "         <p>请勿回复！</p></div></div></td></tr></tbody></table>" +
                "         <style type='text/css'>" +
                "          body{font-size:14px;font-family:arial,verdana,sans-serif;line-height:1.666;padding:0;margin:0;overflow:auto;white-space:normal;word-wrap:break-word;min-height:100px}" +
                "          td, input, button, select, body{font-family:Helvetica, 'Microsoft Yahei', verdana}" +
                "          pre {white-space:pre-wrap;white-space:-moz-pre-wrap;white-space:-pre-wrap;white-space:-o-pre-wrap;word-wrap:break-word;width:95%}" +
                "          th,td{font-family:arial,verdana,sans-serif;line-height:1.666}" +
                "          img{ border:0}" +
                "          header,footer,section,aside,article,nav,hgroup,figure,figcaption{display:block}" +
                "          blockquote{margin-right:0px}" +
                "          </style><style id='ntes_link_color' type='text/css'>a,td a{color:#064977}</style></body>";
        log.info("推送成功:"+ sendUserMessage);
        return sendUserMessage;
    }

    public  String sendUserMessage2(String region,List<WeatherListVO> o,List<com.visionvera.vo.Message> messages,String info) {
        String currentCNDate = ChineseDateUtil.getCurrentCNDate();
        com.visionvera.vo.Message message = messages.get(0);
        log.info("推送的消息是："+message.getContent());
        String sendUserMessage= "<body tabindex='0' role='listitem'> " +
                "<table width='700' border='0' align='center' cellspacing='0' style='width:700px;'>" +
                "  <tbody><tr><td>" +
                "  <div style='width:700px;margin:0 auto;border-bottom:1px solid #ccc;margin-bottom:30px;'>" +
                "   <table border='0' cellpadding='0' cellspacing='0' width='700' height='39' style='font:12px Tahoma, Arial, 宋体;'>" +
                "    <tbody><tr>" +
                "     <td width='210'></td></tr></tbody></table></div>" +
                "     <div style='width:680px;padding:0 10px;margin:0 auto;'>" +
                "      <div style='line-height:1.5;font-size:14px;margin-bottom:25px;color:#4d4d4d;'>" +
                "       <strong style='display:block;margin-bottom:15px;'>" +
                "       Hi！<span style='color:#f60;font-size: 16px;'></span>今天是： "+currentCNDate+" <br><br>" +
                "        <span style='color:#f60;font-size: 18px;'>"+region+"</span>天气：<span style='color:#649FCF;font-size: 16px;'>" +
                "                "+o.get(0).getDay()+o.get(0).getWea()+o.get(0).getTem()+" " +
                "                "+o.get(1).getDay()+o.get(1).getWea()+o.get(1).getTem()+" " +
                "                "+o.get(2).getDay()+o.get(2).getWea()+o.get(2).getTem()+" " +
                "                "+o.get(3).getDay()+o.get(3).getWea()+o.get(3).getTem()+" " +
                "                "+o.get(4).getDay()+o.get(4).getWea()+o.get(4).getTem()+" " +
                "                "+o.get(5).getDay()+o.get(5).getWea()+o.get(5).getTem()+" " +"</span></strong>" +
                "       <strong style='display:block;margin-bottom:15px;'>" +
                "       新的一天！今天也要好好吃饭，<span style='color:#f60;font-size: 18px;'>"+message.getSoup()+"</span> 祝好运。<br/><br/>"+
                "       <span style='display:block;margin-bottom:17px;text-decoration:underline;font-size: 16px;'>"+message.getContent()+"</span>" +
                "       <img src='http://182.92.169.183:/pictures/"+message.getImg()+"' style='width: 680px;height: 480px;'>"+
                "        "+"</strong></div>" +
                "       <div style='margin-bottom:30px;'>" +
                "       <small style='display:block;margin-bottom:20px;font-size:12px;'>" +
                "        <p style='color:#747474;'></p>" +
                "           </small></div></div>" +
                "         <div style='width:700px;margin:0 auto;'>" +
                "         <div style='padding:10px 10px 0;border-top:1px solid #ccc;color:#747474;margin-bottom:20px;line-height:1.3em;font-size:12px;'>" +
                "         <p>记得多与家人保持联络哦~~~！<br>" +
                "         爱他人之前，要先学会爱护自己哦~~~！</p>" +
                "         <p>请勿回复！</p></div></div></td></tr></tbody></table>" +
                "         <style type='text/css'>" +
                "          body{font-size:14px;font-family:arial,verdana,sans-serif;line-height:1.666;padding:0;margin:0;overflow:auto;white-space:normal;word-wrap:break-word;min-height:100px}" +
                "          td, input, button, select, body{font-family:Helvetica, 'Microsoft Yahei', verdana}" +
                "          pre {white-space:pre-wrap;white-space:-moz-pre-wrap;white-space:-pre-wrap;white-space:-o-pre-wrap;word-wrap:break-word;width:95%}" +
                "          th,td{font-family:arial,verdana,sans-serif;line-height:1.666}" +
                "          img{ border:0}" +
                "          header,footer,section,aside,article,nav,hgroup,figure,figcaption{display:block}" +
                "          blockquote{margin-right:0px}" +
                "          </style><style id='ntes_link_color' type='text/css'>a,td a{color:#064977}</style></body>";
        log.info("推送成功:"+ sendUserMessage);
        return sendUserMessage;
    }

    public  String sendUserMessage3(String region,List<WeatherListVO> o,List<com.visionvera.vo.Message> messages,String info) {
        String currentCNDate = ChineseDateUtil.getCurrentCNDate();
        com.visionvera.vo.Message message = messages.get(0);
        log.info("推送的消息是："+message.getContent());
        String sendUserMessage= "<body tabindex='0' role='listitem'> " +
                "<table width='700' border='0' align='center' cellspacing='0' style='width:700px;'>" +
                "  <tbody><tr><td>" +
                "  <div style='width:700px;margin:0 auto;border-bottom:1px solid #ccc;margin-bottom:30px;'>" +
                "   <table border='0' cellpadding='0' cellspacing='0' width='700' height='39' style='font:12px Tahoma, Arial, 宋体;'>" +
                "    <tbody><tr>" +
                "     <td width='210'></td></tr></tbody></table></div>" +
                "     <div style='width:680px;padding:0 10px;margin:0 auto;'>" +
                "      <div style='line-height:1.5;font-size:14px;margin-bottom:25px;color:#4d4d4d;'>" +
                "       <strong style='display:block;margin-bottom:15px;'>" +
                "       Hi！<span style='color:#f60;font-size: 16px;'></span>今天是： "+currentCNDate+" <br><br>" +
                "        <span style='color:#f60;font-size: 18px;'>"+region+"</span>天气：<span style='color:#649FCF;font-size: 16px;'>" +
                "                "+o.get(0).getDay()+o.get(0).getWea()+o.get(0).getTem()+" " +
                "                "+o.get(1).getDay()+o.get(1).getWea()+o.get(1).getTem()+" " +
                "                "+o.get(2).getDay()+o.get(2).getWea()+o.get(2).getTem()+" " +
                "                "+o.get(3).getDay()+o.get(3).getWea()+o.get(3).getTem()+" " +
                "                "+o.get(4).getDay()+o.get(4).getWea()+o.get(4).getTem()+" " +
                "                "+o.get(5).getDay()+o.get(5).getWea()+o.get(5).getTem()+" " +"</span></strong>" +
                "       <strong style='display:block;margin-bottom:15px;'>" +
                "       新的一天！今天也要好好吃饭，<span style='color:#f60;font-size: 18px;'>"+message.getSoup()+"</span> 祝好运。<br/><br/>"+
                "       <span style='display:block;margin-bottom:15px;'>"+message.getContent()+"<span style='color:#747474;font-size: 13px;'>&nbsp;ps:若视频无法播放，请尝试使用游览器打开邮箱</span></span>" +
                "                   <video width='640' height='480' controls autoplay>" +
                "                        <source src='http://182.92.169.183:/pictures/"+message.getImg()+"' type='video/ogg'>" +
                "                        <source src='http://182.92.169.183:/pictures/"+message.getImg()+"' type='video/mp4'>" +
                "                        <source src='http://182.92.169.183:/pictures/"+message.getImg()+"' type='video/webm'>" +
                "                        <object data='http://182.92.169.183:/pictures/"+message.getImg()+"' width='640' height='480'>" +
                "                            <embed width='640' height='480' src='http://182.92.169.183:/pictures/"+message.getImg()+"'>" +
                "                        </object>" +
                "                    </video>" +
                "       </strong></div>" +
                "       <div style='margin-bottom:30px;'>" +
                "       <small style='display:block;margin-bottom:20px;font-size:12px;'>" +
                "        <p style='color:#747474;'></p>" +
                "       </small></div></div>" +
                "         <div style='width:700px;margin:0 auto;'>" +
                "         <div style='padding:10px 10px 0;border-top:1px solid #ccc;color:#747474;margin-bottom:20px;line-height:1.3em;font-size:12px;'>" +
                "         <p>记得多与家人保持联络哦~~~！<br>" +
                "         爱他人之前，要先学会爱护自己哦~~~！</p>" +
                "         <p>请勿回复！</p></div></div></td></tr></tbody></table>" +
                "         <style type='text/css'>" +
                "          body{font-size:14px;font-family:arial,verdana,sans-serif;line-height:1.666;padding:0;margin:0;overflow:auto;white-space:normal;word-wrap:break-word;min-height:100px}" +
                "          td, input, button, select, body{font-family:Helvetica, 'Microsoft Yahei', verdana}" +
                "          pre {white-space:pre-wrap;white-space:-moz-pre-wrap;white-space:-pre-wrap;white-space:-o-pre-wrap;word-wrap:break-word;width:95%}" +
                "          th,td{font-family:arial,verdana,sans-serif;line-height:1.666}" +
                "          img{ border:0}" +
                "          header,footer,section,aside,article,nav,hgroup,figure,figcaption{display:block}" +
                "          blockquote{margin-right:0px}" +
                "          </style><style id='ntes_link_color' type='text/css'>a,td a{color:#064977}</style></body>";
        log.info("推送成功:"+ sendUserMessage);
        return sendUserMessage;
    }
}


