package com.itheima._02startthread.part1;

public class Demo01_开启多线程的第一种方式 {
    public static void main(String[] args) {

        // 4. 在主方法中, 创建线程类的对象
        MyThread mt = new MyThread();
        // 5. 调用start()方法开启线程
        // mt.run(); // 是普通方法的调用
        mt.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("aaaaaaaaaaaaaaaa");
        }
    }
}

// 在上面类的外部, 创建另一个类
// 在一个java文件中, 只能有一个类是public的, 而这个类的类名要和文件名一样
// 如果要创建另一个类, 不能加public, 类名不能和文件名一样


// 1. 创建一个线程类, 继承Thread
class MyThread extends Thread {
    // 2. 重写run()方法
    @Override
    public void run() {
        // 3. 将要执行的内容, 放到run()方法中
        for (int i = 0; i < 1000; i++) {
            System.out.println("BB");
        }
    }
}
