package com.itheima._06noname.demo01;

public class Demo01_匿名内部类 {
    public static void main(String[] args) {

        Bird b = new Bird();

        goSky(b);


        // new Bird() :  Flyable接口的子类对象

        // goSky(new Bird()); // 匿名对象

        // 代表了, 实现了该接口的子类对象(实现类对象)
        // new 接口名() {}
        goSky(new Flyable() {

            @Override
            public void fly() {
                System.out.println("上天了!~");
            }
        });


    }

    // 如果方法的参数列表是接口, 那么实际传入的就是它的子类对象
    public static void goSky(Flyable f) {
        f.fly();
    }

}
