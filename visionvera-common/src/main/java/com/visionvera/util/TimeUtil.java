package com.visionvera.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.visionvera.constrant.CommonConstrant;

public class TimeUtil {
	
	/* 
     * 将时间转换为时间戳
     */    
    public static Long dateToStamp(String s) throws ParseException{
//        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(s);
        long ts = date.getTime();
//        res = String.valueOf(ts);
        return ts;
    }

	/* 
     * 将时间戳转换为时间
     */
    public static String stampToDate(Long lt){
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }
    
    
    /* 
     * 将时间戳转换为时间
     */
    public static String stampToDateString(Long lt){
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }
    /* 
     * 将时间戳转换为年份
     */
    public static String stampToYear(Long lt){
    	String res;
    	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    	Date date = new Date(lt);
    	res = simpleDateFormat.format(date);
    	return res;
    }
    
    /**
     * 
     * TODO Date转String
     * @author 谢程算
     * @date 2017年5月4日  
     * @version 1.0.0 
     * @param date
     * @param type
     * @return
     */
    public static String dateToString(Date date) {  
        String str = null;  
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");  
        // 2007-1-18  
        str = format.format(date);  
        return str;  
    }
    
    /**
     * 将日期转换成字符串
     * @param date 日期
     * @param pattern 日期的格式。默认为yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static String dateToString (Date date, String pattern) {
    	String str = "";
    	if (StringUtil.isNull(pattern)) {
    		pattern = "yyyy-MM-dd HH:mm:ss";
    	}
    	SimpleDateFormat format = new SimpleDateFormat(pattern);
    	str = format.format(date);
    	return str;
    }
    
    /**
     * 将字符串转换成日期
     * @param date 日期字符串
     * @param pattern 转换成的时间格式.默认为yyyy-MM-dd HH:mm:ss
     * @return
     * @throws ParseException 
     */
    public static Date stringToDate(String dateStr, String pattern) throws ParseException {
    	if (StringUtil.isNull(pattern)) {
    		pattern = "yyyy-MM-dd HH:mm:ss";
    	}
    	SimpleDateFormat format = new SimpleDateFormat(pattern);
    	return format.parse(dateStr);
    }
    
    /**
     * 
     * TODO String转Date
     * @author 谢程算
     * @date 2017年5月4日  
     * @version 1.0.0 
     * @param str
     * @return
     */
    public static Date stringToDate(String str) {  
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");  
        Date date = null;  
        try {  
            // Fri Feb 24 00:00:00 CST 2012  
            date = format.parse(str);   
        } catch (ParseException e) {  
        }  
        // 2012-02-24  
        date = java.sql.Date.valueOf(str);  
                                              
        return date;  
    }  
    
    public static String lastDays(Integer num){//num为负数表示之前，为零表示当前，为正表示之后
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
         
        //过去num天
        c.add(Calendar.DATE, num);
        Date d = c.getTime();
        String day = format.format(d);
        System.out.println("过去"+num+"天："+day);
        return day;
    }
    public static String lastMonths(Integer num){//num为负数表示之前，为零表示当前，为正表示之后
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
         
        //过去num月
        c.add(Calendar.MONTH, num);
        Date m = c.getTime();
        String mon = format.format(m);
        System.out.println("过去"+num+"个月："+mon);
        return mon;
    }
    public static String firstDayOfMonth(Integer num){//num为负数表示之前，为零表示当前，为正表示之后
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    	Calendar c = Calendar.getInstance();
    	
    	//获取当前月第一天：
    	c.add(Calendar.MONTH, num);
    	c.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天 
    	String first = format.format(c.getTime());
    	System.out.println("===============first day of month:"+first);
    	return first;
    }
    public static String firstDayOfWeek(){
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    	Calendar c = Calendar.getInstance();
    	
    	c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY); 
    	c.set(Calendar.HOUR_OF_DAY, 0);
    	c.set(Calendar.MINUTE, 0);
    	c.set(Calendar.SECOND, 0);
    	String first = format.format(c.getTime());
    	System.out.println("===============first day of week:"+first);
    	return first;
    }
    public static String lastYears(Integer num){//num为负数表示之前，为零表示当前，为正表示之后
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
         
        //过去num年
        c.add(Calendar.YEAR, num);
        Date y = c.getTime();
        String year = format.format(y);
        System.out.println("过去"+num+"年："+year);
        return year;
    }
    /**
     * 获取前后几周日期
     */
    public static String lastWeek(Integer num){//num为负数表示之前，为零表示当前，为正表示之后
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        //过去num周
        c.add(Calendar.WEEK_OF_YEAR, num);
        Date y = c.getTime();
        String week = format.format(y);
        System.out.println("过去"+num+"周："+week);
        return week;
    }
    
    /**
     * 获取指定日期的上月最后一天
     * @param date 指定日期
     * @return 
     */
    public static String getLastDayOfPreviousMonth(Date date) {
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    	Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DATE, 1);     // 设置当前月的1号
        calendar.add(Calendar.DATE, -1);    // 减一天，变为上月的1号
        String endDate =format.format(calendar.getTime());
        return endDate;
    }
    
    /**
     * 获取指定日期当月最后一天日期
     * @param date 指定日期
     * @return 
     */
    public static String getLastDayOfMonth(Date date) {
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DATE, 1);     // 设置当前月的1号
        calendar.add(Calendar.MONTH, 1);   // 加一个月，变为下月的1号
        calendar.add(Calendar.DATE, -1);    // 减去一天，变为当前月的最后一天
        String endDate =format.format(calendar.getTime());
        return endDate;
    }
    
    /**
     * 获取指定日期当月第一天日期
     * @param date 指定日期
     * @return 
     */
    public static String getFirstDayOfMonth(Date date) {
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DATE, 1); // 设置当前月的1号
        String fristDate =format.format(calendar.getTime());
        return fristDate;
    }
    
    /**
     * 获取指定日期的月份
     * @param date 指定日期
     * @return 
     */
    public static String getOnlyMonth(Date date) {
    	SimpleDateFormat format = new SimpleDateFormat("MM");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        String endDate =format.format(calendar.getTime());
        return endDate;
    }
    
    /**
     * 获取指定日期当月有几周
     * @param date 指定日期
     * @return 
     */
    public static int getTotalWeekOfMonth(Date date) {
    	String last =getLastDayOfMonth(date);//月末
//    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.setTime(stringToDate(last));
        c.setFirstDayOfWeek(Calendar.MONDAY);//将每周第一天设为星期一，默认是星期天
        return c.get(Calendar.WEEK_OF_MONTH);
    }
    
    /**
     * 获取指定日期是第几周
     * @param date 指定日期
     * @return 
     */
    public static int getWeekOfMonth(Date date) {
//    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.setFirstDayOfWeek(Calendar.MONDAY);//将每周第一天设为星期一，默认是星期天
        return c.get(Calendar.WEEK_OF_MONTH);
    }
    /**
     * 获取指定日期是星期几
     * @param date 指定日期
     * @return 
     */
    public static int getDayOfWeek(Date date) {
//    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    	Calendar c = Calendar.getInstance();
    	c.setTime(date);
    	return c.get(Calendar.DAY_OF_WEEK)-1;
    }
    
    /**
     * 获取指定周数第一天
     *
     * @param date 指定日期
     * @return 
     */
    public static String getFirstOfSpecifiedWeek(Date date,Integer flag) {
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.setFirstDayOfWeek(Calendar.MONDAY);//将每周第一天设为星期一，默认是星期天
        calendar.add(Calendar.DATE, flag*7);
        calendar.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        return format.format(calendar.getTime());
    }
    
    /**
     * 获取指定日期的前一天
     * @param date 指定日期
     * @return 
     */
    public static String lastDay(Date date,Integer num) {
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, num);
        Date d = c.getTime();
        String day = format.format(d);
        return day;
    }
    /**
     * 比较某日期是否在另一个日期之前
     * @param date 指定日期
     * @return 
     */
    public static Boolean isBefore(String beginTime,String endTime) {
    	 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); 
    	  
    	  
		try {
			Date bt=sdf.parse(beginTime); 
			Date et = sdf.parse(endTime);
			 if (bt.before(et)){ 
	    	      return true;
	    	  }else{ 
	    		  return false;
	    	  } 
		} catch (ParseException e) {
			e.printStackTrace();
		} 
    	 return null;
    	
    }
    
    /**
     * 判断第一个时间是否在第二个时间之前
     * @param beginTime
     * @param endTime
     * @param pattern 时间格式。默认为yyyy-MM-dd HH:mm:ss
     * @return
     * @throws ParseException 
     */
    public static boolean isBefore(String beginTime,String endTime, String pattern) throws ParseException {
    	if (StringUtil.isNull(pattern)) {
    		pattern = "yyyy-MM-dd HH:mm:ss";
    	}
    	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    	Date beginTimeDate = dateFormat.parse(beginTime);
    	Date endTimeDate = dateFormat.parse(endTime);
    	if (beginTimeDate.before(endTimeDate)) {
    		return true;
    	}
    	return false;
    	
    }
    
    /**
	 * 根据分钟计算秒。默认为半小时
	 * @param minute
	 * @return
	 */
	public static int getSecondsByMinute(Integer minute) {
		int seconds = CommonConstrant.REDIS_SESSION_TIMEOUT_DEFAULT;//默认为半小时
		
		if (minute == null || minute <= 0) {
			return seconds;
		}
		
		seconds = minute * 60;
		
		return seconds;
	}
	
	/**
	 * 设置某个属性的步进长度
	 * date 时间
	 * @param field 
	 * 		Calendar.YEAR: 年
	 * 		Calendar.MONTH: 月
	 * 		Calendar.DAY_OF_MONTH: 天
	 * 		Calendar.HOUR: 小时
	 * 		Calendar.MINUTE: 分钟
	 * 		Calendar.SECOND: 秒
	 * @param amount 步进多长
	 * @return 时间字符串：yyyy-MM-dd HH:mm:ss
	 */
	public static String getAmountTime(Date date, int field, int amount) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(field, amount);
		Date time = calendar.getTime();
		return TimeUtil.dateToString(time, "yyyy-MM-dd HH:mm:ss");
	}
	
	/**
	 * 判断第一个时间是否大于第二个时间minute分钟
	 * @param time 
	 * @param currentTime 
	 * @param minute
	 * @return true表示第一个时间大于第二个时间minute分钟
	 * @throws ParseException 
	 */
	public static boolean isGreaterMinute(String time, long currentTime, int minute) throws ParseException {
		Date date = TimeUtil.stringToDate(time, "yyyy-MM-dd HH:mm");
		long timeMillis = date.getTime();
		long minuteMillis = minute * 60 * 1000L;
		
		if (timeMillis - currentTime >= minuteMillis) {
			return true;
		}
		return false;
	}
	
	/**
	 * 获取指定时间
	 * @param year 年
	 * @param month 月
	 * @param dayOfMonth 日
	 * @param hours 时
	 * @param minute 分
	 * @param second 秒
	 * @param pattern 时间格式。不传默认为yyyy-MM-dd HH:mm:ss
	 * @return pattern的时间格式。如果年月日都为0的话则返回当前时间
	 */
	public static String getSpecifiedTime(int year, int month, int dayOfMonth, int hours, int minute, int second, String pattern) {
		Calendar calendar = Calendar.getInstance();
		if (pattern == null || pattern.length() <= 0) {
			pattern = "yyyy-MM-dd HH:mm:ss";
		}
		DateFormat dateFormat = new SimpleDateFormat(pattern);
		
		if (year == 0 && month == 0 && dayOfMonth == 0) {
			return dateFormat.format(calendar.getTime());
		} else {
			calendar.set(year, month - 1, dayOfMonth, hours, minute, second);//设置真实的年月日 时分秒
			return dateFormat.format(calendar.getTime());
		}
	}
	
	/**
	 * 获取指定时间
	 * @param year 年
	 * @param month 月
	 * @param dayOfMonth 日
	 * @param hours 时
	 * @param minute 分
	 * @param second 秒
	 * @return 返回时间格式为yyyy-MM-dd HH:mm:ss
	 */
	public static String getSpecifiedTime(int year, int month, int dayOfMonth, int hours, int minute, int second) {
		return getSpecifiedTime(year, month, dayOfMonth, hours, minute, second, null);
	}
    
	/**
     * 指定日期加上分钟数后的日期
     * @param num 为增加的分钟
     * @param newDate 创建时间
     * @return
     * @throws ParseException 
     */
    public static Date plusMinute(int num,Date newDate) {
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("现在的日期是：" + newDate);
        Calendar ca = Calendar.getInstance();
        ca.add(Calendar.MINUTE, num);// num为增加的分钟，可以改变的
        newDate = ca.getTime();
        return newDate;
    }
    
    /**
	 * 获取当前时间，按年月日时分秒的格式返回
	 * @param args
	 */
	public static String getCurrentTimeByStdForm(){
		Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(d);
	}
    
    public static void main(String[] args){
    	System.out.println("结果: " + getSpecifiedTime(2019,12,31,23,59,59));
    	
    }
}
