package com.itheima.method;

public class Demo03_求1到100的和 {
    public static void main(String[] args) {
        int sum = get100Sum();
        System.out.println(sum);
    }

    /**
     * 此方法用于求1到100的和
     *
     * 明确返回值类型: 1到100的和  int
     * 明确参数列表: 空
     */
    public static int get100Sum() {
        // 计算1一直加到100的和
        // 创建一个变量, 用来记录每一次相加的和
        int sum = 0;
        // 让for循环中i的变化量是 1 ~ 100
        for (int i = 1; i <= 100; i++) {
            // 求和
            sum = sum + i;
        }
        // 将和返回
        return sum;
    }
}
