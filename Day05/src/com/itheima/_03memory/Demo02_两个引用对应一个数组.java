package com.itheima._03memory;

public class Demo02_两个引用对应一个数组 {
    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30};

        int[] arr2 = arr1;

        // 修改arr2数组
        arr2[0] = 999;

        System.out.println(arr1[0]);
        System.out.println(arr2[0]);

    }
}
