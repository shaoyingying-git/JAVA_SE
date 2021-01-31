package com.itheima._05serializable;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo02_反序列化 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 反序列化流,  对象输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Day10\\object.txt"));
        // 读取对象
        String s = (String) ois.readObject();// ClassNotFoundException

        System.out.println(s);

        ois.close();
    }
}
