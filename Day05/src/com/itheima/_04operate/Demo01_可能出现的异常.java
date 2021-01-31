package com.itheima._04operate;

public class Demo01_可能出现的异常 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println(arr[3]); // ArrayIndexOutOfBoundsException

        int[] arr1 = null;

        System.out.println(arr1[0]); // NullPointerException
    }
}
