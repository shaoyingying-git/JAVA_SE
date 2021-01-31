package com.itheima._02bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo04_使用数组方法 {
    public static void main(String[] args) throws IOException{

        // 创建输入流对象
        FileInputStream fis = new FileInputStream("Day09\\aaa.txt");
        FileOutputStream fos = new FileOutputStream("Day09\\bbb.txt");

        byte[] arr = new byte[3];

        // 将字节读取到数组中
        // 定义变量, 用来记录有效的字节个数
        int len;
        while ((len = fis.read(arr)) != -1) {
             System.out.println(Arrays.toString(arr));
            fos.write(arr, 0, len);
        }


        /*int i = fis.read(arr);
        System.out.println(i);
        System.out.println(Arrays.toString(arr));

        int i2 = fis.read(arr);
        System.out.println(i2);
        System.out.println(Arrays.toString(arr));

        int i3 = fis.read(arr);
        System.out.println(i3);
        System.out.println(Arrays.toString(arr));*/

        fis.close();
        fos.close();
    }

    private static void demo01() throws IOException {
        // write(byte[])
        FileOutputStream fos = new FileOutputStream("Day09\\aaa.txt");

        byte[] arr = {97, 98, 99, 100, 101, 102};

        fos.write(arr, 3, 2);

        fos.close();
    }
}
