package com.javase.io.characterstream;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 * @Author story
 * @CreateTIme 2020/5/22
 **/
public class CharArrayReaderDemo {
    public static void main(String[] args) {

        char[] chars = "你好charArrayReader".toCharArray();

        CharArrayReader charArrayReader = new CharArrayReader(chars);
        try {
            int read = 0;

            while((read=charArrayReader.read())!=-1){
                System.out.print((char)read);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            charArrayReader.close();
        }


    }
}
