package com.javase.basic;

import java.util.Scanner;

/**
 * @Author story
 * @CreateTIme 2020/5/1
 **/

/*
运算符：
	算术运算符:  +，-，*，/，%，++，--

	赋值运算符 =
		java中=表示赋值运算符，==表示相等的操作
	扩展赋值运算符:+=，-=，*=，/=

	关系运算符:  >，<，>=，<=，==，!=
		用来比较两值的关系，
	逻辑运算符:  &&，||，!
		逻辑运算符一般两边的值不是具体的值，而是表达式
	位运算符:  &，|，^，~ ， >>，<<，>>> (了解！！！)
	条件运算符 ？：

*/
public class OperationTestDemo {

    public static void main(String[] args) {
        int a = 10;
        int b =5;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //当木运算符
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(--a);
        System.out.println(++a);

        System.out.println(++a - ++a - --a - a--);//11 - 12 -  11 -  11

        System.out.println( a + b * a);

        int c = 1;
        c = c + 2;
        c+=2;

        byte d = 10;
        //d = d+1;


        System.out.println(1>2);
        System.out.println(1<=2);
        System.out.println(1==1);
        System.out.println(1!=1);
		/*
			&&:表示短路与，两边表达式中只要有一个是false，整体结果就是false
				两边表达式从左向右开始对比，如果左边的表达式是false，右边不需要进行判断
			||:表示短路或，两边表达式中只要有一个是true，整体结果就是true
				两边表达式从左向右开始对比，如果左边的表达式是true，右边不需要进行判断
			!:取反，如果是true，取反是false，如果是false，取反就是true
			&:与运算符，但是两都会参与运算
			|:或运算符，两边都会参与运算
		*/
        System.out.println(1>2 && 2>1);
        System.out.println(1>2 || 2>1);
        System.out.println(!false);

        System.out.println(4 & 5);
        System.out.println(4 | 5);
        System.out.println(4 ^ 5);
        System.out.println(~5);


        System.out.println(8>>2);
        System.out.println(8<<2);

        System.out.println(3>2?3:2);

        System.out.println(true?false:true?false:true);

        short s1=1;   //1
        //s1=s1+1;     //2
        s1+=1;       //3
        System.out.println(s1);

        char cc = '哈';
        System.out.println(cc);

        outputYourInputInfo();
    }

    public double method(byte x,double y){
        return (short)x/y;
    }

    public static void outputYourInputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = sc.nextLine();
        System.out.println("请输入你的年龄");
        int age = Integer.valueOf(sc.nextLine());
        System.out.println("请输入你的性别");
        String gander = sc.nextLine();
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("性别：" + gander);

        System.out.println("周长为:" + getCircleRound(5));
        System.out.println("面积为:" + getCircleArea(5));

        getMoneyByDate(10000);

        System.out.println(encryption(1357));
        getPass();
    }

    public static double getCircleRound(double r){
        return (2*r*Math.PI);
    }

    public static double getCircleArea(double r){
        return (Math.pow(r,2) * Math.PI);
    }

    public static void getMoneyByDate(int money){
        System.out.println("本金："+ money);
        System.out.println("活期一年：:"+ (money*0.0035 + money));
        System.out.println("定期一年:"+(money * 0.015 + money));
        System.out.println("活期两年" + (money * 0.0035 * 2 + money));
        System.out.println("定期两年:"+(money * 0.021 * 2 + money));

    }


    public static String encryption(int num){
        String number = String.valueOf(num);
        int first = (Integer.valueOf(number.substring(0,1))+5)%10;
        int second = (Integer.valueOf(number.substring(1,2))+5)%10;
        int third=(Integer.valueOf(number.substring(2,3))+5)%10;
        int last=(Integer.valueOf(number.substring(3,4))+5)%10;

        return String.valueOf(last).concat(String.valueOf(third)).concat(String.valueOf(second)).concat(String.valueOf(first));

    }

    public static void getPass(){
       char a1 = '十',a2 = '点',a3 = '进',a4='攻';
        System.out.println("加密前原文："+a1+a2+a3+a4);

        char sercet = '8';
        a1 =(char)(a1^sercet);
        a2 =(char)(a2^sercet);
        a3 =(char)(a3^sercet);
        a4 =(char)(a4^sercet);
        System.out.println("加密后:"+a1+a2+a3+a4);

        a1 =(char)(a1^sercet);
        a2 =(char)(a2^sercet);
        a3 =(char)(a3^sercet);
        a4 =(char)(a4^sercet);
        System.out.println("解密后:"+a1+a2+a3+a4);
    }



}
