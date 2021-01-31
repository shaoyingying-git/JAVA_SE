package com.itheima._04methodref.demo05;

public class Man extends Human {
    @Override
    public void sayHello() {
        System.out.println("大家好我是他儿子!");
    }


    public void fun(Greetable lambda) {
        lambda.greed();
    }

    public void method() {
        // 调用父类的sayHello
        /*fun(new Greetable() {
            @Override
            public void greed() {
                // 调用Man类的父类中的方法
                Man.super.sayHello();
            }
        });

        // 调用本类的sayHello
        fun(new Greetable() {
            @Override
            public void greed() {
                Man.this.sayHello();
            }
        });*/

        fun(() -> super.sayHello());
        fun(() -> this.sayHello());

        // 方法引用
        // sayHello功能, 已经定义好了
        // A 中的  B功能
        fun(super::sayHello);
        fun(this::sayHello);

    }


}
