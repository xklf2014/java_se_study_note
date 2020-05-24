package com.javase.pack;

/**
 * @Author story
 * @CreateTIme 2020/5/16
 **/

/*
*   1、常量池在1.7之后放置到类堆空间中（以前在方法区）
*       (1)、创建
*               String str = "abc";
*               String str1 = new String("abc");
*               2种方式都可以用，只不过第一种使用的比较多
*       (2)、字符串判断的本质
*               字符串的本质是字符数组或者叫做字符序列
*               String类使用final关键字修饰，不允许被继承
*               使用equals方法比较的是字符数组里每一个位置的值
*
*
* */
public class StringDemo {
    public static void main(String[] args) {

        StringDemo demo = new StringDemo();
        demo.testString1();

    }

    void testString1(){
        String a = "abc";
        String b = "def";
        String c = "abcdef";
        String d = a + b;
        String e = "abc" + "def";
        System.out.print("c==d? \t");
        System.out.println(c==d);
        System.out.print("c==(a+b)? \t");
        System.out.println(c==(a+b));
        System.out.print("c==e? \t");
        System.out.println(c==e);

        System.out.print("c==d? \t");
        System.out.println(c==d.intern());
    }

    void testString(){
        String str = "abc";
        String str1 = new String("abc");

        //System.out.println(str==str1);
        //System.out.println(str.equals(str1));

        //System.out.println(str.charAt(0));

        //char buf[] = Arrays.copyOf(value, len + otherLen);
        //str.getChars(buf, len);  数组赋值的过程
        System.out.println(str.concat(str1));
        //判断字符串是否包含某个字符
        System.out.println(str.contains("a"));
        System.out.println(str.contains("d"));
        //字符串截取
        /*
        *   subLen为偏移量
        * return ((beginIndex == 0) && (endIndex == value.length)) ? this
                : new String(value, beginIndex, subLen);
        * */
        System.out.println(str.substring(0));
        System.out.println(str.substring(0,1));
        //char数组的循环比较，找到则返回index，否则返回-1
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("d"));

        System.out.println("===============");
        String str2 = "abc";
        String str3 = new String("abc");
        System.out.println(str2==str3);
        //a string that has the same contents as this string, but is
        //guaranteed to be from a pool of unique strings.
        str3=str3.intern();
        System.out.println(str2==str3);
    }
}
