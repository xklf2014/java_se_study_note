package com.javase.thread.ticket;

/**
 * @Author story
 * @CreateTIme 2020/5/23
 **/

/*
*
*   此时出现的问题：
*       1、每次在启动线程的时候都会创建自己对象的属性值，相对于每个对象操作自己，没有真正意义上的实现共享
*           解决问题的方法：将共享对象或者共享变量设置为static
*       2、每次访问共享对象的时候，数据不一致
*           解决方式：使用线程同步
*
* */
public class TicketThreadDemo extends Thread{
    private int ticket = 5;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (ticket > 0){
                System.out.println(Thread.currentThread().getName()+"正在出售第"+(ticket--)+"票");
            }
        }

    }

    public TicketThreadDemo() {
    }

    public TicketThreadDemo(String name) {
        super(name);
    }

    public static void main(String[] args) {
        TicketThreadDemo t1 = new TicketThreadDemo("t1");
        TicketThreadDemo t2 = new TicketThreadDemo("t2");
        TicketThreadDemo t3 = new TicketThreadDemo("t3");
        TicketThreadDemo t4 = new TicketThreadDemo("t4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
