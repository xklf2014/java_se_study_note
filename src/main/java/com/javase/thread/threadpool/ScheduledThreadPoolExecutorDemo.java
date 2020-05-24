package com.javase.thread.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author story
 * @CreateTIme 2020/5/23
 **/
public class ScheduledThreadPoolExecutorDemo {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutorDemo scheduledThreadPoolExecutorDemo = new ScheduledThreadPoolExecutorDemo();
        System.out.println(System.currentTimeMillis());
        //scheduledThreadPoolExecutorDemo.newScheduledThreadPool();
        //scheduledThreadPoolExecutorDemo.newScheduledThreadPool1();
        scheduledThreadPoolExecutorDemo.newSingleThreadScheduledExecutor();
    }

    public void newScheduledThreadPool(){
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("延迟1秒执行");
                System.out.println(System.currentTimeMillis());

            }
        },1, TimeUnit.SECONDS);
    scheduledExecutorService.shutdown();
    }

    public void newScheduledThreadPool1(){
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("延迟1秒执行,每3秒执行一次");
                System.out.println(System.currentTimeMillis());

            }
        },1,3, TimeUnit.SECONDS);
        //scheduledExecutorService.shutdown();
    }

    public void newSingleThreadScheduledExecutor(){
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("延迟1秒执行,每3秒执行一次");
                System.out.println(System.currentTimeMillis());

            }
        },1,3, TimeUnit.SECONDS);
        //scheduledExecutorService.shutdown();
    }

}
