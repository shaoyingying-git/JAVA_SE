package com.itheima._02startthread.part1;

public class Demo02_开启多线程的第二种方式 {
    public static void main(String[] args) {
        // 4. 在主方法中, 创建线程类的对象
        MyRunnable mr = new MyRunnable();
        // 5. 创建Thread对象, 将Runnable接口的子类对象, 放到Thread的构造中
        Thread t = new Thread(mr);
        // 6. 调用Thread的start()方法开启线程
        t.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("aaaaaaaaaaaaaaaa");
        }
    }
}

// 1. 创建一个线程类, 实现Runnable接口
class MyRunnable implements Runnable {

    // 2. 重写run()方法
    @Override
    public void run() {
        // 3. 将要执行的内容, 放到run()方法中
        for (int i = 0; i < 1000; i++) {
            System.out.println("BB");
        }
    }
}
