package com.javase.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @Author story
 * @CreateTIme 2020/5/3
 **/
public class ExercisesTest {
    public static void main(String[] args) {
        //checkNum();
        //printGradeByScore();
        //printSeason();
        //printSumScore();
//        printTenToTwo();
       // printPrimeNum(200);
        //buyGiftByScore();
       // printWeekByInputLetter();
       // printMaxOrMin();
        //buyColo();
        smallPointTenToTWo();

    }

    //输入一个数，判断是奇数还是偶数
    public static void checkNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int number = sc.nextInt();
        if (number % 2 ==0){
            System.out.println(number + "为偶数");
        }else{
            System.out.println(number + "为奇数");
        }
    }

    /*
    * 2.根据成绩输出对应的等级，使用if多分支和switch语句分别实现。
        a)A级   [90,100]
        b)B级   [80,90)
        c)C级   [70,80)
        d)D级   [60,70)
        e)E级   [0,60)
    *
    *
    * */

    public static void printGradeByScore(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输出一个0-100的分数");
        int score = sc.nextInt();
        if (score < 0 || score > 100){
            System.out.println("输入数值有误");
            return;
        }

        int res=0;
        if (score>=90){
            res=1;
        }else if(score>=80){
            res =2;
        }else if(score >=70){
            res=3;
        }else if(score >=60){
            res =4;
        }else{
            res =5;
        }
        String grade;
        switch (res){
            case 1:
                grade="A";
                break;
            case 2:
                grade="B";
                break;
            case 3:
                grade="C";
                break;
            case 4:
                grade="D";
                break;
            default:
                grade="E";
                break;
        }

        System.out.println("分数为:"+score + ",\t 级别为:" + grade);

    }


    //根据月份，输出对应的季节，并输出至少两个描述该季节的成语和活动
    public static void printSeason(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个月份(1-12)");
        int season = sc.nextInt();
        if (season <0 || season > 12){
            return;
        }


        switch (season){
            case 11:
            case 12:
            case 1:
                System.out.println("冬天-白雪皑皑 寒风凛冽 滑雪、打雪仗");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("春天-春意盎然 春暖花开 踏青、赏花");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("夏天-夏日炎炎 烈日当空  游泳、吃雪糕");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("秋天-秋高气爽  硕果累累 收庄稼、登高望远");
                break;

        }
    }

    //判断一个数是否是素数
    public static void printPrime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("打印一个你输入的数以内所有的素数");

    }

    public static void printSumScore(){
        char ch = 'a';
        int sum =0;
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<5;i++){
            ch = (char) (ch + i);
            System.out.println("请输入"+ch+"同学的分数");
            sum += Integer.valueOf(sc.nextLine());
        }
        System.out.println("总分为:"+sum);
    }

    //6.从键盘输入某个十进制整数数，转换成对应的二进制整数并输出。
    public static void printTenToTwo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个十进制数");
        int num = sc.nextInt();
        String res ="";
        while (num !=0){
            int i = num % 2;
            res = i + res;
            num = num / 2;
        }
        System.out.println("对应的二进制数字为:" + res);
    }


    public static void printPrimeNum(int max){
        int index = 1;
        int count = 0;
        while (index <= max){
            boolean flag = true;
            for ( int i = 2;i<index; i++){
                if(index % i == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(index);
                count +=1;
            }
            index ++;
        }
        System.out.println("count === "+count);
    }

    public static void buyGiftByScore(){
        int score = (int) (Math.random()*101);
        System.out.println("分数为"+score);
        if (score > 90){
            System.out.println("买电脑");
        }else if (score > 80){
            System.out.println("买手机");
        }else if (score > 60){
            System.out.println("吃大餐");
        }else{
            System.out.println("买学习资料");
        }
    }

    //Monday Tuesday Wednesday Thursday Fridy Saturday Sunday
    public static void printWeekByInputLetter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入首字母");
        String letter = scanner.nextLine().toUpperCase();
        String second;
        switch (letter){
            case "M":
                System.out.println("星期一");
                break;
            case  "W":
                System.out.println("星期三");
                break;
            case "F":
                System.out.println("星期五");
                break;
            case "T":
                System.out.println("请输入第二个字母");
                second = scanner.nextLine().toUpperCase();
                if (second.equals("U")){
                    System.out.println("星期二");
                    break;
                }else if (second.equals("H")){
                    System.out.println("星期四");
                    break;
                }else {
                    System.out.println("输入错误");
                    break;
                }
            case "S":
                System.out.println("请输入第二个字母");
                second = scanner.nextLine().toUpperCase();
                if (second.equals("A")){
                    System.out.println("星期六");
                    break;
                }else if (second.equals("U")){
                    System.out.println("星期日");
                    break;
                }else {
                    System.out.println("输入错误");
                    break;
                }
            default:
                System.out.println("请输入正确的首字母");
                break;

        }


    }

    //3.输入一批整数，使用循环求出最大值与最小值，输入0时结束。
    public static void printMaxOrMin(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一些整数，按0结束");
        int first = Integer.valueOf(scanner.nextLine());

        int max = first;
        int min = first;

        if (first == 0){
            System.out.println("最大值为："+max + "\t 最小值为:" + min);
            return;
        }

        while(true){
            //System.out.println("请继续输入数字:");
            int temp = Integer.valueOf(scanner.nextLine());

            if (temp == 0){
                break;
            }

            if (temp > max){
                max = temp;
                continue;
            }

            if (temp < min){
                min = temp;
            }

        }

        System.out.println("最大值为："+max + "\t 最小值为:" + min);
    }

    //给20块钱买可乐，每瓶可乐3块钱，喝完之后退瓶子可以换回1块钱，问最多可以喝到多少瓶可乐
    public static void buyColo(){
        int money = 20;
        int count = 0;
        int colos=0;

        while(true){
            money-=3;
            colos++;
            count++;
            if (count == 3){
                money++;
                count=0;
            }

            if (money < 3){
                break;
            }
        }
        System.out.println("一共买了"+ colos + "瓶可乐");


    }

    //从键盘输入某个十进制小数，转换成对应的二进制小数并输出。（查询十进制小数转换成二进制小数的算法，使用循环来实现。最多保留小数位后7位数字即可）
    public static void smallPointTenToTWo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个十进制的小数");
        //给定一个十进制小数,例如0.6666
        double org = scanner.nextDouble();
        //转换
        double mul = org;
        StringBuffer buffer = new StringBuffer("0.");
        //定义一个计数器
        int count=0;
        do{
            //乘以2得到积
            double result =  mul*2;//1.250
            //从积中取出整数部分作为二进制位
            int i = (int)result;
            buffer.append(i);
            //计数
            count++;
            //判断是否够7位
            if(count==7){
                break;
            }
            //从积中取出小数部分作为下一次的乘数
            mul= result-i;
        }while(mul!=0); //判断乘数是否为0
        //输出十进制小数和二进制小数
        System.out.println(org+"---->"+buffer);
    }

}
