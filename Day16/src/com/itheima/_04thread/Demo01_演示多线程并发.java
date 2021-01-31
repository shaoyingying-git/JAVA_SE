package com.itheima._04thread;

public class Demo01_演示多线程并发 {
    public static void main(String[] args) {
        // 主方法的运行就是主线程

        // 开启另一条线程
        new MyThread().start();

        for (int i = 0; i < 100; i++) {
            System.out.println("BB");
        }
    }
}
