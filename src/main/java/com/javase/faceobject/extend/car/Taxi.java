package com.javase.faceobject.extend.car;

/**
 * @Author story
 * @CreateTIme 2020/5/11
 **/

/*
* 1)出租车类:
            属性包括：车型，车牌，所属出租公司；方法包括：启动，停止
* */
public class Taxi extends Car {
    private String belongCompany;

    @Override
    public void start() {
        System.out.println("乘客您好");
        System.out.println("我是"+this.belongCompany+"出租车公司的，我的车牌是"+super.getLicense()+",您要去哪里");
    }

    @Override
    public void stop() {
        System.out.println("目的地已经到了，请您付费下车，欢迎再次乘坐");
    }

    public Taxi(String motoType, String license, String belongCompany) {
        super(motoType, license);
        this.belongCompany = belongCompany;
    }

    public Taxi() {
    }


}
