package com.javase.thread.ticket;

/**
 * @Author story
 * @CreateTIme 2020/5/23
 **/

/*
* 使用接口的方式，每次只创建一个共享对象，所有线程能够实现资源共享
*   1、数据不一致问题
*       解决方法：线程同步
*
*
* */
public class TicketRunnableDemo implements Runnable{
    private int ticket = 5;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (ticket > 0){
                System.out.println(Thread.currentThread().getName()+"正在出售第"+(ticket--)+"票");
            }
        }

    }


    public static void main(String[] args) {
        TicketRunnableDemo ticketRunnableDemo = new TicketRunnableDemo();
        Thread t1 = new Thread(ticketRunnableDemo);
        Thread t2 = new Thread(ticketRunnableDemo);
        Thread t3 = new Thread(ticketRunnableDemo);
        Thread t4 = new Thread(ticketRunnableDemo);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
