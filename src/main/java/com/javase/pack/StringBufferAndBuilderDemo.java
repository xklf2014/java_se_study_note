package com.javase.pack;

/**
 * @Author story
 * @CreateTIme 2020/5/16
 **/

/*
* 可变字符串：
*   StringBuffer：线程安全，效率低
*   StringBuilder：线程不安全，效率高
*
*
* */
public class StringBufferAndBuilderDemo {
    public static void main(String[] args) {
        StringBufferAndBuilderDemo sbb = new StringBufferAndBuilderDemo();
        sbb.testStringBuffer();

        System.out.println("============");
        sbb.testStringBuilder();
    }

    void testStringBuffer(){
        StringBuffer sb = new StringBuffer();
        sb.append(1).append(3.14).append("abc").append(true);
        System.out.println(sb);

        System.out.println(sb.length());
        System.out.println(sb.capacity());

        sb.append(3.1315);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }

    void testStringBuilder(){
        StringBuilder sb = new StringBuilder();
        sb.append(1).append(3.14).append("abc").append(true);
        System.out.println(sb);

        System.out.println(sb.length());
        System.out.println(sb.capacity());

        sb.append(3.1315);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}
