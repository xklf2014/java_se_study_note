package com.javase.network.client;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Author story
 * @CreateTIme 2020/5/24
 **/
public class UploadPicClient {
    public static void main(String[] args) {
        try {
            //创建图片输入流对象
            FileInputStream inputStream = new FileInputStream("/Users/linfeng/workspace/javase/src/main/resources/a.jpg");
            //创建socket
            Socket client = new Socket("localhost",10086);
            //获取输出流对象
            OutputStream outputStream = client.getOutputStream();
            int temp = 0;
            while((temp=inputStream.read())!=-1){
                outputStream.write((char)temp);
            }
            //添加完成的标识
            client.shutdownOutput();

            InputStream inputStream1 = client.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream1);
            String s = dataInputStream.readUTF();
            System.out.println("客户端收到："+s);

            dataInputStream.close();
            inputStream1.close();

            outputStream.close();
            inputStream.close();
            client.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
