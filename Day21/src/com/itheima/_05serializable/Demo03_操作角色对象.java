package com.itheima._05serializable;

import java.io.*;
import java.util.ArrayList;

public class Demo03_操作角色对象 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        out();
        in();
    }

    /*
        序列化
     */
    public static void out() throws IOException {
        // 对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Day10\\object.txt"));
        // 创建角色对象
        Role r = new Role("古尔丹", "霜之哀伤", 500, 1000, 40);
        Role r2 = new Role("吉安娜", "霜之哀伤", 500, 1000, 40);
        Role r3 = new Role("奥蕾莉亚", "霜之哀伤", 500, 1000, 40);

        ArrayList<Role> list = new ArrayList<>();
        list.add(r);
        list.add(r2);
        list.add(r3);

        // 写出对象
        oos.writeObject(list);

        oos.close();

    }

    /*
        反序列化
     */
    public static void in() throws IOException, ClassNotFoundException {
        // 对象输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Day10\\object.txt"));
        // 读取
        ArrayList<Role> list = (ArrayList<Role>) ois.readObject();
        // 遍历打印
        for (Role role : list) {
            System.out.println(role);
        }
        // 关流
        ois.close();
    }

}
