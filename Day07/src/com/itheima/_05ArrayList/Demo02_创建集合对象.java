package com.itheima._05ArrayList;

import java.util.ArrayList;

public class Demo02_创建集合对象 {
    public static void main(String[] args) {
        // demo1();
        // 使用泛型的方式创建
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        // list.add(10); // 不是String类型, 会报错

    }

    private static void demo1() {
        // 空参构造创建
        ArrayList list = new ArrayList();

        // 这种创建方式, 可以存放不同数据类型的元素, 操作起来很麻烦, 不建议使用
        // 添加元素
        list.add(10);
        list.add(12.3);
        list.add(true);
        list.add("abc");
        list.add('1');
    }
}
