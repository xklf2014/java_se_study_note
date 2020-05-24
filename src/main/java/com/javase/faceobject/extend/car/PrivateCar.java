package com.javase.faceobject.extend.car;

/**
 * @Author story
 * @CreateTIme 2020/5/11
 **/

/*
* 家用轿车类：
            属性包括：车型，车牌，车主姓名；方法包括：启动，停止
* */
public class PrivateCar extends Car {
    private String name;


    @Override
    public void start() {
        System.out.println("我是"+this.name+"，我的汽车我做主");
    }

    @Override
    public void stop() {
        System.out.println("目的地到了，我们去玩把");
    }

    public PrivateCar(String motoType, String license, String name) {
        super(motoType, license);
        this.name = name;
    }

    public PrivateCar() {
    }
}
