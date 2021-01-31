package com.itheima._03filter;

import java.io.File;
import java.io.FileFilter;

public class Demo01_过滤器的使用 {
    public static void main(String[] args) {
        // 创建File对象
        File file = new File("D:\\java");
        // 如果方法的参数列表是接口, 那么实际传入的就是该接口的实现类对象
        // 匿名内部类, lambda
        File[] subFiles = file.listFiles(new FileFilter() {
            // pathname: 要测试的文件或文件夹
            // return: 需要存入数组就返回true, 不需要存入就返回false
            @Override
            public boolean accept(File pathname) {
                String name = pathname.getName();
                boolean b = "C".equals(name);
                System.out.println(pathname + "=====" + b);
                return b;
            }
        });


        System.out.println("数组的长度为: " + subFiles.length);

        for (File subFile : subFiles) {
            System.out.println(subFile);
        }
    }
}
