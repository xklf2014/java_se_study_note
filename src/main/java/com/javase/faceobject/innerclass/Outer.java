package com.javase.faceobject.innerclass;

/**
 * @Author story
 * @CreateTIme 2020/5/14
 **/
public class Outer {
    private String name = "lisi";

    class Inner{
        private String name ="zhangsan";

        public void show(){
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Outer.this.name);
        }

        class InnerInner{
            private String name ="wangwu";

            public void show(){
                System.out.println("内部类中的内部类属性"+this.name);
                System.out.println("内部类中的属性"+Inner.this.name);
                System.out.println("外部类中的属性"+Outer.this.name);
            }
        }
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.show();

        System.out.println("===============");
        Outer.Inner.InnerInner innerInner = new Outer().new Inner().new InnerInner();
        innerInner.show();
    }
}
