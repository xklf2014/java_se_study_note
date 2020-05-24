package com.javase.io;

import java.io.*;

/**
 * @Author story
 * @CreateTIme 2020/5/21
 **/

/*
* 1、如果需要将对象通过io流进行传输，那么必须要实现序列化接口
* 2、当前类中必须声明一个serialVersionUID，值为多少无所谓，但是要有
* 3、transient使用此关键字修饰的变量，在进行序列化的时候，不会被序列化
*
* */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) {

        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("abc.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(new Person(1,"java",30));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                objectOutputStream.close();
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    static class Person implements Serializable {
        private int id;
        private String name;
        transient private int age;

        public Person(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public Person() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
