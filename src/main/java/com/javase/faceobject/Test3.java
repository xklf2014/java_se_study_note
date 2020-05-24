package com.javase.faceobject;

/**
 * @Author story
 * @CreateTIme 2020/5/7
 **/
public class Test3 {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle(60,100);
//        vehicle.move();
//        vehicle.speedUp();
//        vehicle.move();
//        vehicle.speedDown();
//        vehicle.move();

       /* Person person = new Person("张三",18);
        person.display();*/


        /*Circle circle = new Circle(5.5);
        System.out.println("周长为"+circle.getPerimeter());
        System.out.println("面积为"+circle.getArea());*/

      /*  NetUser p1 = new NetUser(1,"123456","lisi@163.com");
        p1.show();
        //调用无参构造
        NetUser p2 = new NetUser(2,"666666");
        p2.show();*/

/*        Calculaion c = new Calculaion();
        System.out.println("加法"+c.add(5, 6.6));
        System.out.println("减法"+c.sub(7.0, 3));
        System.out.println("乘法"+c.times(5, 15.7));
        System.out.println("除法"+c.div(5, 0));*/



        StudentNew sn1 = new StudentNew("001","张三",false,18,89.5);
        StudentNew sn2 = new StudentNew("002","张四",true,19,84.5);
        StudentNew sn3 = new StudentNew("003","张五",false,16,66.5);
        StudentNew sn4 = new StudentNew("004","张六",true,20,100);
        StudentNew sn5 = new StudentNew("005","张小",false,15,50);
        double[] avgs = {sn1.getsJava(),sn2.getsJava(),sn3.getsJava(),sn4.getsJava(),sn5.getsJava()};
        System.out.println("平均分"+sn1.getAvg(avgs));
        System.out.println("最大值"+sn1.getMax(avgs));
        System.out.println("最小值"+sn1.getMin(avgs));

    }


}
