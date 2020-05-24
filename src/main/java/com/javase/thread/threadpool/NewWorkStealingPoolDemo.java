package com.javase.thread.threadpool;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author story
 * @CreateTIme 2020/5/24
 **/
public class NewWorkStealingPoolDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newWorkStealingPool(2);
        for (int i = 0; i <= 10; i++) {
            final int count = i;
            service.submit(new Runnable() {
                @Override
                public void run() {
                    Date now = new Date();
                    System.out.println("线程"+Thread.currentThread()+"完成任务:"+
                            count + "时间为L"+now.getSeconds());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

        }
        while (true){
            //观察结果用
        }
    }
}
