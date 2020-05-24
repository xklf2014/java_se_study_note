package com.javase.thread;

/**
 * @Author story
 * @CreateTIme 2020/5/23
 **/
public class RunnableDemo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("当前线程------->"+Thread.currentThread().getName() + "\ti="+i);
        }
    }

    public static void main(String[] args) {
        RunnableDemo runnableDemo = new RunnableDemo();
        Thread thread = new Thread(runnableDemo);
        thread.start();
        for (int i =0;i<5;i++){
            System.out.println("当前线程=====>"+Thread.currentThread().getName() + "\ti="+i);
        }
    }
}
