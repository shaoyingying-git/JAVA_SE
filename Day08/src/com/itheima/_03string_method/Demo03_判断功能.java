package com.itheima._03string_method;
/*

    public boolean equals (Object anObject) ：将此字符串与指定对象进行比较。
    public boolean equalsIgnoreCase (String anotherString) ：将此字符串与指定对象进行比较，忽略大小
写。

    以后比较两个字符串是否相等, 一定要使用  equals()方法, 千万别使用 ==
    因为==号比较的是地址值
    equals()方法比较的是字符序列


 */
public class Demo03_判断功能 {
    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "ABC";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));


    }
}
