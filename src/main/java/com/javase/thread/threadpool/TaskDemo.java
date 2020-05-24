package com.javase.thread.threadpool;

import java.util.concurrent.Callable;

/**
 * @Author story
 * @CreateTIme 2020/5/23
 **/
public class TaskDemo implements Callable {
    @Override
    public Object call() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Thread.currentThread().getName() + "is running!";
    }
}
