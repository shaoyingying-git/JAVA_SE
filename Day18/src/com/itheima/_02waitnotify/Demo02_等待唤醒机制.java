package com.itheima._02waitnotify;

import java.util.concurrent.BlockingQueue;

public class Demo02_等待唤醒机制 {
    public static void main(String[] args) {

        BaoZi baoZi = new BaoZi();

        Producer p = new Producer(baoZi);

        Consumer c = new Consumer(baoZi);

        p.start();
        c.start();

    }
}
