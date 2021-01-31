package com.itheima._05use_array;

public class Demo02_数组作为方法的返回值 {
    public static void main(String[] args) {
        int[] brr = fun2();
        System.out.println(brr);
    }

    public static int fun() {
        // 方法需要返回int类型
        // 创建int类型变量
        int i = 10;
        // 将这个变量返回
        return i;
    }

    public static int[] fun2() {
        // 方法需要返回int[]类型
        // 创建int[]
        int[] arr = {10, 20, 30};
        System.out.println(arr);
        // 将数组返回
        return arr; // 返回的是地址值
    }

}
