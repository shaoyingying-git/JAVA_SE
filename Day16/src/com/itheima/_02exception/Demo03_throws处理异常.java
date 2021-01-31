package com.itheima._02exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo03_throws处理异常 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {


        // fun1();

        // 操作

        // 释放资源

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date d = sdf.parse("2019/03/17");

        FileInputStream fis = new FileInputStream("D:\\java\\aa.txt");

        System.out.println("代码");

    }

    public static void fun1() throws FileNotFoundException {
        fun2();
    }

    public static void fun2() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("D:\\java\\aa.txt");
    }
}
