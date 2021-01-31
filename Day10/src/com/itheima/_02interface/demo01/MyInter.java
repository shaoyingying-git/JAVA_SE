package com.itheima._02interface.demo01;

public interface MyInter {
    // 自定义常量
    public static final int a = 10;

    // 抽象方法
    public abstract void abstractMethod();

    // 默认方法
    public default void defaultMethod() {
        System.out.println("默认方法");
    }

    // 静态方法
    public static void staticMethod() {
        System.out.println("静态方法");
    }

    // 普通私有方法
    private void privateMethod1() {
        System.out.println("普通私有方法");
    }

    // 静态私有方法
    private static void privateMethod2() {
        System.out.println("静态私有方法");
    }

}
