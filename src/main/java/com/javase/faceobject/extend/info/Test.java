package com.javase.faceobject.extend.info;

/**
 * @Author story
 * @CreateTIme 2020/5/10
 **/
public class Test {
    public static void main(String[] args) {
        GoodsDetail detail = new GoodsDetail(1,"洗发水",1,"潘婷洗发水",50,65.5);
        GoodsDetail detail1 = new GoodsDetail(1,"洗发水",1,"飘柔洗发水",-4,100);
        GoodsDetail detail2 = new GoodsDetail(1,"洗发水",1,"黑人洗发水",50,0);
        detail.show();
        detail2.show();
    }
}
