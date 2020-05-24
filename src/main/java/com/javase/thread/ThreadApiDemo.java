package com.javase.thread;

/**
 * @Author story
 * @CreateTIme 2020/5/23
 **/
public class ThreadApiDemo implements Runnable{
    public static void main(String[] args) {
        //获取当前线程对象
        Thread thread = new Thread();
        //获取线程名称
        System.out.println(thread.getName());
        //获取线程的id
        System.out.println(thread.getId());
        //获取线程的优先级，在一般系统中范围是0-10的值，如果没有经过设置的话，默认值是5
        //有些系统是0-100
        System.out.println(thread.getPriority());
        //设置优先级
        //线程优先级高一定会优先执行吗？
        //  不一定，只是优先执行的概率比较大
        thread.setPriority(10);
        System.out.println(thread.getPriority());
        //判断线程是否存活
        System.out.println(thread.isAlive());

        System.out.println("=====================");
        /*ThreadApiDemo threadApiDemo = new ThreadApiDemo();
        Thread thread1 = new Thread(threadApiDemo);
        thread1.start();
        for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName()+"i===="+i);
        }*/

    }

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName()+"i===="+i);
        }
    }
}
