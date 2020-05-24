package com.javase.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author story
 * @CreateTIme 2020/5/20
 **/
public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        Collections.addAll(list,"e","f","g");
        System.out.println(list);

        Collections.addAll(list,"ee","fff","gggg");
        /*list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()>o2.length()){
                    return 1;
                }else if(o1.length()<o2.length()){
                    return -1;
                }else {
                    return 0;
                }

            }
        });*/

        //System.out.println(list);

        //二分查找的时候需要先进行排序操作，如果没有排序的话，是找不到指定元素的
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list, "fff"));

        Collections.fill(list,"java");
        System.out.println(list);
    }
}
