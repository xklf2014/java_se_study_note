package com.javase.faceobject;

/**
 * @Author story
 * @CreateTIme 2020/5/8
 **/

/*
*
* 在java中明确定义了访问权限：
*   限制访问，以下分类按照从大到小进行排列
*   public：公公的
*       当前项目的所有类都可以访问
*   protected
*       可以被当前类访问，可以被当前包访问，可以被子类访问
*   default
*       可以被当前类访问，可以被当前包访问
*   private
*       只能被当前类访问
*
*   四种访问修饰符可以修饰方法和属性
*   类的访问权限只有2种public、default
*
* */
public class AccessControlDemo {

    public String str = "pubilc";
    protected String str1 = "protected";
    String str2 = "default";
    private String str3 = "private";

    public AccessControlDemo(){};

    private AccessControlDemo(int a){}
}
