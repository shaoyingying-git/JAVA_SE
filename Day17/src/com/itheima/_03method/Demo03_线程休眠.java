package com.itheima._03method;
/*
public static void sleep(long millis)


 */
public class Demo03_线程休眠 {
    public static void main(String[] args) {
        // 匿名内部类
        new Thread(new Runnable() {
            // 由于父类的run方法没有抛出异常, 所以子类也不能抛
            @Override
            public void run()  {
                for (int i = 1; i <= 10; i++) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(i);
                }
            }
        }).start();
    }
}
