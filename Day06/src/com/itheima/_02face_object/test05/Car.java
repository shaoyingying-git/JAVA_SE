package com.itheima._02face_object.test05;
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


    /*
        每一个类都有构造方法(不包含接口)

        返回值类型也没有, 连void都没有
        方法名: 方法名和类名一模一样
        构造方法的格式:
            public 方法名(参数列表) {

            }

        特点:
            1. 如果一个类没有给出任何的构造方法, 那么会默认生成一个空参构造
            2. 如果手动给人了任何的构造方法, 那么系统就不会默认生成空参构造


        有参构造, 全参构造, 满参构造:
            在构造方法的参数列表中, 将每一个成员变量对应的声明语句, 放到里面,
            然后将参数列表中局部变量的值, 赋值给成员变量
     */
    public Car() {
    }

    public Car(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }


    /**
     * 获取品牌
     * @return 返回车的品牌
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 修改品牌
     */
    public void setBrand(String brand) {
        this.brand = brand;
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
     * @param color 颜色
     */
    public void setColor(String color) {
        this.color = color;
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
     * @param price 价格
     */
    public void setPrice(double price) {
        this.price = price;
    }

    // 行为 -> 成员方法

    /**
     * 汽车跑的方法
     */
    public void run() {
        System.out.println("小汽车跑了!~");
    }
}
