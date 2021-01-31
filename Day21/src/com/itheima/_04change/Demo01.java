package com.itheima._04change;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        // 使用字节流拷贝
        FileInputStream fis = new FileInputStream("d:\\gbk.txt");
        FileOutputStream fos = new FileOutputStream("Day10\\utf-8.txt");

        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }

        fis.close();
        fos.close();


    }
}
