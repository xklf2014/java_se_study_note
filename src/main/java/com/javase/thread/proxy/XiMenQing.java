package com.javase.thread.proxy;

/**
 * @Author story
 * @CreateTIme 2020/5/23
 **/
public class XiMenQing {
    public static void main(String[] args) {
        WangPo wangPo = new WangPo();
        wangPo.makeEyesAtMan();
        wangPo.playWithMan();

        System.out.println("==========");
        Jiashi jiashi = new Jiashi();
        WangPo wangPo1 = new WangPo(jiashi);
        wangPo1.makeEyesAtMan();
        wangPo1.playWithMan();
    }
}
