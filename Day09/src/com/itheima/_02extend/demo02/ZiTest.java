package com.itheima._02extend.demo02;

public class ZiTest {
    public static void main(String[] args) {
        // 创建子类对象
        Zi zi = new Zi();

        System.out.println(zi.a);

//         System.out.println(zi.privateA);

        zi.fun();

//         zi.privateFun();

        System.out.println(zi.yeA);

        zi.yeFun();
    }
}
