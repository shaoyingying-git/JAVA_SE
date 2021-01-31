package com.itheima._02file;

import java.io.File;

public class Demo06_遍历文件夹 {
    public static void main(String[] args) {

        // demo01();

        File file = new File("D:\\java");

        // File数组
        File[] subFiles = file.listFiles();
        // 遍历数组, 获取到的 每一个File对象
        for (File subFile : subFiles) {
            // 使用File的功能操作
            System.out.println(subFile);
        }


    }

    private static void demo01() {
        File file = new File("D:\\java");

        String[] arr = file.list();

        System.out.println("数组的长度为: " + arr.length);

        // 遍历数组
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
