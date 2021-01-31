package com.itheima.method;

public class Demo01_求和 {
    public static void main(String[] args) {
        // 调用方法
        int sum = getSum(10, 20);
        System.out.println(sum);
    }

    /*
        此方法用于求两个数的和

        明确返回值类型: 两个数的和  int
        明确参数列表:  两个数 int a, int b
     */
    public static int getSum(int a, int b) {
        return a + b;
    }


}
