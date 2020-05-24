package com.javase.faceobject.extend.act;

/**
 * @Author story
 * @CreateTIme 2020/5/11
 **/
public class Actor extends Person {
    //毕业院校，代表作
    public String graduate;
    private String works;

    public Actor(String name, int age, String gender, String graduate, String works) {
        super(name, age, gender);
        this.graduate = graduate;
        this.works = works;
    }

    @Override
    public void selfIntroduce() {
        System.out.println("大家好，我是"+super.getName());
        System.out.println("今年"+super.getAge());
        System.out.println("我毕业于:"+graduate);
        System.out.println("代表作品有:"+works);
    }
}
