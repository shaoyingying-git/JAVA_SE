package com.itheima._02face_object.test02;

public class Person {
    // 成员变量
    int num;

    // 成员方法
    public void fun() { // b是局部变量
        // 方法中, 局部变量

        // 空指针异常的产生, 是使用了null
        int a;

        String s = null;

        System.out.println(s.length());

        System.out.println(num);

    }

    public void fun2() {
        // System.out.println(a);
        System.out.println(num);
    }


}
