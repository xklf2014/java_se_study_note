package com.javase.collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author story
 * @CreateTIme 2020/5/16
 **/
public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add(1);
        list.add(true);
        list.add("a");
        System.out.println(list.get(0));
        //System.out.println(list.get(3));

        System.out.println(list.indexOf("a"));
        System.out.println(list.lastIndexOf("a"));

        list.set(1,"abc");
        System.out.println(list);
        System.out.println(list.subList(0,2));
    }
}
