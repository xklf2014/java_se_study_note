package com.javase.network.server;

import com.javase.network.client.UserDemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author story
 * @CreateTIme 2020/5/24
 **/
public class LoginServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(10000);
            Socket accept = serverSocket.accept();
            InputStream inputStream = accept.getInputStream();
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            UserDemo user = (UserDemo)objectInputStream.readObject();
            String string = "java";
            if ("java".equals(user.getUsername()) && "1234".equals(user.getPassword())){
                string = "login success,欢迎："+user.getUsername();
            }else {
                string = "login failed";
            }
            accept.shutdownInput();
            OutputStream outputStream = accept.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF(string);
            accept.shutdownOutput();

            dataOutputStream.close();
            outputStream.close();

            objectInputStream.close();
            inputStream.close();
            accept.close();
            serverSocket.close();


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
