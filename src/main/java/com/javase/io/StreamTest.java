package com.javase.io;

import java.io.*;

/**
 * @Author story
 * @CreateTIme 2020/5/20
 **/

/*
* 将b.txt文件读出来，写到a.txt文件中
* 相当于文件的复制操作
*
* */
public class StreamTest {
    public static void main(String[] args) {

        File file = new File("/Users/linfeng/workspace/javase/src/main/resources/newpath/a/b/c/b.txt");
        File outFile = new File("/Users/linfeng/workspace/javase/src/main/resources/newpath/a/b/c/a.txt");
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(file);
            outputStream = new FileOutputStream(outFile);
            byte[] buffer = new byte[1024];
            int read = 0;
            while ((read=inputStream.read(buffer))!=-1){
                System.out.println(new String(buffer,0,read));
                outputStream.write(buffer,0,read);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                outputStream.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
