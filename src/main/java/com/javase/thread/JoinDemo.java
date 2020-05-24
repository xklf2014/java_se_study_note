package com.javase.thread;

/**
 * @Author story
 * @CreateTIme 2020/5/23
 **/
public class JoinDemo implements Runnable {
    public static void main(String[] args) {
        JoinDemo joinDemo = new JoinDemo();
        Thread thread = new Thread(joinDemo);
        thread.start();


        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"i===="+i);
            if (i==2){
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName()+"i===="+i);
        }
    }
}
