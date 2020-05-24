package com.javase.faceobject.interfacedemo.computer;

/**
 * @Author story
 * @CreateTIme 2020/5/13
 **/
public class InterCpu implements Cpu {

    @Override
    public String getBrand() {

        return "Inter";
    }

    @Override
    public String getHz() {
        return "3000hz";
    }

    public InterCpu() {
    }
}
