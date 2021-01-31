package com.itheima._02bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo05_使用数组的拷贝 {
    public static void main(String[] args) throws IOException {
        // 1. 创建输入流对象
        FileInputStream fis = new FileInputStream("Day09\\aaa.txt");
        // 2. 创建输出流对象
        FileOutputStream fos = new FileOutputStream("Day09\\bbb.txt");

        // 3. 使用输入流读取
        // 创建字节数组
        byte[] arr = new byte[1024 * 8]; // 1024的n倍
        // 定义变量, 用来记录每一次读取到有效的字节个数
        int len;

        long start = System.currentTimeMillis();

        while ((len = fis.read(arr)) != -1) {
            // 4. 使用输出流写出
            // 写出数组, 从0索引开始, 有效字节个数
            fos.write(arr, 0, len);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);

        // 5. 关闭输出流
        fos.close();
        // 6. 关闭输入流
        fis.close();

    }
}
