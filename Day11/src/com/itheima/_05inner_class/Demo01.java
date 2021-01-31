package com.itheima._05inner_class;

public class Demo01 {
    public static void main(String[] args) {
        // 外部类
        Person p = new Person();
        p.fun();

        // 直接使用内部类
        // 创建内部类对象: 外部类名.内部类名  对象名 =  new 外部类().new 内部类();
        Person.Heart h = new Person().new Heart();
        h.method();
    }
}
