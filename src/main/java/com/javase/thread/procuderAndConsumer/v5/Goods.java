package com.javase.thread.procuderAndConsumer.v5;

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


}
