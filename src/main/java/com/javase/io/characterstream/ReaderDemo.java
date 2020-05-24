package com.javase.io.characterstream;

import java.io.*;

/**
 * @Author story
 * @CreateTIme 2020/5/20
 **/

/*
* 字符流可以直接读取中文汉字，而字节流在处理的时候会出现中文乱码
*
* */
public class ReaderDemo {
    public static void main(String[] args) {
        ReaderDemo readerDemo = new ReaderDemo();
        readerDemo.read1();
    }

    public static void read(){
        File file = new File("/Users/linfeng/workspace/javase/src/main/resources/newpath/a/b/c/b.txt");
        Reader reader = null;
        try {
            reader = new FileReader(file);
            char[] buffer = new char[1024];
            //int read =reader.read();
            //System.out.println((char)read);
            int read = 0;
            while((read = reader.read())!=-1){
                System.out.println((char) read);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void read1(){
        File file = new File("/Users/linfeng/workspace/javase/src/main/resources/newpath/a/b/c/b.txt");
        Reader reader = null;
        try {
            reader = new FileReader(file);
            int len = 0;
            char[] buffer = new char[1024];
            while((len = reader.read(buffer))!=-1){
                System.out.println(new String(buffer,0,len));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
