package com.itheima._02extend.demo05;

public class Fruit {

    private String color;

    private double price;

    public Fruit() {
    }

    public Fruit(String color, double price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // 方法的重写多态的前提
    public void ate() {
        System.out.println("水果被吃了!~");
    }
}
