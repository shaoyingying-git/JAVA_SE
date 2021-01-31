package com.ithiema._02function_interface;

import java.util.function.Predicate;

public class Demo03_Predicate {
    public static void main(String[] args) {
        // 传入的就是判断的方式
        fun(t -> t.contains("H") && t.length() > 3);
    }

    public static void fun(Predicate<String> lambda) {
        boolean b = lambda.test("Hello"); // 不需要我们传入参数, 而是从流中获取
        System.out.println(b);
    }
}
