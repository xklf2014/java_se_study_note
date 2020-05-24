package com.javase.faceobject.extend;

/**
 * @Author story
 * @CreateTIme 2020/5/10
 **/
public class Pet {

    private String name;
    private int age;
    private boolean gender;


    public Pet() {
    }

    public Pet(String name, int age, boolean gender) {
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


    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public boolean getGender() {
        return gender;
    }

    public void show(){
        String gender = "母";
        if (this.gender ){
            gender = "公";
        }
        System.out.println("宠物名字"+this.name+"\t年龄"+this.age+"\t性别"+gender);
    }

    public static void print(){
        System.out.println("父类静态方法");
    }


    //不可以被继承
    private void pricateFuncation(){
        System.out.println("私有方法");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
