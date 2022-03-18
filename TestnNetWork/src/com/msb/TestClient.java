package com.msb;

import java.io.*;
import java.net.Socket;

public class TestClient {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",9999);

        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF("服务器,你好啊 .我是客户端");
        System.out.println("客户端: 服务器,你好啊 .我是客户端");

        InputStream inputStream = socket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String s = dataInputStream.readUTF();
        System.out.println("服务器: " + s);



        dataOutputStream.close();
        outputStream.close();
        socket.close();
    }
}
