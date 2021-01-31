package com.itheima._02extend.demo05;
// 继承多态的前提
public class Orange extends Fruit{

    public Orange() {
    }

    public Orange(String color, double price) {
        super(color, price); // 访问父类的构造方法
    }

    @Override
    public void ate() {
        System.out.println("橘子被吃了!~");
    }
}
