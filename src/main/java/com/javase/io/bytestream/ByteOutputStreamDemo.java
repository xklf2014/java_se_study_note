package com.javase.io.bytestream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @Author story
 * @CreateTIme 2020/5/21
 **/
public class ByteOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = null;
        byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(123);

        try {
            byteArrayOutputStream.write("www.baidu.com".getBytes());
            System.out.println(byteArrayOutputStream.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
