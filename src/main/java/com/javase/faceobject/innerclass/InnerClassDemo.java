package com.javase.faceobject.innerclass;

/**
 * @Author story
 * @CreateTIme 2020/5/14
 **/
public class InnerClassDemo {
    static int outerStaticId;
    private int outerId;

    public int getOuterId() {
        return outerId;
    }

    public void setOuterId(int outerId) {
        this.outerId = outerId;
    }

    public void show(){
        System.out.println("show");
        //System.out.println(privateInner);
        System.out.println(new InnerClass().publicInner);

    }

    class InnerClass{
        //static int staticInner;
        private int privateInner;
        public int publicInner;
        int defaultInner;
        protected int protectedInner;

        protected void protectedInnerShow(){
            System.out.println("inner protect show");
            System.out.println(outerId);
            System.out.println(outerStaticId);
        }

        void defaultInnerShow(){
            System.out.println("inner default show");
        }

        private void privateInnerShow(){
            System.out.println("inner private show");
        }

        public InnerClass() {
        }


        public InnerClass(int privateInner) {
            this.privateInner = privateInner;
        }
    }
}

class Test{
    public void show(){
        System.out.println("Test show");
    }
}
