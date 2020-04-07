package com.visionvera.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;

import org.apache.commons.lang3.StringUtils;

/**
 * 处理时间的一些类
 *
 * @author Jally
 */
public class DateUtil {

    public static final int DEFAULT_START_WEEK = Calendar.SUNDAY; // 默认为周日开始
    public static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";
    public static final String Y_M_D = "yyyy-MM-dd";

    /**
     * 日期转换成字符串类型 默认格式为：yyyy-MM-dd HH:mm:ss
     *
     * @param date
     * @return
     */
    public static String date2String(Date date) {
        return date2String(date, null);
    }

    public static String convertStr(String date) {
        StringBuffer sb = new StringBuffer();
        sb.append(date.subSequence(0, 4) + "-");
        sb.append(date.subSequence(4, 6) + "-");
        sb.append(date.subSequence(6, 8) + " ");
        sb.append(date.subSequence(8, 10) + ":");
        sb.append(date.subSequence(10, 12) + ":");
        sb.append(date.subSequence(12, 14));
        return sb.toString();
    }

    /**
     * 将当前日期转成字符串类型 默认格式为：yyyy-MM-dd HH:mm:ss
     *
     * @param format
     * @return
     */
    public static String date2String(String format) {
        return date2String(null, format);
    }

    /**
     * 将当前日期转成字符串类型 默认格式为：yyyy-MM-dd
     *
     * @param format
     * @return
     */
    public static String date2StringDay(String format) {
        return date2String(null, format);
    }

    /**
     * 日期转换成字符串类型
     *
     * @param date
     * @param format 默认的时间格式为：yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static String date2String(Date date, String format) {
        if (StringUtils.isBlank(format)) {
            format = DEFAULT_DATE_PATTERN;
        }
        if (date == null) {
            date = new Date();
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    /**
     * 将字符串类型转换成时间类型
     *
     * @param source 时间的格式是yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static Date string2Date(String source) {
        return string2Date(source, null);
    }

    /**
     * 将字符串类型转换成时间类型
     *
     * @param source 需要格式化的时间类型
     * @param format 格式化后的样式，如果为空，默认样式是yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static Date string2Date(String source, String format) {
        if (StringUtils.isBlank(format)) {
            format = DEFAULT_DATE_PATTERN;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            return sdf.parse(source);
        } catch (ParseException e) {
            return null;
        }
    }

    /**
     * 将一个类型的时间类型，转换成另一种时间类型
     *
     * @param source     源字符串类型，例如：20111112231234
     * @param srcFormat  源格式类型，例如：yyyyMMddHHmmss
     * @param destFormat 转换成的类型，例如：yyyy-MM-dd HH:mm:ss
     * @return
     * @throws ParseException
     */
    public static String string2String(String source, String srcFormat, String destFormat) {
        return date2String(string2Date(source, srcFormat), destFormat);
    }

    /**
     * 将long类型的日期类型转成String类型的时间
     *
     * @param date   long类型的日期格式
     * @param format 转成的格式
     * @return
     */
    public static String long2String(long date, String format) {
        return date2String(new Date(date), format);
    }

    /**
     * 将long类型的日期类型转成String类型的时间 默认格式是yyyy-MM-dd HH:mm:ss
     *
     * @param date long类型的日期格式
     * @return
     */
    public static String long2String(long date) {
        return date2String(new Date(date), DEFAULT_DATE_PATTERN);
    }

    /**
     * 将string类型的时间格式，转成long类型。默认格式是yyyy-MM-dd HH:mm:ss
     *
     * @param date
     * @param format
     * @return
     * @throws ParseException
     */
    public static long string2Long(String date, String format) {
        Date date2 = string2Date(date, format);
        return date2.getTime();
    }

    public static long string2Long(String date) {
        return string2Long(date, DEFAULT_DATE_PATTERN);
    }

    /**
     * 获得给定时间是星期几
     *
     * @param date
     * @return
     */
    public static String getWeek(Date date) {
        SimpleDateFormat sdw = new SimpleDateFormat("E");
        return sdw.format(date);
    }

    /***************** 获取时间的年月日系列方法 *********************/
    /**
     * 获得当前时间的日历实例
     *
     * @return
     */
    public static Calendar getInstance() {
        return Calendar.getInstance();
    }

    /**
     * 获得指定时间的日历实例（指定时间为空则为当前时间）
     *
     * @return
     */
    public static Calendar getInstance(Date date) {
        Calendar calendar = getInstance();
        if (date != null) {
            calendar.setTime(date);
        }
        return calendar;

    }

    /**
     * 获得当前时间的年份
     *
     * @return
     */
    public static int getYear() {
        return getInstance().get(Calendar.YEAR);
    }

    /**
     * 获得当前时间的月份
     *
     * @return
     */
    public static int getMonth() {
        return getInstance().get(Calendar.MONTH) + 1;
    }

    /**
     * 获得当前时间的日
     *
     * @return
     */
    public static int getDay() {
        return getInstance().get(Calendar.DATE);
    }

    /**
     * 获得当前小时
     *
     * @return
     */
    public static int getHour() {
        return getInstance().get(Calendar.HOUR_OF_DAY);
    }

    /**
     * 获得当前分钟
     *
     * @return
     */
    public static int getMinute() {
        return getInstance().get(Calendar.MINUTE);
    }

    /**
     * 获得当前秒
     *
     * @return
     */
    public static int getSecond() {
        return getInstance().get(Calendar.SECOND);
    }

    /**
     * 获得当前毫秒
     *
     * @return
     */
    public static long getMillis() {
        return getInstance().getTimeInMillis();
    }

    /**
     * 获取指定时间的年
     *
     * @param date
     * @return
     */
    public static int getYear(Date date) {
        return getInstance(date).get(Calendar.YEAR);
    }

    /**
     * 获取指定时间的月
     *
     * @param date
     * @return
     */
    public static int getMonth(Date date) {
        return getInstance(date).get(Calendar.MONTH);
    }

    /**
     * 获取指定时间的日
     *
     * @param date
     * @return
     */
    public static int getDay(Date date) {
        return getInstance(date).get(Calendar.DATE);
    }

    /******************** 日期周数精度计算--移植刘海平的周报日期工具类******* 用Calendar类计算周和周的起始日期 ******************/

    /**
     * 获取某天是一年中的第几周。默认：周日为第一天<br>
     *
     * @param date
     * @return
     */
    public static int getWeekOfYear(Date date) {
        return getWeekOfYear(date, DEFAULT_START_WEEK);
    }

    public static int getWeekOfYear(Date date, int startWeek) {
        Calendar calendar = getInstance(date);
        calendar.setFirstDayOfWeek(startWeek);
        calendar.setMinimalDaysInFirstWeek(7);
        return calendar.get(Calendar.WEEK_OF_YEAR);
    }

    /**
     * 获取某年共有几周。默认：周日为第一天
     *
     * @param year
     * @return
     */
    public static int getWeeksOfYear(int year) {
        return getWeeksOfYear(year, DEFAULT_START_WEEK);
    }

    public static int getWeeksOfYear(int year, int startWeek) {
        Calendar c = getInstance();
        c.set(year, Calendar.DECEMBER, 31, 23, 59, 59);
        return getWeekOfYear(c.getTime(), startWeek);
    }

    /**
     * 获取某天所在周的第一天。默认：周日为第一天
     *
     * @param date
     * @return
     */
    public static Date getFirstDayOfWeek(Date date) {
        return getFirstDayOfWeek(date, DEFAULT_START_WEEK);
    }

    public static Date getFirstDayOfWeek(Date date, int startWeek) {
        Calendar calendar = getInstance(date);
        calendar.setFirstDayOfWeek(startWeek);
        calendar.set(Calendar.DAY_OF_WEEK, calendar.getFirstDayOfWeek());
        return calendar.getTime();
    }

    /**
     * 获取某天所在周的最后天。默认：周日为第一天
     *
     * @param date
     * @return
     */
    public static Date getLastDayOfWeek(Date date) {
        return getLastDayOfWeek(date, DEFAULT_START_WEEK);
    }

    public static Date getLastDayOfWeek(Date date, int startWeek) {
        Calendar calendar = getInstance(date);
        calendar.setFirstDayOfWeek(startWeek);
        calendar.set(Calendar.DAY_OF_WEEK, calendar.getFirstDayOfWeek() + 6);
        return calendar.getTime();
    }

    /**
     * 获取某年某月的第一天
     *
     * @param year
     * @param month
     * @return
     */
    public static Date getFirstDayOfMonth(int year, int month) {
        Calendar calendar = getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        return calendar.getTime();
    }

    /**
     * 获取某年某月的最后一天
     *
     * @param year
     * @param month
     * @return
     */
    public static Date getLastDayOfMonth(int year, int month) {
        Calendar calendar = getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, 0);
        return calendar.getTime();
    }

    /**
     * 获取某年某月的天数
     *
     * @param year
     * @param month
     * @return
     */
    public static int getDaysOfMonth(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    /**
     * 获取某月的第一周
     *
     * @param year
     * @param month
     * @return
     */
    public static int getFirstWeekOfMonth(int year, int month) {
        return getFirstWeekOfMonth(year, month, DEFAULT_START_WEEK);
    }

    public static int getFirstWeekOfMonth(int year, int month, int startWeek) {
        Calendar calendar = getInstance();
        calendar.setFirstDayOfWeek(startWeek);
        calendar.set(year, month - 1, 1);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    /**
     * 获取某月的最后一周
     *
     * @param year
     * @param month
     * @return
     */
    public static int getLastWeekOfMonth(int year, int month) {
        return getLastWeekOfMonth(year, month, DEFAULT_START_WEEK);
    }

    /****
     * 将字符串格式的时间 2015-12-18 10:20:32 转换为 20151218102032 sws
     *
     * @return
     */
    public static String convertDate(String date) {
        String[] tempDate = date.split(" ");
        StringBuffer sb = new StringBuffer();
        for (String str : tempDate) {
            if (str.indexOf("-") >= 0) {
                for (String t : str.split("-")) {
                    sb.append(t);
                }
            } else {
                for (String t : str.split(":")) {
                    sb.append(t);
                }
            }
        }
        return sb.toString();
    }

    public static int getLastWeekOfMonth(int year, int month, int startWeek) {
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(startWeek);
        calendar.set(year, month - 1, getDaysOfMonth(year, month));
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    /**
     * @param durTime  向前推多少时间
     * @param interval 时间间隔(粒度)
     * @return
     */
    public static String getNewDate(int durTime, long interval) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, 0 - durTime);
        calendar.getTime().getTime();
        long time = (calendar.getTime().getTime() / (interval * 1000)) * interval * 1000;
        calendar.setTime(new Date(time));
        calendar.add(Calendar.MINUTE, 0 - durTime);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:00");
        return sdf.format(calendar.getTime());
    }

    public static String getNextTime(int calendarType, int interval, String format) {
        if (StringUtils.isBlank(format)) {
            format = "yyyy-MM-dd HH:mm:00";
        }
        Calendar calendar = Calendar.getInstance();
        long time = calendar.getTime().getTime();
        calendar.setTime(new Date(time));
        calendar.add(calendarType, 0 - interval);
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(calendar.getTime());
    }

    public static String getNextTime(int calendarType, int interval) {
        return getNextTime(calendarType, interval, null);
    }

    public static String getNextMinute(int interval, String format) {
        return getNextTime(Calendar.MINUTE, interval, format);
    }

    public static String getNextMinute(int interval) {
        return getNextTime(Calendar.MINUTE, interval, null);
    }

    public static String getNextHour(int interval, String format) {
        return getNextTime(Calendar.HOUR, interval, format);
    }

    public static String getNextHour(int interval) {
        return getNextTime(Calendar.HOUR, interval, null);
    }

    public static String getNextDay(int interval, String format) {
        return getNextTime(Calendar.HOUR, interval * 24, format);
    }

    public static String getNextDay(int interval) {
        return getNextTime(Calendar.HOUR, interval * 24, null);
    }

    public static String addDateDays(String pattern, Date nowDate, long d) {
        SimpleDateFormat format = new SimpleDateFormat(pattern);// 24小时制
        if (nowDate == null) {
            return "";
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(nowDate);
        cal.add(Calendar.DAY_OF_MONTH, (int) d);// 增加天的方法
        nowDate = cal.getTime();
        cal = null;
        return format.format(nowDate);
    }

    public static String addDateDays(Date nowDate, long d) {
        return addDateDays(DEFAULT_DATE_PATTERN, nowDate, d);
    }

    public static String addDateHours(String pattern, Date nowDate, int h) {
        SimpleDateFormat format = new SimpleDateFormat(pattern);// 24小时制
        if (nowDate == null) {
            return "";
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(nowDate);
        cal.add(Calendar.HOUR_OF_DAY, h);// 增加小时的方法
        nowDate = cal.getTime();
        cal = null;
        return format.format(nowDate);
    }
   
    public static String addDateMinute(Date nowDate, int minute) {
    	SimpleDateFormat format = new SimpleDateFormat(DEFAULT_DATE_PATTERN);// 24小时制
    	if (nowDate == null) {
    		return "";
    	}
    	Calendar cal = Calendar.getInstance();
    	cal.setTime(nowDate);
    	cal.add(Calendar.MINUTE, minute);// 增加分钟的方法
    	nowDate = cal.getTime();
    	cal = null;
    	return format.format(nowDate);
    }

    public static String addDateHours(Date nowDate, int h) {
        return addDateHours(DEFAULT_DATE_PATTERN, nowDate, h);
    }

    public static String addDateSeconds(String pattern, String nowDateStr, int h, String returnPattern) {
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        SimpleDateFormat Secondsformat = new SimpleDateFormat(returnPattern);
        Date nowDate = null;
        try {
            nowDate = format.parse(nowDateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (nowDate == null) {
            return "";
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(nowDate);
        cal.add(Calendar.SECOND, h);// 增加秒的方法
        nowDate = cal.getTime();
        cal = null;
        return Secondsformat.format(nowDate);
    }

    public static String addDateSeconds(String nowDateStr, int h, String returnPattern) {
        return addDateSeconds(DEFAULT_DATE_PATTERN, nowDateStr, h, returnPattern);
    }

    public static String addDateSeconds(String nowDateStr, int h) {
        return addDateSeconds(DEFAULT_DATE_PATTERN, nowDateStr, h, DEFAULT_DATE_PATTERN);
    }

    public static long getMarginSeconds(String date1, String date2) {
        long margin;
        try {
            SimpleDateFormat format = new SimpleDateFormat(DEFAULT_DATE_PATTERN);// 24小时制
            ParsePosition pos = new ParsePosition(0);
            ParsePosition pos1 = new ParsePosition(0);
            Date dt1 = format.parse(date1, pos);
            Date dt2 = format.parse(date2, pos1);
            long l = dt2.getTime() - dt1.getTime();
            margin = (l / (1000));
            return margin;
        } catch (Exception e) {
            return 0;
        }
    }

    /**
     * 将指定字符串格式的日期与当前时间比较
     *
     * @param strDate 需要比较时间
     * @return <p>
     * int code
     * <ul>
     * <li>-1 当前时间 < 比较时间 </li>
     * <li> 0 当前时间 = 比较时间 </li>
     * <li>>=1当前时间 > 比较时间 </li>
     * </ul>
     * </p>
     * @author DYLAN
     * @date Feb 17, 2012
     */
    public static int compareToCurTime(String strDate) {
        SimpleDateFormat sdf_datetime_format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cale = Calendar.getInstance();
        if (StringUtils.isBlank(strDate)) {
            return -1;
        }
        Date curTime = cale.getTime();
        String strCurTime = null;
        try {
            strCurTime = sdf_datetime_format.format(curTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (StringUtils.isNotBlank(strCurTime)) {
            return strCurTime.compareTo(strDate);
        }
        return -1;
    }

    public static int compareToTime(String startDate, String endDate) {
        SimpleDateFormat sdf_datetime_format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (StringUtils.isBlank(startDate)) {
            return -1;
        }
        if (StringUtils.isBlank(endDate)) {
            return -1;
        }
        Date curTime = string2Date(endDate);
        String strCurTime = null;
        try {
            strCurTime = sdf_datetime_format.format(curTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (StringUtils.isNotBlank(strCurTime)) {
            return strCurTime.compareTo(startDate);
        }
        return -1;
    }

    public static String getOtherDate(int num) {
        Date date = new Date();//取时间
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, num);//把日期往后增加一天.整数往后推,负数往前移动
        date = calendar.getTime(); //这个时间就是日期往后推一天的结果
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        String dateString = formatter.format(date);
        return dateString;
    }

    public static Date geLastWeekMonday(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(getThisWeekMonday(date));
        cal.add(Calendar.DATE, -7);
        return cal.getTime();
    }

    public static Date getThisWeekMonday(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        // 获得当前日期是一个星期的第几天
        int dayWeek = cal.get(Calendar.DAY_OF_WEEK);
        if (1 == dayWeek) {
            cal.add(Calendar.DAY_OF_MONTH, -1);
        }
        // 设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        // 获得当前日期是一个星期的第几天
        int day = cal.get(Calendar.DAY_OF_WEEK);
        // 根据日历的规则，给当前日期减去星期几与一个星期第一天的差值
        cal.add(Calendar.DATE, cal.getFirstDayOfWeek() - day);
        return cal.getTime();
    }

    /* 判断是否是对应的格式的日期字符串
     * @param dateStr
     * @param datePattern
     * @return
     */
    public static boolean isRightDateStr(String dateStr, String datePattern) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);
        try {
            //采用严格的解析方式，防止类似 “2017-05-35” 类型的字符串通过
            dateFormat.setLenient(false);
            dateFormat.parse(dateStr);
            Date date = (Date) dateFormat.parse(dateStr);
            //重复比对一下，防止类似 “2017-5-15” 类型的字符串通过
            String newDateStr = dateFormat.format(date);
            if (dateStr.equals(newDateStr)) {
                return true;
            } else {
                return false;
            }
        } catch (ParseException e) {
            return false;
        }
    }

    /**
     * 判断当前时间是否再当天24h内
     *
     * @param nowTime
     * @return
     */
    public static boolean isToday(Date nowTime) {
        boolean flag = false;
        //获取当前系统时间
        Date nowDate = new Date();
        Date endTime = nextDay(nowDate);
        Date startTime = getCalendar(nowDate).getTime();
        if (nowTime.getTime() == startTime.getTime()
                || nowTime.getTime() == endTime.getTime()) {
            return true;
        }
        if (nowTime.after(startTime) && nowTime.before(endTime)) {
            flag = true;
        }
        return flag;
    }

    /**
     * 判断当前时间是否再多少天内
     *
     * @param nowTime 当前时间
     * @param day     天数
     * @return
     */
    public static boolean isEffectiveDate(Date nowTime, Integer day) {
        Calendar instance = getCalendar(new Date());
        Date now = nextDay(instance.getTime());
        instance.add(Calendar.DATE, -day);
        return isEffectiveDate(nowTime, instance.getTime(),now);
    }

    /**
     * 判断时间是否再一段时间内
     *
     * @param nowTime   当前时间
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @return
     */
    public static boolean isEffectiveDate(Date nowTime, Date startTime, Date endTime) {
        if (nowTime.getTime() == startTime.getTime()
                || nowTime.getTime() == endTime.getTime()) {
            return true;
        }
        Calendar date = getInstance();
        date.setTime(nowTime);

        Calendar begin = getInstance();
        begin.setTime(startTime);

        Calendar end = getInstance();
        end.setTime(endTime);

        if (date.after(begin) && date.before(end)) {
            return true;
        }
        return false;

    }
    public static Date nextDay(Date start) {
        Calendar c = getInstance();
        c.setTime(start);
        c.set(Calendar.HOUR_OF_DAY, 23);
        c.set(Calendar.MINUTE, 59);
        c.set(Calendar.SECOND, 59);
        c.set(Calendar.MILLISECOND, 59);
        return c.getTime();
    }

    /**
     * 根据时间段获取一个list
     * @param startDate 开始时间
     * @param endDate 结束时间
     * @param offset 间隔 单位分钟
     * @return
     */
    public static List<String> getTimeSegment(Date startDate,Date endDate,Integer offset) {
        Calendar c = getCalendar(startDate);
//        Date nextDayDate = nextDay(endDate);//下一天的date

        List<String> result = new ArrayList<>();
        while (c.getTime().compareTo(endDate) < 0) {
            result.add(date2String(c.getTime()));
            //日期加offset分钟
            c.add(Calendar.MINUTE, offset);
        }
        return result;
    }

    public static Calendar getCalendar(Date startDate) {
        Calendar c = getInstance();
        c.setTime(startDate);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return c;
    }

    public static void main(String[] args) {
    	//System.out.println(getMarginSeconds("2019-11-19 16:55:32","2019-11-19 16:55:31"));;
    	//System.out.println(isEffectiveDate(string2Date("2019-10-20 17:19:32"),isEffectiveDate(string2Date("2019-10-20 17:19:32"),isEffectiveDate(string2Date("2019-10-19 17:19:32")));;
    }
}
