package com.itheima._02bytestream;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo02_字节输入流 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Day09\\aaa.txt");

        /*// 定义变量, 用来记录每一次读取到的值
        int b;

        // 条件: 又内容就读, 没有达到文件的末尾
        // read()方法的返回值, 不等于 -1
        while ((b = fis.read()) != -1) {
            // 读取并打印
            System.out.println(b);

        }*/

        System.out.println(fis.read());

        /*// 输入: 将硬盘中的内容, 读取到内存中
        int i1 = fis.read();
        int i2 = fis.read();
        int i3 = fis.read();
        int i4 = fis.read();
        int i5 = fis.read();

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);*/

        // 关流
        fis.close();
    }
}
