package com.javase.exception;

import java.util.Scanner;

/**
 * @Author story
 * @CreateTIme 2020/5/16
 **/
public class CourseTest {
    public static void main(String[] args) {
        CourseTest courseTest = new CourseTest();
        courseTest.printCourseById();
    }

    void printCourseById(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入课程编号");
        try {
            int i = sc.nextInt();
            switch (i){
                case 1:
                    System.out.println("java");
                    break;
                case 2:
                    System.out.println("scala");
                    break;
                case 3:
                    System.out.println("python");
                    break;
            }
        }catch (Exception e){
            //e.printStackTrace();
        }finally {
            System.out.println("欢迎选课");
        }

    }
}
