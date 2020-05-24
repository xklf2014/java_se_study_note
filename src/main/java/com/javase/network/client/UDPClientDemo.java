package com.javase.network.client;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @Author story
 * @CreateTIme 2020/5/24
 **/
public class UDPClientDemo {
    public static void main(String[] args) {
        DatagramSocket datagramSocket = null;
        //创建udp通信socket
        try {
            datagramSocket = new DatagramSocket(10000);
            //从控制台读取数据
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            DatagramPacket datagramPacket = new DatagramPacket(s.getBytes(),s.getBytes().length,
                    InetAddress.getByName("localhost"),10001);
            datagramSocket.send(datagramPacket);

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            datagramSocket.close();
        }
    }

}
