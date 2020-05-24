package com.javase.exception;

/**
 * @Author story
 * @CreateTIme 2020/5/16
 **/
/*
*
*
*
* */
public class ThrowExcetionDemo {

    public static void main(String[] args) {
        ThrowExcetionDemo throwExcetionDemo = new ThrowExcetionDemo();
        try {
            //throwExcetionDemo.show();
            //throwExcetionDemo.showErrorGender();
            throwExcetionDemo.showErrorGender1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void show() throws Exception {
        String gender = "1234";

        if ("man".equals(gender)){

        }else if ("women".equals(gender)){

        }else {
            throw new Exception("性别出现错误");
        }

    }

    public static void showErrorGender() throws GenderException {
        String gender = "1234";

        if ("man".equals(gender)){

        }else if ("women".equals(gender)){

        }else {
            throw new GenderException("性别出现错误");
        }

    }

    public static void showErrorGender1() throws GenderException {
        String gender = "1234";

        if ("man".equals(gender)){

        }else if ("women".equals(gender)){

        }else {
            throw new GenderException();
        }

    }
}
