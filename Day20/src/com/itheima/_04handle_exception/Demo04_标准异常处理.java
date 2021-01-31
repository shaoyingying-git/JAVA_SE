package com.itheima._04handle_exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo04_标准异常处理 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("Day09\\aaa.txt");
            fos = new FileOutputStream("Day09\\bbb.txt");

            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
        }finally {
            // 流尽量能关一个就关一个
            // 如果第一个有异常, 第二个关流将不会执行
            try {
                if (fis != null) {
                    fis.close();
                }
            }finally {
                if (fos != null) {
                    fos.close();
                }
            }
        }
    }
}
