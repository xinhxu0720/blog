package com.visionvera.web.controller.rest;

import com.alibaba.fastjson.JSONObject;
import com.visionvera.service.MessageService;
import com.visionvera.service.TrackService;
import com.visionvera.service.cityService;
import com.visionvera.util.DoSend;
import com.visionvera.util.RedisUtil;
import com.visionvera.util.StringUtil;
import com.visionvera.util.Weather;
import com.visionvera.vo.Message;
import com.visionvera.vo.Track;
import com.visionvera.vo.WeatherListVO;
import com.visionvera.vo.cityVO;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/SendEmail")
public class SendEmailController {
    private static final Logger log = LoggerFactory.getLogger(SendEmailController.class);

    @Autowired
    RedisUtil redisUtil;

    @Autowired
    cityService cityService;

    @Autowired
    TrackService trackService;

    @Autowired
    MessageService messageService;

    @Autowired
    DoSend doSend;


    @RequestMapping("/go")
    @ResponseBody
    public Object goEmail(String email){
        Map<String, Object> regionNameAndIp;
        String province;
        String city;
        cityVO cityVO;
        //获取地区
        List<cityVO> regionList;
        Map<String, Object> weatherList;
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime localDateTime = now.plusDays(-1);
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        List<Message> newestMessage = messageService.findNewestMessage(localDateTime.format(dateTimeFormatter));
        Weather weather = new Weather();
        log.info("进入推送=======================");

        List<Track> userEmailAndIp = trackService.getUserEmailAndIp(StringUtils.isBlank(email) ? null : email);
        log.info("获取所有用户的邮箱和ip地址=============="+userEmailAndIp);
        for (Track track : userEmailAndIp) {
            if (StringUtil.isNull(track.getCountry())){
                log.info("该ip的邮箱为空:"+track.getIp());
                continue;
            }
             regionNameAndIp = weather.getRegionNameAndIp(track.getIp());
            //去掉省
            province = (String) regionNameAndIp.get("province");
            log.info("地区为："+province);
            province = province.replace("省", "");
            //去掉市
            city = (String) regionNameAndIp.get("city");
            log.info("市区为："+city);
            city = city.replace("市", "");
            //获取对象
            cityVO = new cityVO();
            cityVO.setCountryZh((String) regionNameAndIp.get("country"));
            //获取省
            cityVO.setProvinceZh(province);
            //获取市
            cityVO.setCityZh(city);
            //leaderZh
            cityVO.setLeaderZh(city);

            regionList = cityService.getRegionList(cityVO);
            String id = regionList.get(0).getId();
            log.info("地区id为："+id);
            //通过地区id获取天气
            weatherList = weather.getWeather(id);
            String region = (String) weatherList.get("city");
            log.info("天气城市为："+region);
            List<Map<String,Object>> data = (List<Map<String,Object>>) weatherList.get("data");
            Map<String, Object> map = data.get(0);
            List<Map<String,Object>> hours = (List<Map<String,Object>>) map.get("hours");
            log.info("天气城市天气条数："+hours.size());
            List<WeatherListVO> weatherListVOS = new ArrayList<>();
            int num =0;
            for (Map<String, Object> hour : hours) {
                WeatherListVO wea = new WeatherListVO();
                String day = (String) hour.get("day");
                wea.setDay(day.substring(day.indexOf("日") + 1,day.length()));
                wea.setTem((String) hour.get("tem"));
                wea.setWea((String) hour.get("wea"));
                wea.setWin((String) hour.get("win"));
                wea.setWin_speed((String) hour.get("win_speed"));
                weatherListVOS.add(wea);
                if (num >=5){
                    break;
                }
                num++;
            }
            doSend.sendMail(track.getCountry(), doSend.sendUserMessageTest(region,weatherListVOS,newestMessage), "我想有句话跟你说!");
        }
        return "成功";
    }

    @RequestMapping("/findkey")
    @ResponseBody
    public String findKey(String key){
        boolean hashKey = redisUtil.getHashKey(key);
        if(hashKey){
            return "ok";
        }else {
            return "false";
        }
    }

    /**
     * 将Map转换为对象
     *
     * @param paramMap
     * @param cls
     * @return
     */
    public static <T> T parseMap2Object(Map<String, Object> paramMap, Class<T> cls) {
        return JSONObject.parseObject(JSONObject.toJSONString(paramMap), cls);
    }

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime localDateTime = now.plusDays(-1);
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(localDateTime.format(dateTimeFormatter));

    }
}
