package com.itheima._02startthread.part2;

public class Demo02_一个线程类开启多条线程_Runnable {
    public static void main(String[] args) {

        // Runnable接口的子类对象, 只需要创建一次.
        /*MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);
        t1.start();
        t2.start();
        t3.start();*/

        MyRunnable mr = new MyRunnable();

        new Thread(mr).start();
        new Thread(mr).start();
        new Thread(mr).start();



    }
}


class MyRunnable implements Runnable {
    Object o = new Object();
    @Override
    public void run() {
        System.out.println(o);
        /*for (int i = 1; i <= 10; i++) {

            System.out.println(i);
        }*/
    }
}
