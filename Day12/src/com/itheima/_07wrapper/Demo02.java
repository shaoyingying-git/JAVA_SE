package com.itheima._07wrapper;

public class Demo02 {
    public static void main(String[] args) {
        String s = "123";  // -> 123
        // Integer.parseInt(String)
        int i = Integer.parseInt(s) + 100;
        System.out.println(i);


        String s2 = "true";
        boolean b = Boolean.parseBoolean(s2);
        System.out.println(b);

    }
}
