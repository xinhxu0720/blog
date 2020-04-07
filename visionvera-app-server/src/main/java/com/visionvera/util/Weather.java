package com.visionvera.util;

import com.visionvera.bean.restful.client.RestClient;

import java.util.Map;
import java.util.Objects;

/**
 * @ClassName Weather
 * @Description TODO
 * @Author 徐鑫辉
 * @Date 2019年12月12日 10:40
 **/
public class Weather {
        String  appid ="91677414";
        String appsecret="9LujuRyV";
        String version ="v1";

    public Map<String, Object> getWeather(String cityid){
        String url ="https://www.tianqiapi.com/api/?version="+version+
                "&cityid="+cityid+"&appid="+appid+"&appsecret="+appid+"";
        Map<String, Object> map = RestClient.get(url, null, null);
        return map;
    }

    public Map<String, Object> getRegionNameAndIp(String ip){
        String url ="http://ip.tianqiapi.com/?ip="+ip+"&appid="+appid+"&appsecret="+appsecret+"";
        Map<String, Object> map = RestClient.get(url, null, null);
        return map;
    }

    public static void main(String[] args) {
        String[] cc =new String[]{"112.95.175.19","183.56.159.141"};
        for (String s : cc) {
            Map<String, Object> weather = new Weather().getRegionNameAndIp(s);
            System.out.println(weather);
        }
        //14.204.121.253上海
        //139.207.121.117
        //43.250.201.51
    }
}
