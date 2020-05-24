package com.javase.faceobject.extend.act;

/**
 * @Author story
 * @CreateTIme 2020/5/11
 **/
public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.selfIntroduce();
        System.out.println("============");

        Sporter sporter = new Sporter("刘小翔",23,"男","200米短跑",22);
        sporter.selfIntroduce();
        System.out.println("============");

        Actor actor = new Actor("章一",27,"女","北京电影学院","寄往天国的家属");
        actor.selfIntroduce();
    }
}
