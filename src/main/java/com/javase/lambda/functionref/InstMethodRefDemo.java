package com.javase.lambda.functionref;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @Author story
 * @CreateTIme 2020/5/25
 **/
public class InstMethodRefDemo {
    public int add(int a,int b){
        return a+b;
    }

    public String put(){
        return "put...";
    }

    public void getSize(int i){
        System.out.println("size"+i);
    }

    public String toUpperCase(String str){
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(new InstMethodRefDemo().put());
        Supplier<String> s1 = ()->new InstMethodRefDemo().put();
        Supplier<String> s2 = ()->{return new InstMethodRefDemo().put();};
        Supplier<String> s3 = new InstMethodRefDemo()::put;
        System.out.println(s1.get());
        System.out.println(s2.get());
        System.out.println(s3.get());

        InstMethodRefDemo i = new InstMethodRefDemo();
        Supplier<String> s4 = i::put;
        System.out.println(s4.get());

        Consumer<Integer> c1 = (size)->new InstMethodRefDemo().getSize(size);
        Consumer<Integer> c2 = new InstMethodRefDemo()::getSize;
        Consumer<Integer> c3 = i::getSize;

        c1.accept(123);
        c2.accept(123);
        c3.accept(123);

        Function<String,String> f1 = (str)->str.toUpperCase();
        Function<String,String> f2 = (str)->i.toUpperCase(str);
        Function<String,String> f3 = new InstMethodRefDemo()::toUpperCase;
        Function<String,String> f4 = i::toUpperCase;

        System.out.println(f1.apply("abc"));
        System.out.println(f2.apply("abc"));
        System.out.println(f3.apply("abc"));
        System.out.println(f4.apply("abc"));

    }
}
