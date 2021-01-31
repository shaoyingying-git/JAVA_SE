package com.itheima._02interface.demo04;

public class Cat extends Animal implements CatchMouseAble{

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼!");
    }

    @Override
    public void sleep() {
        System.out.println("猫趴着睡");
    }


    @Override
    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
