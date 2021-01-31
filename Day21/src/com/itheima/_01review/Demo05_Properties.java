package com.itheima._01review;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Demo05_Properties {
    public static void main(String[] args) throws IOException {
        // 创建Properties对象
        Properties p = new Properties();
        // 创建字节输入流, 输入流关联配置文件
        // FileInputStream fis = new FileInputStream("Day10\\ccc.properties");

        InputStream fis = Demo05_Properties.class.getClassLoader().getResourceAsStream("ccc.properties");

        // 读取配置文件
        p.load(fis);
        // 关流
        fis.close();

        String id = p.getProperty("id");
        String name = p.getProperty("name");

        System.out.println(id + "===" + name);

    }
}
