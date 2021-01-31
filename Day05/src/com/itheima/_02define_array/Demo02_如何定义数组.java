package com.itheima._02define_array;
/*
    定义格式:

        第一种格式:
            数据类型[] 数组名 = new 数据类型[长度];
        第二种格式:
            数据类型[] 数组名 = new 数据类型[] {元素1, 元素2, ...};
        第三种格式(对第二种的简化形式):
            数据类型[] 数组名 = {元素1, 元素2, ...};


 */
public class Demo02_如何定义数组 {
    public static void main(String[] args) {
        // 第一种格式
        int[] arr1 = new int[3];

        // 第二种格式
        int[] arr2 = new int[]{10, 20, 30};

        // 第三种格式
        int[] arr3 = {10, 20, 30};
    }
}
