package com.javase.annotation;

import java.lang.annotation.*;

/**
 * @Author story
 * @CreateTIme 2020/5/27
 **/

//@MyAnnotation(name="annotation",age=10,id=1,likes={"1","2","3"})
@MyAnnotation
public class MetaAnnotation {

}


//target用来声明当前自定义的注解适用在什么地方，类、方法、变量、包...
@Target({ElementType.METHOD,ElementType.TYPE})
//用来表示当前注解适用于什么环境，是源码级别、类级别还是运行时环境，一般是运行时环境
@Retention(RetentionPolicy.RUNTIME)
//表示该注解是否是显示在javadoc中
@Documented
//表示当前注解是否能够被继承
@Inherited
@interface MyAnnotation{
    //定义的方式看起来像是方法，但是实际上在使用注解的时候填写的参数名称，默认的名称是value
    //自定义注解中填写的所有方法都需要在使用注解的时候，添加值，很麻烦，因此包含默认值
    String name() default "java";
    int age() default 15;
    int id() default 2;
    String[] likes() default {"a","b","c"};
}