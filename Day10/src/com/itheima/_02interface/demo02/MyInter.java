package com.itheima._02interface.demo02;

public interface MyInter {

    default void fun1() {
        fun3();
        System.out.println("黑马程序员");
    }

    default void fun2() {
        fun3();
        System.out.println("传智播客");
    }

    private  void fun3() {
        System.out.println("欢迎来到, ");
    }


}
