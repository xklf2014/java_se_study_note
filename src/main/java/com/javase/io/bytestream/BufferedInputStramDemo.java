package com.javase.io.bytestream;

import java.io.*;

/**
 * @Author story
 * @CreateTIme 2020/5/21
 **/
public class BufferedInputStramDemo {
    public static void main(String[] args) {
        File file = new File("abc.txt");
        InputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;

        try {
            inputStream = new FileInputStream(file);
            bufferedInputStream = new BufferedInputStream(inputStream);
            int read = 0;
            while((read = bufferedInputStream.read())!=-1){
                System.out.print((char)read);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedInputStream.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
