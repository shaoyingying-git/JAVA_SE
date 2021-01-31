package com.itheima._01review;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02_字节流拷贝 {
    public static void main(String[] args) throws IOException {
        /*// 1. 创建输入流对象
        FileInputStream fis = new FileInputStream("Day10\\aaa.txt");
        // 2. 创建输出流对象
        FileOutputStream fos = new FileOutputStream("Day10\\bbb.txt");
        // 3. 使用输入流读取
        byte[] arr = new byte[1024 * 8];
        // 定义变量, 用来记录读取到有效的字节个数
        int len;
        while ((len = fis.read(arr)) != -1) {
            // 4. 使用输出流写出
            fos.write(arr, 0, len);
        }
        // 5. 关闭输出流
        fos.close();
        // 6. 关闭输入流
        fis.close();*/

        demo01();


    }

    private static void demo01() throws IOException {
        // 1. 创建输入流对象
        FileInputStream fis = new FileInputStream("D:\\gbk.txt");
        // 2. 创建输出流对象
        FileOutputStream fos = new FileOutputStream("Day10\\bbb.txt");
        // 3. 使用输入流读取
        int b;
        while ((b = fis.read()) != -1) {
            System.out.println(b);
            // 4. 使用输出流写出
            fos.write(b);
        }
        // 5. 关闭输出流
        fos.close();
        // 6. 关闭输入流
        fis.close();
    }
}

