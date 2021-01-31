package com.itheima._03multiple.demo02;

public class Demo02_成员访问特点 {
    public static void main(String[] args) {

        // 父类引用指向子类对象
        Fu fu = new Zi();
        // 使用的是父类的num
        System.out.println(fu.num);

        // 使用成员方法
        fu.fun();

    }
}
