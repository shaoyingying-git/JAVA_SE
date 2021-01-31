package com.itheima._02bytestream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01_字节输出流 {
    public static void main(String[] args) throws IOException {
        // 创建字节输出流的对象
        /*File file = new File("Day09\\aaa.txt");

        FileOutputStream fos2 = new FileOutputStream(file);*/

        FileOutputStream fos = new FileOutputStream("Day09\\aaa.txt"); // 常用

        int a = 100; // a=97, b=98, c=99, d=100

        // 写出
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.write(100);

        // 关流
        fos.close();




    }
}
