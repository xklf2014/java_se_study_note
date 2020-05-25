package com.javase.lambda;

/**
 * @Author story
 * @CreateTIme 2020/5/24
 **/
public class AgeFilter implements StudentFilter {
    @Override
    public boolean compare(Student student) {
        return student.getAge() > 14;
    }
}
