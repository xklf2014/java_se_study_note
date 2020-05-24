package com.javase.thread;

/**
 * @Author story
 * @CreateTIme 2020/5/23
 **/
public class SwitchOutputNumTest implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("当前线程------->"+Thread.currentThread().getName() + "\ti="+i);
            try {
                Thread.sleep(1050);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwitchOutputNumTest switchOutputNumTest = new SwitchOutputNumTest();
        Thread thread = new Thread(switchOutputNumTest);
        thread.start();

        for (int i = 10; i>0;i--){
            System.out.println("当前线程------->"+Thread.currentThread().getName() + "\ti="+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
