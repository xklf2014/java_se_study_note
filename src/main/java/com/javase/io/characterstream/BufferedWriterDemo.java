package com.javase.io.characterstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author story
 * @CreateTIme 2020/5/22
 **/
public class BufferedWriterDemo {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter("234.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("hello bufferedwriter");
            bufferedWriter.write("我是中文哦");
            bufferedWriter.append("append=======");
            bufferedWriter.newLine();
            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
