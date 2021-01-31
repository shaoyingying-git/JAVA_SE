package com.itheima._01review;

public class Demo02 {
    public static void main(String[] args) {
        // 如果使用常量和变量进行比较, 一定将常量放在前面

        String s = null;

        if ("abc".equals(s)) {
            System.out.println("相等");
        }else {
            System.out.println("不相等");
        }

        boolean b = false;

        if (true == b) {
            System.out.println("b是true");
        }


    }
}
