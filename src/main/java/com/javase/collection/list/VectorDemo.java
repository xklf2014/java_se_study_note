package com.javase.collection.list;

import java.util.Vector;

/**
 * @Author story
 * @CreateTIme 2020/5/17
 **/

/*
*   Vector也是List接口的一个子类实现
*   Vector跟Arraylist意义，底层都是使用数组进行实现的
*   面试经常问到区别：
*       ArrayList是线程不安全的，效率高，Vector是线程安全的，效率低
*       ArrayList在扩容的时候是原数组的1.5倍，Vector扩容的时候是原来的2倍
*
* */
public class VectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(123);
        vector.add(3.14);
        vector.add("java");
        System.out.println(vector);
        System.out.println(vector.capacity()); //初始容量
        for (int i=0;i<10;i++){
            vector.add(i);
        }
        System.out.println(vector.capacity()); //首次扩容

        for (int i=0;i<10;i++){
            vector.add(i);
        }
        System.out.println(vector.capacity()); //第二次扩容
    }
}
