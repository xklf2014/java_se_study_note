package com.javase.lambda;

import java.util.ArrayList;

/**
 * @Author story
 * @CreateTIme 2020/5/24
 **/
public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan",10,80));
        list.add(new Student("lisi",14,65));
        list.add(new Student("wangwu",19,75));
        list.add(new Student("zhaoliu",27,46));
        list.add(new Student("huangqi",22,90));

        Test test = new Test();
        test.findByAge(list);
        System.out.println("=====");
        test.findByScore(list);

    }

    public static void findByAge(ArrayList<Student> students){
        ArrayList<Student> list = new ArrayList<>();
        for(Student stu : students){
            if (stu.getAge() > 14){
                list.add(stu);
            }
        }

        for (Student stu : list){
            System.out.println(stu);
        }
    }

    public static void findByScore(ArrayList<Student> students){
        ArrayList<Student> list = new ArrayList<>();
        for(Student stu : students){
            if (stu.getScore() > 75){
                list.add(stu);
            }
        }

        for (Student stu : list){
            System.out.println(stu);
        }
    }
}
