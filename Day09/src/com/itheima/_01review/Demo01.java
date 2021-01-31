package com.itheima._01review;

import java.util.Arrays;

/*

    String
        特点:
            1. 字符串常量("abc"), 也是一个字符串的对象, 就能调用方法
            2. 字符串是不可变的字符序列

        构造方法:
            String() : 创建了一个字符串, ""
            String(String): 创建了一个字符串, 表示与参数相同

            String s1 = new String();  ->  ""
            String s2 = "";

            ==: 比较基本数据类型比较的是值, 比较引用数据类型比较的是地址值


            String s = new String("qqq") -> "qqq"

            String(byte[]): 将字节数组, 转换成字符串
            String(char[]): 将字符数组, 转换成字符串

            toCharArray(): 将字符串转换成字符数组
            getBytes(): 将字符串转换成字节数组

         其他方法:
            获取功能:
                length(): 获取字符串的长度(字符个数)
                concat(String s): 字符串的拼接
                charAt(int index) : 获取指定索引处的字符
                indexOf(String s) : 在大串中找小串第一次出现的位置
                substring(int startIndex)
                substring(int startIndex, int endIndex)

            判断功能:
                equals(String s) : 判断两个字符串的字符序列是否相同
                equalsIgnoreCase(String s)

            转换功能
                replace(String target, String replacement)

            拆分:
                split(String)

    static: 静态
        特点:
            1. static修饰的成员变量, 被这个类所有对象所共享
            2. static修饰的成员, 可以直接使用类名. 去调用

        使用注意:
            静态只能访问静态


        静态代码块: 优先于所有方法执行, 只执行一次. 一般用于加载驱动
            static {

            }

     Arrays:
        toString(数组): 将数组转换成字符串
        sort(数组): 从小到大排序
     Math:
        abs(): 求两个数的差值

 */
public class Demo01 {
    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};

        System.out.println(Arrays.toString(arr));
        // 排序
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));


        int a = 10;
        int b = 15;


        System.out.println(Math.abs(a - b));


    }

    private static void demo01() {
        // 有一个字符串, 转换成首字母大写, 其余小写
        String s = "helLOJava";
        // 1. 截取第一个字符
        String s1 = s.substring(0, 1);
        // 2. 将这个字符串转换成大写
        String s2 = s1.toUpperCase();
        // 3. 截取从第二个字符到末尾的字符串
        String s3 = s.substring(1);
        // 4. 将这个字符串转换成小写
        String s4 = s3.toLowerCase();

        String s5 = s2 + s4;
        System.out.println(s5);


        String s6 = s.substring(0, 1)
                .toUpperCase()
                .concat(s.substring(1).toLowerCase());
        System.out.println(s6);
    }

    public static void fun() {

    }

}
