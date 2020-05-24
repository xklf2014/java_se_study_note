package com.javase.thread.ticket;

/**
 * @Author story
 * @CreateTIme 2020/5/23
 **/

public class TicketRunnableFinalDemo implements Runnable{
    private int ticket = 5;

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


    public static void main(String[] args) {
        TicketRunnableFinalDemo ticketRunnableDemo = new TicketRunnableFinalDemo();
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
