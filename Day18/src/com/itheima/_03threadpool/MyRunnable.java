package com.itheima._03threadpool;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {

            String name = Thread.currentThread().getName();

            System.out.println("教练, 快来教我游泳!" + name);
            Thread.sleep(3000);
            System.out.println("教练正在教我游泳..." + name);
            Thread.sleep(3000);
            System.out.println("教练教完了, 回到了泳池中!" + name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
