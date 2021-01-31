package com.itheima._02face_object.test04;

public class CarTest {
    public static void main(String[] args) {
        // 创建对象
        Car c = new Car();

        c.setBrand("沃尔沃");
        c.setColor("white");
        c.setPrice(330000);

        System.out.println(c.getBrand());
        System.out.println(c.getColor());
        System.out.println(c.getPrice());


    }
}
