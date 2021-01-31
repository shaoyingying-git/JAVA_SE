package com.itheima._03interview;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo02_close_flush {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("Day10\\bbb.txt"));

        bw.write("你好");

        // 没有关流
        // bw.close();
    }

}
