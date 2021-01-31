package com.itheima._02startthread.part2;

public class Demo01_一个线程类开启多条线程 {
    public static void main(String[] args) {

        /*MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        MyThread mt3 = new MyThread();
        mt1.start();
        mt2.start();
        mt3.start();*/


        // 匿名对象
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();

    }
}

class MyThread extends Thread {

    static Object o = new Object();

    @Override
    public void run() {
        System.out.println(o);
        /*for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }*/
    }
}
