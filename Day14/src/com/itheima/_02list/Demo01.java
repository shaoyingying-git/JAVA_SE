package com.itheima._02list;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("3");
        list.add("2");
        list.add("1");
        list.add("4");

        System.out.println(list);

        for (String s : list) {
            System.out.println(s);
        }

    }
}
