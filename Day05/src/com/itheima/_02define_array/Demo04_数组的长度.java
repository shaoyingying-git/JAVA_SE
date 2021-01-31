package com.itheima._02define_array;

public class Demo04_数组的长度 {
    public static void main(String[] args) {
        // 创建数组
        int[] arr = {10, 20, 30};
        // 获取数组的长度
        int len = arr.length;
        System.out.println(len);

        System.out.println(arr.length);


        // 获取数组的第一个和最后一个元素
        // 第一个:
        System.out.println(arr[0]);
        // 最后一个: 索引 -> 长度 - 1
        System.out.println(arr[arr.length - 1]);
    }
}
