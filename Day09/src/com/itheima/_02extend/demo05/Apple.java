package com.itheima._02extend.demo05;

public class Apple extends Fruit{

    public Apple() {
    }

    public Apple(String color, double price) {
        super(color, price);
    }

    @Override
    public void ate() {
        System.out.println("苹果被吃了!");
    }
}
