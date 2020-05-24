package com.javase.thread.procuderAndConsumer.v5;

import java.util.concurrent.BlockingQueue;

/**
 * @Author story
 * @CreateTIme 2020/5/23
 **/
public class Producer implements Runnable {

    private BlockingQueue<Goods> blockingDeque;

    public Producer() {
    }

    public Producer(BlockingQueue blockingDeque) {
        this.blockingDeque = blockingDeque;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            Goods goods = null;

            if (i%2==0){
                goods = new Goods("娃哈哈","矿泉水");
            }else {
                goods = new Goods("源氏","辣片");
            }
            System.out.println("生产者开始生产商品"+goods.getBrand()+"----->"+goods.getName());
            try {
                blockingDeque.put(goods);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
