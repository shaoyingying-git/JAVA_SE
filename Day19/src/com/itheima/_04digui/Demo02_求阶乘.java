package com.itheima._04digui;
/*
    5! = 5 * 4 * 3 * 2 * 1

    5!
    5 * 4!
        4 * 3!
            3 * 2!
                2 * 1!
                    1

    n! = n * (n - 1)!

    定义递归的方法时, 一定要明确方法的功能

 */
public class Demo02_求阶乘 {
    public static void main(String[] args) {

        /*int num = 1;

        for (int i = 5; i >= 1 ; i--) {
            num = num * i;
        }

        System.out.println(num);*/

        // StackOverflowError
        System.out.println(fun(30));
    }

    /**
     * 此方法用来求n的阶乘
     */
    public static int fun(int n) {
        if (n == 1) {
            return 1;
        }
        // 返回n * (n - 1)!
        return n * fun(n - 1);
    }
}
