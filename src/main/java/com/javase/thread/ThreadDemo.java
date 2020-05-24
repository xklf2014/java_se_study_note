package com.javase.thread;

/**
 * @Author story
 * @CreateTIme 2020/5/23
 **/

/*
* 实现多线程的时候
*   1、需要继承thread类
*   2、必须要重写run方法，指的是核心执行逻辑
*   3、线程在启动的时候，不要直接调用run方法，而是要通过start方法进行调用
*   4、每次运行相同的代码，出来结果可能不一样，原因在于多线程谁先抢占资源无法人为进行控制
*
* 第二种实现方式：（使用了代理设计模式）
*   1、实现runnable接口
*   2、重写run方法
*   3、创建thread类，将刚刚创建好的runnable的子类实现作为thread类构造方法的参数
*   4、通过thread.start方法启动线程
*
*   那种实现方法使用的比较多？
*       推荐使用第二种方式，java是单继承，把继承留给最需要的类
*       使用runnable接口之后不需要给共享变量加static关键字，每次创建一个对象，作为共享对象即可
*
*   线程的声明周期：
*       1、新生状态
*           当创建好当前对象后，没有启动之前（调用start之前）
*               Thread thread = new Thread();
*               Runnable runnable = new Runnable();
*       2、就绪态：准备开始执行，并没有执行，表示调用start之后
*               当对应的线程创建完成后，且调用start方法后，所有的线程会添加到一个就绪的队列中，所有线程同时去抢占cpu资源
*       3、运行态：当前进行获取到cpu资源后，就绪队列中的所有线程会去抢占cpu资源，谁先抢占到谁先执行，在执行的过程中叫做运行状态
*       4、死亡态：当运行中的线程正常执行完所有的代码逻辑或者因为异常情况导致程序结束就叫做死亡状态
*               进入的方式：
*                   1、正常运行完成且结束
*                   2、人为中断执行，比如使用stop方法
*                   3、程序抛出未捕获的异常
*       5、阻塞态：在程序运行过程中，发生某些异常状态，导致当前线程无法顺序执行下去，此时会进入阻塞状态，进入阻塞的原因消除后，
*                   所有的阻塞队列会进入到就绪状态中，随机抢占cpu的资源，等待执行
*               进入的方式有2种：
*                   （1）sleep方法
*                   （2）等待io资源
*                   （3）join方法，代码块中的执行逻辑
*
*       注意：
*           在多线程的时候，可以实现唤醒和等待的操作，但是唤醒和等待的对象不是操作的thread对象
*               而是我们设置的共享对象或者共享变量
*
*       多线程并发访问的时候出现数据安全问题
*           解决方式：
*               1、同步代码块
*                  synchronized（共享资源、共享对象，需要时object子类）{具体执行代码块}
*               2、同步方法
*                   将核心代码逻辑定义成一个方法，使用synchronized关键字修饰，此时不需要指定共享对象
*
* */
public class ThreadDemo extends Thread {
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();
        for (int i =0;i<5;i++){
            System.out.println("当前线程=====>"+Thread.currentThread().getName() + "\ti="+i);
        }
    }


    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("当前线程------->"+Thread.currentThread().getName() + "\ti="+i);
        }
    }
}
