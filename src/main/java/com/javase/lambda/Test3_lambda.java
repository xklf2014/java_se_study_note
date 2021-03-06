package com.javase.lambda;

import java.util.ArrayList;

/**
 * @Author story
 * @CreateTIme 2020/5/24
 **/
public class Test3_lambda {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan",10,80));
        list.add(new Student("lisi",14,65));
        list.add(new Student("wangwu",19,75));
        list.add(new Student("zhaoliu",27,46));
        list.add(new Student("huangqi",22,90));

        getByFilter(list,(e)->e.getScore()>75);
        System.out.println("=============");
        getByFilter(list,(e)->e.getAge()>14);
        System.out.println("=============");
        getByFilter(list,(e)->e.getName().length()>5);
    }

    public static void getByFilter(ArrayList<Student> students,StudentFilter filter){
        ArrayList<Student> list = new ArrayList<>();
        for (Student student : students){
            if (filter.compare(student)){
                list.add(student);
            }
        }
        printStudent(list);
    }

    public static void printStudent(ArrayList<Student> students){
        for (Student student:students){
            System.out.println(student);
        }
    }
}
