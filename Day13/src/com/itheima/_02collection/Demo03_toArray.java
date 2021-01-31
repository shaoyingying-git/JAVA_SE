package com.itheima._02collection;

import java.util.ArrayList;
import java.util.Collection;

// 给定一个String类型的集合, 将集合转换成String类型的数组

public class Demo03_toArray {
    public static void main(String[] args) {
        // public Object[] toArray() : 把集合中的元素，存储到数组中。
        // 将集合转换成数组

        Collection<String> c = new ArrayList<>();
        c.add("C罗");
        c.add("布冯");
        c.add("内马尔");
        c.add("武磊");

        /*Object[] arr = c.toArray();

        for (int i = 0; i < arr.length; i++) {
            String s = (String) arr[i];
            System.out.println(s.length());
        }*/

        // String[] arr2 = new String[2];

        String[] strings = c.toArray(new String[c.size()]);

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i].length());
            System.out.println(strings[i]);
        }


    }
}
