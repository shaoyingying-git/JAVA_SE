package com.itheima._04collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo03_sort {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "a", "b", "c", "aa", "ab");

        // 排序
        // 按照字符串的字典顺序排序(升序)
        Collections.sort(list);
        System.out.println(list);

        demo01();
    }

    private static void demo01() {
        ArrayList<Integer> list = new ArrayList<>();

        // 添加元素
        Collections.addAll(list, 5,4,6,8,7,9,2,3,1);
        System.out.println("排序前: " + list);
        // 排序
        Collections.sort(list);
        System.out.println("排序后: " + list);
    }
}
