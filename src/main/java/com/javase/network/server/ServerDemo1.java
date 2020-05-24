package com.javase.network.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author story
 * @CreateTIme 2020/5/24
 **/
public class ServerDemo1 {
    public static void main(String[] args) {
        try {
            //服务端需要使用serverSocket来开放本地端口
            ServerSocket serverSocket = new ServerSocket(10000);
            //需要接收client传输过来的数据，需要定义socket对象
            Socket accept = serverSocket.accept();
            //通过server获取输入流对象
            InputStream inputStream = accept.getInputStream();
            //对输入流对象进行包装，包装成dataInputStream
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            //读取client端发送的数据
            String s = dataInputStream.readUTF();
            System.out.println(s);

            OutputStream outputStream = accept.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF("我是服务端");
            //关闭流操作
            dataOutputStream.close();
            outputStream.close();
            dataInputStream.close();
            inputStream.close();
            accept.close();
            serverSocket.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
