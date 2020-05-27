package com.javase.annotation;

import java.util.Date;

/**
 * @Author story
 * @CreateTIme 2020/5/27
 **/
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Deprecated
    public  void show(){
        System.out.println("这是一个过时的方法");
    }

    public static void main(String[] args) {
        @SuppressWarnings("all")
        User u = new User();
        new User().show();
        new Date().getMinutes();
    }
}
