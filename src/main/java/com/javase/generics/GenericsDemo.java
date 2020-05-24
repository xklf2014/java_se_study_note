package com.javase.generics;

import com.javase.faceobject.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author story
 * @CreateTIme 2020/5/18
 **/

/*
* 当一些集合当统一操作时，需要保证集合当类型时统一的，此时需要用泛型来进行限制
*   优点：
*       1、数据安全
*       2、获取数据是效率比较高
*   给集合中的元素设置相同的类型就是泛型的基本需求
*
*   使用：
*       在定义对象的时候，通过<>中设置合理的类型来进行实现
*
* 泛型的高阶应用：
*       1、泛型类
*           在定义类的时候在类名的后面添加<E，K，V,A,B>,起到站位的作用，类中的方法的返回值类型和属性的位置都可以使用
*       2、泛型接口
*           在定义接口的时候在接口的名称后添加<E，K，V,A,B>,
*           1、子类在进行实现的时候，可以不填写泛型的类型，此时在创建具体的子类对象的时候才决定使用具体泛型
*           2、子类在实现泛型接口的时候，只在实现父类接口的时候指定父类的泛型即可，此时，测试方法中的泛型类型必须要跟子类保持一致
*
*       3、泛型方法
*             在定义方法的时候,指定方法的返回值和参数是自定义的占位符，可以是类型中的T，也可以是自定义的Q，
*               只不过在使用Q的时候，需要<Q>定义在返回值的前面
*       4、泛型上限
*               如果父类确定类，所有的子类都可以直接使用
*       5、泛型下限
*               如果子类确定类，子类的所有父类都可以直接传递参数使用
*
* */
public class GenericsDemo {
    public static void main(String[] args) {
        //List<String> list = new ArrayList<>();
        //list.add("1");

        GenericsClass<String> genericsClass = new GenericsClass<>(1,"lisi");
        genericsClass.show();

        GenericsClass<Integer> genericsClass2 = new GenericsClass<>(2,20);
        genericsClass2.show();

        Person p = new Person("zhangsan",15);
        GenericsClass<Person> genericsClass3 = new GenericsClass<>(3,p);
        genericsClass3.show();
        System.out.println(genericsClass3.get());
        genericsClass3.setA(new Person("hehe",12));

        System.out.println("==========");
        GenericsMethod<String> method = new GenericsMethod<>();
        method.setT("hello");
        method.show("java");
        method.show(100);
    }

    static class GenericsClass<A>{
        private int id;
        private A a;

        void show(){
            System.out.println("id \t"+id+"\t,A\t"+a);
        }

        public A get(){
            return a;
        }


        public GenericsClass(int id, A a) {
            this.id = id;
            this.a = a;
        }

        public GenericsClass() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public A getA() {
            return a;
        }

        public void setA(A a) {
            this.a = a;
        }
    }

    void unUseGenerics(){
        List list = new ArrayList();
        list.add(1);
        list.add(3.14);
        list.add(true);
        list.add("abc");
        list.add(new Person("zhangsan",15));
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
