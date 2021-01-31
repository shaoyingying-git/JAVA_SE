package com.itheima._04methodref.demo01;

public class Demo01_方法引用的引入 {
    public static void main(String[] args) {
        // 匿名内部类
        printString(new Printable() {
            @Override
            public void print(String s) {
                System.out.println(s);
            }
        });

        // lambda
        printString(s -> System.out.println(s));
        // 方法引用
        printString(System.out::println);
    }


    public static void printString(Printable lambda) {
        lambda.print("我爱你!~");
    }
}
