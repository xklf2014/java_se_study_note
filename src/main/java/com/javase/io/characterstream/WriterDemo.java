package com.javase.io.characterstream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @Author story
 * @CreateTIme 2020/5/21
 **/

/*
*  什么时候需要加flush，什么时候不加flush
*   最保险的方式，在输出流关闭之前都flush一下，然后在关闭
*   当某一个输出流对象中带有缓冲区的时候，就需要进行flush
*
* */
public class WriterDemo {
    public static void main(String[] args) {
        File file = new File("/Users/linfeng/workspace/javase/src/main/resources/newpath/a/b/c/c.txt");
        Writer writer =null;
        try {
            writer = new FileWriter(file);
            writer.write("hello io stream\r\n");
            writer.write("初次学习java io流");
            //writer.flush();//强制溢写
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
