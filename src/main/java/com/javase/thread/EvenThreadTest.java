package com.javase.thread;

/**
 * @Author story
 * @CreateTIme 2020/5/23
 **/
public class EvenThreadTest extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 ==0){
                System.out.println(Thread.currentThread().getName()+"=========>"+i);
            }
        }
    }

    public static void main(String[] args) {
        EvenThreadTest threadTest = new EvenThreadTest();
        threadTest.start();
    }
}
