package com.itheima._02map;

import java.util.HashMap;

public class Demo01_Map集合的特点 {
    public static void main(String[] args) {
        // HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // put(键, 值): 添加功能
        map.put(1, "张三丰");
        map.put(2, "圆寂大师");
        map.put(2, "圆寂大师");
        map.put(3, "黄衣女子");
        map.put(4, null);

        System.out.println(map);

    }
}
