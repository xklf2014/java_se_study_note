package com.javase.thread.procuderAndConsumer.v1;

/**
 * @Author story
 * @CreateTIme 2020/5/23
 **/
public class Producer implements Runnable {
    private Goods goods;

    public Producer() {
    }

    public Producer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            if (i%2==0){
                goods.setBrand("小木屋");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                goods.setName("饮料");
            }else {
                goods.setBrand("雪花");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                goods.setName("啤酒");
            }
            System.out.println("生产者生产了"+this.goods.getBrand()+"=========>"+this.goods.getName());
        }
    }
}
