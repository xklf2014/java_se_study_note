package com.javase.exception;


/**
 * @Author story
 * @CreateTIme 2020/5/16
 **/


/*
*
* 在程序运行过程中，如果处理异常的部分包含finally处理块，那么无论代码是否发生异常，finally中的代码总是会执行
*       finally包含那些处理逻辑？
*           1、IO流的关闭操作设置在finally中
*           2、数据库的链接关闭操作设置在finally中
*
*
* */
public class FinallyDemo {
    public static void main(String[] args) {
        FinallyDemo finalDemo = new FinallyDemo();
        finalDemo.finallyTets();

    }

    void finallyTets(){
        try {
            System.out.println(1/0);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }
    }
}
