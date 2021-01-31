package com.itheima._02file;

import java.io.File;

public class Test01_获取java结尾的文件 {
    public static void main(String[] args) {
        // 创建File对象
        File file = new File("D:\\java");
        // 通过listFiles方法, 获取所有文件和文件夹
        File[] subFiles = file.listFiles();
        // 遍历数组, 获取每一个文件和文件夹 (File)
        for (File subFile : subFiles) {
            // 获取文件或文件夹的名字
            String name = subFile.getName();
            // 判断 是一个文件  && 是以.java结尾
            if (subFile.isFile() && name.endsWith(".java")) {
                System.out.println(subFile);
            }
        }
    }
}
