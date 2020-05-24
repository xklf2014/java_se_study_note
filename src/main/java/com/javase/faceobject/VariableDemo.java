package com.javase.faceobject;

/**
 * @Author story
 * @CreateTIme 2020/5/4
 **/


/*
*
*   变量：
*       局部变量：
*           定义：定义为方法中的变量为局部变量
*           作用域：从定义位置开始到方法结束（只能在当前方法使用，方法外无法使用）
*           注意：不包含默认值，如果没有使用到当前变量，可以不赋值
*       成员变量：
*           定义在方法之外，类内到变量为成员变量
*           作用域：整个类内
*           注意：包含默认值
*
*
*
* */
public class VariableDemo {

    static int age =20;
    String name;

    public static void main(String[] args) {

    }

    public static void show(){
        int age = 18;
        System.out.println("age="+age);
        age = 10;


    }

    //无参构造方法，默认系统会生产默认到无参构造方法
    public VariableDemo() {
    }

    //有参构造方法，如果创建类有参构造方法，系统提供的无参构造方法会失效，需要手动创建无参构造方法
    public VariableDemo(String name) {
        this.name = name;
    }

    // 重载： 在一个类中可以 包含重名方法
    //          1 方法参数类型不同
    //          2 方法个数不同
    //          3 方法位置不同
    public void study(){
        System.out.println("学习");
    }

    public void study(int year){
        System.out.println("学习了"+year+"年");
    }

    public void study(String name){
        System.out.println(name + "在学习");
    }

    public void study(String name,int age){
        System.out.println(name+age+"岁，开始学习了");
    }

    public void study(int age,String name){
        System.out.println(age+"岁的"+name+"，开始学习了");
    }

}
