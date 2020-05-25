package com.javase.lambda.functionref;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @Author story
 * @CreateTIme 2020/5/25
 **/
public class Test1 {
    public static void main(String[] args) {
        Function<String,Integer> f1 =(str)->{return str.length();};
        System.out.println(f1.apply("abcdef"));

        Consumer<String> c = (str)->System.out.println(str);
        c.accept("haha");

    }
}
