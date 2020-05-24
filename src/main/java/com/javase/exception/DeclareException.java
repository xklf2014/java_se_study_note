package com.javase.exception;

/**
 * @Author story
 * @CreateTIme 2020/5/16
 **/

/*
*
* 在异常出现的情况，可以使用try...catch...finally的方式对异常进行处理，还可以使用throws关键字将异常进行抛出，交给上级方法进行处理
*   在方法调用过程中，可能存在多个方法调用，此时，假如每个方法中都包含类异常情况
*   那么就需要在每个方法中进行try...catch，另外一种比较简单的方法，就是在方法的最外一层处理一次异常即可，
*   使用throws的方法，对所有执行过程中的所有方法出现的异常进行统一集中处理
*
*   如何判断是使用throws还是try...catch
*       最稳妥的方式是在每个方法中都进行异常处理
*       偷懒的方式就是判断整个调用过程中，外层的调用方法是否对异常的处理，如果有，直接使用throws，如果没有直接要使用try...catch
*
*
* */
public class DeclareException {
    public static void main(String[] args) throws Exception {
        test();
        System.out.println("==========");
    }

    public static void test() throws Exception{
        System.out.println(1/0);
    }

    public static void test1() throws Exception{
        test2();
    }

    public static void test2() throws Exception{
       test3();
    }

    public static void test3() throws Exception{
        System.out.println(1/0);
    }
}
