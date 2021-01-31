package com.itheima._03multiple.demo05;

public class Zi extends Fu {

    // 子类特有的成员变量
    int a = 10;

    @Override
    public void fun() {
        System.out.println("重写父类的fun方法");
    }

    // 子类特有的成员方法
    public void ziFun() {
        System.out.println("子类特有的fun方法");
    }
}
