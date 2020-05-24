package com.javase.faceobject.interfacedemo;

/**
 * @Author story
 * @CreateTIme 2020/5/12
 **/
public class Udisk implements Usb{
    @Override
    public void transfer() {
        System.out.println("传输数据");
    }
}
