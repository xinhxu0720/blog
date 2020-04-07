package com.visionvera.vo;

import java.util.List;

/**
 * @ClassName WeatherVO
 * @Description TODO
 * @Author 徐鑫辉
 * @Date 2019年12月12日 14:01
 **/
public class WeatherVO {
   private List<WeatherListVO> hours;
   private String day;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public List<WeatherListVO> getHours() {
        return hours;
    }

    public void setHours(List<WeatherListVO> hours) {
        this.hours = hours;
    }
}
