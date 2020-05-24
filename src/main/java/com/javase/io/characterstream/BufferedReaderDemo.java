package com.javase.io.characterstream;

import java.io.*;

/**
 * @Author story
 * @CreateTIme 2020/5/22
 **/
public class BufferedReaderDemo {
    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader("123.txt");
            bufferedReader = new BufferedReader(fileReader);
            String str = null;
            while ((str=bufferedReader.readLine())!=null){
                System.out.println(str);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
