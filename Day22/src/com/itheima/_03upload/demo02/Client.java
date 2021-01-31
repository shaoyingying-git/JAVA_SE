package com.itheima._03upload.demo02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) throws IOException {
        // 创建和硬盘连接的输入流
        BufferedInputStream bis =
                new BufferedInputStream(new FileInputStream("Day11\\upload.txt"));

        // 创建Socket对象
        Socket socket = new Socket("127.0.0.1", 8888);
        // 获取和服务器连接的输出流
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());

        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }

        // 释放资源
        bos.close();
        socket.close();
        bis.close();

    }
}
