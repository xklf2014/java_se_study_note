package com.javase.network.client;

import java.io.*;
import java.net.Socket;

/**
 * @Author story
 * @CreateTIme 2020/5/24
 **/
public class LoginClient {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("localhost",10000);
            UserDemo user = new UserDemo("java","23");
            OutputStream outputStream = client.getOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(user);
            client.shutdownOutput();

            InputStream inputStream = client.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            String s = dataInputStream.readUTF();
            System.out.println("客户端接收："+s);
            client.shutdownInput();
            dataInputStream.close();
            inputStream.close();

            objectOutputStream.close();
            outputStream.close();
            client.close();

            objectOutputStream.close();
            outputStream.close();
            client.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
