package com.itheima._03abstract.demo01;

public class Cat extends Animal {


    /*public void fun() {
        System.out.println("子类");
    }*/


    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("猫趴着睡");
    }
}
