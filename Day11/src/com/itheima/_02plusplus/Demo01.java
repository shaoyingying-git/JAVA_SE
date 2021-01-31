package com.itheima._02plusplus;
/*

    ++

    单独使用:
        效果是一样

    配合使用:
        ++在前: 先做自增, 然后参数运算
        ++在后: 先参与运算, 然后再自增

        都先自增, 整个表达式的值: 如果++在前, 表达式的值是++之后的值;
                              如果++在后, 表达式的值是++之前的值;

 */
public class Demo01 {
    public static void main(String[] args) {
        int a = 10;

        a = a++;

        System.out.println(a);

    }
}
