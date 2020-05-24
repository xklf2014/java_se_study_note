package com.javase.faceobject;

/**
 * @Author story
 * @CreateTIme 2020/5/8
 *
 *
 * 4.定义一个表示学生信息的类 Student，要求如下：
 * （1）类 Student 的属性如下：
 * sNO  表示学号； sName 表示姓名； sSex 表示性别； sAge 表示
 * 年龄；sJava：表示 Java 课程成绩。
 * （2）类 Student 带参数的构造方法：
 * 在构造方法中通过形参完成对成员变量的赋值操作。
 * （3）类 Student 的方法成员：
 * getNo（）：获得学号；
 * getName（）：获得姓名；
 * getSex（）：获得性别；
 * getAge（）获得年龄；
 * getJava（）：获得 Java  课程成绩
 * （4）  根据类 Student 的定义，创建五个该类的对象，输出每个学生的信息，
 * 计算并输出这五个学生 Java 语言成绩的平均值，以及计算并输出他们 Java 语言成绩的最大值和最小值。
 *
 **/
public class StudentNew {
    private String sNo;
    private String sName;
    private boolean sSex;//true 男 false 女
    private int age;
    private double sJava;

    public StudentNew() {
    }

    public StudentNew(String sNo, String sName, boolean sSex, int age, double sJava) {
        this.sNo = sNo;
        this.sName = sName;
        this.sSex = sSex;
        this.age = age;
        this.sJava = sJava;
    }

    public String getsNo() {
        return sNo;
    }

    public String getsName() {
        return sName;
    }

    public boolean issSex() {
        return sSex;
    }

    public int getAge() {
        return age;
    }

    public double getsJava() {
        return sJava;
    }

    public double getAvg(double[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }

        return sum/array.length;
    }

    public double getMax(double[] array){
        double max=array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public double getMin(double[] array){
        double min=array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
