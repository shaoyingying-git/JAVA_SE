package com.itheima._03multiple.demo01;

public class FruitTest {
    public static void main(String[] args) {

        // 一个苹果  -> new Apple()

        // 一个苹果  是一个苹果
        Apple a = new Apple();

        // 一个苹果  是一个水果
        Fruit f = new Apple(); // 父类引用指向子类对象

        Fruit f2 = new Banana();


    }
}
