package com.ithiema._03stream;

import java.util.stream.Stream;

public class Demo09_parallel {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 先转换成并发流
        stream.parallel().forEach(System.out::println);
    }
}
