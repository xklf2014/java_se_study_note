package com.javase.faceobject.abstractdemo;

/**
 * @Author story
 * @CreateTIme 2020/5/10
 **/
public class Test {


    public static void main(String[] args) {
        Dog dog = new Dog("贵宾",2,"心情不","哈尼");
        Dog dog1 = new Dog("贵宾",2,"心情好","哈尼");
        dog1.show();
        Dog dog2 = new Dog("哈士奇",4,"心情不好","二哈");
        dog2.show();
        System.out.println("===================");
        ItEmployee emp = new ItEmployee("张三",14,5);
        ItEmployee emp1 = new ItEmployee("张三",15,5);
        emp1.work("alibaba","cto");

        Book book = new Book("仙剑奇侠传","华北出版社",5);
        Book book1 = new Book("神雕侠侣","华北出版社",150);
        book1.introduce();
        Book book2 = new Book("大话西游","华北出版社",80);
        book2.introduce();
    }

}
