package com.javase.faceobject.extend.info;

/**
 * @Author story
 * @CreateTIme 2020/5/10
 **/
public class GoodsDetail extends Goods{

    //属性：商品编号，商品名称，所属类别，商品数量（大于0），商品价格（大于0），
    //方法：盘点的方法，描述商品信息。内容包括商品名称，商品数量，商品价格，现在商品总价以及所属类别信息
    private int goodsNo;
    private String goodsName;
    public  int goodsCount;
    private double price;

    public void show(){
        System.out.println("商品名称："+goodsName);
        System.out.println("所属类别："+super.getTypeName());
        System.out.println("商品售价："+price);
        System.out.println("库存数量"+goodsCount);
        System.out.println("商品总价:"+goodsCount*price);
        System.out.println("============");
    }

    public int getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(int goodsNo) {
        this.goodsNo = goodsNo;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }



    public int getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(int goodsCount) {
        if (goodsCount < 0){
            System.out.println("库存数量异常，请联系管理员");
        }else{
            this.goodsCount = goodsCount;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0){
            System.out.println("价格不能小于0");
        }else{
            this.price = price;
        }
    }

    public GoodsDetail(int typeNo, String typeName, int goodsNo, String goodsName, int goodsCount, double price) {
        super(typeNo, typeName);
        this.goodsNo = goodsNo;
        this.goodsName = goodsName;
        this.setGoodsCount(goodsCount);
        this.setPrice(price);
    }

    public GoodsDetail(int goodsNo, String goodsName, int goodsCount, double price) {
        this.goodsNo = goodsNo;
        this.goodsName = goodsName;
        this.setGoodsCount(goodsCount);
        this.setPrice(price);
    }
}
