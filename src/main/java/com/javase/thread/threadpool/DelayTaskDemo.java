package com.javase.thread.threadpool;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @Author story
 * @CreateTIme 2020/5/24
 **/
public class DelayTaskDemo {

    public static void main(String[] args) {
        DelayQueue<DeplayTask> delayQueue = new DelayQueue<>();
        delayQueue.add(new DeplayTask("1",1000L,TimeUnit.MILLISECONDS));
        delayQueue.add(new DeplayTask("2",2000L,TimeUnit.MILLISECONDS));
        delayQueue.add(new DeplayTask("3",3000L,TimeUnit.MILLISECONDS));

        System.out.println("queue put done");

        while(!delayQueue.isEmpty()){
            try {
                DeplayTask task = delayQueue.take();
                System.out.println(task.name + ":" + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


    static class DeplayTask implements Delayed{
        private String name;
        private Long delayTime;
        private TimeUnit delayTimeUnit;
        private Long executeTime;

        public DeplayTask(String name, Long delayTime, TimeUnit delayTimeUnit) {
            this.name = name;
            this.delayTime = delayTime;
            this.delayTimeUnit = delayTimeUnit;
            this.executeTime = System.currentTimeMillis() + delayTimeUnit.toMillis(delayTime);
        }

        public DeplayTask() {
        }

        @Override
        public long getDelay(TimeUnit unit) {
            return unit.convert(executeTime - System.currentTimeMillis(),TimeUnit.MILLISECONDS);
        }

        @Override
        public int compareTo(Delayed o) {
            if (this.getDelay(TimeUnit.MILLISECONDS) > o.getDelay(TimeUnit.MILLISECONDS)){
                return 1;
            }else if (this.getDelay(TimeUnit.MILLISECONDS) < o.getDelay(TimeUnit.MILLISECONDS)){
                return -1;
            }
            return 0;
        }
    }
}
