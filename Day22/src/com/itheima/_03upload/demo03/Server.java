package com.itheima._03upload.demo03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器
 */
public class Server {
    public static void main(String[] args) throws IOException {


        // 创建ServerSocket对象
        ServerSocket ss = new ServerSocket(8888);
        while (true) {

            // 需要在接收到客户端连接之后, 开启新线程
            System.out.println("等待客户端连接...");
            // 接收客户端连接
            Socket socket = ss.accept();

            new Thread(() -> {
                try {

                    System.out.println("连接成功");
                    // 获取和客户端连接的输入流
                    BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
                    // 让每一次接收到的内容, 在不同的文件中
                    String name = "Day11\\" + System.currentTimeMillis() + ".txt";
                    // 创建和硬盘连接的输出流
                    BufferedOutputStream bos =
                            new BufferedOutputStream(new FileOutputStream(name));

                    System.out.println("正在传输...");

                    int b;
                    while ((b = bis.read()) != -1) {
                        System.out.println(b);
                        bos.write(b);
                    }

                    System.out.println("传输成功!~");

                    // ===================回写===============
                    // 创建和客户端连接的输出流
                    OutputStream os = socket.getOutputStream();

                    os.write("传输成功".getBytes());

                    // ======================================


                    // 释放资源
                    os.close();
                    bos.close();
                    bis.close();
                    socket.close();
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();


        }
    }
}
