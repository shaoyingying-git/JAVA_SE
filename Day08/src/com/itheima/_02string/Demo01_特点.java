package com.itheima._02string;

public class Demo01_特点 {
    public static void main(String[] args) {
//         String s = "abc";

        // s和"abc"都能调用方法, 都是String类的对象
//         System.out.println(s.length());
//         System.out.println("abc".length());

        // 字符串是一个不可变的字符序列
        String s = "abc";
        // s调用任何方法, 都不能改变s的值. 只有重新赋值可以改变s变量
         s = "def";

        System.out.println(s);

        String s1 = null;
        String s2 = "";

        System.out.println(s2.length());
//        System.out.println(s1.length());


    }
}
