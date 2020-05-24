package com.javase.faceobject.extend.car;

/**
 * @Author story
 * @CreateTIme 2020/5/11
 **/

/*
*
* 2.请使用面向对象的思想，设计自定义类，描述出租车和家用轿车的信息。
    设定
        1)出租车类:
            属性包括：车型，车牌，所属出租公司；方法包括：启动，停止
        2)家用轿车类：
            属性包括：车型，车牌，车主姓名；方法包括：启动，停止
            要求
                1)分析出租车和家用轿车的公共成员，提取出父类—汽车类
                2)利用继承机制，实现出租车类和家用轿车类
                3)编写测试类，分别测试汽车类，出租车类和家用轿车类对象的相关方法
                  定义名为car的包存放汽车类，出租车类，家用轿车类和测试类
*
*
* */
public class Car {
    private String motoType;
    private String license;

    public void start(){
        System.out.println("我是车，我启动");
    }

    public void stop(){
        System.out.println("我是车，我停止");
    }

    public Car() {
    }

    public Car(String motoType, String license) {
        this.motoType = motoType;
        this.license = license;
    }

    public String getMotoType() {
        return motoType;
    }

    public void setMotoType(String motoType) {
        this.motoType = motoType;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }
}
