package com.itheima._02string;

public class Demo03_使用字节数组字符数组的构造方法 {
    public static void main(String[] args) {
        // 创建字节数组
        byte[] bytes = {97, 98, 99};
        // 可以将字节数组转换成字符串
        String s1 = new String(bytes);
        System.out.println(s1);

        // 创建字符数组
        char[] chs = {'你', '好', '啊', '!'};
        String s2 = new String(chs);

        System.out.println(s2);




    }
}
