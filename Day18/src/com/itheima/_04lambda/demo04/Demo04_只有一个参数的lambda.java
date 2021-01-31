package com.itheima._04lambda.demo04;

public class Demo04_只有一个参数的lambda {
    public static void main(String[] args) {

        // 我们要做的就是fun方法的调用
        fun(new MyInter() {
            @Override
            public void method(int a) {
                System.out.println(a);
            }
        });

        // lambda
        fun((int a) -> {
            System.out.println(a);
        });

        // 省略
        fun(a -> System.out.println(a));

    }

    public static void fun(MyInter m) {
        m.method(100);
    }
}
