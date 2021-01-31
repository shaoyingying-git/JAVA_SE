package com.itheima._02interface.demo03;

public class Zi extends Fu implements Inter1, Inter2{

    @Override
    public void fun() {

    }

    @Override
    public void fun2() {
        System.out.println("子类重写的默认方法");
    }

    @Override
    public void method() {

    }
}
