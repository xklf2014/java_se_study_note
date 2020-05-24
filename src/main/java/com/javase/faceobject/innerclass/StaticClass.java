package com.javase.faceobject.innerclass;

/**
 * @Author story
 * @CreateTIme 2020/5/14
 **/
public class StaticClass {
    private int id;

    public void show(){
        System.out.println("outer show");
    }
    static class InnerClass{
        private String name;
        public void test(){
            System.out.println("inner test");
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        innerClass.test();

        InnerClass innerClass1 = new StaticClass.InnerClass();
        innerClass1.test();

    }
}
