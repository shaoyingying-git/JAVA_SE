package com.itheima._02functional.demo03;

public class Demo03_无参无返回的函数式接口 {
    public static void main(String[] args) {
        // 通过lambda调用下面那的方法
        fun(new Eatable() {
            @Override
            public void eat() {
                System.out.println("吃饭才能活着!~");
            }
        });

        // lambda
        fun(() -> System.out.println("不吃饭就死啦!~"));
    }

    // 模拟一个方法, 让函数式接口作为方法的参数
    public static void fun(Eatable lambda) {
        lambda.eat();
    }
}
