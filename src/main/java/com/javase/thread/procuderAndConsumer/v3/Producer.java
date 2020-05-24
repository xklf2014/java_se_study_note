package com.javase.thread.procuderAndConsumer.v3;

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
                goods.produceGoods("小木屋","饮料");
            }else {
                goods.produceGoods("雪花","啤酒");
            }

        }
    }
}
