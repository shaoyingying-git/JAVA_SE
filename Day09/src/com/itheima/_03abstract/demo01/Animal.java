package com.itheima._03abstract.demo01;

/*
 *  将这个父类, 改成抽象类
 *
 *  将父类中共性的方法, 改成抽象方法
 *
 *  抽象类:  public abstract class 类名 {}
 *
 *  抽象方法: public abstract void 方法名();
 *
 *
 *      特点:
 *          1. 子类必须重写父类所有的抽象方法
 *          2. 抽象类不一定有抽象方法, 有抽象方法的类一定是抽象类(接口)
 *
 *
 *  在使用子类对象调用方法时:
 *      如果子类有, 用子类; 如果子类没有, 就找父类, 父类有就用父类, 父类没有就报错.
 *
 */
public abstract class Animal {
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
    public abstract void eat();

    public abstract void sleep();

    /*public void fun() {
        System.out.println("父类");
    }*/

}
