package com.ithiema._03stream;

import java.util.stream.Stream;

public class Demo04_filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("杨超越", "张无忌", "高圆圆", "张翠山", "蔡徐坤",
                "张萎", "吴亦凡", "马尔扎哈", "迪丽热巴", "张", "张钱孙李", "钟伟");

        // filter
        stream.filter(s -> s.startsWith("张")).filter(s -> s.length() == 2).forEach(System.out::println);
    }
}
