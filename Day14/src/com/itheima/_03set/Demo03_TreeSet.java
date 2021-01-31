package com.itheima._03set;

import java.util.TreeSet;

public class Demo03_TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(18);
        set.add(18);
        set.add(18);
        set.add(18);
        set.add(2);
        set.add(2);
        set.add(2);
        set.add(2);
        set.add(2);
        set.add(17);
        set.add(17);
        set.add(17);
        set.add(5);
        set.add(1);
        set.add(4);
        set.add(6);
        set.add(16);

        System.out.println(set);
    }
}
