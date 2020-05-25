package com.javase.lambda.interfacedemo;

/**
 * @Author story
 * @CreateTIme 2020/5/25
 **/

@FunctionalInterface
public interface StudentDao {

    abstract void insert(Student student);
}
