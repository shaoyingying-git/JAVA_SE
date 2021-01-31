package com.itheima._02buffer;

import java.io.*;
import java.nio.Buffer;

public class Demo01_字节缓冲流 {
    public static void main(String[] args) throws IOException {
        // FileInputStream fis = new FileInputStream("Day10\\");
        // BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fis);
        // 创建带缓冲区的字节输入流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Day10\\meinv.jpg"));
        //        // 创建带缓冲区的字节输出流对象
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Day10\\copymeinv.jpg"));

        int b;

        while ((b = bis.read()) != -1) {
            bos.write(b);
        }

        // bos.flush();

        bis.close();
        bos.close();

    }
}
