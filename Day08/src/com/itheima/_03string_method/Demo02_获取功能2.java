package com.itheima._03string_method;
/*
    public int indexOf (String str) ：返回指定子字符串第一次出现在该字符串内的索引。
    public String substring (int beginIndex) ：返回一个子字符串，从beginIndex开始截取
        字符串到字符串结尾。
    public String substring (int beginIndex, int endIndex) ：返回一个子字符串，
        从beginIndex到endIndex截取字符串。含beginIndex，不含endIndex。

        包头不包尾


    "unhappy".substring(2)      returns "happy"
    "Harbison".substring(3)     returns "bison"



    "hamburger".substring(4, 8) returns "urge"
    "smiles".substring(1, 5) returns "mile"

    注意事项
        "angel".substring(5)  returns  ""
        "angel".substring(6)  returns  ""

        substring()方法, 可以写到的最大索引为 字符串的长度


 */
public class Demo02_获取功能2 {
    public static void main(String[] args) {

        /*String s1 = "angel".substring(5); // ""
        System.out.println(s1);*/

       /* String s2 = "angel".substring(6); // ""
        System.out.println(s2);*/

        String s3 = "angel".substring(3, 5);
        System.out.println(s3);



        /*// 在大字符串中, 找小字符串第一次出现的位置(索引)
        String s1 = "itheimalalala";
        String s2 = "laa";

        int index = s1.indexOf(s2); // 返回s2在s1中第一次出现的索引
        System.out.println(index);

        String s3 = "I love you"; // 我爱吃肉

        // 截取获取  you
        String s4 = s3.substring(7);

        System.out.println(s4);*/



    }
}
