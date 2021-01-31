package com.itheima._04lambda.demo05;

public class Demo05_Runnable {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("开启了一条新线程");
            }
        }).start();

        // lambda简化
        new Thread(() -> {
            System.out.println("开启了一条新线程");
        }).start();

        // 省略
        new Thread(() -> System.out.println("开启了一条新线程")).start();
    }
}
