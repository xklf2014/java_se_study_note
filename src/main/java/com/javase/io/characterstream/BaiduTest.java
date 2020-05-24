package com.javase.io.characterstream;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Author story
 * @CreateTIme 2020/5/22
 **/
public class BaiduTest {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(
                    new URL("https://www.baidu.com").openStream(),"utf-8"));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("baidu.html")));
        String msg = null;
        while((msg=bufferedReader.readLine())!=null){
            bufferedWriter.write(msg);
            bufferedWriter.newLine();
        }


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
