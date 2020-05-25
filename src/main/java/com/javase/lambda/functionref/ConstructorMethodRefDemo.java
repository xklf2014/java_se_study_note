package com.javase.lambda.functionref;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @Author story
 * @CreateTIme 2020/5/25
 **/
public class ConstructorMethodRefDemo {
    public static void main(String[] args) {
       /* Supplier<Person> s1 = ()->new Person();
        s1.get();
        Supplier<Person> s2 = Person::new;
        s2.get();

        Supplier<List> s3 = ArrayList::new;
        Supplier<Set> s4 = HashSet::new;
        Supplier<String> s5 = String::new;
        Supplier<Thread> s6 = Thread::new;*/

        Consumer<String> c1 = (name)->new User(name);
        Consumer<String> c2 = User::new;
        c1.accept("abc");
        c2.accept("abc");

        Function<String,User> f1 = (str)->new User();
        Function<String,User> f2 = User::new;
        f1.apply("abc");
        f2.apply("abc");

    }
}

class Person{
    public Person(){
        System.out.println("无参数构造方法");
    }
}

class User{
    private String name;
    private int age;

    public User() {
        System.out.println("user 无参");
    }

    public User(String name) {
        this.name = name;
        System.out.println("user 有参数");

    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
