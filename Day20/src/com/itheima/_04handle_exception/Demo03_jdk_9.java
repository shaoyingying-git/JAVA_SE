package com.itheima._04handle_exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03_jdk_9 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Day09\\aaa.txt");
        FileOutputStream fos = new FileOutputStream("Day09\\bbb.txt");
        // 使用分号隔开
        try (fis; fos){
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
        }
    }
}
