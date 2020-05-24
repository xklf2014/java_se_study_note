package com.javase.faceobject.extend;

/**
 * @Author story
 * @CreateTIme 2020/5/10
 **/
public class Penguin {

    private String name;
    private int age;
    private boolean gender;
    private String color;

    public Penguin() {
    }

    public Penguin(String name, int age, boolean gender, String color) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.color = color;
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
