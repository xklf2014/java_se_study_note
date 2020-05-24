package com.javase.basic;

/**
 * @Author story
 * @CreateTIme 2020/5/1
 **/

/*
注意：
	1、java文件的名称必须跟public class的名称保持一致
	2、一个java文件中可以包含多个class,凡是public class只能有1个
	3、public static void main(String[] args)是所有java程序的入口，如果向
		执行对应的java代码，则必须要添加如下方法，且格式是固定
	4、main方法中参数列表可以支持多种写法：String[] args,String [] args,String args[]
	5、main方法中参数的名称无所谓，但是一般写成args
	6、java代码在编写的时候，每行结尾的时候需要使用;结束
	7、java代码的代码块需要使用{}括起来，前后匹配
*/

/*java中的注释分为三类*/
//	1、单行注释：
/*	2、多行注释:*/
/**
 *3、文档注释：
 */
public class HelloWorld {
    public static void main(String[] args) {
        //javac 编译HelloWorld.java文件
        //java HelloWorld进行运行
        System.out.println("hello world");
    }
}
