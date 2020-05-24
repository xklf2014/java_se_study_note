package com.javase.faceobject.abstractdemo;

/**
 * @Author story
 * @CreateTIme 2020/5/10
 **/
/*
*
* 1.以面向对象的思想，编写自定义类描述图书信息。设定属性包括：书名，作者，出版社名，价格；方法包括：信息介绍
    要求：
        1)设置属性的私有访问权限，通过公有的get,set方法实现对属性的访问
        2)限定介格必须大于10，如果无效进行提示
        3)限定作者，书名为只读属性
        4)设计构造方法实现对属性赋值
        5)信息介绍方法描述图书所有信息
        6)编写测试类，测试图书类的对象及相关方法（测试数据信息自定）
*
* */
public class Book {
    private String bookName;
    private final String author = "story";
    private String publishing;
    private double price;

    public void introduce(){
        System.out.println("书名:" +bookName);
        System.out.println("作者:"+author);
        System.out.println("出版社:"+publishing);
        System.out.println("价格:"+price);
        System.out.println("============");
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }



    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 10){
            System.out.println("加个不能低于10元");
        }else{
            this.price = price;
        }
    }

    public Book(String bookName, String publishing, double price) {
        this.bookName = bookName;
        this.publishing = publishing;
        this.setPrice(price);
    }
}
