package com.javase.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author story
 * @CreateTIme 2020/5/16
 **/
public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        //将Date类按照规范转换为字符串格式
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateFormat.format(date));

        DateFormat dateFormat1 = new SimpleDateFormat("y-M-d H:m:s");
        System.out.println(dateFormat1.format(date));
        //将字符串转换成对应的日期类
        Date d1 = dateFormat.parse("2020-05-16 21:13:00");
        System.out.println(d1);
    }
}
