package com.javase.lambda;

import java.util.ArrayList;

/**
 * @Author story
 * @CreateTIme 2020/5/24
 **/
public class Test1 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan",10,80));
        list.add(new Student("lisi",14,65));
        list.add(new Student("wangwu",19,75));
        list.add(new Student("zhaoliu",27,46));
        list.add(new Student("huangqi",22,90));

        getByFilter(list,new AgeFilter());
        System.out.println("===========");
        getByFilter(list,new ScoreFilter());
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
