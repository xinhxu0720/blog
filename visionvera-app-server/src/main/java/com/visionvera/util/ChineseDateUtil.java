package com.visionvera.util;

import com.visionvera.vo.Message;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;


@Component
public class ChineseDateUtil {

    /**
     * 中文数字
     */
    private static final String[] CN_NUMBER_NAME = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};

    /**
     * 获取当前时间的中文时间
     * @return 中文时间
     */
    public static String getCurrentCNDate() {

        Calendar cal = Calendar.getInstance(); // 使用日历类
        String year = String.valueOf(cal.get(Calendar.YEAR)); // 得到年
        String month = String.valueOf(cal.get(Calendar.MONTH) + 1); // 得到月，因为从0开始的，所以要加1
        String day = String.valueOf(cal.get(Calendar.DAY_OF_MONTH)); // 得到天

        StringBuilder cnDate = new StringBuilder();
        for (int i = 0; i < year.length(); i++) {
            cnDate.append(CN_NUMBER_NAME[Integer.valueOf(String.valueOf(year.charAt(i)))]);
        }

        cnDate.append("年");

        for (int i = 0; i < month.length(); i++) {
            if (month.length() >= 2){
                if (1 == i+1){
                    cnDate.append("十");
                    continue;
                } else {
                    cnDate.append(CN_NUMBER_NAME[Integer.valueOf(String.valueOf(month.charAt(i)))]);
                }
            }else {
                cnDate.append(CN_NUMBER_NAME[Integer.valueOf(String.valueOf(month.charAt(i)))]);
            }
        }

        cnDate.append("月");

        if (day.length() == 2) {
            Integer value = Integer.valueOf(String.valueOf(day.charAt(0)));
            if (!value.equals(1)) {
                cnDate.append(CN_NUMBER_NAME[value]);
            }
            cnDate.append("十");
            if (!String.valueOf(day.charAt(1)).equals("0")) {
                cnDate.append(CN_NUMBER_NAME[Integer.valueOf(String.valueOf(day.charAt(1)))]);
            }
        } else {
            cnDate.append(CN_NUMBER_NAME[Integer.valueOf(String.valueOf(day.charAt(0)))]);
        }
        String[] weekDays = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};

        cnDate.append("日");

        cnDate.append("("+weekDays[cal.get(Calendar.DAY_OF_WEEK)-1]+")");
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        if (hour <= 12){
            cnDate.append(" 上午"+hour+":");
            if (minute<=10){
                cnDate.append(String.valueOf("0"+minute));
            }else {
                cnDate.append(minute);
            }
        }else {
            cnDate.append(" 下午"+hour+":");
            if (minute<=10){
                cnDate.append(String.valueOf("0"+minute));
            }else {
                cnDate.append(minute);
            }
        }
        return cnDate.toString();
    }

    public static void main(String[] args) {
        ChineseDateUtil chineseDateUtil = new ChineseDateUtil();
        String currentCNDate = chineseDateUtil.getCurrentCNDate();

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime localDateTime = now.plusDays(-1);
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(localDateTime.format(dateTimeFormatter));

    }

    private static String chinese_period(Long t){
        Long y, n, d, h, m, s;
        String time;
        if(t<=0) return "立即";
        s = t % 60; t /= 60;
        m = t % 60; t /= 60;
        h = t % 24; t /= 24;
        d = t % 30; t /= 30;
        n = t % 12; t /= 12;
        y = t;
        time = "";
        if(y>0) time = y + "年又";
        if(n>0) time += n + "个月";
        if(d>0) time += d + "天";
        if(h>0) time += h + "小时";
        if(m>0) time += m+ "分";
        if(s>0) time += s + "秒";
        return time;
    }
    public static char formatDigit(char sign){
        if(sign == '0')
            sign = '0';
        if(sign == '1')
            sign = '一';
        if(sign == '2')
            sign = '二';
        if(sign == '3')
            sign = '三';
        if(sign == '4')
            sign = '四';
        if(sign == '5')
            sign = '五';
        if(sign == '6')
            sign = '六';
        if(sign == '7')
            sign = '七';
        if(sign == '8')
            sign = '八';
        if(sign == '9')
            sign = '九';
        return sign;
    }


}
