package com.javase.thread.threadpool;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * @Author story
 * @CreateTIme 2020/5/24
 **/
public class PriorityBlockingQueueDemo {
    public static void main(String[] args) {
        PriorityBlockingQueue<Task>  priorityBlockingQueue = new PriorityBlockingQueue<>();
        Task t1 = new Task(1,"id是1");
        Task t2 = new Task(2,"id是2");
        Task t3 = new Task(3,"id是3");
        Task t4 = new Task(4,"id是4");

        priorityBlockingQueue.add(t1);
        priorityBlockingQueue.add(t2);
        priorityBlockingQueue.add(t3);
        priorityBlockingQueue.add(t4);

        try {
            System.out.println("容器:"+priorityBlockingQueue);
            System.out.println(priorityBlockingQueue.take().getId());
            System.out.println("容器:"+priorityBlockingQueue);
            System.out.println("===========================");
            System.out.println("容器:"+priorityBlockingQueue);
            System.out.println(priorityBlockingQueue.take().getId());
            System.out.println("容器:"+priorityBlockingQueue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    static class Task implements Comparable<Task>{
        private int id;
        private String name;

        public Task() {
        }

        public Task(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public int compareTo(Task task) {
            return this.id > task.id ? 1 : (this.id < task.id ? -1 : 0);
        }

        @Override
        public String toString() {
            return "Task{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
