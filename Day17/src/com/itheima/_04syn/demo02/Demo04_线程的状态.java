package com.itheima._04syn.demo02;

public class Demo04_线程的状态 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(mt.getState());
        }

    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        synchronized (this) {
            try {
                // this.wait();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
