package com.javase.thread.ticket;

/**
 * @Author story
 * @CreateTIme 2020/5/23
 **/


public class TicketThreadFInalDemo extends Thread{
    private static int ticket = 5;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this){
                if (ticket > 0){
                    System.out.println(Thread.currentThread().getName()+"正在出售第"+(ticket--)+"票");
                }

            }

        }

    }

    public TicketThreadFInalDemo() {
    }

    public TicketThreadFInalDemo(String name) {
        super(name);
    }

    public static void main(String[] args) {
        TicketThreadFInalDemo t1 = new TicketThreadFInalDemo("t1");
        TicketThreadFInalDemo t2 = new TicketThreadFInalDemo("t2");
        TicketThreadFInalDemo t3 = new TicketThreadFInalDemo("t3");
        TicketThreadFInalDemo t4 = new TicketThreadFInalDemo("t4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
