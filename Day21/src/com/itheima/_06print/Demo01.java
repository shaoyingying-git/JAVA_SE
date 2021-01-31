package com.itheima._06print;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        System.out.println(1000); // 默认指向控制台

        PrintStream ps = new PrintStream("Day10\\print.txt");
        // 改变打印流的流向
        System.setOut(ps);

        System.out.print(1000);
    }
}
