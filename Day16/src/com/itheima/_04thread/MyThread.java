package com.itheima._04thread;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("aaaaaaaaaaaaaaa");
        }
    }
}
