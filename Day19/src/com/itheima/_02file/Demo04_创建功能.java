package com.itheima._02file;

import java.io.File;
import java.io.IOException;

public class Demo04_创建功能 {
    public static void main(String[] args) throws IOException {
        // File对象创建成功, 它所代表的文件一定存在?
        /*File file = new File("Day08\\bbb.txt");
        System.out.println(file.createNewFile());*/

        File file2 = new File("Day08\\abc");
        System.out.println(file2.mkdirs());



    }
}
