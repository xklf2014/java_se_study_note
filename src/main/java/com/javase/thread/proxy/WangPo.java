package com.javase.thread.proxy;

/**
 * @Author story
 * @CreateTIme 2020/5/23
 **/

//代理人
public class WangPo implements KindWomen {

    private KindWomen kindWomen;

    public WangPo() {
        this.kindWomen = new PanJinLian();
    }

    public WangPo(KindWomen kindWomen) {
        this.kindWomen = kindWomen;
    }

    @Override
    public void makeEyesAtMan() {
        this.kindWomen.makeEyesAtMan();
    }

    @Override
    public void playWithMan() {
        this.kindWomen.playWithMan();
    }
}
