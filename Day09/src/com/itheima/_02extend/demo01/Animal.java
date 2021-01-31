package com.itheima._02extend.demo01;

public class Animal {
    private String kind;

    private String color;

    public Animal() {
    }

    public Animal(String kind, String color) {
        this.kind = kind;
        this.color = color;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 行为
    public void eat() {
        System.out.println("动物吃饭");
        // this.fun();
    }

    public void sleep() {
        System.out.println("动物睡觉");
    }

    public void fun() {
        System.out.println("fun()");
    }
}
