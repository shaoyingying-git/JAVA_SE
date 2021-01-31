package com.itheima._05use_array;
/*

    基本数据类型作为参数的时候, 传递的是值

    引用数据类型作为参数的时候, 传递的是地址值

 */
public class Demo03_数组的面试题 {
    public static void main(String[] args) {
        int a = 10;

        fun(a);

        System.out.println("a = " + a); // 10

        int[] arr = {10, 20};

        fun(arr);

        System.out.println(arr[0]); // 9999
    }

    public static void fun(int i) {
        i = 999;
        System.out.println("i = " + i); // 999
    }

    public static void fun(int[] array) {
        array[0] = 9999;
        System.out.println(array[0]); // 9999
    }
}
