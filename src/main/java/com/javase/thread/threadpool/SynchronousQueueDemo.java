package com.javase.thread.threadpool;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * @Author story
 * @CreateTIme 2020/5/24
 **/
public class SynchronousQueueDemo {

    public static void main(String[] args) {
        final BlockingQueue<String> queue = new SynchronousQueue<>();

        SynchronousQueueProducer producer = new SynchronousQueueProducer(queue);
        new Thread(producer).start();
        SynchronousQueueConsumer consumer = new SynchronousQueueConsumer(queue);
        new Thread(consumer).start();
        SynchronousQueueConsumer consumer1 = new SynchronousQueueConsumer(queue);
        new Thread(consumer1).start();

    }


    static class SynchronousQueueProducer implements Runnable{
        protected BlockingQueue<String> blockingQueue;
        final Random random = new Random();

        public SynchronousQueueProducer(BlockingQueue<String> blockingQueue) {
            this.blockingQueue = blockingQueue;
        }

        public SynchronousQueueProducer() {
        }

        @Override
        public void run() {
            while (true){
                String data = UUID.randomUUID().toString();
                System.out.println("Put :" + data);
                try {
                    blockingQueue.put(data);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        }
    }

    static class SynchronousQueueConsumer implements Runnable{
        protected BlockingQueue<String> blockingQueue;

        public SynchronousQueueConsumer() {
        }

        public SynchronousQueueConsumer(BlockingQueue<String> blockingQueue) {
            this.blockingQueue = blockingQueue;
        }

        @Override
        public void run() {
            while (true){
                try {
                    String data = blockingQueue.take();
                    System.out.println(Thread.currentThread().getName() + "take:"+data);
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        }
    }
}
