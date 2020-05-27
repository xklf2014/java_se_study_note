package com.javase.stream;

/**
 * @Author story
 * @CreateTIme 2020/5/26
 **/
public class Person {
    private String name;

    public static Person build(String name){
        Person person = new Person(name);
        return person;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
