package com.itheima._04static;
/*
    static: 静态
        1. static修饰的成员变量, 被这个类所有对象所共享
        2. static修饰的成员, 可以直接使用类名. 去调用

 */
public class Demo01 {
    public static void main(String[] args) {
        /*Person p1 = new Person("张三", 23);
        Person p2 = new Person();

        Person p3 = new Person();
        System.out.println(p3.getName());

        // 修改p2的年龄
        p2.setAge(24);

        // 展示属性
        p1.show();
        p2.show();*/

        System.out.println(StaticDemo.num);

        StaticDemo.fun();

    }
}
