package com.javase.basic;

import java.util.Scanner;

/**
 * @Author story
 * @CreateTIme 2020/5/3
 **/
public class RepeatDemo {
    public static void main(String[] args) {
        //whileTest();
        //while100Sum();
        //dowhileTest();
        //dowhile100sumTest();
        //forTest();
        //for100sum();
        //printCustomAge();
        //print3rowNum();
        //printTenToTwo();
        //makeRandomNum();
        //breakCircle();
        //breakCircle1();
        //printDoNotDivdeBy3();
        //deadCircle();
        //ninenineRule();
        //printFibonacciSequence();
        //printFibonacciSequence();
        //hundredBuy100Chicken();
        printFibonacciSeq(10);
    }

    //while循环
    public static void whileTest(){
        int i = 1;
        while (i <= 10){
            System.out.println("i的值为" + i);
            i++;
        }
    }



    //100以内的偶数和
    public static void while100Sum(){
        int sum = 0;
        int i = 1;
        while (i <=100){
            if (i %2 ==0){
                sum +=i;
            }
            i++;
        }
        System.out.println(sum);
    }

    //do while循环
    public static void dowhileTest(){
        int i = 0;
        do{
            System.out.println(i);
            i++;
        }while(i<10);
    }

    //do while 100 sum
    public static void dowhile100sumTest(){
        int i = 0;
        int sum = 0;
        do{
            if (i % 2 ==0){
                sum +=i;
            }
            i++;
        }while(i<101);
        System.out.println(sum);
    }

    public static void forTest(){
        for (int i =0;i<10;i++){
            System.out.println(i);
        }
    }

    public static void for100sum(){
        int sum = 0;
        for (int i =0;i<=100;i++){
            if (i % 2 ==0){
                sum +=i;
            }
        }
        System.out.println(sum);
    }

    public static void printCustomAge(){
        double low30 = 0;
        for (int i =1;i<=10;i++){
            int age = (int) (Math.random()*70);
            System.out.println("第"+i+"位客户的年龄为"+age);
            if (age<30){
                low30++;
            }
        }
        System.out.println("30岁以下客户比例为"+(low30/10)*100+"%");
        System.out.println("30岁以上客户比例为"+((10-low30)/10)*100+"%");
    }

    public static void print3rowNum(){
        int count = 0;
        for (int i =0;i<1000;i++){
            if (i % 5 ==0){
                System.out.print(i + "\t");
                count++;
            }
            if (count==3){
                System.out.println();
                count = 0;
            }
        }
    }

    public static void printTenToTwo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个十进制数");
        int number = Integer.valueOf(sc.nextLine());
        String result = "";
        while (number!=0){
            int i = number % 2;
            result = i+result;
            number /=2;
        }

        System.out.println(result);
    }

    public static void makeRandomNum(){
        while (true){
            int i = (int) (Math.random()*101);

            if (i == 66){
                System.out.println("退出循环,i="+i);
                break;
            }
            System.out.println(i);
        }
    }

    //终止循环 break + tag名 ,return
    public static void breakCircle(){
            out:for (int i =0;i<10;i++){
                inner:for (int j=0;j<10;j++){
                    System.out.println("("+i+"),("+j+")");
                    if (i==6&&j==6){
                        break out;
                    }
                }
            }
    }

    public static void breakCircle1(){
        for (int i =0;i<10;i++){
            for (int j=0;j<10;j++){
                System.out.println("("+i+"),("+j+")");
                if (i==6&&j==6){
                    return;
                }
            }
        }
    }

    public static void printDoNotDivdeBy3(){
        //打印100-150内不能被3整除的数字
        for (int i = 100;i<=150;i++){
            if (i %3 ==0){
               continue;
            }
            System.out.println("不能被3整除的数字为:"+i);
        }
    }

    public static void deadCircle(){
        for (;;){
            System.out.println("死循环");
        }
    }

    public static void ninenineRule(){
        for (int i = 1;i<=9;i++){
            for (int j =1; j<=i;j++){
                System.out.print(j+"+"+i+"="+i*j + "\t");
            }
            System.out.println();
        }
    }

    //斐波那契数列
    public static void printFibonacciSequence(){
        int x = 1;
        int y = 1;
        int z = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入斐波那契数列的个数");
        int count = sc.nextInt();

        for (int i =1;i<=count;i++){
            if(i==1 || i== 2){
                System.out.print("1" + "\t");
            }else {
                z = x + y;
                x = y;
                y = z;
                System.out.print(z + "\t");
            }
        }

    }

    //递归写法
    public static int printFibonacciSequence1(int number){
        if (number ==1 || number ==2){
            return 1;
        }else {
            return printFibonacciSequence1(number-1) + printFibonacciSequence1(number -2);
        }
    }

    public static void printFibonacciSeq(int j){
        for (int i =1;i<=j;i++){
            System.out.print(printFibonacciSequence1(i) + "\t");
        }
    }



    //百钱买百鸡
    public static void hundredBuy100Chicken(){
        for (int i = 0;i<20;i++){
            for (int j=0;j<=34;j++){
                for (int k=0;k<=300;k++){
                    if ((i+j+k==100)&&(5*i+3*j+k/3)==100 && k%3==0){
                        System.out.println("公鸡："+ i +"\t 母鸡："+j+"\t 小鸡:" + k);
                    }
                }
            }
        }
    }
}
