package com.javase.faceobject;

/**
 * @Author story
 * @CreateTIme 2020/5/8
 **/

/*
*
* 方法参数的值是否改变
*   方法中的参数列表叫做形式参数，没有具体的值，只是为了方便在具体方法中使用
*   调用方法的时候实际传入的值叫实际参数，代表具体的数值，用来替换在方法体中代码逻辑的值进行计算
*
*   注意：
*       1、形式参数的变量名称也是局部变量
*       2、当方法的参数值是基本数据类型的时候，不会改变原来的值
*       3、当方法的参数值是引用数据类型的时候，如果改变类该饮用的值，会改变原来的对象的值
*   java中的参数传递是值传递
*
* */
public class ArgumentDemo {
    int x;
    int y;

    public static void switchTwoValue(ArgumentDemo argumentDemo){
        int tmp = argumentDemo.x;
        argumentDemo.x = argumentDemo.y;
        argumentDemo.y=tmp;
    }

    public static void switchTwoNum(int a, int b){
        int tmp =a;
        a = b;
        b = tmp;

    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        switchTwoNum(a,b);
        System.out.println(a);
        System.out.println(b);

        ArgumentDemo argumentDemo = new ArgumentDemo();
        argumentDemo.x =10;
        argumentDemo.y =20;
        argumentDemo.switchTwoValue(argumentDemo);
        System.out.println(argumentDemo.x);
        System.out.println(argumentDemo.y);
    }
}
