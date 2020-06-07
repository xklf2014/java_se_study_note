package com.reflect;

public class Student extends Person {
    public String className;
    private String address;

    public Student() {
    }

    private Student(String address){
        this.address = address;
    }

    public Student(String name, int age, String className, String address) {
        super(name, age);
        this.className = className;
        this.address = address;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "className='" + className + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    private int add(int a, int b){
        return a+b;
    }
}
