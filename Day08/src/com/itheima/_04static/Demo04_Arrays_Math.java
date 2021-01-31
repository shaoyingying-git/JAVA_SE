package com.itheima._04static;

import java.util.Arrays;

/*
    Arrays: 用来操作数组的工具类

        public static String toString(数组):
            将数组按照指定格式转换成字符串

        public static void sort(数组):
            将数组从小到大排序

    Math: 数学运算

        public static int abs(int i): 求绝对值

        开发中的四舍五入:   (int) (某小数 + 0.5)


 */
public class Demo04_Arrays_Math {
    public static void main(String[] args) {

        System.out.println(Math.abs(10));



    }

    private static void demo01() {
        int[] arr = {23, 64, 15, 89, 75, 48};
        System.out.println(arr); // 直接打印是地址值
        System.out.println("排序前: " + Arrays.toString(arr));

        // 排序
        Arrays.sort(arr);

        System.out.println("排序后: " + Arrays.toString(arr));

        System.out.println("最小: " + arr[0]);
        System.out.println("最大: " + arr[arr.length - 1]);
    }
}
