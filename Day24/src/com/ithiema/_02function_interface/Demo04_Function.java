package com.ithiema._02function_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Demo04_Function {
    public static void main(String[] args) {

        fun(t -> Integer.parseInt(t));

        // 方法引用
        fun(Integer::parseInt);

    }

    public static void fun(Function<String, Integer> lambda) {
        int a = lambda.apply("123");
    }
}
