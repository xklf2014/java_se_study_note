package com.javase.thread.procuderAndConsumer.v2;

/**
 * @Author story
 * @CreateTIme 2020/5/23
 **/
public class Goods {
    private String brand;
    private String name;

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
        this.setBrand(brand);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        System.out.println("生产者生产了"+this.getBrand()+"=========>"+this.getName());
    }

    public synchronized void takeGoods(){
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("消费者取走了"+this.getBrand()+"------>"+this.getName());
    }
}
