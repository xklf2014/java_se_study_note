package com.javase.basic;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @Author story
 * @CreateTIme 2020/5/3
 **/
public class ArrayDemo {

    public static void main(String[] args) {
        printAvgValue();
    }

    public static void initArray(){
        //声明数组
        int [] array;
        //创建空间
        array = new int[5];
        //赋值
        for (int i =0;i<5;i++){
            array[i] = i;
        }

        //数组操作
        for (int i=0;i<5;i++){
            System.out.println(array[i]);
        }
    }

    public static void initArrayAndGiveValue(){
        //初始化数组并赋值
        int [] array = {1,2,3,4,5};
        //数组操作
        for (int i=0;i<5;i++){
            System.out.println(array[i]);
        }

    }

    public static void printAvgValue(){
        int[] array = new int[]{1,2,3,4};
        int sum =0;
        for (int i=0;i<array.length;i++){
            sum +=array[i];
        }
        System.out.println(sum/array.length);
    }
}
