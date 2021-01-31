package com.itheima._02extend.demo01;


/**
 * 这是一个狗类
 */
public class Dog extends Animal{

    public Dog() {
        super(); // 调用父类的空参构造
    }

    public Dog(String kind, String color) {
        super(kind, color);
    }

    // 注解: 用来标记下面的方法, 一定是重写的方法
    @Override
    public void eat() {
        // this.eat();
        super.eat();
        System.out.println("狗吃肉!~");
    }

    @Override
    public void sleep() {
        System.out.println("狗躺着睡!~");
    }
}
