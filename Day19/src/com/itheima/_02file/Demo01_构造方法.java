package com.itheima._02file;

import java.io.File;

public class Demo01_构造方法 {
    public static void main(String[] args) {

        File file1 = new File("d:\\java");
        // 判断文件或者文件夹是否存在 :  exists()
        System.out.println(file1.exists());

        File file2 = new File("D:\\java", "A\\a.txt");
        System.out.println(file2.exists());


        File parent = new File("D:\\java\\A");
        String child = "a.txt";
        File file3 = new File(parent, child);
        System.out.println(file3.exists());

    }
}
