package com.itheima._06stringbuilder;

public class Demo01 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("abc");

        sb2.append(100);
        sb2.append(true);
        sb2.append('饕');
        sb2.append(false);
        sb2.append(12.3);



        System.out.println(sb2);
    }

    public static String fun() {
        StringBuilder sb2 = new StringBuilder("abc");
        return sb2.toString();
    }

}
