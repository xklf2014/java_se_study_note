package com.javase.faceobject;

/**
 * @Author story
 * @CreateTIme 2020/5/4
 **/
public class ThisDemo {

    String name;
    int age;

    /*
    *   this:表示当前对象的指针
    *   指向当前对象，表示当前对象的饮用
    *   用处：
    *       1、构造方法，当前构造方法中的参数名称跟类的成员变量名称一样时，可以用this代表当前对象
    *           注意：有类this之后，可以将构造方法的参数与成员变量保持一致
    *       2 普通方法中：
    *           多个普通方法之间需要调用的时候可以使用this进行调用，指的是当前对象调用其他方法
    *       3 成员变量的使用
    *           当方法中的参数名称跟成员变量的名称一致时，使用this+变量，表示调用的是当前对象的成员变量，而非局部变量
    *
    *
    * */
    public ThisDemo(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    public ThisDemo() {
        System.out.println("无参构造方法初始化");
    }

    public void test1(){
        System.out.println("test1");
    }

    public void test2(){
        System.out.println("test2");
        this.test1();
    }

    public void show(String name){
        System.out.println("局部变量"+name);
        System.out.println("成员变量"+this.name);

    }

    public static void main(String[] args) {
        ThisDemo thisDemo = new ThisDemo("lisi",12);
    }
}


