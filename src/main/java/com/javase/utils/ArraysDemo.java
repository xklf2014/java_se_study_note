package com.javase.utils;

import java.util.Arrays;
import java.util.List;

/**
 * @Author story
 * @CreateTIme 2020/5/20
 **/
public class ArraysDemo {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1,2,3,4,5);
        ints.set(1,3);
        System.out.println(ints);
        ints.forEach(i ->{
            System.out.println(i);
        });

        System.out.println(ints.subList(2, 4));
        System.out.println(ints.contains(5));

        Object[] obj = ints.toArray();

    }
}
