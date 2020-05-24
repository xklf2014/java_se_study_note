package com.javase.faceobject.extend.mon;

/**
 * @Author story
 * @CreateTIme 2020/5/11
 **/
public class Test {
    public static void main(String[] args) {

        Snake snake = new Snake("蛇妖甲",5,20);
        snake.attack();
        snake.resume();
        System.out.println(snake.move());
        System.out.println("===========");

        Centipede centipede = new Centipede("蜈蚣乙",60,15);
        centipede.attack();
        System.out.println(centipede.move());
    }
}
