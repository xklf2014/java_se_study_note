package com.javase.thread.procuderAndConsumer.v5;

import java.util.concurrent.BlockingQueue;

/**
 * @Author story
 * @CreateTIme 2020/5/23
 **/
public class Consumer implements Runnable {

    private BlockingQueue<Goods> blockingDeque;
    public Consumer() {
    }

    public Consumer(BlockingQueue blockingDeque) {
        this.blockingDeque = blockingDeque;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            try {
                Goods goods = blockingDeque.take();
                System.out.println("消费者开始消费商品"+goods.getBrand() + "=====>"+goods.getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
