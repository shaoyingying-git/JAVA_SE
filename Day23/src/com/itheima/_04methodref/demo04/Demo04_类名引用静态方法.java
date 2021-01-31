package com.itheima._04methodref.demo04;

public class Demo04_类名引用静态方法 {
    public static void main(String[] args) {
        // 匿名内部类
        printAbs(new Calcable() {
            @Override
            public int abs(int a) {
                return Math.abs(a);
            }
        });

        // lambda
        printAbs(a -> Math.abs(a));

        // 方法引用
        // abs功能已经定义好了
        // A 中的 B功能,  Math类中的静态方法abs
        printAbs(Math::abs);

    }

    public static void printAbs(Calcable lambda) {
        // 打印-5的绝对值
        System.out.println(lambda.abs(-5));
    }
}
