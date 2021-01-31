package com.itheima._02tcp_message.demo02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;

/**
 * 客户端
 *
 *
 *  127.0.0.1 : 本机回路地址
 */
public class Client {
    public static void main(String[] args) throws IOException {

        // String ip = InetAddress.getLocalHost().getHostAddress();
        // System.out.println(ip);

        // 创建Socket对象
        Socket socket = new Socket("127.0.0.1", 8888);

        // 获取和服务器连接的输出流
        OutputStream os = socket.getOutputStream();

        // 写出一句话
        os.write("你愁啥!".getBytes());


        // =============接收回写====================
        // 获取和服务器连接的输入流
        InputStream is = socket.getInputStream();

        byte[] arr = new byte[1024];
        // 获取读取到有效的字节个数
        int len = is.read(arr);
        // 打印
        System.out.println(new String(arr, 0, len) + " : " + new Date());

        // ========================================

        // 释放资源
        is.close();
        os.close();
        socket.close();
    }
}
