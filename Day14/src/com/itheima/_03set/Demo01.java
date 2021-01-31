package com.itheima._03set;

import java.util.HashSet;

public class Demo01 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();


        set.add(3);
        set.add(2);
        set.add(5);
        set.add(1);
        set.add(4);
        set.add(6);
        set.add(16);
        set.add(17);
        set.add(18);

        System.out.println(set);

    }
}
