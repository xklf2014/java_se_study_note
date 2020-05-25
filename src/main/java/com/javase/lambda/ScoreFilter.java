package com.javase.lambda;

/**
 * @Author story
 * @CreateTIme 2020/5/24
 **/
public class ScoreFilter implements StudentFilter {
    @Override
    public boolean compare(Student student) {
        return student.getScore() > 75;
    }
}
