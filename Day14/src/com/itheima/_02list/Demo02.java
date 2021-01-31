package com.itheima._02list;

import java.util.ArrayList;
import java.util.List;

public class Demo02 {
    public static void main(String[] args) {

        // 元素是Integer
        // 索引是int
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(100);

        // list.remove(100);
        Integer i = 100; // 自动装箱
        list.remove(i);
        list.remove(0);

        System.out.println(list);

        demo01();
    }

    private static void demo01() {
        List<String> list = new ArrayList<>();

        list.add("赵爽");
        list.add("惠若琪");
        list.add("王霜");
        list.add("潘晓婷");

         list.remove("赵爽");

        list.remove(2);

        System.out.println(list);
    }
}
