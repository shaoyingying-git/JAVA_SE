package com.itheima._03multiple.demo03;

import com.itheima._03multiple.demo02.Zi;

public class Test {
    public static void main(String[] args) {

        // 创建Zi1的对象
        Zi1 z1 = new Zi1();
        fun(z1);

        Zi2 z2 = new Zi2();
        fun(z2);


        int i = 100;

        method(i);

        fun(z1);
        fun(z2);

    }

    public static void method(int a) { // int a = 100;

    }

    // 如果方法的参数列表是抽象类/接口, 实际传入的是他们的子类对象
    public static void fun(Fu fu) { // Fu fu = new Zi1();
        fu.show();
    }


    // 由于这个方法要在主方法中调用, 所以需要加上static修饰
    // 如果方法的参数列表是类, 那么实际传入的就是该类的对象
    /*public static void fun(Zi1 z1) { // Zi1 zi = new Zi1();
        z1.show();
    }

    public static void fun(Zi2 z2) {
        z2.show();
    }*/


}
