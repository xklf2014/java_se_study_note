package com.javase.faceobject;

/**
 * @Author story
 * @CreateTIme 2020/5/7
 *
 * 1.定义一个类 Calculaion， 其中包含四个方法： 加（add()） 、 减（sub()） 、乘（times()） 和除（div()） 。
 * 创建一个具有 main()函数的类。 在 main()函数中创建一个 Calculation 的实例对象并对其中的方法进行调用。
 *
 *
 **/
public class Calculaion {
    public double add(double a,double b){
        return a+b;
    }

    public double sub(double a,double b){
        return a - b;
    }

    public double times(double a,double b){
        return a * b;
    }

    public double div(double a,double b){
        return b != 0 ? a/b:0;
    }


}
