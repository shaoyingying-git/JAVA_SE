package com.ithiema._03stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo10_存入集合或数组 {
    public static void main(String[] args) {
        // 存入集合
        List<Integer> list = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toList());

        // 存入Set
        Set<Integer> set = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toSet());

        // 存入数组
        Object[] objects = Stream.of(1, 2, 3, 4, 5).toArray();
        Integer[] integers = Stream.of(1, 2, 3, 4, 5).toArray(Integer[]::new); // 了解
    }
}
