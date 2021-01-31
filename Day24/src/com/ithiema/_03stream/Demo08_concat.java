package com.ithiema._03stream;

import java.util.stream.Stream;

public class Demo08_concat {
    public static void main(String[] args) {
        Stream<String> one = Stream.of("李小璐");

        Stream<String> two = Stream.of("贾乃亮");

        Stream.concat(one, two).forEach(System.out::println);
    }
}
