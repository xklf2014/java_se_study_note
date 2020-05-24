package com.javase.faceobject;

/**
 * @Author story
 * @CreateTIme 2020/5/8
 **/

/*
* 封装：
*   概念：
*       将类的某些信息隐藏在类的内部，不允许外部程序直接访问
*       通过类提供的方法来实现对隐藏信息的操作和访问
*
*      如果任何一个处理类都可以直接对Dog进行赋值操作，那么当值不准确时，可以产生额外的结果
*       如果在赋值的时候添加一些处理逻辑呢？
*       封装可以解决此问题
*   使用封装可以保证数据的规范，不符合规范的数据将无法保存
*
*   好处：
*       1、隐藏类的内部实现细节
*       2、只能通过规定的方法金访问，其他方法无法访问
*       3、可以根据需求添加复杂的逻辑判断语句
*       4、方便修改实现
*
*   面向对象的封装（狭义）可以用一句话概述：为了保证数据安全和规范
*       将类中的属性设置为私有属性，提供公有方法供程序进行调用，可以实现丰富的细节操作
*   广义的封装：
*       可以将完成特定的功能代码块封装称一个方法，供不同的程序进行调用
*
*
*   定义类的时候包含以下组件：
*       属性
*       构造方法（无参，自定义），get/set
*       普通方法
* */
public class Dog {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        if (age>0){
            this.age = age;
        }else {
            System.out.println("年龄不规范");
        }
        this.color = color;
    }

    public Dog() {
    }

    public void eat(){
        System.out.println("eating");
    }

    public void play(){
        System.out.println("playing");
    }

    public void show(){
        System.out.println("name"+name);
        System.out.println("int"+age);
        System.out.println("color"+color);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age>0){
            this.age = age;
        }else {
            System.out.println("年龄不合法");
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }
}
