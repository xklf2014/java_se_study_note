package com.javase.faceobject.extend;

/**
 * @Author story
 * @CreateTIme 2020/5/10
 **/
public class Dog {

    private String name;
    private int age;
    private boolean gender;
    private String sound;


    public Dog() {
    }

    public Dog(String name, int age, boolean gender, String sound) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.sound = sound;
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

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
