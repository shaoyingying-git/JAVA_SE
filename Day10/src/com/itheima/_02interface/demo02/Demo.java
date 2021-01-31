package com.itheima._02interface.demo02;

public class Demo {
    public static void main(String[] args) {

        // 创建接口的实现类对象
        MyClass mc = new MyClass();

        mc.fun1();
        mc.fun2();


        // mc.fun3(); // 不应该可以单独调用


    }
}
