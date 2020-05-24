package com.javase.faceobject.innerclass;

/**
 * @Author story
 * @CreateTIme 2020/5/14
 **/
public class AnonymousClassDemo {

    public static void main(String[] args) {
        new Thread(new Runner());
    }
}

class Runner implements Runnable{

    @Override
    public void run() {

    }
}
