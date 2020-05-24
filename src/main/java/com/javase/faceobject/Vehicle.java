package com.javase.faceobject;

/**
 * @Author story
 * @CreateTIme 2020/5/7
 *
 *
 * 请定义一个交通工具(Vehicle)的类其中有:  属性： 速度(speed)、 体积(size)等，方法：移动(move())、
 * 设置速度(setSpeed(int speed))、加速 speedUp()、减速 speedDown()等。
 * 最后在测试类 Vehicle 中的 main()中实例化一个交通工具对象并通过方法给它初始化
 * speed,size 的值并且通过打印出来。另外调用加速、减速的方法对速度进行改变。
 *
 *
 * */


public class Vehicle {
    int speed;
    double size;

    public void move(){
        System.out.println("正在移动,当前速度为"+speed);
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void speedUp(){
        this.speed++;

    }

    public void speedDown(){
        this.speed--;
    }

    public Vehicle() {
    }

    public Vehicle(int speed, double size) {
        this.speed = speed;
        this.size = size;
        System.out.println("速度为"+speed+",体积为"+size);
    }
}
