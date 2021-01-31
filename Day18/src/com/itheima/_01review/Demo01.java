package com.itheima._01review;
/*
    线程


    同步
        同步代码块的格式
            synchronized (锁对象) {
            }
        作用: 保证在同步代码块中的内容, 执行时不被抢走执行权
        锁对象: 可以是任意对象, 必须使用同一个锁对象
            this
            类名.class



       线程安全问题:
        1. 多线程环境下
        2. 有共享数据
        3. 多条语句操作共享数据

      解决线程安全问题:
        使用同步代码块

 */
public class Demo01 {
    public static void main(String[] args) {
        /*MyThread mt = new MyThread();
        mt.setName();
        mt.start();

        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr);
        t.start();*/

        /*MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        MyThread mt3 = new MyThread();

        mt1.setName("谢广坤");
        mt2.setName("刘能");
        mt3.setName("赵四");

        mt1.start();
        mt2.start();
        mt3.start();*/

        /*MyRunnable mr = new MyRunnable();
        new Thread(mr, "苏大强").start();
        new Thread(mr, "苏明成").start();*/
        // new Thread(mr, "苏明玉").start();



        // 使用Thread的子类对象开启线程
        new Thread() {
            @Override
            public void run() {
                System.out.println("开启一条新线程1");
            }
        }.start();

        // Runnable接口的实现类对象
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("开启一条新线程2");
            }
        }).start();
    }
}

// Thread.currentThread()获取当前正在执行的线程对象
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "==="+ i);
        }
    }
}


class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            System.out.println(getName() + "===" + i);
        }
    }
}

