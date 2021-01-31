package com.itheima._04methodref.demo03;

public class Demo03_对象引用成员方法 {
    public static void main(String[] args) {
        // 字符串转换成大写, 然后再打印
        /*printString(new Printable() {
            @Override
            public void print(String s) {
                System.out.println(s.toUpperCase());
            }
        });*/

        // lambda
        printString(s -> System.out.println(s.toUpperCase()));

        // 方法引用
        // lambda中的功能, 必须是已经定义好的
        // A :: B
        // MethodRef 里面的  printUpper
        printString(new MethodRef() :: printUpper);
    }

    public static void printString(Printable lambda) {
        lambda.print("Hello");
    }
}
