package com.itheima._04lambda.demo03;
// 给定一个计算器Calculator 接口，内含抽象方法calc 可以将两个int数字相加得到和值
public class Demo03_有参有返回的lambda {
    public static void main(String[] args) {

        fun(new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });

        // lambda简化
        fun((int a, int b) -> {
            return a + b;
        });

        // 省略
        fun((a, b) -> a + b);

    }


    public static void fun(Calculator c) {
        System.out.println(c.calc(10, 20));
    }
}
