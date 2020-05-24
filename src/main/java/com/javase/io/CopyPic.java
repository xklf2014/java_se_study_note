package com.javase.io;

import java.io.*;

/**
 * @Author story
 * @CreateTIme 2020/5/21
 **/
public class CopyPic {
    public static void main(String[] args) {
        CopyPic copyPic = new CopyPic();
        //copyPic.copyPic();
        copyPic.copyPic1();
    }

    void copyPic(){
        FileReader reader = null;
        FileWriter writer = null;
        try {
            reader = new FileReader("/Users/linfeng/workspace/javase/src/main/resources/a.jpg");
            writer = new FileWriter("/Users/linfeng/workspace/javase/src/main/resources/target.jpg");

            int len = 0;
            char[] chars = new char[1024];

            while((len=reader.read(chars))!=-1){
                writer.write(chars);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    void copyPic1(){
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(new File("/Users/linfeng/workspace/javase/src/main/resources/a.jpg"));
            outputStream = new FileOutputStream(new File("/Users/linfeng/workspace/javase/src/main/resources/target1.jpg"));

            int len = 0;
            byte[] bytes = new byte[1024];

            while((len=inputStream.read(bytes))!=-1){
                outputStream.write(bytes);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
