package com.javase.date;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author story
 * @CreateTIme 2020/5/16
 **/
public class CalendarDemo {
    public static void main(String[] args) {
        //获取的是当前系统的时间
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        //设定指定时间的日期类
        Date d = new Date();
        d.setYear(5);
        calendar.setTime(d);
        System.out.println(calendar);

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
    }
}
