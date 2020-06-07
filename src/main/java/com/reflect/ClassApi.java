package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassApi {
    public static void main(String[] args) throws Exception{
        Class clazz = Class.forName("com.reflect.Student");
        //获取成员变量,包括之类及父类，同时只能包含公共类型
        Field[] fields = clazz.getFields();
        for (Field field : fields){
            System.out.println(field);
            System.out.println(field.getName());
            System.out.println(field.getType());
            System.out.println(field.getModifiers());
            System.out.println("====================");
        }

        System.out.println("========");
        //此方法返回的是当前类的所有属性，不仅仅局限于公共访问修饰符，所有的访问修饰符都可以拿到
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field field : declaredFields){
            System.out.println(field.getName());
        }
        System.out.println("===============");
        //反射在一定意义上破坏了封装性，需要合理使用
        Field adress = clazz.getDeclaredField("address");
        //设置该属性是否可以被访问
        adress.setAccessible(true);
        System.out.println(adress.getName());

        Object o = clazz.newInstance();
        adress.set(o,"伦敦市");
        System.out.println(((Student)o).getAddress());
        System.out.println("===============");

        //获取该对象的普通方法,包含的方法范围是当前对象及父类对象所有公共方法
        Method[] methods = clazz.getMethods();
        for (Method m : methods){
            System.out.println(m);
            System.out.println(m.getName());
        }

        //获取当前类中的所有方法，无论什么访问修饰符
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method m : declaredMethods){
            System.out.println(m.getName());
        }

        Method add = clazz.getDeclaredMethod("add", int.class, int.class);
        add.setAccessible(true);
        Object o1 = clazz.newInstance();
        System.out.println(add.invoke(o1, 123, 456));
        System.out.println("===============");

        //获取对象的所有构造方法，只能获取公共的
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor c : constructors){
            System.out.println(c.getName());
        }
        System.out.println("===============");
        //获取对象所有的构造方法,无论公有还是私有
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor c: declaredConstructors){
            System.out.println(c.getName());
        }

        Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        Student haha = (Student)declaredConstructor.newInstance("haha");
        System.out.println(haha.toString());
    }
}
