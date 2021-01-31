package com.itheima._02face_object.test03;

public class CarTest {
    public static void main(String[] args) {
        // 创建对象
        Car c = new Car();
        // 使用对象
        //c.brand = "领克";
        // c.color = "black";
        // c.price = 120000;

        // 查看文档注释中的内容
        c.setBrand("保时捷");
        c.setColor("sexPink");
        c.setPrice(1000000);

        System.out.println("车的品牌是: " + c.getBrand());
        System.out.println("车的颜色是: " + c.getColor());
        System.out.println("车的价格是: " + c.getPrice());


        //System.out.println("车的品牌是: " + c.brand);
        // System.out.println("车的颜色是: " + c.color);
        // System.out.println("车的价格是: " + c.price);
    }
}
