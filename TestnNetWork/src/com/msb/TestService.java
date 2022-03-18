package com.msb;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TestService {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String s = dataInputStream.readUTF();
        System.out.println("客户端:" + s);

        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF("服务器:我接受到你的请求了");
        System.out.println("服务器:我接受到你的请求了");


        //关闭资源
        dataInputStream.close();
        inputStream.close();

        socket.close();
        serverSocket.close();
    }
}
