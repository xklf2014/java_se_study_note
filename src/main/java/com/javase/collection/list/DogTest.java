package com.javase.collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author story
 * @CreateTIme 2020/5/17
 **/
public class DogTest {
    public static void main(String[] args) {
        Dog d1 = new Dog("嘻嘻","blue");
        Dog d2 = new Dog("哈哈","red");
        Dog d3 = new Dog("呵呵","black");
        List list = new ArrayList();
        list.add(d1);
        list.add(d2);
        list.add(d3);

        System.out.println(list);
        System.out.println(list.size());
        list.remove(d1);
        System.out.println(list);
        Dog d4 = new Dog("哈哈","red");
        //需要重写equals和hashcode
        System.out.println(list.contains(d4));

    }
}
