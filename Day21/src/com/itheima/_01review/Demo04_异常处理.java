package com.itheima._01review;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo04_异常处理 {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("Day10\\aaa.txt");
            fos = new FileOutputStream("Day10\\bbb.txt");
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } finally {
                if (fis != null) {
                    fis.close();
                }
            }

        }
    }
}
