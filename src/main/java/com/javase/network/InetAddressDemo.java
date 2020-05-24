package com.javase.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author story
 * @CreateTIme 2020/5/24
 **/
public class InetAddressDemo {
    public static void main(String[] args) {
        try {
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println(localhost); // 主机名+ip地址

            //InetAddress byName = InetAddress.getByName("主机名");
            //System.out.println(byName);

            InetAddress byName = InetAddress.getByName("www.baidu.com");
            System.out.println(byName);
            System.out.println(localhost.getHostAddress());
            System.out.println(localhost.getHostName());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
