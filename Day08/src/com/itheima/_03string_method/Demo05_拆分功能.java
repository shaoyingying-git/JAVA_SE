package com.itheima._03string_method;
// String[] split(String regex): 将此字符串按照给定的regex（规则）拆分为字符串数组。
public class Demo05_拆分功能 {
    public static void main(String[] args) {
        String s = "123#456#789";
        // 按照#拆分
        String[] arr = s.split("#");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
