package com.javase.faceobject.abstractdemo.pet;

/**
 * @Author story
 * @CreateTIme 2020/5/12
 **/


/*
*   多态：
*       对应同一个指令（调用同一个名称的方法），不同的对象给予不同的反应（不同的方法实现）
*       规范（多态实现的前提）：
*           1、必须要有继承关系
*           2、子类方法必须重写父类方法
*           3、父类引用指向子类对象
*
*       多态的目的：
*           为了提高代码的扩展性和可维护性
*           方便代码逻辑的编写
*
*       多态的两种表现形式：
*           1、父类作为方法的参数
*           2、父类作为方法的返回值类型
*
*       引用类型的转换跟基本数据类型的转换类似：
 *       1、当父类需要转成子类的时候，要进行强制转换，但是在强制转换之前一定要先判断父类引用指向的子类对象到底是谁，
 *           如果无法确定，在运行过程中可以出错（强制转换)
 *       2、当子类需要向父类转换的时候，直接自动转换，不需要进行任何的判断。
*
* */
public class Person {
//    public void feed(Cat cat){
//        cat.feed();
//    }
//
//    public void feed(Dog dog){
//        dog.feed();
//    }

    public void feed(Pet pet){
        pet.feed();
    }

    public void play(Pet pet){
        pet.play();
    }

    public static void main(String[] args) {
        Person p = new Person();
        Cat cat = new Cat();
        Dog dog = new Dog();
        //p.feed(dog);
        //p.feed(cat);
        System.out.println("======");

        p.feed(cat);
        p.feed(dog);
        p.play(dog);
        p.play(cat);

        Tiger tiger = new Tiger();
        p.feed(tiger);

    }


}
