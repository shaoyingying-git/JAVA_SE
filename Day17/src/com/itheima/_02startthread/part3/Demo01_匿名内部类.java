package com.itheima._02startthread.part3;
/*

    new 类名/接口名 () {}

    代表了继承了该类的子类对象
    代表了实现了该接口的实现类对象

 */
public class Demo01_匿名内部类 {
    public static void main(String[] args) {
        // MyThread mt = new MyThread();
        // MyThread是Thread的子类
        // new MyThread()是Thread类的子类对象
        // mt.start(): 调用了Thread类的子类对象中的start()方法开启

        new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(i);
                }
            }
        }.start();


        // MyRunnable mr = new MyRunnable();
        // MyRunnable是Runnable的实现类
        // new MyRunnable(), Runnable接口的实现类对象

        // Thread t = new Thread(mr);
        // 将Runnable接口的实现类对象, 放到Thread的构造中



        /*Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                }
            }
        });

        t.start();*/

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(i);
                }
            }
        }).start();


    }
}
