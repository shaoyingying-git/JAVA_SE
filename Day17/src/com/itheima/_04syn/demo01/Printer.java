package com.itheima._04syn.demo01;

import java.util.concurrent.locks.ReentrantLock;

public class Printer {

    // Object obj = new Object();

    // 创建锁对象
    ReentrantLock lock = new ReentrantLock();


    public  void print1() {
        // synchronized(Printer.class) {
        lock.lock();
            System.out.print("传");
            System.out.print("智");
            System.out.print("播");
            System.out.print("客");
            System.out.println();
        lock.unlock();
        // }
    }

    public void print2() {
        // synchronized(Printer.class) {
        lock.lock();
            System.out.print("黑");
            System.out.print("马");
            System.out.print("程");
            System.out.print("序");
            System.out.print("员");
            System.out.println();

        lock.unlock();
        // }

    }


}
