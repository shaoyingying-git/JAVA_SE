package com.itheima._02exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*

 */
public class Demo05_finally {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\java\\aa.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            // 结束方法
            // return;
            // 结束Java虚拟机
            System.exit(0);
        }finally {
            System.out.println("finally");
        }
    }
}
