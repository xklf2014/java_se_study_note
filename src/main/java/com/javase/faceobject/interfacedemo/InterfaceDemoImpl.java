package com.javase.faceobject.interfacedemo;

/**
 * @Author story
 * @CreateTIme 2020/5/13
 **/
public class InterfaceDemoImpl implements InterfaceDemo {
    @Override
    public void A(int a, String b) {
        System.out.println("int"+a);
        System.out.println("String"+b);
    }
}
