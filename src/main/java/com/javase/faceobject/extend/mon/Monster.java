package com.javase.faceobject.extend.mon;

/**
 * @Author story
 * @CreateTIme 2020/5/11
 **/


/*
*
*   3.某公司要开发新游戏，请用面向对象的思想，设计游戏中的蛇怪和蜈蚣精
        设定
            1)蛇怪类:
                属性包括：怪物名字，生命值，攻击力
                方法包括：攻击，移动（曲线移动），补血（当生命值<10时，可以补加20生命值）
            2)蜈蚣精类：
                属性包括：怪物名字，生命值，攻击力
                方法包括：攻击，移动（飞行移动）
            要求
                1)分析蛇怪和蜈蚣精的公共成员，提取出父类—怪物类
                2)利用继承机制，实现蛇怪类和蜈蚣精类
                3)攻击方法，描述攻击状态。内容包括怪物名字，生命值，攻击力
                4)编写测试类，分别测试蛇怪和蜈蚣精的对象及相关方法
                5)定义名为mon的包存怪物类，蛇怪类，蜈蚣精类和测试类
*
*
*
* */
public class Monster {

    private String name;
    private int lifeValue;
    private int aggressivity;

    public String move(){
        return "我是"+this.getName();
    }

    public void attack(){
        System.out.println("怪物"+this.getName()+"展开攻击");
        System.out.println("当前生命值是:"+this.getLifeValue());
        System.out.println("攻击力是："+this.getAggressivity());
    }

    public Monster() {
    }

    public Monster(String name, int lifeValue, int aggressivity) {
        this.name = name;
        this.lifeValue = lifeValue;
        this.aggressivity = aggressivity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        this.lifeValue = lifeValue;
    }

    public int getAggressivity() {
        return aggressivity;
    }

    public void setAggressivity(int aggressivity) {
        this.aggressivity = aggressivity;
    }
}
