package com.javase.faceobject;

/**
 * @Author story
 * @CreateTIme 2020/5/8
 **/
public class CodeBlockDemo {

    /*
    *   代码块：使用{}扩起来
    *   分类：
    *       普通代码块：定义在方法中，使用{}括起来的代码
    *       构造代码块：定义在类中，使用{}括起来的代码,每次代码运行的时候会将构造代码块中的代码添加到构造方法前面
    *                 构造代码块中的代码会添加到每一个构造方法中，当使用this()的时候不会添加
    *       静态代码块:使用static{}括起来的代码，在程序载入的时候优先执行
    *                 数据库链接等其他提前需要准备好的代码会放在static代码块
    *       同步代码块：在多线程的时候会使用，用来给贡献空间进行加锁
    *
    *       执行顺序：静态代码块>构造代码块>普通代码块
    * */
    {
        System.out.println("构造代码块");
    }

    static {
        System.out.println("静态代码块");
    }

    public CodeBlockDemo(){
        System.out.println("构造代码块2");
    }

    public void test(){
        System.out.println("test");

        {
            System.out.println("代码块");
        }

    }



    public static void main(String[] args) {
        CodeBlockDemo blockDemo = new CodeBlockDemo();
        blockDemo.test();
        {
            System.out.println("main");
        }
    }
}
