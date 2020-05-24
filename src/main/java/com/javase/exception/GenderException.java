package com.javase.exception;

/**
 * @Author story
 * @CreateTIme 2020/5/16
 **/


/*
* 自定义异常：
*   在java的api中提供类非常丰富的异常类，但是在某些情况下不太满足我们的需求，此时需要自定义异常
*       步骤：
*           1、继承Exception
*           2、自定义实现构造方法
*           3、需要使用的时候，使用throw new自定义异常的名称
*
*       什么时候使用自定义异常？
*           一般情况不需要
*           但是在公司要求明确，或者需要异常格式统一规范的时候，必须要自己实现的
*
* */
public class GenderException extends Exception {

    public GenderException(){
        System.out.println("性别异常");
    }

    public GenderException(String msg){
        System.out.println(msg);
    }
}
