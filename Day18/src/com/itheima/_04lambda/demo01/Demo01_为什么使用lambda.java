package com.itheima._04lambda.demo01;
/*

    面向对象:  强调是怎么做
    函数式编程: 强调的是做什么

 */
public class Demo01_为什么使用lambda {

    public static void main(String[] args) {

        // 由于构造中需要使用Runnable,
        // 我们不得不要么创建一个类, 要么不得不使用匿名内部类
        // run是不得不写
        // run方法的参数和返回值
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("开启了一条新线程!");
            }
        }).start();

        new Thread(() -> {
            System.out.println("开启了一条新线程!");
        }).start();

    }

}
