package com.javase.thread.procuderAndConsumer.v3;

/**
 * @Author story
 * @CreateTIme 2020/5/23
 **/
public class Goods {
    private String brand;
    private String name;
    //设置一个标志，默认为false，说明开始没有商品
    private boolean flag = false;

    public Goods(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    public Goods() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public synchronized void produceGoods(String brand,String name){

        //当生产者抢占到cpu资源之后会判断当前对象是否有值，如果有的话，以为消费者还没有消费，需要提醒消费者消费
        //同时，当前线程进入阻塞状态，等待消费者进行消费后，再次提醒生产者进行生产。如果没有的话，不需要等待，不需要进入阻塞状态，直接生产即可
        if (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setBrand(brand);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        System.out.println("生产者生产了"+this.getBrand()+"=========>"+this.getName());
        //如果代码执行到此处，意味着已经生产完成，需要将flag设置为true
        flag=true;
        //唤醒消费者进行消费商品
        notify();
    }

    public synchronized void takeGoods(){
        /*
        * 如果flag等于false的话，意味着生产者没有生产商品，此时消费者无法消费，需要让消费者进行阻塞状态，等待生产者生产
        *有商品之后，再次开始消费
        * */
        if (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("消费者取走了"+this.getBrand()+"------>"+this.getName());
        flag=false;
        //唤醒生产者去进行生产商品
        notify();
    }
}
