package com.javase.faceobject.extend.act;

/**
 * @Author story
 * @CreateTIme 2020/5/11
 **/

/*
*
*   1.请用面向对象的思想，设计自定义类描述演员和运动员的信息
        设定
            1)演员类:
                属性包括：姓名，年龄，性别，毕业院校，代表作
                方法包括：自我介绍
            2)运动员类：
                属性包括：姓名，年龄，性别，运动项目，历史最好成绩
                方法包括：自我介始
        要求
            3)分析演员和运动员的公共成员，提取出父类—人类
            4)利用继承机制，实现演员类和运动员类
            5)编写测试类，分别测试人类，演员类和运动员类对象及相关方法
            6)定义名为act的包存人类，演员类，运动员类和测试类
*
*
*
* */
public class Person {
    private String name;
    private int age;
    private String gender;

    public void selfIntroduce(){
        System.out.println("我是一个普通老百姓");
    }

    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
