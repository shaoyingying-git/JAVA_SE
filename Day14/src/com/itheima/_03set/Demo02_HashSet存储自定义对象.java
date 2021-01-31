package com.itheima._03set;

import java.util.HashSet;

public class Demo02_HashSet存储自定义对象 {
    public static void main(String[] args) {
        // 创建一个用来存储Person对象的HashSet集合
        HashSet<Person> set = new HashSet<>();

        set.add(new Person("张三", 23));
        set.add(new Person("张三", 23));
        set.add(new Person("张三", 23));
        set.add(new Person("张三", 23));
        set.add(new Person("李四", 24));
        set.add(new Person("王五", 25));
        set.add(new Person("赵六", 26));

        System.out.println(set);

    }
}
