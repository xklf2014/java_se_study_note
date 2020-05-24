package com.javase.faceobject.abstractdemo;

/**
 * @Author story
 * @CreateTIme 2020/5/10
 **/
public class AbstractTest {
    public static void main(String[] args) {
        //abstractDemo is abstract,can't be instantiated
        //AbstractDemo abstractDemo = new AbstractDemo();

        AbstractChildDemo abstractChildDemo = new AbstractChildDemo();
        abstractChildDemo.print();
        abstractChildDemo.print1();
    }
}
