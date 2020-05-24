package com.javase.faceobject;

/**
 * @Author story
 * @CreateTIme 2020/5/8
 **/
public class AccessControlDemoTest {
    public static void main(String[] args) {
        AccessControlDemo demo = new AccessControlDemo();
        System.out.println(demo.str);
        System.out.println(demo.str1);
        System.out.println(demo.str2);
        //System.out.println(demo.str3); //私有无法直接访问
    }
}
