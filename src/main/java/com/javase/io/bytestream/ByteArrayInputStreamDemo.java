package com.javase.io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * @Author story
 * @CreateTIme 2020/5/21
 **/
public class ByteArrayInputStreamDemo {
    public static void main(String[] args) throws IOException {
        String str = "bytearrayinputstream";
        byte[] buffer = str.getBytes();
        ByteArrayInputStream byteArrayInputStream = null;

        byteArrayInputStream = new ByteArrayInputStream(buffer);
        int read = 0;
        while((read = byteArrayInputStream.read())!=-1){
            byteArrayInputStream.skip(3);
            System.out.print((char)read);

        }

        try {
            byteArrayInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
