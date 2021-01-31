package com.itheima._04operate;

public class Demo03_求数组的最大值 {
    public static void main(String[] args) {
        int[] arr = {5, 15, 2000, 10000, 100, 4000};
        // 定义一个变量, 用来记录每一次比较时的最大值
        int max = arr[0]; // 让初始值为数组的第一个元素
        // 遍历数组
        // 为了提高效率, 将i的初始值设置为1
        for (int i = 1; i < arr.length; i++) {
            // 使用遍历出来的元素, 和临时最大值进行比较
            if (arr[i] > max) {
                // 将当前元素赋值给临时最大值
                max = arr[i];
            }
        }

        System.out.println("最大值为: " + max);
    }
}
