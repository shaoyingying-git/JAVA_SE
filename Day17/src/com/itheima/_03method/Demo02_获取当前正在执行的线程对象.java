package com.itheima._03method;
/*

    获取当前正在执行的线程对象


    public static Thread currentThread() : 返回当前正在执行的线程对象


 */
public class Demo02_获取当前正在执行的线程对象 {
    public static void main(String[] args) {
        MyRunnable2 mr = new MyRunnable2();
        new Thread(mr, "线程一").start();


        // 主方法, 主线程
        System.out.println(Thread.currentThread().getName());

    }
}

class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        // 获取当前正在执行的线程对象
        System.out.println(Thread.currentThread().getName());
    }
}
