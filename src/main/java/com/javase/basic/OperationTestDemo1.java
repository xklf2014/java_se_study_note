package com.javase.basic;

/**
 * @Author story
 * @CreateTIme 2020/5/3
 **/
public class OperationTestDemo1 {
    public static void main(String[] args) {
        byte b = 10;
        int a = 20;
        byte c;
        /*
        * 1 在进行算数操作时，数据类型需要保持一致
        * 2 如果数据类型不一致，会自动将小点数据类型转换为大大数据类型
        * 3 在运算过程中，可以进行强制转换，将大的数据类型转换为小的数据类型（强制转换过程中，如果转换的数据超过小的数据存储范围，将会损失精度）
        * */
        c = (byte)(a + b);
        System.out.println(c);
        //                         128     8 4 2 1
        // 00000000 00000000 0000000 1 00001 1 1 0
        // byte为8个byte位，超出部分将会被砍掉，剩余1110，为十进制的14
        System.out.println((byte)270);

    }
}
