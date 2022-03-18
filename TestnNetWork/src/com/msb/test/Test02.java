package com.msb.test;

import java.net.InetAddress;
import java.net.InetSocketAddress;

public class Test02 {
    public static void main(String[] args) {
        InetSocketAddress inetSocketAddress = new InetSocketAddress("192.168.153.130",3306);
        System.out.println("inetSocketAddress = " + inetSocketAddress);
        System.out.println(inetSocketAddress.getHostName());
        System.out.println(inetSocketAddress.getPort());

        InetAddress inetAddress = inetSocketAddress.getAddress();
        System.out.println(inetAddress.getHostName());
        System.out.println(inetAddress.getHostAddress());

    }
}
