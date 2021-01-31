package com.itheima._02buffer;

import java.io.*;

public class Demo02_字符缓冲流 {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("Day10\\bbb.txt"));

        bw.write("你好");
        // 写出回车换行
        // bw.write("\r\n");

        bw.newLine();

        bw.write("不要");

        bw.close();

    }

    private static void demo01() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Day10\\aaa.txt"));

        String s = br.readLine();
        System.out.print(1111);
        System.out.print(s);
        System.out.print(2222);
        br.close();
    }
}
