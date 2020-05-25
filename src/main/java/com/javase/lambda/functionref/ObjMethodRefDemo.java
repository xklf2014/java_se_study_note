package com.javase.lambda.functionref;


import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/**
 * @Author story
 * @CreateTIme 2020/5/25
 **/
public class ObjMethodRefDemo {
    public static void main(String[] args) {
        Consumer<Too> c1 = (too)->new Too().foo();
        c1.accept(new Too());

        Consumer<Too> c2 = (Too too)->new Too1().foo();
        c2.accept(new Too());

        Consumer<Too> c3 = Too::foo;
        c3.accept(new Too());

        BiConsumer<Too1,String> bc = (too,str)->new Too1().show(str);
        BiConsumer<Too1,String> bc1 = Too1::show;
        bc.accept(new Too1(),"haha");
        bc1.accept(new Too1(),"haha");

        BiFunction<Exec,String,Integer> bf = (e,s)->new Exec().test(s);
        bf.apply(new Exec(),"abc");

        BiFunction<Exec,String,Integer> bf1 = Exec::test;
        bf1.apply(new Exec(),"abc");
    }


}

class Exec{
    public int test(String name){
        return 1;
    }
}

class Too{
    public Integer fun(String s){
        return 1;
    }

    public void foo(){
        System.out.println("foo");
    }
}

class Too1{
    public Integer fun(String s){
        return 1;
    }

    public void foo(){
        System.out.println("foo-----2");
    }

    public void show(String str){
        System.out.println("show()----"+str);
    }
}