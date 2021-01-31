package com.itheima._01review;
/*
6.定义一个方法名blackjack接收两个大于0的int类型值，
返回两个数中不大于21且最接近21的数，如果两个数都大于21，则返回0；
 */
public class Demo04_21点 {

    public static void main(String[] args) {
        int a = blackjack2(2, 25);
        System.out.println(a);
    }

    /*
        返回值类型 int
        参数是两个int值
     */
    public static int blackjack(int a, int b) {
        // a和b都小于等于21
        if (a <= 21 && b <= 21) {
            // 返回两个数的最大值
            int max = a > b ? a : b;
            return max;
        }else if (a > 21 && b <= 21) {
            // a大,b小
            return b;
        }else if (a <= 21 && b > 21) {
            // a小, b大
            return a;
        }else {
            // a和b都大于21
            return 0;
        }
    }

    // 如果方法中要进行多种情况的判断, 那么先判断最特殊的
    public static int blackjack2(int a, int b) {
        // a和b都大于21, 返回0
        if (a > 21 && b > 21) {
            return 0;
        }

        // 代码执行到这里, 一定没有都大于21
        // 一大一小
        if (a > 21) {
            return b;
        }

        if (b > 21) {
            return a;
        }

        // 返回两个数的最大值
        // int max = a > b ? a : b;
        // return max;
        return a > b ? a : b;

    }

}
