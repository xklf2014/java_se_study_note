package com.javase.faceobject.extend.info;

/**
 * @Author story
 * @CreateTIme 2020/5/11
 **/

/*
*
* 1.编写应用程序，创建类的对象，分别设置圆的半径、圆柱体的高，计算并分别显示圆半径、圆面积、圆周长，圆柱体的体积。（7分）
    提示:（1）编写一个圆类Circle，该类拥有：
            1)一个成员变量，radius（私有，浮点型）;//存放圆的半径；
            2)两个构造方法
                Circle（）              //将半径设为0
                Circle（double  r ）    //创建Circle对象时将半径初始化为r
            3)三个成员方法
                double getArea（）      //获取圆的面积
                double getPerimeter（）  //获取圆的周长
                void show（）           //将圆的关径、周长、面积输出到屏幕
		 （2） 编写一个圆柱体类Cylinder，它继承于上面的Circle类。还拥有：
            1)一个成员变量，double hight  （私有，浮点型）;  //圆柱体的高；
            2)构造方法
                //创建Cylinder对象时将半径初始化为r,高度初始化为h
                Cylinder（double r,double h）
            3)成员方法
                double getVolume（）            //获取圆柱体的体积
                void showVolume（）             //将圆柱体的体积输出到屏幕
*
* */
public class Circle {

    private double radius;

    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    public void show(){
        System.out.println("半径为"+this.radius);
        System.out.println("周长为："+this.getPerimeter());
        System.out.println("面积为"+this.getArea());
    }


    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
