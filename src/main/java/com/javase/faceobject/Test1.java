package com.javase.faceobject;

import java.util.Scanner;

/**
 * @Author story
 * @CreateTIme 2020/5/5
 **/
public class Test1 {
    public static void main(String[] args) {
        //ninenineRule();
        //checkNumisPrime();
        //printClassSumScoreAndAvg();
        //printNumByFor();
        //System.out.println(printNum(40));
        //printFlower();
        //printRectangle(3,10);
        //printFactorialByFor();

        /*for(int i=100;i<1000;i++){
            if(isLotus(i))
                System.out.print(i+" ");
        }
        System.out.println();*/

      /*  Scanner input = new Scanner(System.in);
        //输入一个数
        System.out.println("请输入你要判断的数据：");
        int n = input.nextInt();
        if(n>10 || n<1){
            System.out.println("限制输入的数据在1-10之间");
            System.exit(0);
        }
        String str = testString(n);
        long sum = factRec(n);//递归
        System.out.println(n+"!="+str+"="+sum);*/

    }
    



    //1.打印九九乘法表
    public static void ninenineRule(){
        for (int i = 1;i<10;i++){
            for (int j = 1; j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }

    //判断1-100之间有多少个素数并输出所有素数。（将判断一个数是否是素数的功能提取成方法，在循环中直接调用即可）
    public static void checkNumisPrime(){
        for (int i =1;i<=100;i++){
            boolean flag =true;

            for (int j=2;j<i;j++){
                if (i%j==0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(i+"是素数");

            }
        }
    }

    //输入三个班，每班10个学生的成绩，求和并求平均分
    public static void printClassSumScoreAndAvg(){
        double score = 0;
        Scanner sc = new Scanner(System.in);
        for (int i =1;i<=3;i++){
            System.out.println("请输入"+i+"班10名同学成绩");
            for (int j =1;j<=10;j++){
                System.out.println("请输入第"+j+"名同学的成绩");
                score += Integer.valueOf(sc.nextLine());
            }
            System.out.println(i+"班级总成绩为"+score+",平均分为"+(score/10));
            score = 0;
        }
    }

    //4.编写递归算法程序：一列数的规则如下: 1、1、2、3、5、8、13、21、34...... 求数列的第40位数是多少。
    //非递归
    public static void printNumByFor(){
       int first = 1;
       int second = 1;

       Scanner sc = new Scanner(System.in);
        System.out.println("请输入打印的个数");
       int times = sc.nextInt();
       for (int i = 0;i < times;i++){
           if (i<=1){
               System.out.print(first + "\t");
               continue;
           }
           int tmp = first + second;
           first = second;
           second = tmp;
           System.out.print( second + "\t");
           if (i % 10 ==0){
               System.out.println( );
           }
       }
    }

    //递归
    public static int printNum(int n){
        if (n <= 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return printNum(n - 1) + printNum(n - 2);
        }
    }



    //打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方
    public static void printFlower(){
        for (int i =100;i<1000;i++){
            int hundred = i / 100;
            int ten = i /10 %10;
            int single = i  % 10;

            if (i == (Math.pow(hundred,3)+Math.pow(ten,3)+Math.pow(single,3))){
                System.out.println(i+"为水仙花");
            }
        }
    }

    //水仙花答案
    private static boolean isLotus(int lotus){
        boolean flag=false;
        int a = lotus % 10;
        int b = lotus / 10 % 10;
        int c = lotus / 100 % 10;
        if (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == lotus) {
            flag = true;
        }
        return flag;
    }

    //2.定义方法：打印指定行和列的矩形
    public static void printRectangle(int row,int cel){
        for (int i = 0;i<row;i++){
            for (int j =0;j<cel;j++){
                if (i==0 || i ==row-1){
                    System.out.print("*");
                    continue;
                }

                if (j==0 || j== cel-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // 3.编写Java程序，实现接收用户输入的正整数，输出该数的阶乘。
    // 要求：限制输入的数据在1-10之间，无效数据进行提示，结束程序。要求使用递归和循环分别实现。输出结果如：4！=1*2*3*4=24
    public static void printFactorialByFor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1-10之间的整数");
        int num = sc.nextInt();
        int result = 1;
        String  str = num+"!=";

        if (num < 1 || num > 10){
            System.out.println("输入错误，请输入1-10之间的整数");
            return;
        }

        for (int i = 1;i<=num;i++){
            result *= i;
            if (i == num){
                str = str.concat(i+"="+result);
                break;
            }
            str = str.concat(i+"*");
        }
        System.out.println(str);
    }

    //递归答案
    //实现字符串的输出
    public static String testString(int n){
        String result = "";
        for (int i=1;i<=n;i++){
            result +=(i+"*");
        }
        return result.substring(0, result.length()-1);
    }
    //递归实现
    public static long factRec(int n){
        if(n==1){
            return 1;
        }else{
            return n*factRec(n-1);
        }
    }

}
