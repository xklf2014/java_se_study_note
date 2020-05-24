package com.javase.collection.list;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author story
 * @CreateTIme 2020/5/16
 **/

/*
*
* java集合框架：
*   Collection：存放的是单一值
*       特点：
*           1、可以存放不同数据类型的数据，而数组只能存储固定类型的数据
*           2、当使用arraylist子类实现的时候，初始化长度是10，当长度不够的时候会自动进行扩容操作(1.5倍)
*
*       api方法：
*           增加数据的方法
*           add：要求必须传入的参数是object对象，因此当写入基本数据类型的时候，包含类自动拆箱和自动装箱的过程
*           addAll:添加另一个集合中的元素到此集合中
*
*           删除数据的方法：
*           clear:只是清空此集合中的元素，但是此集合对象并没有被回收
*           remove:删除只能元素
*           removeAll:删除集合元素
*
*           查询数据的方法：
*           contains:判断集合中是否包含只能的元素值
*           containsAll:判断此集合是否包含另一个集合
*           isEmpty:判断此集合是否为空
*           retainAll:若集合中拥有另一个集合的所有元素，返回true，否则返回false
*           size:返回当前集合的大小
*
*           转换成数组的方法
*           toArray:将集合转换成数组
*
* */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(new Integer(1));
        collection.add(1.23);
        collection.add(true);
        collection.add("string");
        System.out.println(collection);
        ((ArrayList)collection).add(0,"first");
        System.out.println(collection);

        Collection collection1 = new ArrayList();
        collection1.add("a");
        collection1.add("b");
        collection1.add("c");
        collection1.add("d");
        collection.addAll(collection1);
        System.out.println(collection);

        collection1.clear();
        System.out.println(collection1);
        System.out.println(collection);
        System.out.println(collection.contains("a"));

        Collection collection2 = new ArrayList();
        collection2.add("a");
        collection2.add("b");
        collection2.add("e");
        System.out.println(collection.containsAll(collection2));
        System.out.println(collection.isEmpty());
        //System.out.println(((ArrayList) collection).remove(1));
        System.out.println(collection.removeAll(collection2));
        System.out.println(collection);

        System.out.println(collection.retainAll(collection2));


    }
}
