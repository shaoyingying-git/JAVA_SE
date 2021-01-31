package com.itheima._01review;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo03_字符流使用 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("Day10\\aaa.txt");

        fos.write("哈哈哈哈".getBytes());

        fos.close();
    }

    private static void demo02() throws IOException {
        // 字符输出流
        FileWriter fw = new FileWriter("Day10\\aaa.txt");

        fw.write("不要乱动!我的!");

        fw.close();
    }

    private static void demo01() throws IOException {
        // 创建字符输入流
        FileReader fr = new FileReader("Day10\\aaa.txt");

        // 字符流每次读取, 可以读取到一个字符
        int i = fr.read();
        // 使用强转, 打印这个字符
        System.out.println((char) i);

        fr.close();
    }
}
