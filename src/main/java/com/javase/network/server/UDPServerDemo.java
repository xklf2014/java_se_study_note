package com.javase.network.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @Author story
 * @CreateTIme 2020/5/24
 **/
public class UDPServerDemo {
    public static void main(String[] args) {
        try {
            DatagramSocket datagramSocket = new DatagramSocket(10001);
            byte[] buf = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buf,buf.length);
            //利用创建好的数据包对象来接收数据
            datagramSocket.receive(packet);
            //打印输出信息
            System.out.println(new String(packet.getData(), 0, packet.getLength()));

            datagramSocket.close();

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
