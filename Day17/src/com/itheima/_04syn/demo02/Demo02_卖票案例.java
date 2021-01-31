package com.itheima._04syn.demo02;

public class Demo02_卖票案例 {
    public static void main(String[] args) {
        SellTicket st = new SellTicket();

        new Thread(st).start();
        new Thread(st).start();
        new Thread(st).start();
        new Thread(st).start();
    }
}


class SellTicket implements Runnable{

    // 创建一个变量, 用来当做票数, 一定要是共享数据
    int tickets = 100;

    @Override
    public void run() {
        // synchronized一定要在while的里面
        // 有票才卖
        while (true) {
            synchronized (SellTicket.class) {
                // 没票就不卖了
                if (tickets <= 0) {
                    break;
                }
                String name = Thread.currentThread().getName();
                System.out.println(name + "正在卖第" + tickets + "张票!");
                // 卖一张少一张
                tickets--;
            }
        }
    }
}
