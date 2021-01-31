package com.itheima._02extend.demo02;
// 父类, 超类, 基类
public class Fu extends YeYe{
    int a = 10;

    private int privateA = 100;


    public void fun() {
        System.out.println("public的fun()方法");
    }

    private void privateFun() {
        System.out.println("private的fun()方法");
    }


}
