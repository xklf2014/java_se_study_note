package com.javase.faceobject.interfacedemo.computer;

/**
 * @Author story
 * @CreateTIme 2020/5/13
 **/
public class AmdCpu implements Cpu {
    @Override
    public String getBrand() {
        return "Amd";
    }

    @Override
    public String getHz() {
        return "1000hz";
    }
}
