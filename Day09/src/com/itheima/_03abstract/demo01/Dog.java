package com.itheima._03abstract.demo01;


/**
 * 这是一个狗类
 */
public class Dog extends Animal {

    public Dog() {
        super(); // 调用父类的空参构造
    }

    public Dog(String kind, String color) {
        super(kind, color);
    }

    @Override
    public void eat() {
        System.out.println("狗吃肉!~");
    }

    @Override
    public void sleep() {
        System.out.println("狗躺着睡!~");
    }
}
