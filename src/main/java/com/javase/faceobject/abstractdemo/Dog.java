package com.javase.faceobject.abstractdemo;

/**
 * @Author story
 * @CreateTIme 2020/5/10
 **/

/*
    * 1.使用面向对象的思想，编写自定义描述狗的信息。设定属性包括：品种，年龄，心情，名字；方法包括：叫，跑。
        要求：
            1)设置属性的私有访问权限，通过公有的get,set方法实现对属性的访问
            2)限定心情只能有“心情好”和“心情不好”两种情况，如果无效输入进行提示，默认设置“心情好”。
            3)设置构造函数实现对属性赋值
            4)叫和跑的方法，需要根据心情好坏，描述不同的行为方式。
            5)编写测试类，测试狗类的对象及相关方法（测试数据信息自定义）
    *
    * */
public class Dog {
    private String branch;
    private int age;
    private String feeling = "心情好";
    private String name;

    public void run(){
        if (this.feeling.equals("心情好")){
            System.out.println("跑的飞快");
        }else{
            System.out.println("无精打采的跑");
        }
    }

    public void shout(){
        if (this.feeling.equals("心情好")){
            System.out.println("摇头晃尾巴的叫");
        }else{
            System.out.println("蔫蔫的叫");
        }
    }

    public void show(){
        System.out.print("名字叫"+name+"的"+branch+"今天"+feeling);
        this.run();
        System.out.print("名字叫"+name+"的"+branch+"今天"+feeling);
        this.shout();
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFeeling() {
        return feeling;
    }

    public void setFeeling(String feeling) {
        if ("心情不好".equals(feeling)){
             this.feeling = "心情不好";
        }else if ("心情好".equals(feeling)){
             this.feeling = "心情好";
        }else{
            System.out.println("输入错误，只能输入心情好和心情不好");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(String branch, int age, String feeling, String name) {
        this.branch = branch;
        this.age = age;
        this.setFeeling(feeling);
        this.name = name;
    }

    public Dog() {
    }
}
