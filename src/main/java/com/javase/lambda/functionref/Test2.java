package com.javase.lambda.functionref;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @Author story
 * @CreateTIme 2020/5/25
 **/
public class Test2 {

    static String put(){
        System.out.println("put......");
        return "put";
    }

    public static void getSize(int size){
        System.out.println(size);
    }

    public static String toUpper(String str){
        return str.toUpperCase();
    }

    public static Integer getLength(String a,String b){
        return a.length()+b.length();
    }

    public static void main(String[] args) {
        //System.out.println(put());
        Supplier<String> s1 = ()-> Test2.put();
        System.out.println(s1.get());

        Supplier<String> s2 = Test2::put;
        System.out.println(s2.get());

        Supplier<String> s3 = Fun::show;
        System.out.println(s3.get());

        Consumer<Integer> c1 = Test2::getSize;
        c1.accept(123);
        Consumer<Integer> c2 = (size)->Test2.getSize(size);
        c2.accept(456);

        Function<String,String> f1 = str->str.toUpperCase();
        Function<String,String> f2 = str -> Test2.toUpper(str);
        Function<String,String> f3 = Test2::toUpper;
        Function<String,String> f4 = Fun::toUpper;

        System.out.println(f1.apply("abc"));
        System.out.println(f2.apply("abc"));
        System.out.println(f3.apply("abc"));
        System.out.println(f4.apply("abc"));

        BiFunction<String,String,Integer> bf1 = (a,b)-> a.length()+b.length();
        BiFunction<String,String,Integer> bf2 = Test2::getLength;
        System.out.println(bf1.apply("123", "456"));
        System.out.println(bf2.apply("abc","def"));

    }
}

class Fun{
    public static String show(){
        return "show()";
    }

    public static String toUpper(String str){
        return str.toUpperCase();
    }

}
