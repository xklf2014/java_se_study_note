package com.reflect;

import com.jdbc.entity.Emp;

import static java.lang.Class.forName;

public class CreateClassObject {
    public static void main(String[] args) {
        //1、通过class.forname()来获取class对象
        try {
            Class clazz = forName("com.jdbc.entity.Emp");
            System.out.println(clazz.getPackage());
            System.out.println(clazz.getName());
            System.out.println(clazz.getSimpleName());
            System.out.println(clazz.getCanonicalName());
        //2、通过类名.class来获取
            Class<Emp> empClass = Emp.class;
            System.out.println(empClass.getSimpleName());
        //3、通过对象的getclass()来获取
            Emp e = new Emp();
            Class<? extends Emp> aClass = e.getClass();
            System.out.println(aClass.getName());

            Class<Integer> type = Integer.TYPE;
            System.out.println(type.getName());
            System.out.println(type.getCanonicalName());

            Class<Integer[]> aClass1 = Integer[].class;
            System.out.println(aClass1.getName());
            System.out.println(aClass1.getCanonicalName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
