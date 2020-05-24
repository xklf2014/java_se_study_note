package com.javase.faceobject;

/**
 * @Author story
 * @CreateTIme 2020/5/4
 **/
public class StaticDemo {

    /*
    *   static:
    *       修饰成员变量时，表示为静态变量或者类变量
    *       普通变量在使用的时候，必须要通过对象名称进行调用
    *       类变量或者静态变量可以使用对象名称调用，也可以通过类名进行调用
    *   注意：
    *       静态变量，在创建对象之前被初始化，或者称为类在被载入前进行初始化
    *       静态方法、普通方法中不允许创建静态变量
    *       静态变量被所有对象共享，属于公共变量，对象和类都可以直接使用，推荐类来调用
    *       成员变量放在堆中，静态变量放在静态区中
    *       静态方法可以被普通方法调用
    *       静态方法中不能直接调用普通方法
    *       静态方法中不能使用this
    *       一般工具类中的方法定义为static
    * */

    String name ="zhangsan";
    static int age = 10;

    public static void staticTest(){
        System.out.println("我是个静态方法");
    }

    public void test(){
        staticTest();
    }
    public static void main(String[] args) {
        StaticDemo staticDemo = new StaticDemo();
        System.out.println("姓名：" + staticDemo.name + ",年龄"+staticDemo.age);
        System.out.println("姓名：" + staticDemo.name + ",年龄"+StaticDemo.age);
        staticDemo.age = 20;
        System.out.println(staticDemo.age);
        System.out.println(StaticDemo.age);

        StaticDemo.age=30;
        System.out.println(staticDemo.age);
        System.out.println(StaticDemo.age);

        StaticDemo staticDemo1 = new StaticDemo();
        System.out.println(staticDemo1.age);

        staticDemo.staticTest();
        StaticDemo.staticTest();
        staticDemo.test();


    }
}
