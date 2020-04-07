package com.visionvera.web.controller.rest;

import com.visionvera.service.MessageService;
import com.visionvera.service.TrackService;
import com.visionvera.service.TraitService;
import com.visionvera.util.ChineseDateUtil;
import com.visionvera.vo.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/find")
public class MessageController {

    @Resource
    MessageService messageService;
    @Resource
    TraitService traitService;

    @Resource
    TrackService trackService;

    @RequestMapping("/index")
    public String querAll(HttpServletRequest request){


       // List<Message> messages = messageService.querAll();
      //  request.setAttribute("messages",messages);
        String ip = request.getRemoteAddr();//返回发出请求的IP地址
        int Port = request.getLocalPort();
        request.setAttribute("ip",ip);
        request.setAttribute("port",Port);
     //   List<Message> messages1 = messageService.querAll();
       /* List<Trait> traits = traitService.querAll();
        request.setAttribute("traits",traits);
*/
       /* User user = new User();
        String ipAddress = user.getIpAddress(request);

        Track ip = trackService.findIp(ipAddress);
        Track track = new Track();
        if(ip==null){
            track.setIp(ipAddress);
            track.setVersion(1);
            track.setCreateDate(new Date());
            trackService.add(track);
        }else {
            track.setVersion(ip.getVersion()+1);
            track.setModifyDate(new Date());
            track.setId(ip.getId());
            trackService.update(track);
        }*/
        return "resume";
    }


    @RequestMapping(value="/uploadPictures",method=RequestMethod.POST)
    public Object uploadHeadPic(@RequestParam("file") CommonsMultipartFile file,  String name) {
        String uuid = UUID.randomUUID().toString().trim();
        String fileN=file.getOriginalFilename();
        int index=fileN.indexOf(".");
        String fileName=uuid+fileN.substring(index);
        try {

            File fileMkdir=new File("/sofwate/imgs/");
            if(!fileMkdir.exists()) {
                fileMkdir.mkdir();
            }
            //定义输出流 将文件保存在D盘    file.getOriginalFilename()为获得文件的名字
          String img=  fileMkdir.getPath()+"/"+fileName;
            FileOutputStream os = new FileOutputStream(img);
            InputStream in = file.getInputStream();
            int b = 0;
            while((b=in.read())!=-1){ //读取文件
                os.write(b);
            }
            os.flush(); //关闭流
            in.close();
            os.close();
            Date date = new Date();
            Message message = new Message();
            message.setVersion(1);
            message.setTitly(ChineseDateUtil.getCurrentCNDate());
            message.setContent(name);
            message.setImg(fileName);
            messageService.insertSelective(message);
        } catch (Exception e) {
            return "上传失败";
        }
        return new ModelAndView("redirect:/find/index.do");
    }

    @RequestMapping("/jiaz")
    public String jiaz(HttpServletRequest request){

        return "jiaz";
    }

    public static void main(String[] args) {
        try {
            //获取本机InetAddress实例
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("计算机名字:"+address.getHostName());
            System.out.println("IP地址:" + address.getHostAddress());
            //获取字节数组新式的ip地址
            byte[] bytes = address.getAddress();
            System.out.println("字节新式的ip地址:"+ Arrays.toString(bytes));

            //根据机器名字获取InetAddress实例
            InetAddress byName = InetAddress.getByName("172.20.10.2");
            System.out.println(byName.getHostAddress());
            System.out.println(byName.getHostName());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
