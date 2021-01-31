package com.itheima._02face_object.test05;

public class CarTest {
    public static void main(String[] args) {
        // 创建对象
        // 在这个对象创建出来的时候, 就已经具有值
        Car c = new Car("沃尔沃", "white",  320000); // new Car() -> 调用了构造方法

        /*c.setBrand("沃尔沃");
        c.setColor("white");
        c.setPrice(320000);*/

        System.out.println(c.getBrand());
        System.out.println(c.getColor());
        System.out.println(c.getPrice());


    }
}
