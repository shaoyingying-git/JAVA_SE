package com.itheima._02interface.demo04;

public class Dog extends Animal implements LookDoorAble{

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃肉!");
    }

    @Override
    public void sleep() {
        System.out.println("狗躺着睡");
    }

    @Override
    public void lookDoor() {
        System.out.println("狗会看门");
    }
}
