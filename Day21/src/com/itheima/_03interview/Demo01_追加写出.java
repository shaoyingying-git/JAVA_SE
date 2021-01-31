package com.itheima._03interview;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01_追加写出 {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("Day10\\aaa.txt", true);

        /*fos.write(97);
        fos.write(98);
        fos.write(99);*/

        fos.write(100);

        fos.close();

    }
}
