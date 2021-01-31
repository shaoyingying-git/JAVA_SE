package com.itheima._04collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo02_addAll {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);


        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(list);

        // 随机置换
        Collections.shuffle(list);

        System.out.println(list);
    }
}
