package com.itheima._07wrapper;

public class Demo01 {
    public static void main(String[] args) {
        Integer i = 10; // 自动装箱
        int a = i; // 自动拆箱

        // 手动装拆箱
        Integer i2 = new Integer(10); // 手动装箱
        int i3 = i2.intValue(); // 手动拆箱

    }
}
