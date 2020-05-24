package com.javase.generics;

/**
 * @Author story
 * @CreateTIme 2020/5/18
 **/
public class GenericsInterfaceImpl implements GenericsInterface<String> {


    @Override
    public String test() {
        return "hello java";
    }

    @Override
    public void test2(String s) {
        System.out.println("hello php");
    }
}
