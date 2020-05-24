package com.javase.faceobject.extend.mon;

/**
 * @Author story
 * @CreateTIme 2020/5/11
 **/
public class Centipede extends Monster {
    public Centipede(String name, int lifeValue, int aggressivity) {
        super(name, lifeValue, aggressivity);
    }

    @Override
    public String  move() {
        return super.move()+",御风飞行";
    }

    @Override
    public void attack() {
        super.attack();
    }
}
