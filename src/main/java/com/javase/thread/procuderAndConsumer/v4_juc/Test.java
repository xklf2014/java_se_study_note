package com.javase.thread.procuderAndConsumer.v4_juc;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Author story
 * @CreateTIme 2020/5/23
 **/
public class Test {
    public static void main(String[] args) {
        BlockingQueue blockingDeque = new ArrayBlockingQueue(5);
        Producer producer = new Producer(blockingDeque);
        Consumer consumer = new Consumer(blockingDeque);
        new Thread(producer).start();
        new Thread(consumer).start();

    }
}
