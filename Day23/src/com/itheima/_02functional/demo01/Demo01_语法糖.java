package com.itheima._02functional.demo01;

public class Demo01_语法糖 {

   /* public class Test {

    }*/


    public static void main(String[] args) {
        /*// 匿名内部类
        method(new MyInter() {
            @Override
            public void fun() {
                System.out.println("111");
            }
        });

        // 匿名内部类
        method(new MyInter() {
            @Override
            public void fun() {
                System.out.println("111");
            }
        });*/

        method(() -> System.out.println("111"));
        method(() -> System.out.println("111"));
        method(() -> System.out.println("111"));
        method(() -> System.out.println("111"));
    }

    public static void method(MyInter lambda) {
        lambda.fun();
    }
}
