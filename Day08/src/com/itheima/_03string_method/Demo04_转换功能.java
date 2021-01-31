package com.itheima._03string_method;
/*
    public char[] toCharArray () ：将此字符串转换为新的字符数组。
    public byte[] getBytes () ：使用平台的默认字符集将该 String编码转换为新的字节数组。
    public String replace (CharSequence target, CharSequence replacement) ：
    将与target匹配的字符串使用replacement字符串替换。

 */
public class Demo04_转换功能 {
    public static void main(String[] args) {
        char[] chs = "itheima".toCharArray();
        // 查看数组中的内容
        // 遍历数组
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }


        // 将字符串转换成字节数组
        byte[] bytes = "abcd".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }


        System.out.println("~~~~~~~~~~~~~");
        String s1 = "itheimahei";
        String s2 = s1.replace("hei", "bai");
        System.out.println(s2);

        String message = "你TMD是不是SB啊!";
        String s = message.replace("TMD", "***").replace("SB", "**");
        System.out.println(s);

    }
}
