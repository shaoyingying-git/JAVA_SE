package com.itheima._03string_method;
/*
    public int length () ：返回此字符串的长度。
    public String concat (String str) ：将指定的字符串连接到该字符串的末尾。
    public char charAt (int index) ：返回指定索引处的 char值。
 */
public class Demo01_获取功能1 {
    public static void main(String[] args) {
        String s1 = "abcd";
        System.out.println(s1.length());

        // 想调用concat方法, 需要使用String对象来调用
        // concat方法的参数中需要传入String
        // 将参数中传入的字符串, 拼接到调用方法的字符串的末尾
        String s2 = "zxc";

        String s3 = s1.concat(s2);

        System.out.println(s3);

        System.out.println(s1.charAt(2));


    }
}
