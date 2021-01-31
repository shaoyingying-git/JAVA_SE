package com.itheima._02functional.demo04;

public class Demo04_有参有返回的lambda {
    public static void main(String[] args) {
        // 方法的调用
        printSum(new Sumable() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        }, 10, 20);

        printSum((a, b) -> a + b, 234, 432);
    }

    public static void printSum(Sumable lambda, int a, int b) {
        System.out.println(lambda.sum(a, b));
    }
}
