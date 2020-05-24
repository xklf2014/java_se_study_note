package com.javase.faceobject;

/**
 * @Author story
 * @CreateTIme 2020/5/7
 *
 *
 * 定义一个圆类——Circle，在类的内部提供一个属性：半径(r)，同时 提供 两个 方 法 ：
 * 计算 面积 （ getArea() ） 和 计算 周长（getPerimeter()） 。
 * 通过两个方法计算圆的周长和面积并且对计算结果进行输出。最后定义一个测试类对 Circle 类进行使用。
 *
 *
 **/
public class Circle {
    private double r;
    public static double PI=Math.PI;

    public double getArea(){
        return PI * r * r;
    }

    public double getPerimeter(){
        return 2 * PI * r;
    }

    public Circle(double r) {
        this.r = r;
    }

    public Circle() {
    }
}
