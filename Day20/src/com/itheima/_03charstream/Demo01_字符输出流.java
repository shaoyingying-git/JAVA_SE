package com.itheima._03charstream;

import java.io.FileWriter;
import java.io.IOException;

public class Demo01_字符输出流 {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("Day09\\aaa.txt");

        fw.write("杨超越锦鲤!");

        fw.close();

    }
}
