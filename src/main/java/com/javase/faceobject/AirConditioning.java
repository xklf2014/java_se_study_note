package com.javase.faceobject;

/**
 * @Author story
 * @CreateTIme 2020/5/7
 *
 * 3.创建一个空调，并调用制冷、制热、通风功能。空调包含的属性有品牌、匹数、温度，功能有加热、制冷、通风等功能。
 *
 **/
public class AirConditioning{
    private String branch;
    private int matches;
    private int temperature;

    public AirConditioning(String branch, int matches, int temperature) {
        this.branch = branch;
        this.matches = matches;
        this.temperature = temperature;
    }

    public AirConditioning() {
    }

    public void up(){
        temperature++;
    }

    public void down(){
        temperature--;
    }

    public void flow(){
        System.out.println("通风");
    }

    public void show(){
        System.out.println("品牌为"+branch+",匹数"+matches+",当前温度为"+temperature);
    }
}
