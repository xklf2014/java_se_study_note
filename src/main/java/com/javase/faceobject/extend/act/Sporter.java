package com.javase.faceobject.extend.act;

/**
 * @Author story
 * @CreateTIme 2020/5/11
 **/
public class Sporter extends Person{
    //运动项目，历史最好成绩
    private String sport;
    private double score;

    public Sporter(String name, int age, String gender, String sport, double score) {
        super(name, age, gender);
        this.sport = sport;
        this.score = score;
    }

    @Override
    public void selfIntroduce() {
        System.out.println("大家好，我是"+super.getName());
        System.out.println("今年"+super.getAge());
        System.out.println("我擅长的项目是:"+sport);
        System.out.println("历史最好成绩是:"+score+"秒");
    }
}
