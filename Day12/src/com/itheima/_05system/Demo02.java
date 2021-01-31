package com.itheima._05system;

import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) {

        // 源数组
        int[] src = {1, 2, 3, 4, 5};
        // 目的数组
        int[] dest = new int[7];

        // 数组拷贝
        System.arraycopy(src, 0, dest, 1, src.length);

        // 打印数组
        System.out.println(Arrays.toString(dest));

    }
}
