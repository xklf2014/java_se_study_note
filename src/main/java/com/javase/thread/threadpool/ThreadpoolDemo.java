package com.javase.thread.threadpool;

import java.util.concurrent.*;

/**
 * @Author story
 * @CreateTIme 2020/5/23
 **/
public class ThreadpoolDemo {
    public static void main(String[] args) {
        ThreadpoolDemo threadpoolDemo = new ThreadpoolDemo();
        //threadpoolDemo.cacheThreadPool();
        //threadpoolDemo.fixedThreadPool();
        threadpoolDemo.singleThreadPool();
    }

    public void threadpooltest(){
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1,1,60, TimeUnit.SECONDS,new LinkedBlockingQueue(5));
        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Math.random());
            }
        });
        threadPoolExecutor.shutdown();
    }

    public void cacheThreadPool(){
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 20; i++) {
            executorService.submit(new Task());
        }
        executorService.shutdown();

    }

    public void fixedThreadPool(){
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 20; i++) {
            executorService.submit(new Task());
        }
        executorService.shutdown();
    }

    public void singleThreadPool(){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 20; i++) {
            executorService.submit(new Task());
        }
        executorService.shutdown();
    }

    class Task implements Runnable{

        @Override
        public void run() {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(Thread.currentThread().getName()+" is running");
        }
    }
}
