package com.itheima._04collections;


public class Demo01_可变参数 {
    public static void main(String[] args) {
        System.out.println(getSum());
        System.out.println(getSum(1));
        System.out.println(getSum(1, 2));
        System.out.println(getSum(1, 2, 3));
        System.out.println(getSum(1, 2, 3, 4, 5, 6, 7, 8));
    }

    /*public static void fun(int a) {

    }

    public static void fun(int a) {

    }*/


    public static int getSum(int ... arr) {

        // System.out.println(Arrays.toString(arr));

        int sum = 0;

        for (int i : arr) {
            sum += i;
        }


        return sum;
    }

    /*public static int getSum(int[] a) {
        return 0;
    }*/


    /*// 求两个数的和
    public static int getSum(int a, int b) {
        return a + b;
    }

    public static int getSum(int a, int b, int c) {
        return a + b + c;
    }

    public static int getSum(int a, int b, int c, int d) {
        return a + b + c + d;
    }*/


}
