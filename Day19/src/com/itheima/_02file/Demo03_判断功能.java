package com.itheima._02file;

import java.io.File;

public class Demo03_判断功能 {
    public static void main(String[] args) {
        File file = new File("F:\\代码\\JavaEE就业60期代码\\Day08\\aaa.txt");

        System.out.println("是否是文件: " + file.isFile());
        System.out.println("是否是文件夹: " + file.isDirectory());

        // System.out.println(file.exists());
    }
}
