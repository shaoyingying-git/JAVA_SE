package com.itheima._01review;

public class Demo02_三条线程通信 {
    // 创建int标记变量
    static int i = 1;

    public static void main(String[] args) {

        String s = "锁对象";

        new Thread(() -> {
            while (true) {
                synchronized (s) {
                    while (i != 1) {
                        try {
                            s.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    // 是1
                    String name = Thread.currentThread().getName();
                    System.out.println(name);
                    // 修改标记变量
                    i = 2;
                    // 唤醒其他线程
                    s.notifyAll();
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                synchronized (s) {
                    while (i != 2) {
                        try {
                            s.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    // 是2
                    String name = Thread.currentThread().getName();
                    System.out.println(name);
                    // 修改标记变量
                    i = 3;
                    // 唤醒其他线程
                    s.notifyAll();
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                synchronized (s) {
                    while (i != 3) {
                        try {
                            s.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    // 是3
                    String name = Thread.currentThread().getName();
                    System.out.println(name);
                    // 修改标记变量
                    i = 1;
                    // 唤醒其他线程
                    s.notifyAll();
                }
            }
        }).start();



    }
}
