package com.javase.thread;

/**
 * @Author story
 * @CreateTIme 2020/5/23
 **/
public class SleepDemo {
    public static void main(String[] args) {
        JoinDemo joinDemo = new JoinDemo();
        Thread thread = new Thread(joinDemo);
        thread.start();

        for (int i =0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"i===="+i);
            if (i==2){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
