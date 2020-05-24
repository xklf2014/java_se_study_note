package com.javase.network.client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author story
 * @CreateTIme 2020/5/24
 **/
public class LoginClient1 {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("localhost",10000);
            UserDemo user = getUser();
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

    public static UserDemo getUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();

        return new UserDemo(username,password);

    }
}
