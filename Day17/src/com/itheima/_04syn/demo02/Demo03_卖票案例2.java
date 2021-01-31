package com.itheima._04syn.demo02;

public class Demo03_卖票案例2 {
    public static void main(String[] args) {
        new SellTicket2().start();
        new SellTicket2().start();
        new SellTicket2().start();
        new SellTicket2().start();
    }
}

class SellTicket2 extends Thread {
    // 创建共享数据
    private static int ticket = 100;
    @Override
    public void run() {
        // 无限循环
        while (true) {

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 同步代码块
            synchronized (SellTicket2.class) {
                // 出口
                if (ticket <= 0) {
                    break;
                }

                System.out.println(getName() + "买了第" + ticket + "张票");

                ticket--;
            }
        }


    }
}
