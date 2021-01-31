package com.ithiema._02function_interface;

import java.util.function.Consumer;

public class Demo02_Consumer {
    public static void main(String[] args) {

        // 消费者
        // lambda中->后面的内容, 就是我们消费的过程
        fun(t -> System.out.println(t));

        fun(System.out::println);

    }

    public static void fun(Consumer<String> lambda) {
        lambda.accept("Hello");
    }
}
