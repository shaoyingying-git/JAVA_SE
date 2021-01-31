package com.itheima._04handle_exception;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo01_jdk_6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("Day09\\aaa.txt");
            fis.read();
        } finally {
            // 1. 作用域
            // 2. 局部变量使用前没有初始化

            // 非空判断
            if (fis != null) {
                fis.close();
            }
        }


    }
}
