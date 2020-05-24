package com.javase.thread;

/**
 * @Author story
 * @CreateTIme 2020/5/23
 **/
public class StopDemo {
    public static void main(String[] args) {

        JoinDemo joinDemo = new JoinDemo();
        Thread thread = new Thread(joinDemo);
        thread.start();

        for (int i = 0; i < 5; i++) {

            if (i == 2) {
                thread.stop();
            }else {
                System.out.println(Thread.currentThread().getName() + "i====" + i);
            }

        }
    }
}