package com.javase.lambda.interfacedemo;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @Author story
 * @CreateTIme 2020/5/25
 **/

/*
* 在java中提供了一系列的函数式
*
* */
public class LambdaTest {
    public static void main(String[] args) throws Exception {

        BiFunction<String,String,Integer> bf = (a,b) -> a.length()+b.length();
        System.out.println(bf.apply("hello","lambda"));

        List<String> list = Arrays.asList("a","b","c");
        list.forEach(System.out::println);

    }

    static int get(){
        return 1;
    }

    static String find(){
        return "find";
    }

    static void exec(){
        find();
    }

    public void test1(){
        Function<String,Integer> f1 = (str)->{return str.length();};
        System.out.println(f1.apply("hello lambda"));

        Supplier<String> s1 = ()->{return "lambda1";};
        Supplier<String> s2 = ()->"lambda2";
        System.out.println(s1.get());
        System.out.println(s2.get());

        Consumer<String> c1 = (str) -> System.out.println(str);
        c1.accept("nihao");

        Runnable runnable = () -> get();
        runnable.run();

        Runnable runnable1 = ()->exec();
        runnable1.run();

        LambdaInterface li1 = ()->get();
        LambdaInterface li2 = ()->100;
        LambdaInterface li3 = ()->true?1:0;

        System.out.println(li1.get());
    }

    public void testTeacher(){
        TeacherDao td1 = new TeacherDao() {
            @Override
            public int get(Teacher teacher) {
                return 1;
            }
        };

        TeacherDao td2 = (teacher)->{return 2;};
        TeacherDao td3 = (Teacher teacher)->{return 3;};
        TeacherDao td4 = (teacher)->4;
        TeacherDao td5 = (Teacher teacher)->5;

        System.out.println(td1.get(new Teacher()));
        System.out.println(td2.get(new Teacher()));
        System.out.println(td3.get(new Teacher()));
        System.out.println(td4.get(new Teacher()));
        System.out.println(td5.get(new Teacher()));
    }

    public void testStudent(){
        StudentDao sd1 = new StudentDao() {
            @Override
            public void insert(Student student) {
                System.out.println("insert stu1");
            }
        };

        StudentDao sd2 = (student)->{
            System.out.println("student:" + student);
        };

        StudentDao sd3 = (Student student)-> System.out.print("student:"+student);

        sd1.insert(new Student());
        sd2.insert(new Student());
        sd3.insert(new Student());

    }

    public void test() throws Exception {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("running1.....");
            }
        };
        runnable.run();

        Runnable runnable1 = () ->{
            System.out.println("running2.......");
        };
        runnable1.run();

        Runnable runnable2 = ()-> System.out.println("running3....");
        runnable2.run();

        Callable<String> c1 = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "callable2";
            }
        };
        System.out.println(c1.call());

        Callable<String> c2 = ()->{return "callable2";};
        System.out.println(c2.call());

        Callable<String> c3 = () ->"callable3";
        System.out.println(c3.call());
    }
}
