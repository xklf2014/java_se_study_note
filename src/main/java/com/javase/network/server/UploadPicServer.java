package com.javase.network.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author story
 * @CreateTIme 2020/5/24
 **/
public class UploadPicServer {
    public static void main(String[] args) {
        try {
            //开放服务端端口
            ServerSocket server = new ServerSocket(10086);
            Socket accept = server.accept();

            InputStream inputStream = accept.getInputStream();
            FileOutputStream outputStream = new FileOutputStream("fruit.jpg");
            int temp = 0;
            while((temp=inputStream.read())!=-1){
                outputStream.write((char)temp);
            }
            //添加输出完成的标识
            accept.shutdownInput();

            //上传完成后通知客户端
            OutputStream outputStream1 = accept.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream1);
            dataOutputStream.writeUTF("上传成功，请知晓");

            dataOutputStream.close();
            outputStream1.close();

            outputStream.close();
            inputStream.close();
            accept.close();
            server.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
