package com.ithiema._03stream;

import java.util.function.Function;
import java.util.stream.Stream;

public class Demo07_map {
    public static void main(String[] args) {
       /* Stream.of("10", "20")
                .map(t -> Integer.parseInt(t))
                .forEach(System.out::println);*/

        Stream<String> stream = Stream.of("杨超越", "张无忌", "高圆圆", "张翠山", "蔡徐坤",
                "张萎", "吴亦凡", "马尔扎哈", "迪丽热巴", "张", "张钱孙李", "钟伟");

        // String -> Person
        /*stream.map(new Function<String, Person>() {
                       @Override
                       public Person apply(String s) {
                           return new Person();
                       }
                   }
                );*/

        stream.map(s -> new Person(s)).forEach(System.out::println);
    }
}
