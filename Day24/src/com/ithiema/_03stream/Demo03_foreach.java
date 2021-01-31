package com.ithiema._03stream;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demo03_foreach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("杨超越", "张无忌", "高圆圆", "张翠山", "蔡徐坤",
                "张萎", "吴亦凡", "马尔扎哈", "迪丽热巴", "张", "张钱孙李", "钟伟");

        // forEach
        /*stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                // 定义如何消费
                System.out.println(s);
            }
        });*/

        // stream.forEach(s -> System.out.println(s));

        stream.forEach(System.out::println);
    }
}
