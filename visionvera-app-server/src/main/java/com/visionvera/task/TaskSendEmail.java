package com.visionvera.task;

import com.visionvera.config.AppServerConfig;
import com.visionvera.service.MessageService;
import com.visionvera.service.TrackService;
import com.visionvera.service.cityService;
import com.visionvera.util.DoSend;
import com.visionvera.util.StringUtil;
import com.visionvera.util.Weather;
import com.visionvera.vo.Message;
import com.visionvera.vo.Track;
import com.visionvera.vo.WeatherListVO;
import com.visionvera.vo.cityVO;
import com.visionvera.web.controller.rest.SendEmailController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName TaskSendEmail
 * @Description TODO
 * @Author 徐鑫辉
 * @Date 2019年12月11日 19:22
 **/
@Component
@EnableScheduling
public class TaskSendEmail {
    private static final Logger log = LoggerFactory.getLogger(TaskSendEmail.class);

    @Autowired
    TrackService trackService;

    @Autowired
    cityService cityService;

    @Autowired
    DoSend doSend;

    @Autowired
    MessageService messageService;

    @Autowired
    AppServerConfig appServerConfig;
    /**
     * @Component
     * @EnableScheduling
     * public class taskTest {
     *
     *     @Autowired
     *     AsyncTest asyncTest;
     *
     *     @SuppressWarnings("unchecked")
     *     @Scheduled(cron = "0/5 * * * * ?")
     *     public void task() {
     *         asyncTest.sendMsg();
     *         System.out.println("定时任务启动:" + new Date());
     *     }
     *   //秒 分钟 小时 日期 月份 星期 年（可选）
     * 	  0 0 10,14,16 * * ? 每天上午10点，下午2点，4点
     * 	  0 0/30 9-17 * * ?   朝九晚五工作时间内每半小时
     * 	  0 0 12 ? * WED 表示每个星期三中午12点
     * 	 "0 0 12 * * ?" 每天中午12点触发
     * 	 "0 15 10 ? * *" 每天上午10:15触发
     * 	 "0 15 10 * * ?" 每天上午10:15触发
     * 	 "0 15 10 * * ? *" 每天上午10:15触发
     * 	 "0 15 10 * * ? 2005" 2005年的每天上午10:15触发
     * 	 "0 * 14 * * ?" 在每天下午2点到下午2:59期间的每1分钟触发
     * 	 "0 0/5 14 * * ?" 在每天下午2点到下午2:55期间的每5分钟触发
     * 	 "0 0/5 14,18 * * ?" 在每天下午2点到2:55期间和下午6点到6:55期间的每5分钟触发
     * 	 "0 0-5 14 * * ?" 在每天下午2点到下午2:05期间的每1分钟触发
     * 	 "0 10,44 14 ? 3 WED" 每年三月的星期三的下午2:10和2:44触发
     * 	 "0 15 10 ? * MON-FRI" 周一至周五的上午10:15触发
     * 	 "0 15 10 15 * ?" 每月15日上午10:15触发
     * 	 "0 15 10 L * ?" 每月最后一日的上午10:15触发
     * 	 "0 15 10 ? * 6L" 每月的最后一个星期五上午10:15触发
     *    0 15 10 ? * 6L 2002-2005" 2002年至2005年的每月的最后一个星期五上午10:15触发
     * 	 "0 15 10 ? * 6#3" 每月的第三个星期五上午10:15触发*/
    @SuppressWarnings("unchecked")
    @Scheduled(cron = "0 15 8 * * ? ")
    private void hourUpdateDevices(){
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
        List<Track> userEmailAndIp = trackService.getUserEmailAndIp(null);
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
    }
}
