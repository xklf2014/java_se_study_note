package com.javase.faceobject;

/**
 * @Author story
 * @CreateTIme 2020/5/4
 **/
public class Student {

    /*

        所有类的方法和属性都是可以定义的，但不是必须的
        一个class中可以有多个class，但是只能有一个public class
        属性：
            【访问修饰符】 数据类型 属性名 = 值
        方法： 表示行为
            语法：
                【访问修饰符】 返回值类型 方法名称{
                    1 方法修饰符可以不写
                    2 方法可以有返回值，也可以没有,void表示没有返回值
                    3 形参列表可以有，也可以没有
                    4 参数传递为值传递
                }


     */
    int no;
    String name;
    int age;
    boolean gander;

    void study(){
        System.out.println("我在学习");
    }

    void eat(String food){
        System.out.println("我在吃" + food);
    }

    public static void main(String[] args) {
        Student student = new Student();

        System.out.println("我的名字叫:"+student.name+",今年"+student.age+",学号为"+student.no+","+student.gander);
        student.study();
        student.eat("苹果");
        student.name="张三";
        student.age = 18;
        student.no=1;

        System.out.println("我的名字叫:"+student.name+",今年"+student.age+",学号为"+student.no);
    }

    class inner{

    }
}

class outer{


}
