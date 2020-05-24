package com.javase.io.characterstream;

import java.io.*;

/**
 * @Author story
 * @CreateTIme 2020/5/21
 **/
public class OutputStreamWriteDemo {
    public static void main(String[] args) {
        File file = new File("abc.txt");
        OutputStream outputStream = null;
        OutputStreamWriter writer = null;

        try {
            outputStream = new FileOutputStream(file);
            writer = new OutputStreamWriter(outputStream);
            writer.write(99);
            writer.write("hello java");
            writer.write("hello python");
            writer.write("123456789",0,5);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
