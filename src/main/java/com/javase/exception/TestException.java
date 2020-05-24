package com.javase.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Author story
 * @CreateTIme 2020/5/15
 **/

/*
*
*   异常：
*       在程序运行的过程中，出现的不正常情况叫做异常
*
*   注意：
*       相同的代码在运行的时候，跟怒输入的参数或者操作的不同，有可能会发生异常，有可能不会发生异常
*           应该在写代码的过程中尽可能的保证代码的正确性
*       如果要解决代码中出现的异常，需要添加非常复杂的代码逻辑来判断，会使代码变得十分臃肿，不利于维护，可读性比较差
*           因此推荐使用异常机制来出来程序运行过程中出现的问题
*       程序在运行过程中如果出现来问题，会导致后面的代码无法执行，而使用异常机制之后，可以对异常进行处理，同时后续的代码会继续执行
*       在异常处理的过程中，不要只是简单的输出错误，要尽可能输出详细的异常信息
*           e.printStackTrace();打印异常的堆栈信息，可以从异常信息的最后一行开始追踪，寻找自己编写的java类产生异常的地方
*
*     异常处理的方法：
*       1、捕获异常
*           try{代码逻辑}catch{捕获异常}
*               InputMismatchException
*               ArithmeticException  除0异常
*
*           try{代码逻辑}catch{捕获异常}catch{}...;
*               可以针对每一种具体的异常做响应的更丰富的处理
*                   注意：当使用多重catch的时候，一定要注意相关的异常顺序，将子类放在最前面的catch，父类放在后面的catch
*           执行的过程中可能存在的情况：
*               1、正常执行，执行try中的代码
*               2、遇到异常情况，会处理try中异常代码之前的逻辑，后面的逻辑不会执行，最后会执行catch中的戴拿
*               3、多重catch的时候，会遇到异常子类不匹配的情况，此时依然会报错，因此建议在catch的最后将所有异常的父类加上
*
* */
public class TestException {
    public static void main(String[] args) {
        //System.out.println(1/0);


    }

    public void divide(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("请输入被除数");
            int num1 = sc.nextInt();
            System.out.println("请输入除数");
            int num2 = sc.nextInt();
            System.out.println(String.format("%d / %d = %d",num1,num2,num1/num2));
            System.out.println("前面没有异常");
        }catch (Exception e){
            System.out.println("出现异常");
            System.out.println(e.getMessage());
        }
    }

    public void divide1(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("请输入被除数");
            int num1 = sc.nextInt();
            System.out.println("请输入除数");
            int num2 = sc.nextInt();
            System.out.println(String.format("%d / %d = %d",num1,num2,num1/num2));
            System.out.println("前面没有异常");
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (InputMismatchException e){
            e.printStackTrace();
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
