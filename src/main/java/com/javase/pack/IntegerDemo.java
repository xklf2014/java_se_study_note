package com.javase.pack;

import java.util.zip.DeflaterOutputStream;

/**
 * @Author story
 * @CreateTIme 2020/5/16
 **/

/*
*
*   包装类于基本数据类型
*       包装类是将基本数据类型封装成一个类
*           装箱：将基本数据类型封装成对应的包装类
*           拆箱：将包装类转换成基本数据类型
*
* */
public class IntegerDemo {
    public static void main(String[] args) {
        IntegerDemo i = new IntegerDemo();
        //i.test1();
        //i.test2();
        i.test3();
    }

    public void test3(){

        int i =10;
        Integer i1 = 10;
        System.out.println(i==i1);
    }

    public void test2(){
        //return new Double(parseDouble(s));
        Double d1 =1.0;
        Double d2 =1.0;
        Double d3 =2.0;
        Double d4 =2.0;
        System.out.println(d1==d2);
        System.out.println(d3==d4);
    }
    public void test1() {

        //if (i >= IntegerCache.low && i <= IntegerCache.high)
        //static final int low = -128;
        //high = 127
        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = 200;
        Integer i4 = 200;
        System.out.println(i1==i2);
        System.out.println(i3==i4);
        System.out.println(i3==(i1+i2));
    }
    public void test(){
        int a = 10;
        Integer i = new Integer(10);
        System.out.println(a==i);
        //通过方法进行类型的转换
        Integer i2 = Integer.valueOf(a);
        int i3 = i.intValue();
        System.out.println(i3==i2);
    }
}
