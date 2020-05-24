package com.javase.network.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author story
 * @CreateTIme 2020/5/24
 **/
public class ClientDemo {
    public static void main(String[] args) {
        //创建socket对象，其实是开启实现io的虚拟接口,需要制定数据接收方的ip和端口号
        try {
            Socket client = new Socket("localhost",10086);
            //获取输出流对象，向服务端发送数据
            OutputStream outputStream = client.getOutputStream();
            //将输出流对象进行包装
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            //输出数据
            dataOutputStream.writeUTF("hello,网络");
            //关闭流操作
            dataOutputStream.close();
            outputStream.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
