package com.itheima._05_19;

import java.util.List;
import java.util.Map;
import java.util.Set;
/*
    IllegalArgumentException: 非法的参数异常
 */
public class Demo01_集合添加优化 {
    public static void main(String[] args) {
        // of(可变参数)
        List<Integer> list = List.of(3, 2, 1, 4, 5);
        System.out.println(list);

        // 如果是正常的add添加功能, 会保证元素的为.
        // of()方法如果添加了重复的元素, 会报错
        Set<Integer> set = Set.of(3, 2, 1, 4, 5);
        System.out.println(set);

        Map<Integer, Integer> map = Map.of(1, 2, 3, 4, 5, 6, 7, 8);

        System.out.println(map);

    }
}
