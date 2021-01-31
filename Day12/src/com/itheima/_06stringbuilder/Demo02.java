package com.itheima._06stringbuilder;

public class Demo02 {
    public static void main(String[] args) {

        String s = "abc"; // "cba"

        System.out.println(reverseString(s));

    }

    /**
     * 将传入的字符串进行翻转, 并返回
     * @param s
     * @return
     */
    public static String reverseString(String s) {
        // charAt(index)
        // toCharArray()
        // 将字符串转换成字符数组
        /*char[] arr = s.toCharArray();

        String result = "";

        // 倒着遍历数组
        for (int i = arr.length - 1; i >= 0; i--) {
            result = result + arr[i];
        }

        return result;*/

        return new StringBuilder(s).reverse().toString();
    }

}
