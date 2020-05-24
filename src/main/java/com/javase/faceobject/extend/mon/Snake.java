package com.javase.faceobject.extend.mon;

/**
 * @Author story
 * @CreateTIme 2020/5/11
 **/

/*
* 1)蛇怪类:
                属性包括：怪物名字，生命值，攻击力
                方法包括：攻击，移动（曲线移动），补血（当生命值<10时，可以补加20生命值）
* */
public class Snake extends Monster {
    public Snake() {
    }

    public Snake(String name, int lifeValue, int aggressivity) {
        super(name, lifeValue, aggressivity);
    }

    public void resume(){
        if (super.getLifeValue() < 10){
            System.out.println("实施大蛇补血术.....,当前生命值是："+(super.getLifeValue()+20));
        }
    }

    @Override
    public String move() {
        return super.move()+",我走S型路线";
    }

    @Override
    public void attack() {
        super.attack();

    }
}
