package com.itheima._04handle_exception;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo02_jdk_7 {
    public static void main(String[] args) throws IOException {

        try (
                FileInputStream fis = new FileInputStream("Day09\\aaa.txt");
                ){
            fis.read();
        }




    }
}
