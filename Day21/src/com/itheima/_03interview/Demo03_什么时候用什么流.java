package com.itheima._03interview;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo03_什么时候用什么流 {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("Day10\\meinv.jpg");
        FileWriter fw = new FileWriter("Day10\\copyMeinv.jpg");

        int c;

        while ((c = fr.read()) != -1) {
            fw.write(c);
        }

        fr.close();
        fw.close();

    }
}
