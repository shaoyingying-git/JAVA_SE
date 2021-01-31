package com.itheima._01review;

import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {
        System.out.println("请输入第一个整数: ");
        int a = scannerInt();
        System.out.println("请输入第二个整数: ");
        int b = scannerInt();
        System.out.println("请输入第三个整数: ");
        int c = scannerInt();


        int max = getMax(a, b, c);
        System.out.println(max);


        // int max2 = a > b ? a > c ? a : c : b > c ? b : c; // 不可取

        System.out.println("max = " + max);
        // System.out.println("max2 = " + max2);
    }


    /**
     * 此方法用于获取键盘录入的一个整数
     */
    public static int scannerInt() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        return a;
    }


    /**
     * 此方法用于获取三个数的最大值
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int getMax(int a, int b, int c) {
        // 先获取前两个数的最大值
        int temp = a > b ? a : b;
        // 再使用前两个数的最大值和第三个数比较
        int max = temp > c ? temp : c;

        return max;
    }

}
