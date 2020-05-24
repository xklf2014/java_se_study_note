package com.javase.faceobject.abstractdemo;

/**
 * @Author story
 * @CreateTIme 2020/5/10
 **/
/*
*   java中的对象是对现实世界的具像化，但是在现实世界中，某些类并不具备实例化的意义
*   因此可以定义为抽象类
*
*   抽象类：
*       1、创建抽象类的时候需要添加abstract的关键字
*       2、不能进行实例化，也就是不能new对象
*       3、抽象类中的某些方法需要子类进行更丰富的实现，父类实现没有意义，此时可以将抽象类
*           中的方法定义为抽象方法，没有具体实现，只包含方法名称、返回值、参数列表、访问修饰符
*       4、使用abstract关键字修饰的方法叫做抽象方法，可以不写方法的实现
*       5、子类在继承抽象父类的时候，必须将父类中的抽象方法进行实现或者将子类也定义抽象类
*       6、有抽象方法的一定是抽象类，但是抽象类中不一定包含抽象方法
*
*
* */
public abstract class AbstractDemo {
    public abstract void print();

    public void print1(){
        System.out.println("print ~~~");
    }
}

