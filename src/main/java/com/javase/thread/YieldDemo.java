package com.javase.thread;

/**
 * @Author story
 * @CreateTIme 2020/5/23
 **/
public class YieldDemo {
    public static void main(String[] args) {

        JoinDemo joinDemo = new JoinDemo();
        Thread thread = new Thread(joinDemo);
        thread.start();

        for (int i = 0; i < 5; i++) {

            if (i == 2) {
                Thread.yield();
                System.out.println(Thread.currentThread().getName() + "i====" + i+"礼让一次");
            }else {
                System.out.println(Thread.currentThread().getName() + "i====" + i);
            }

        }
    }
}