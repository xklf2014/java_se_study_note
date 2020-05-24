package com.javase.faceobject;

import java.util.Scanner;

/**
 * @Author story
 * @CreateTIme 2020/5/4
 **/
public class StringDemo {
    public static void main(String[] args) {
        /*
        *
        *  ==比较的是地址
        *  equals比较的是值
        *
        * */
        String s1 = "abc";
        String s2 = s1;
        String s3 = new String("abc");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入abc");
        String s4 = sc.nextLine();//abc
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));

        System.out.println(s1 ==s4);
        System.out.println(s1.equals(s4));


    }
}
