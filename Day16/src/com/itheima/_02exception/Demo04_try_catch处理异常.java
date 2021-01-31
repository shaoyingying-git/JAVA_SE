package com.itheima._02exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo04_try_catch处理异常 {
    public static void main(String[] args) {

        // 如果出现了异常, 应该怎么办
        try {
            FileInputStream fis = new FileInputStream("D:\\java\\aa.txt");


            System.out.println("异常后面的代码!");

            // System.out.println(10 / 0);
            // throw new FileNotFoundException()


        } catch (Exception e) { // Exception e = new FileNotFoundException();
            e.printStackTrace();
        }

        System.out.println("try-catch后面的代码");
    }
}
