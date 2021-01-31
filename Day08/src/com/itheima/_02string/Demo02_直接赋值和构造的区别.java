package com.itheima._02string;
/*
    == :
        在比较基本数据类型时, 比较的是值;
        在比较引用数据类型时, 比较的是地址值;


 */
public class Demo02_直接赋值和构造的区别 {
    public static void main(String[] args) {

        String s1 = "abc";

        String s2 = new String("abc");


        System.out.println(s1 == s2);// false: 因为地址值不同


    }
}
