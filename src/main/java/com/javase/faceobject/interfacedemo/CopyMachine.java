package com.javase.faceobject.interfacedemo;

/**
 * @Author story
 * @CreateTIme 2020/5/13
 **/
public class CopyMachine implements InkBox,Paper {
    @Override
    public void getWriteAndBlack() {
        System.out.println("使用黑白打印机");
    }

    @Override
    public void gerColor() {
        System.out.println("使用彩色打印机");
    }

    @Override
    public void getA4() {
        System.out.println("使用A4纸打印");
    }

    @Override
    public void getA5() {
        System.out.println("使用A5纸打印");
    }

    public static void main(String[] args) {
        CopyMachine machine = new CopyMachine();
        machine.gerColor();
        machine.getA4();

        machine.getWriteAndBlack();
        machine.getA5();
    }
}
