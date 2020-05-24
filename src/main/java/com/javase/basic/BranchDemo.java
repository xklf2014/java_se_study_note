package com.javase.basic;

import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;

/**
 * @Author story
 * @CreateTIme 2020/5/3
 **/
public class BranchDemo {
    public static void main(String[] args) {
        //singleIf();
        //doubleIf();
        //doubleIf1(1);
        //manyIf();
        //nestIf();
        switchTest();
        byte a = 127;
        System.out.println((byte)(a + 3));
    }

    /*
     * 分支结构：
     * 单分支：只做单一多条件判断，不符合则不走该分支内流程
     * 双分支：if(){...}else{ ...} 符合第一个分支条件则执行第一个分支流程，否则执行第一个分支流程
     * 多分枝：
     */

    public static void singleIf(){
        int i = (int) (Math.random()*6);
        if (i> 3){
            System.out.println(i + ">3");
            return;
        }
        System.out.println(i);
    }

    public static void doubleIf(){
        int i = (int) (Math.random()*6);
        if (i> 3){
            System.out.println(i + ">3");
        }else {
            System.out.println(i);
        }
    }

    public static void doubleIf1(double r){
        double area = Math.PI * Math.pow(r,2);
        double length = 2 * r * Math.PI;
        System.out.println("area:" + area + ",length:" + length);
        if (area > length){
            System.out.println("面积大于周长");
        }else {
            System.out.println("周长大于面积");
        }
    }

    public static void manyIf(){
        int age = (int) (Math.random()*100);
        if (age > 80){
            System.out.println("老年");
        }else if( age > 60){
            System.out.println("中年");
        }else if (age > 40){
            System.out.println("壮年");
        }else if (age > 20){
            System.out.println("青年");
        }else{
            System.out.println("少年");
        }
    }

    public static void nestIf(){
        int time = (int) (Math.random() * 40);
        if (time < 20){
            System.out.println("进入决赛组，当前时间为：" + time);
            int gander = (int) (Math.random() * 2);
            if (gander == 0 ){
                System.out.println("进入男子组"+time);
            }else{
                System.out.println("进入女子组"+ time);
            }
        }else {
            System.out.println("成功太差，被淘汰了");
        }
    }

    public static void switchTest(){
        int rand = (int) (Math.random()*26);
        char ch = (char) ('a'+rand);
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("元音字母："+ch);
                break;
            case 'y':
            case 'w':
                System.out.println("半元音字母："+ch);
                break;
            default:
                System.out.println("辅音字母："+ ch);

        }




    }


}
