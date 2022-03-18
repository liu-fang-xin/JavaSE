package com.msb.test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test01 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getByName("12.168.153.130");
        System.out.println("inetAddress = " + inetAddress);
        InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");
        System.out.println("inetAddress2 = " + inetAddress2);
        InetAddress inetAddress3 = InetAddress.getByName("localhost");
        System.out.println("inetAddress3 = " + inetAddress3);
    }
}
