package com.itheima._04bs;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo01_模拟BS服务器 {
    public static void main(String[] args) throws IOException {
        // 创建服务器
        ServerSocket ss = new ServerSocket(9999);

        while (true) {
            System.out.println("[服务器]正在等待连接...");
            Socket socket = ss.accept();
            System.out.println("连接成功");
            new Thread(() -> {
                try {
                    // 获取和浏览器连接的输入流
                    InputStream is = socket.getInputStream();
                    // 需要将字节流, 转换成BufferedReader
                    BufferedReader br = new BufferedReader(new InputStreamReader(is));
                    // 读取一行
                    String s = br.readLine();
                    // 通过空格分割
                    String[] arr = s.split(" ");
                    // 获取第二个元素, 并去掉第一个字符
                    String path = arr[1].substring(1);

                    // 创建和文件连接的输入流
                    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
                    // 获取和浏览器连接的输出流
                    BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());

                    // 写入HTTP协议响应头,固定写法
                    bos.write("HTTP/1.1 200 OK\r\n".getBytes());
                    bos.write("Content-Type:text/html\r\n".getBytes());
                    // 必须要写入空行,否则浏览器不解析
                    bos.write("\r\n".getBytes());

                    // 写出
                    int b;
                    while ((b = bis.read()) != -1) {
                        bos.write(b);
                    }

                    // 释放资源
                    bos.close();
                    bis.close();
                    br.close();
                    is.close();
                    socket.close();
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }


    }
}
