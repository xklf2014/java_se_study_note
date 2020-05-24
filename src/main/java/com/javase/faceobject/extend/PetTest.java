package com.javase.faceobject.extend;

/**
 * @Author story
 * @CreateTIme 2020/5/10
 **/


/*
*
*   继承：
*       表示父类跟子类的关系
*       当2个类或者多个类具备相同当属性和方法当时候，可以提取出来，变成父类，子类可以继承
*       子类跟父类是is-a当关系
*
*       使用：
*           1、使用继承当时候，需要使用extend关键字
*           2、使用继承关系之后，父类中当属性和方法都可以在子类中进行使用（非私有属性和非私有方法）
*           3、java中是单继承关系（如果包含多个父类，同时父类中包含多个重名方法，无法决定该调用哪个方法）
*
*   super:直接父类对象的引用
*       用途：
*           1、可以在子类中调用父类中被子类覆盖的方法， super.父类方法名称
*           2、当super在普通方法中使用的话，可以在任意位置编写
*           3、当super在构造方法中使用的话，会调用父类的构造方法，一定要将super()放在第一行
*           4、在构造方法中super() 和this()不能同时出现
*           5、父类中私有当属性和方法都不能被使用，包括构造方法
*           6、子类当构造方法中都会默认调用super()调用父类当无参构造方法，因此在定义类当时候
*              无论自己是否有其他构造方法，最好都要把无构造方法加上
*           7、如果构造方法中显示当指定类super当构造方法，那么无参当构造方法就不会被调用
*
*   总结：
*       1、在创建子类对象当时候，一定会优先创建父类对象
*       2、所有当java类都具有同一个超类，称之为Object，是所有类当根类
*
*
*   重写：
*       必须要存在继承关系，当父类中当方法无法满足子类需求当时候可以选择使用重写的方式
*       注意：
*           1、重写表示的是子类覆盖父类的方法，当覆盖之后，调用同样当方法的时候会优先调用子类
*           2、重写的方法名称，返回值类型，参数列表必须和父类一致
*           3、子类重写的方法不允许比父类的方法权限更小的访问权限
*               父类  public           子类   public
*               父类  protected        子类   public protected
*               父类  defult(friendly) 子类   public protected defult
*
*   父类的静态方法子类可以进行调用，但是子类不可以进行重写
* */
public class PetTest {

    public static void main(String[] args) {
        Pet cat = new Cat();
        cat.setName("大喵");
        cat.setAge(3);
        cat.setGender(true);
        cat.show();
        ((Cat) cat).superShow();//需要强制转换为子类才可以调用
        //cat.pricateFuncation();//无法调用private方法

        Pet pet = new Pet();
        pet.show();

        System.out.println(pet.toString());

        Cat cat1 = new Cat();
        cat1.superShow();

        System.out.println("===================");
        Cat cat2 = new Cat("咪咪",2,true,"喵喵");
        cat2.superShow();
        cat2.show();
        System.out.println(cat2.toString());
    }
}
