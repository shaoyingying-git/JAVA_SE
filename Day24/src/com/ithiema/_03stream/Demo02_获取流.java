package com.ithiema._03stream;

import java.util.*;
import java.util.stream.Stream;

public class Demo02_获取流 {
    public static void main(String[] args) {
        // List集合
        ArrayList<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        // Set集合
        HashSet<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        // Map集合
        HashMap<String, String> map = new HashMap<>();
        // 所有键的Stream
        Stream<String> stream3 = map.keySet().stream();
        // 所有值的Stream
        Stream<String> stream4 = map.values().stream();
        // 所有键值对的Stream
        Stream<Map.Entry<String, String>> stream5 = map.entrySet().stream();

        // 数组
        // 注意事项, 不能使用基本数据类型的数组
        String[] arr = {"张三", "李四"};
        Stream<String> stream6 = Arrays.stream(arr);
        Stream<String> stream7 = Stream.of(arr);


        // 一堆数据
        Stream<Integer> stream8 = Stream.of(1, 2, 3, 4, 5); // 数据类型要一致
    }
}
