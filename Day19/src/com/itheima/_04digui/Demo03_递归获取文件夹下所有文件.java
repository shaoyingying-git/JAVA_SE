package com.itheima._04digui;

import java.io.File;

public class Demo03_递归获取文件夹下所有文件 {
    public static void main(String[] args) {
        printFile(new File("C:\\"));
    }

    /**
     * 此方法用于获取文件夹下所有文件
     */
    public static void printFile(File file) {
        // 获取文件夹中所有的文件和文件夹  :  listFiles()
        File[] subFiles = file.listFiles();
        // 遍历数组, 获取每一个文件和文件夹 : 增强for
        if (subFiles != null) {
            for (File subFile : subFiles) {
                // 判断
                if (subFile.isFile()) {
                    // 如果是文件就打印
                    System.out.println(subFile);
                }else {
                    // 如果是文件夹, 获取这个文件夹下所有文件  递归
                    printFile(subFile);
                }
            }
        }
    }
}
