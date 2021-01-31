package com.itheima._03multiple.demo05;

public class Demo05_多态的弊端 {
    public static void main(String[] args) {

        double d = 10;
        System.out.println((int) d / 3);




        // 多态: 父类引用指向子类对象
        Fu fu = new Zi(); // 向上转型: 将子类对象, 转换成父类的类型

        // 调用fun方法
        fu.fun();


        //

        System.out.println(((Zi) fu).a); // 报错


        ((Zi) fu).ziFun(); // 报错


    }
}
