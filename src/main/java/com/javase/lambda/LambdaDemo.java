package com.javase.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author story
 * @CreateTIme 2020/5/24
 **/
public class LambdaDemo {
    public static void main(String[] args) {





    }

    public void sortCollectionBylength(){
        List<String> list = Arrays.asList("java","javascript","scala","python");
        Collections.sort(list, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        for (String str : list){
            System.out.println(str);
        }
    }

    public void sortCollectionByLambda(){
        List<String> list = Arrays.asList("java","javascript","scala","python");
        Collections.sort(list,(a,b)->a.length()-b.length());
        list.forEach(System.out::println);
    }

    public void newThread(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("running.....");
            }
        });
        thread.start();

    }

    public void newThreadByLambda(){
        new Thread(()->{
            System.out.println("running2....");}).start();
    }
}
