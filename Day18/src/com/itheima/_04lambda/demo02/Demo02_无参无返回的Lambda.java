package com.itheima._04lambda.demo02;
/*

    模拟创建接口

    模拟创建静态方法

    给定一个厨子Cook 接口，内含唯一的抽象方法makeFood ，且无参数、无返回值
 */
public class Demo02_无参无返回的Lambda {
    public static void main(String[] args) {
        // 我们要做, 调用fun方法
        fun(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭啦!~");
            }
        });

        // 使用lambda简化
        fun(() -> {
            System.out.println("吃饭啦!~");
        });


        // 省略
        fun(() -> System.out.println("吃饭啦!~"));
    }

    // 接口作为方法的参数列表
    // 方法的参数列表是接口, 那么实际传入的应该是该接口的实现类对象
    public static void fun(Cook c) {
        c.makeFood();
    }
}
