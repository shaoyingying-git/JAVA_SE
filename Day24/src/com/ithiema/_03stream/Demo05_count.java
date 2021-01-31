package com.ithiema._03stream;

import java.util.stream.Stream;

public class Demo05_count {
    public static void main(String[] args) {
        /*Stream<String> stream = Stream.of("杨超越", "张无忌", "高圆圆", "张翠山", "蔡徐坤",
                "张萎", "吴亦凡", "马尔扎哈", "迪丽热巴", "张", "张钱孙李", "钟伟");

        stream.forEach(System.out::println);
        // count
        System.out.println(stream.count());*/


        // 演示流已经被操作过
        Stream<String> stream = Stream.of("杨超越", "张无忌", "高圆圆", "张翠山", "蔡徐坤",
                "张萎", "吴亦凡", "马尔扎哈", "迪丽热巴", "张", "张钱孙李", "钟伟");

        // filter
        Stream<String> stream1 = stream.filter(s -> s.startsWith("张")).filter(s -> s.length() == 2);

        // stream1.forEach(System.out::println);

        stream.forEach(System.out::println);

    }
}
