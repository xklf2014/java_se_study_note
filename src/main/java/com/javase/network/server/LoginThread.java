package com.javase.network.server;

import com.javase.network.client.UserDemo;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

/**
 * @Author story
 * @CreateTIme 2020/5/24
 **/
public class LoginThread implements Runnable {
    private Socket socket;

    public LoginThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        ObjectInputStream objectInputStream = null;
        DataOutputStream dataOutputStream = null;
        try {
            objectInputStream = new ObjectInputStream(socket.getInputStream());
            UserDemo user = (UserDemo) objectInputStream.readObject();
            String str = "";
            if ("java".equals(user.getUsername()) && "1234".equals(user.getPassword())) {
                str = "login success,欢迎：" + user.getUsername();
            } else {
                str = "login failed";
            }
            socket.shutdownInput();

            dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeUTF(str);
            socket.shutdownOutput();



        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                dataOutputStream.close();
                objectInputStream.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
