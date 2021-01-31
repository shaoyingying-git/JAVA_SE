package com.itheima._02bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03_文件的拷贝 {
    public static void main(String[] args) throws IOException {
        // 1. 创建输入流对象
        FileInputStream fis = new FileInputStream("Day09\\actor.mp3");
        // 2. 创建输出流对象
        FileOutputStream fos = new FileOutputStream("Day09\\copyActor.mp3");


        long start = System.currentTimeMillis();

        // 3. 使用输入流读取
        int b;
        while ((b = fis.read()) != -1) {
            // 4. 使用输出流写出
            fos.write(b);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
        // 5. 关闭输入流
        fis.close();
        // 6. 关闭输出流
        fos.close();
    }
}
