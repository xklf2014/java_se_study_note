package com.javase.thread.threadpool;

import java.util.Random;
import java.util.concurrent.*;

/**
 * @Author story
 * @CreateTIme 2020/5/23
 **/
public class ForkJoinPoolDemo {
    public static void main(String[] args) {
        ForkJoinPoolDemo demo = new ForkJoinPoolDemo();
        //demo.testPrint();
        demo.testSum();
    }

    public void testPrint(){
        PrintTask printTask = new PrintTask(0,300);
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(printTask);

        try {
            pool.awaitTermination(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pool.shutdown();
    }

    public void testSum(){
        int[] array = new int[100];
        Random random = new Random();
        int total = 0;
        for (int i = 0; i < 100; i++) {
            total+=(array[i]=random.nextInt(20));
        }
        System.out.println("数组总和为："+total);

        SumTask sumTask = new SumTask(array,0,array.length);
        ForkJoinPool pool = ForkJoinPool.commonPool();
        Future<Integer> future = pool.submit(sumTask);
        try {
            System.out.println("多线程执行结果:"+future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        pool.shutdown();


    }

    static class PrintTask extends RecursiveAction{
        private static final int THRESHOLD = 50;
        private int start;
        private int end;

        public PrintTask(int start, int end) {
            super();
            this.start = start;
            this.end = end;
        }

        @Override
        protected void compute() {
            if (end - start < THRESHOLD){
                for (int i = start; i < end; i++) {
                    System.out.println(Thread.currentThread().getName()+"的i值"+i);
                }
            }else{//1 3
                int middle =(start+ end)>>1;
                PrintTask left = new PrintTask(start,middle);
                PrintTask right = new PrintTask(middle,end);

                left.fork();
                right.fork();

            }

        }
    }

    static class SumTask extends RecursiveTask<Integer> {
        private static final int THRESHOLD = 20;
        private int start;
        private int end;
        private int array[];

        public SumTask(int[] array ,int start, int end) {
            super();
            this.array = array;
            this.start = start;
            this.end = end;
        }
        @Override
        protected Integer compute() {
            int sum = 0;
            if (end-start < THRESHOLD){
                for (int i =start;i<end;i++){
                    sum+= array[i];
                }
                return sum;
            }else{
                int middle = (start+end)>>1;
                SumTask left = new SumTask(array,start,middle);
                SumTask right = new SumTask(array,middle,end);

                left.fork();
                right.fork();

                return left.join()+right.join();
            }
        }
    }

}
