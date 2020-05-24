package com.javase.network.server;

import com.javase.network.client.UserDemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author story
 * @CreateTIme 2020/5/24
 **/
public class LoginServer2 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10000);
        while (true) {
            Socket accept = serverSocket.accept();
            LoginThread loginThread = new LoginThread(accept);
            new Thread(loginThread).start();
        }

    }

}
