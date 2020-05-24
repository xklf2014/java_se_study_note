package com.javase.collection.set;

import java.util.*;

/**
 * @Author story
 * @CreateTIme 2020/5/17
 **/

/*
*
*  1、set中存放的是无序，唯一的数据
   2、set不可以通过下标获取对应位置的元素的值，因为无序的特点
   3、使用treeset底层的实现是treemap,利用红黑树来进行实现
   4、设置元素的时候，如果是自定义类型，会查找对象中的equals和hashcode方法，如果没有，比较的是地址
   5、树中的元素是要默认进行排序操作的，如果是基本数据类型，自动比较，如果是引用数据类型，需要实现Comparable接口
        比较器分类：
            内部比较器：
                定义在元素的类中，通过实现comparable接口来进行实现
            外部比较器
                定义在当前类中，通过comparetor接口来实现，但是要将该比较器传递到集合中
            注意：
            *   如果比较器可以定义成一个工具类，此时所有需要比较的规则如果一致的话，可以复用
            *   而内部比较器只有存储在当前对象的时候才可以使用
            *   如果两者同时存在，使用外部比较器
            *   当使用比较器的时候，不会调用equals方法

*
* */
public class SetDemo implements Comparator<SetDemo.Person>{
    public static void main(String[] args) {


        Person p = new Person("张三",13);
        Person p1 = new Person("王五",14);
        Person p2 = new Person("李四",15);
        Person p3 = new Person("李四",15);
       /* Set set = new HashSet();
        set.add(p);
        set.add(p1);
        set.add(p2);
        System.out.println(set);*/

        /*TreeSet set = new TreeSet();
        set.add(p);
        set.add(p1);
        set.add(p2);
        System.out.println(set);*/

        TreeSet treeSet = new TreeSet(new SetDemo());
        treeSet.add(p);
        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        System.out.println(treeSet);

        //SetDemo demo = new SetDemo();
        //demo.treeSetTest();

    }

    void treeSetTest(){
        //red black tree
        TreeSet treeSet = new TreeSet();
        treeSet.add(123);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(5);
        //ClassCastException: java.lang.Integer cannot be cast to java.lang.Character
        //treeSet.add('a');
        System.out.println(treeSet);

        System.out.println(treeSet.higher(5));
        System.out.println(treeSet.ceiling(3));
        System.out.println(treeSet.floor(5));
        System.out.println(treeSet.floor(122));

        System.out.println(treeSet.lower(4));
        System.out.println(treeSet.ceiling(130));

    }

    void setTest(){
        Set set = new HashSet();
        set.add("123");
        set.add("123");
        set.add(123);
        set.add(1);
        set.add(true);
        System.out.println(set);

        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("==========");

        for ( Iterator i = set.iterator();i.hasNext();){
            System.out.println(i.next());
        }
    }


    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge()-o2.getAge();
    }

    static class Person implements Comparable{
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Person() {
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
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age &&
                    Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public int compareTo(Object o) {
            Person p = (Person) o;
            return p.age - this.age;
        }
    }
}
