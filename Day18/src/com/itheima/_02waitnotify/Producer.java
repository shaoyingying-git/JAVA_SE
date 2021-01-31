package com.itheima._02waitnotify;

/**
 * 生产者
 */
public class Producer  extends Thread {
    private BaoZi baoZi;

    public Producer(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {

        while (true) {
            synchronized (baoZi) {
                // 如果有包子
                if (baoZi.isHaveBaoZi) {
                    // 就等待 wait方法需要锁对象来调用
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 代码执行到这, 说明没有包子
                System.out.println("生产者正在生产包子...");
                try {
                    Thread.sleep(2000);
                    System.out.println("包子做好了, 吃货快来吃!");
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // 告诉大家, 有包子了,   修改是否有包子的变量
                baoZi.isHaveBaoZi = true;
                // 唤醒另一条线程
                baoZi.notify();

            }
        }
    }
}
