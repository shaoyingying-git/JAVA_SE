package com.itheima._01review;

public class Test {

    public static void main(String[] args) {
        Test t = new Test();
        t.gHappy("happyg");
    }

    // xxxggx

    public boolean gHappy(String str) {
        // 将字符串转换成字符数组
        char[] arr = (" " + str + " ").toCharArray();
        for (int i = 1; i < arr.length - 1; i++) {
            // 如果有单独的g, 就返回false
            if ('g' == arr[i] && 'g' != arr[i + 1] && 'g' != arr[i - 1]) {
                return false;
            }
        }

        return true;
    }
}
