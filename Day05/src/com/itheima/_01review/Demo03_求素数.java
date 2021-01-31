package com.itheima._01review;

/*

    素数(质数): 只能被1和它本身整除的数

    求100以内的所有素数

    1. 求一个数是否是素数
    2. 求1~100所有数

 */
public class Demo03_求素数 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            boolean b = isPrime(i);
            if (b == true) {
                System.out.println("当前数据为: " + i + "它是否是素数: " + b);
            }
        }
    }


    public static boolean isPrime(int a) {
        // 在循环外创建计数器, 用来记录整除的次数
        int count = 0;
        // 从1~a的for循环
        for (int i = 1; i <= a; i++) {
            // 用a对i取余
            int yuShu = a % i;
            // 对余数进行判断, 如果余数为0, 说明整除
            if (yuShu == 0) {
                // 整除了, 计数器自增
                count++;
            }
        }

        // 循环结束, count的值, 就是整除的次数
        // 整除次数如果是2, 这个数是素数
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

}




