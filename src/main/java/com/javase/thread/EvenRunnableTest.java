package com.javase.thread;

/**
 * @Author story
 * @CreateTIme 2020/5/23
 **/
public class EvenRunnableTest implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 ==0){
                System.out.println(Thread.currentThread().getName()+"=========>"+i);
            }
        }
    }

    public static void main(String[] args) {
        EvenThreadTest evenThreadTest = new EvenThreadTest();
        Thread t1 = new Thread(evenThreadTest);
        t1.start();
    }
}
