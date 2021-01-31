package com.itheima._03upload.demo01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器
 */
public class Server {
    public static void main(String[] args) throws IOException {
        // 创建ServerSocket对象
        ServerSocket ss = new ServerSocket(8888);

        System.out.println("等待客户端连接...");

        // 接收客户端连接
        Socket socket = ss.accept();

        System.out.println("连接成功");
        // 获取和客户端连接的输入流
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        // 创建和硬盘连接的输出流
        BufferedOutputStream bos =
                new BufferedOutputStream(new FileOutputStream("Day11\\test.txt"));

        System.out.println("正在传输...");

        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }

        System.out.println("传输成功!~");

        // 释放资源
        bos.close();
        bis.close();
        socket.close();
        ss.close();

    }
}
