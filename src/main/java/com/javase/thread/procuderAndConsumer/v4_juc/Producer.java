package com.javase.thread.procuderAndConsumer.v4_juc;

import java.util.concurrent.BlockingQueue;

/**
 * @Author story
 * @CreateTIme 2020/5/23
 **/
public class Producer implements Runnable {

    private BlockingQueue blockingDeque;

    public Producer() {
    }

    public Producer(BlockingQueue blockingDeque) {
        this.blockingDeque = blockingDeque;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            System.out.println("生产者开始生产商品"+i);
            try {
                blockingDeque.put(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
