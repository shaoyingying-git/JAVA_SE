package com.itheima._02file;

import java.io.File;

public class Demo05_删除功能 {
    public static void main(String[] args) {
        File file = new File("Day08\\aaa");
        System.out.println(file.delete());
    }
}
