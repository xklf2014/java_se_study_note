package com.javase.thread.procuderAndConsumer.v4_juc;

import java.util.concurrent.BlockingQueue;

/**
 * @Author story
 * @CreateTIme 2020/5/23
 **/
public class Consumer implements Runnable {

    private BlockingQueue blockingDeque;
    public Consumer() {
    }

    public Consumer(BlockingQueue blockingDeque) {
        this.blockingDeque = blockingDeque;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            try {
                System.out.println("消费者开始消费商品"+blockingDeque.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
