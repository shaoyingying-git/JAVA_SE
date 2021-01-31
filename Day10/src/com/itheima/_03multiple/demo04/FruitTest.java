package com.itheima._03multiple.demo04;

public class FruitTest {
    public static void main(String[] args) {

        Apple a = new Apple();

        juicer(a);


        WaterMelon wm = new WaterMelon();

        juicer(wm);

        Orange o = new Orange();
        juicer(o);


    }

    /**
     * 榨汁机     水果
     */
    public static void juicer(Fruit fruit) { // 父类引用指向子类对象
        fruit.juice();
    }


    /**
     * 此方法用来代表榨汁机  苹果
     *//*
    public static void juicer(Apple apple) { // Apple apple = new Apple();
        apple.juice();
    }

    *//**
     * 榨汁机   西瓜
     *//*
    public static void juicer(WaterMelon melon) {
        melon.juice();
    }

    *//**
     * 榨汁机  橙子
     *//*
    public static void juicer(Orange orange) {
        orange.juice();
    }*/

}
