package com.javase.faceobject;

/**
 * @Author story
 * @CreateTIme 2020/5/7
 *
 * 2.定义一个类 Draw ， 在 类 中 提供 3 个 方法：输出直角三角形（drawTrian()） 、 输出矩形（drawRec()） 及平行四边形（drawPra()） 。
 * 通过方法可以输出由“*” 组成的一个图形。 同时在类中包含两个属性：星号的个数（count） 、行数（lines） 。最后在测试类中进行调用。
 *
 **/
public class Draw {

    private int count;
    private int lines;

    public void drawTrian(){
        //打印行数
        for (int i = 0;i < lines;i++){
            //打印空格
            for (int j = count-1-i;j>0;j--){
                System.out.print(" ");
            }
            //打印*
            for (int j =0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Draw d = new Draw();
        d.count=5;
        d.lines=3;
        //d.drawTrian();
        //d.drawRec();
        d.drawPra();
    }

    public void drawRec(){
        for (int i = 0;i < lines;i++){
            for (int j =0;j<=count;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void drawPra(){
        int space1 = 0;
        int width = count + lines - 1;
        int height = lines;

        for(int i = 0 ;i< height; i++){
            int start = space1;
            int w = count;
            int space2 = width - space1 - count;
            while(start > 0){
                System.out.print(" ");
                start-=1;
            }
            while(w > 0){
                System.out.print("*");
                w-=1;
            }
            while (space2 > 0){
                System.out.print(" ");
                space2 -=1;
            }

            System.out.println();
            space1 +=1;
        }


    }

    //答案- 平行四边形
    public void drawPra(int lines,int count){
        for (int i = 0; i < lines; i++) {
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
            for (int j = 0; j < count; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
