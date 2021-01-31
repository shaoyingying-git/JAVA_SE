package com.itheima._03filter;

import java.io.File;
import java.io.FileFilter;

public class Test01_使用过滤器获取java结尾 {
    public static void main(String[] args) {
        // 创建File对象
        File file = new File("D:\\java");
        // 使用过滤器, 直接获取满足条件的文件, 存入数组中
        /*File[] subFiles = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                // 是文件, 以.java结尾
                return pathname.isFile() && pathname.getName().endsWith(".java");
            }
        });*/

        File[] subFiles = file.listFiles(p -> p.isFile() && p.getName().endsWith(".java"));

        for (File subFile : subFiles) {
            System.out.println(subFile);
        }
    }
}
