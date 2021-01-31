package com.itheima._05properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        // 创建对象
        Properties p = new Properties();

        // 创建的字节输入流, 需要关联配置文件
        FileInputStream fis = new FileInputStream("Day09\\config.properties");

        // 读取配置文件
        p.load(fis);

        // 关流
        fis.close();

        String username = p.getProperty("username");
        String password = p.getProperty("password");

        System.out.println(username + "---" + password);

        // System.out.println(p);
    }
}
