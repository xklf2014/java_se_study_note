package com.javase.faceobject.interfacedemo;

/**
 * @Author story
 * @CreateTIme 2020/5/12
 **/
public class Mouse implements Usb {
    @Override
    public void transfer() {
        System.out.println("鼠标可以点击");
    }
}
