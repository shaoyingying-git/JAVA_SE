package com.itheima._01review;

import java.util.Arrays;
import java.util.HashMap;

/*

    [4,3,2,5,6]     target:10

    时间复杂度: O(n^2)
    空间复杂度: O(1)


 */
public class Demo01 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 5, 6};
        int target = 10;

        System.out.println(Arrays.toString(fun2(arr, target)));

    }

    public static int[] fun2(int[] arr, int target) {
        // O(n)
        // O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            // 键是元素, 值是索引
            map.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            int key = target - arr[i];
            // 查看map集合中是否有这个键, 键和当前元素不能相等
            if (map.containsKey(key) && key != arr[i]) {
                return new int[] {i, map.get(key)};
            }
        }
        return null;
    }


    public static int[] fun(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 10) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}
