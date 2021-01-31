package com.ithiema._03stream;

import java.util.ArrayList;
import java.util.List;

public class Demo01_流的引入 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        // demo01(list);

        // Stream流的方式: 代码简洁, 思路清晰
        list.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .forEach(System.out::println);

    }

    private static void demo01(List<String> list) {
        // 首先筛选所有姓张的人；
        ArrayList<String> one = new ArrayList<>();
        // 遍历老集合
        for (String s : list) {
            // 判断
            if (s.startsWith("张")) {
                // 存入新集合
                one.add(s);
            }
        }

        // 然后筛选名字有三个字的人；
        ArrayList<String> two = new ArrayList<>();
        for (String s : one) {
            // 判断
            if (s.length() == 3) {
                // 存入新集合
                two.add(s);
            }
        }

        // 最后进行对结果进行打印输出。
        for (String s : two) {
            System.out.println(s);
        }
    }
}
