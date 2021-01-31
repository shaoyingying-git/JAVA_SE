package com.itheima._02interface.demo03;

public interface Inter1 {
    public abstract void fun();


    public default void fun2() {
        System.out.println("这是Inter1中的默认方法");
    }

    public default void fun3() {
        System.out.println("接口中的fun方法");
    }

}
