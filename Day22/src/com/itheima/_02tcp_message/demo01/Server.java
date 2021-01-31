package com.itheima._02tcp_message.demo01;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器
 */
public class Server {
    public static void main(String[] args) throws IOException {
        // 创建ServerSocket
        ServerSocket ss = new ServerSocket(8888);
        System.out.println("[服务器]正在等待客户端连接...");
        // 接收客户端的连接
        Socket socket = ss.accept();
        System.out.println("[服务器]接收到了连接!!!");

        // 获取和客户端连接的输入流
        InputStream is = socket.getInputStream();

        // byte[] bytes = is.readAllBytes();

        byte[] arr = new byte[1024];

        // 获取到有效的字节个数
        int len = is.read(arr);

        // 将字节数组转换成字符串
        System.out.println(new String(arr, 0, len));

        // 释放资源
        is.close();
        socket.close();
        ss.close();

    }
}
