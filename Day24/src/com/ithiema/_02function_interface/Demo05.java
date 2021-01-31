package com.ithiema._02function_interface;

import java.util.function.Consumer;

public class Demo05 {
    public static void main(String[] args) {

        fun(t -> System.out.println(t.toUpperCase()),
                t -> System.out.println(t.toLowerCase()));
    }

    // fun方法的参数中有两个Consumer接口
    public static void fun(Consumer<String> one, Consumer<String> two) {
        // one.andThen(two).accept("Hello");

        one.accept("Hello");
        two.accept("Hello");
    }
}
