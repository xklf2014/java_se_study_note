package com.javase.io.characterstream;

import java.io.*;

/**
 * @Author story
 * @CreateTIme 2020/5/21
 **/
public class InputStreamReaderDemo {
    public static void main(String[] args) {
        File file = new File("abc.txt");
        InputStream inputStream = null;
        InputStreamReader reader = null;

        try {
            inputStream = new FileInputStream(file);
            reader = new InputStreamReader(inputStream);
            char[] chars = new char[1024];
            int len = 0;
            while((len=reader.read(chars))!=-1){
                reader.read(chars);
                System.out.println(new String(chars,0,len));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
