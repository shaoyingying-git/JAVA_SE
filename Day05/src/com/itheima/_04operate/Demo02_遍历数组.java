package com.itheima._04operate;
/*
    遍历数组:
        获取数组中的每一个元素
                ↓
        获取数组中每一个元素所在的索引
                ↓
        每一个索引, 从0 ~ 长度-1
                ↓
        让for循环中i的变化量是从 0 ~ 数组的长度 - 1


 */
public class Demo02_遍历数组 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        // 让for循环中i的变化量是从 0 ~ (数组的长度 - 1)
        for (int i = 0; i < arr.length; i++) {
            // 把i当成数组中每一个元素的索引
            System.out.println(arr[i]);
        }
    }
}
