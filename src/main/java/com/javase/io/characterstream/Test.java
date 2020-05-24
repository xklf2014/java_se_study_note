package com.javase.io.characterstream;


import java.io.*;

/**
 * @Author story
 * @CreateTIme 2020/5/22
 **/
public class Test {
    public static void main(String[] args) {
        String str = "";
        System.out.println("请输入内容，输入完成后内容会显示在控制台，输入exit会退出");
        try(InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)) {
            while(!"exit".equals(str)){
                str = bufferedReader.readLine();
                bufferedWriter.write(str);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
            System.out.println("退出成功");
        } catch (IOException e) {
            e.printStackTrace();
        }/*finally {
            try {
                bufferedReader.close();
                bufferedWriter.close();
                outputStreamWriter.close();
                inputStreamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }*/


    }
}
