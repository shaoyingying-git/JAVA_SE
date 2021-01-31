package com.itheima._02waitnotify;

/**
 * 消费者
 */
public class Consumer extends Thread{

    // 如果一个类中, 需要另一个类的对象
    // 将这个类当做成员变量, 使用构造方法赋值
    private BaoZi baoZi;

    public Consumer(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {

        while (true) {
            synchronized (baoZi) {
                // 如果没有包子
                if (!baoZi.isHaveBaoZi) {
                    // 就等待
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // 代码执行到这里,  有包子
                System.out.println("消费者正在吃包子...");
                try {
                    Thread.sleep(2000);
                    System.out.println("包子吃完了, 包子铺快做!");
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // 告诉大家没有包子了
                baoZi.isHaveBaoZi = false;
                // 唤醒
                baoZi.notify();

            }
        }
    }
}
