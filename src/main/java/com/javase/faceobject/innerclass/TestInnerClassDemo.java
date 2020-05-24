package com.javase.faceobject.innerclass;

/**
 * @Author story
 * @CreateTIme 2020/5/14
 **/
/*
*
* 内部类：
*   一个java文件中可以包含多个class，但是只能有一个publc class
*   如果一个类定义在另一个类的内部，此时可以成为内部类
*
*   使用：
*       创建内部类的时候，跟之前的方法不一样，需要在内部类的前面加外部类进行修饰
*   特点：
*       内部类可以访问外部类私有属性
*       外部类不能访问内部类的私有属性
*       内部类中不能定义静态属性
*       当内部类和外部类具有相同的私有属性的时候，在内部类中访问的时候，可以直接访问内部类的属性
*       如果需要访问外部类的属性，需要外部类名.this.属性名
*
*   分类：
*       匿名内部类:当定义类一个类，实现类某个接口当时候，在使用当过程中只需要使用一次，没有其他用途
*           其实考虑到代码编写到简洁，可以考虑不创建具体的类，而采用new interface(){添加未实现的方法}
*           就叫做匿名内部类
*       静态内部类：在内部类中可以定义静态内部类，使用static关键字进行修饰，使用规则
*           外部类.内部类 引用名称 = new 外部类.内部类();
*       方法内部类：在外部类的方法中也可以定义类，此时叫做方法内部类
*                   使用的时候需要注意，只能在方法中创建对象，因为class的作用域就是当前方法
*
*
* */
public class TestInnerClassDemo {
    public static void main(String[] args) {
        InnerClassDemo innerClassDemo = new InnerClassDemo();
        innerClassDemo.show();
        innerClassDemo.setOuterId(1);
        System.out.println(innerClassDemo.getOuterId());

        System.out.println("=========下面为实例内部类==========");
        InnerClassDemo.InnerClass innerClass = new InnerClassDemo().new InnerClass();
        System.out.println(innerClass.defaultInner);
        System.out.println(innerClass.protectedInner);
        System.out.println(innerClass.publicInner);

        innerClass.defaultInnerShow();
        innerClass.protectedInnerShow();

    }
}
