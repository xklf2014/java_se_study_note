package com.javase.generics;

/**
 * @Author story
 * @CreateTIme 2020/5/18
 **/
public class GenericsMethod<T> {
    private T t;

    public <Q> void show(Q q){
        System.out.println(q);
        System.out.println(t);
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
