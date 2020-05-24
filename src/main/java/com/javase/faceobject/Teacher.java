package com.javase.faceobject;

/**
 * @Author story
 * @CreateTIme 2020/5/8
 **/

/*
*   构造方法：
*       创建对象的时候默认会调用构造方法来创建对象（在堆中开辟空间），可以完成成员变量的初始化操作
*       构造方法的语法：
*           方法名称：构造方法的方法名称必须更类名保持一致
*           访问修饰符：
*           形参：用户可以自定义添加
*           方法体：完成对象初始化操作
*           返回值：无，并非void
*
*   注意：
*   1、创建完类之后，如果没有手动创建构造方法，系统会有一个默认的无参构造方法供调用
*   2、当用户定义类构造方法后，默认的无参构造方法就不能使用类，必须手动定义无参构造方法
*   3、同一个类中可以包含多个同名构造方法
*
*   重载：在一个类中可以包含多个重名方法，但是方法的参数列表不同
*   1、参数个数不同
*   2、参数类型不同
*   3、参数顺序不同
* */
public class Teacher {

    String name;
    int age;

    public Teacher() {
        System.out.println("无参构造方法");
    }

    public Teacher(String name,int age){
        System.out.println("有参构造方法");
        this.name = name;
        this.age = age;
    }

    //重载
    public void teach(){};

    public void teach(String s){};

    public void teach(int num){};

    public void teach(int num,String s){};

    public void teach(String s,int num){};

    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name="zhangsan";
        t.age=18;
        System.out.println(t.name);
        System.out.println(t.age);

        Teacher t1 = new Teacher("lisi",20);
        System.out.println(t1.name + ","+t1.age);


    }
}
