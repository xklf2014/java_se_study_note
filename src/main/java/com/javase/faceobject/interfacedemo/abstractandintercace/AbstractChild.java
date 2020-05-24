package com.javase.faceobject.interfacedemo.abstractandintercace;

/**
 * @Author story
 * @CreateTIme 2020/5/13
 **/
public abstract class AbstractChild implements InterfaceFather {
    @Override
    public void neadImplementShow() {
        System.out.println("抽象类实现接口中的抽象方法");
    }


    public abstract void show();
}
