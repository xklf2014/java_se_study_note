package com.javase.faceobject.interfacedemo.abstractandintercace;

/**
 * @Author story
 * @CreateTIme 2020/5/13
 **/
public class AbstractChildImpl extends AbstractChild {
    @Override
    public void show() {
        System.out.println("实现show");
    }

    public static void main(String[] args) {
        AbstractChildImpl abstractChild = new AbstractChildImpl();
        abstractChild.show();
        abstractChild.neadImplementShow();
    }
}
