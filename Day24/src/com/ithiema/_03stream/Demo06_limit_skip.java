package com.ithiema._03stream;

import java.util.stream.Stream;

public class Demo06_limit_skip {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("杨超越", "张无忌", "高圆圆", "张翠山", "蔡徐坤",
                "张萎", "吴亦凡", "马尔扎哈", "迪丽热巴", "张", "张钱孙李", "钟伟");

        // stream.limit(4).forEach(System.out::println);
        stream.skip(3).forEach(System.out::println);

    }
}
