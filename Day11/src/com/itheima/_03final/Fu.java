package com.itheima._03final;

public class Fu {

    final int num;

    public Fu() {
        num = 10;
    }

    public Fu(int a) {
        num = 20;
    }

    public void fun() {
        final int a;

        a = 10;

        // a = a + 10;

        // a = 10;

        // a++;
    }
}
