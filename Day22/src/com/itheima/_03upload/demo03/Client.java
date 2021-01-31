package com.itheima._03upload.demo03;

import java.io.*;
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


        bos.flush();
        // 禁用此输出流, 所有写出的内容将被发送
        socket.shutdownOutput();


        // ==========接收回写================

        // 获取和服务器连接的输入流
        InputStream is = socket.getInputStream();

        byte[] arr = new byte[1024];

        // 获取到有效的字节个数
        int len = is.read(arr);

        // 打印
        System.out.println(new String(arr, 0, len));


        // ================================


        // 释放资源
        is.close();
        // bos.close();
        socket.close();
        bis.close();

    }
}
