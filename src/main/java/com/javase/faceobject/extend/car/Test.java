package com.javase.faceobject.extend.car;

/**
 * @Author story
 * @CreateTIme 2020/5/11
 **/
public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
        System.out.println("=========");

        PrivateCar privateCar = new PrivateCar("玛莎拉蒂总裁","沪A88888","马飞");
        privateCar.start();
        privateCar.stop();
        System.out.println("=========");

        Taxi taxi = new Taxi("比亚迪","京A66666","景生");
        taxi.start();
        taxi.stop();


    }
}
