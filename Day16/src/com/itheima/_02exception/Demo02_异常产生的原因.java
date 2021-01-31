package com.itheima._02exception;

import java.util.Objects;

public class Demo02_异常产生的原因 {
    public static void main(String[] args) {

        /*String s = null;

        Objects.requireNonNull(s);*/

        // throw new NullPointerException();

        System.out.println(10 / 0);

        System.out.println("异常后面的代码");

    }
}
