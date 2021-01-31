package com.itheima._05serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo01_序列化 {
    public static void main(String[] args) throws IOException {
        // 序列化流 ,  对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Day10\\object.txt"));

        // 字符串对象
        String s = "abc";
        // 写出对象
        oos.writeObject(s);

        // 关流
        oos.close();


    }
}
