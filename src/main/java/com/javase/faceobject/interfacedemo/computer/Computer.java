package com.javase.faceobject.interfacedemo.computer;

//import sun.plugin2.gluegen.runtime.CPU;

/**
 * @Author story
 * @CreateTIme 2020/5/13
 **/
public class Computer {

    public void show(Cpu cpu,HardDisk disk){
        System.out.println("计算机的组成如下：");
        System.out.println("cpu:"+cpu.getBrand()+",主频是:"+cpu.getHz());
        System.out.println("harddisk:"+disk.getVolume());
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        Cpu cpu = new InterCpu();
        SamsungHardDisk samsungHardDisk = new SamsungHardDisk();
        computer.show(cpu,samsungHardDisk);

        Computer computer1 = new Computer();
        Cpu cpu1 = new AmdCpu();
        JSDHardDisk jsdHardDisk = new JSDHardDisk();
        computer1.show(cpu1,jsdHardDisk);
    }
}
