package com.javase.faceobject.abstractdemo;

/**
 * @Author story
 * @CreateTIme 2020/5/10
 **/

/*
*
*
*   final的使用：
*       final可以修饰变量：
*           表示变量的值不可以修改
*       final可以修饰方法：
*           表示方法不可以被重写
*       final可以修饰类：
*           表示类不可以被继承
*
*
* */
public class FinalDemo {

    public static final String name = "zhangsan";

    public final void test(){
        System.out.println("final test");
    }

    public static void main(String[] args) {
        //name = "lisi"; //不允许修改一个被final修饰的变量
    }

}


