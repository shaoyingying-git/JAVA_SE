package com.itheima._02face_object.test03;

/**
 * 这是一个汽车类
 */
public class Car {
    // 属性 -> 成员变量

    /**
     * 品牌
     */
    private String brand;

    /**
     * 颜色
     */
    private String color;

    /**
     * 价格
     */
    private double price;

    /**
     * 获取品牌
     *
     * 明确返回值类型 : 品牌 String
     * 明确参数列表: 空
     *
     * @return 返回车的品牌
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 修改品牌
     *
     * 明确返回值类型: 空
     * 明确参数列表: 品牌 String b
     */
    public void setBrand(String b) {
        // 将局部变量的b, 赋值给成员变量的brand
        brand = b;
    }

    /**
     * 获取颜色
     * @return 返回车的颜色
     */
    public String getColor() {
        return color;
    }

    /**
     * 修改颜色
     * @param c 颜色
     */
    public void setColor(String c) {
        color = c;
    }

    /**
     * 获取价格
     * @return 返回车的价格
     */
    public double getPrice() {
        return price;
    }

    /**
     * 修改价格
     * @param p 价格
     */
    public void setPrice(double p) {
        price = p;
    }





    // 行为 -> 成员方法

    /**
     * 汽车跑的方法
     */
    public void run() {
        System.out.println("小汽车跑了!~");
    }
}
