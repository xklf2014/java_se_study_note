package com.javase.io;


import java.io.*;

/**
 * @Author story
 * @CreateTIme 2020/5/20
 **/

/*
*
* 在java中需要读写文件中的数据的话，需要使用流的概念
*   流表示从一个文件将数据传输到另一个文件，包含一个流向的问题
*       最终需要选择一个参照物：当前程序作为参照物
*           从一个文件中读取数据到程序叫做输入流
*           从程序输出数据到另一个文件叫做输出流
*
* 注意:当编写io流的程序的时候，一定要注意关闭流
*   步骤：
*       1、选择合适的流对象
*       2、创建对象
*       3、传输数据
*       4、关闭流对象()
* */
public class StreamDemo {
    public static void main(String[] args) {
        StreamDemo streamDemo = new StreamDemo();
        //streamDemo.read("/Users/linfeng/workspace/javase/src/main/resources/newpath/a/b/c/abc.txt");
        //streamDemo.read1("/Users/linfeng/workspace/javase/src/main/resources/newpath/a/b/c/abc.txt");
        streamDemo.write("/Users/linfeng/workspace/javase/src/main/resources/newpath/a/b/c/b.txt");
    }

    public static void read(String path) {
        InputStream is = null;
        try {
            is = new FileInputStream(path);
            int read = 0;
            //每次只能读取一个字节，效率比较低，需要循环N多次
//            while((length = is.read())!=-1){
//                System.out.print((char)length);
//            }

            //添加缓冲区方法,每次回将数据添加到缓冲区中，当缓冲区满了之后，一次读取，而不是每一个字节进行读取
            byte[] buffer = new byte[1024];
            while((read=is.read(buffer))!=-1){
                System.out.println(new String(buffer,0,read));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void read1(String path) {
        InputStream is = null;
        try {
            is = new FileInputStream(path);
            int read = 0;
            //每次只能读取一个字节，效率比较低，需要循环N多次
//            while((length = is.read())!=-1){
//                System.out.print((char)length);
//            }

            //添加缓冲区方法,每次回将数据添加到缓冲区中，当缓冲区满了之后，一次读取，而不是每一个字节进行读取
            byte[] buffer = new byte[1024];
            while((read=is.read(buffer,5,5))!=-1){
                System.out.println(new String(buffer,5,read));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void write(String path) {
        OutputStream outputStream = null;

        try {
            outputStream = new FileOutputStream(path);
            outputStream.write(99);
            outputStream.write("\r\nhello outputstream".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}

