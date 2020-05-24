package com.javase.faceobject.interfacedemo;

/**
 * @Author story
 * @CreateTIme 2020/5/12
 **/
public class LockDoor extends Door implements Lock {
    @Override
    public void openDoor() {
        System.out.println("开门");
    }

    @Override
    public void closeDoor() {
        System.out.println("关门");
    }

    @Override
    public void lock() {
        System.out.println("上锁");
    }

    @Override
    public void unlock() {
        System.out.println("解锁");
    }
}
