package com.itheima._02waitnotify;

public class Demo01_使用方法 {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (Demo01_使用方法.class) {
                    try {
                        System.out.println("快睡了!~");

                        Demo01_使用方法.class.wait();

                        System.out.println("醒了");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (Demo01_使用方法.class) {
                    try {
                        Thread.sleep(3000);
                        System.out.println("起床啦!!!");
                        Demo01_使用方法.class.notify();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();


    }
}



