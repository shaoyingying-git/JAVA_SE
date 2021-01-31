package com.itheima._05ArrayList;

import java.util.ArrayList;

public class Demo04_集合的遍历 {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<String> list = new ArrayList<>();
        // 添加元素
        list.add("朱茵");
        list.add("张敏");
        list.add("王祖贤");
        list.add("关咏荷");

        // 让for循环中i的值, 和集合的索引一一对应
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

         System.out.println(list);

    }
}
