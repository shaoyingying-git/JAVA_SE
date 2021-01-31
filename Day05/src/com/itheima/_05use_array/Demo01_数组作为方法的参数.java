package com.itheima._05use_array;
/*
    int[]  :   引用数据类型

    int    :   基本数据类型

 */
public class Demo01_数组作为方法的参数 {

    public static void main(String[] args) {
        // 定义一个int类型变量, 作为参数传递
        int i = 10;
        fun(i);

        // 定义一个int[]类型变量, 作为参数传递
        int[] arr = {10, 20, 30};
        fun(arr);
    }

    public static void fun(int i) {
        System.out.println(i);
    }

    public static void fun(int[] arr) {
        System.out.println(arr);
    }



}
