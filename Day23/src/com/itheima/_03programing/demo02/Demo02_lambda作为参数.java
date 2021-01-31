package com.itheima._03programing.demo02;

public class Demo02_lambda作为参数 {
    public static void main(String[] args) {
        /*startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println("开启线程");
            }
        });*/

        // lambda   ,  lambda作为方法的参数
        startThread(() -> System.out.println("开启线程"));
    }

    public static void startThread(Runnable lambda) {
        new Thread(lambda).start();
    }

}
