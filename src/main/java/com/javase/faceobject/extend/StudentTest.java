package com.javase.faceobject.extend;

/**
 * @Author story
 * @CreateTIme 2020/5/11
 **/
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("张三",18);
        Student s2 = s1;
        s2.setName("李四");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        Student s3 = new Student("王五",18);
        Student s4 = new Student("王五",32);
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
    }
}
