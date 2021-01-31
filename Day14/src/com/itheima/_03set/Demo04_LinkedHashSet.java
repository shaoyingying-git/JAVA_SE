package com.itheima._03set;

import java.util.LinkedHashSet;

public class Demo04_LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(3);
        lhs.add(4);
        lhs.add(5);
        lhs.add(1);
        lhs.add(2);
        lhs.add(2);

        System.out.println(lhs);

    }
}
