package com.javase.faceobject;

import java.util.Date;
import static java.lang.Math.*;
/**
 * @Author story
 * @CreateTIme 2020/5/8
 **/
public class ImportDemo {

    /*
    *   import:
    *       当需要引入非lang包的其他java类的时候，需要使用import
    *       如果不使用import，每次在使用某个类的时候必须将类的完全限制名都加上才可以使用，太过于繁琐
    *
    *   用法：
    *       import java.包名.类型 ；导入具体的类
    *       import 包名.*;    将当前包下所有类文件都进行导入
    *
    *   注意：
    *       当一个java文件中需要使用多个同名的类文件的时候，只能选择导入一个，另一个需要使用完全限制名才可以访问
    *
    *   静态导包：(jdk5后增加)
    *       当需要使用某个类的多个方法的时候，可以使用import static java.lang.Math.*;
    * */

    public static void main(String[] args) {
        Date date = new Date();
        java.sql.Date date1 = new java.sql.Date(100);
        System.out.println(sqrt(2));
    }
}
