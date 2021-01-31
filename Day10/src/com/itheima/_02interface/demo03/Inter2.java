package com.itheima._02interface.demo03;

public interface Inter2 extends Inter3, Inter4 {
    public abstract void fun();

    public default void fun2() {
        System.out.println("这是Inter2中的默认方法");
    }
}
