package com.javase.faceobject.innerclass;

/**
 * @Author story
 * @CreateTIme 2020/5/14
 **/
public class MethodInnerClass {
    private String name;
    public void show(){
        System.out.println("show");

        class MethodInner{
            private int id;
            public void test(int id){
                System.out.println("method ======");
                System.out.println(id);
                System.out.println(name);
            }
        }

        new MethodInner().test(5);
    }

    public static void main(String[] args) {
        MethodInnerClass innerClass = new MethodInnerClass();
        innerClass.name = "wangwu";
        innerClass.show();
    }
}
