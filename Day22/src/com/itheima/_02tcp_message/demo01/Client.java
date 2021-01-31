package com.itheima._02tcp_message.demo01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 客户端
 *
 *
 *  127.0.0.1 : 本机回路地址
 */
public class Client {
    public static void main(String[] args) throws IOException {

        String ip = InetAddress.getLocalHost().getHostAddress();
        System.out.println(ip);

        // 创建Socket对象
        Socket socket = new Socket("127.0.0.1", 8888);

        // 获取和服务器连接的输出流
        OutputStream os = socket.getOutputStream();

        // 写出一句话
        os.write("你愁啥!".getBytes());

        // 释放资源
        os.close();
        socket.close();
    }
}
