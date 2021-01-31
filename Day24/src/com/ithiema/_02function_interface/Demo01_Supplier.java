package com.ithiema._02function_interface;

import java.util.function.Supplier;

public class Demo01_Supplier {
    public static void main(String[] args) {
        fun(() -> "Hello");
    }

    public static void fun(Supplier<String> lambda) {
        String s = lambda.get();
        System.out.println(s);
    }
}
