package com.itheima._03charstream;

import java.io.FileReader;
import java.io.IOException;

public class Demo02_字符输入流 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Day09\\aaa.txt");

        int i = fr.read();
        System.out.println((char) i);

        fr.close();
    }
}
